# Java_DevHub

* Documentation: https://apideveloper.vantiv.com/docs/devhub-developer
* Forum: https://apideveloper.vantiv.com/forum
* FAQ: https://apideveloper.vantiv.com/faqs
* Questions: apideveloper@vantiv.com

##Overview

This repository demonstrates sending transactions to Vantiv DevHub.


##Prerequisites

* DevHub Account (https://apideveloper.vantiv.com)
* License from DevHub Account
* AcceptorID (merchantid)


##Step 1: Find Configuration Information and Setup

Login to your DevHub account, create an application, and click on that application to integrate.  You will see a webpage like the following.  You will need the LicenseId, the AcceptorID, and the endpoint URL's. Here are a few key resources to be aware of once you create an account and scope an application. 

![Image of DevHub developer dashboard](http://apideveloper.vantiv.com/sites/default/files/Dev%20dashboard%20Page.png)

Before using the sample application please locate the src\request\Config.java 
You'll need to enter the license Id you obtained in the portal into the "license" field. To learn more about how the code is setting the license, please reference the file src\request\Request.java to see how it's set in the HTTPS header.

```
public static String license = "";
public static String baseEndpoint = "apis.cert.vantiv.com";
public static int version = 1;
public static Proxy proxy = null;
public static String proxyAuth = "";
```

##Step 2: Build the Request

Resources

* The src\Test.java provides a way to begin trying out the different API transaction types. 
* API documentation for more information: https://apideveloper.vantiv.com/docs/devhub-developer
* Endpoint reference which provides the different endpoint URL's: https://apideveloper.vantiv.com/docs/endpoint-reference-devhub
* Postman examples (You can import the collection using this URL and try out tests once you enter the License in the header) https://www.getpostman.com/collections/332d5043da14439823aa

In the file src\Test.Java you can simply uncomment the transactions you'd like to try out. For example, the following will send an example of an Authorization transactions.

```
//^^^^^^^^^^^^^^^^^^^^^^^^CONFIGURE THE API^^^^^^^^^^^^^^^^^^^^^^^^//

//   Uncomment the sample transaction below that you would like to test

//  CREDIT
sampleCreditAuthorization();
// sampleCreditAuthorizationCompletion();
// sampleCreditCaptureGivenAuth();
```

To provide a more basic understanding of the message the sample code is sending, here is an example. Please note that although string building is an option, we generally recommend a more structured approach when sending transactions.

```
POST /payment/sp2/credit/v1/authorization
Content-Type: application/json
Authorization: VANTIV license="[Your License Id]"
Host: apis.cert.vantiv.com
Content-Length: 764

{
   "Credentials":
   {
      "AcceptorID":"1147003"
   },
   "Reports":
   {
      "ReportGroup":"1243"
   },
   "Transaction":
   {
      "ReferenceNumber":"1",
      "TransactionAmount":"10.00",
      "OrderSource":"ecommerce",
      "CustomerID":null,
      "PartialApprovedFlag":null
   },
   "Card":
   {
      "Type":"VI",
      "CardNumber":"4457010000000009",
      "ExpirationMonth":"01",
      "ExpirationYear":"16",
      "CVV":"349"
   },
   "Application":
   {
      "ApplicationID":"4306abfcc9a56e42df996a965"
   },
   "Address":
   {
      "BillingName":"John and Mary Smith",
      "BillingAddress1":"1 Main St.",
      "BillingCity":"Burlington",
      "BillingState":"MA",
      "BillingZipcode":"01803-3747",
      "BillingCountry":"US"
   }
}
```

##Step 3: Send the Request

Although the src\Test.java will handle setting everything for you, we wanted to call out how it works. Please reference the src\request\Request.java The "send()" function handles converting the object to a Json string as well as setting the header information for the request.

```
public String send() {
	if (Config.doNotSend) {
		return this.toJSON();
	}
	HttpsURLConnection connection = null;
	try {
		String queryParamString = "";
		if(!queryParams.isEmpty()) {
			queryParamString = "?";
			for(String key : queryParams.keySet()) {
				queryParamString += key + "=" + queryParams.get(key) + "&";
			}
			queryParamString = queryParamString.substring(0,queryParamString.length()-1);
		}
		URL url = new URL(this.url + queryParamString);
		if (Config.proxy != null) {
			connection = (HttpsURLConnection) url.openConnection(Config.proxy);
			if (Config.proxyAuth != null) {
				connection.setRequestProperty("Proxy-Authorization", "Basic " + Config.proxyAuth);
			}
		} else {
			connection = (HttpsURLConnection) url.openConnection();
		}
		connection.setDoOutput(true);
		connection.setRequestMethod(method);
		connection.setRequestProperty("Authorization", "VANTIV license=\"" + Config.license + "\"");
		if(!method.equals("GET")) {
			connection.setDoInput(true);
			connection.setRequestProperty("Content-Type", "application/json");
			DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
			wr.writeBytes(this.toJSON());
			wr.close();
		}

		return getResponse(connection.getInputStream());
	} catch (Exception e) {
		try {
			return getResponse(connection.getErrorStream());
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	return null;
}

@SuppressWarnings("unchecked")
public String toJSON() {
	Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
	String request = gson.toJson((T) this);
	if (Config.printRequest)
		System.out.println(request);
	return request;
}

```


##Step 4: Parse the Response

The sample demonstrates obtaining the string response using the following in the src\request\Request.java The "getResponse()" function. 


```
private String getResponse(InputStream is) throws IOException {
	BufferedReader rd = new BufferedReader(new InputStreamReader(is));
	StringBuilder response = new StringBuilder();
	String line;
	while ((line = rd.readLine()) != null) {
		response.append(line);
		response.append('\r');
	}
	rd.close();
	String responseString = response.toString();
	if (Config.printResponse)
		System.out.println(responseString);
	return responseString;
}

```

An example of locating specific meta data in the response can be found by referencing the src\request\Utilities.java The "getTransactionID()" function. In this case we are extracting the TransactionID. 

```
/**
 * Extracts the transactionID from a response object
 * @param response must be the response of a transaction
 * @return the transactionID as a String or null if not found
 */
public static String getTransactionID(JsonObject response) {
	JsonElement litleOnlineResponse = response.get("litleOnlineResponse");
	if(litleOnlineResponse!=null) {
		response = litleOnlineResponse.getAsJsonObject();
		Set<Map.Entry<String,JsonElement>> entrySet=response.entrySet();
		for(Map.Entry<String,JsonElement> entry:entrySet){
			if(entry.getKey().matches("[^@].*")) {
				response = entry.getValue().getAsJsonObject();
				JsonElement transactionID = response.get("TransactionID");
				if(transactionID!=null) {
					return transactionID.getAsString();
				}
			}
		}
	}
	return null;
}
```

##Step 5: Validate a test

One of the key features of DevHub is the ability to provide automated scenario based validations of pre-defined tests in the portal. Here's an example of validating a test against the portal. Using the example JSON provided above, let's validate test "L_AC_1" in the "Authorization and Capture" set of tests. Please note that for certification, all of your tests must be run through the interface you write for your application. This example is only intended to show you how you can validate your solution.

First, follow the steps above to send an Authorization transaction.

In the response you'll see a "RequestID". The "RequestID" is used to uniquely identify the transaction sent through DevHub. We use this value to retrieve the message you just sent and validate it against a test defined in your application. In this case "L_AC_1". 

Here's an example of the JSON response.

```
{
  "litleOnlineResponse": {
    "@version": "9.3",
    "@response": "0",
    "@message": "Valid Format",
    "authorizationResponse": {
      "@id": "4306abfcc9a56e42df996a965",
      "@reportGroup": "1243",
      "@customerId": "345",
      "orderId": "1",
      "response": "000",
      "responseTime": "2016-02-16T23:18:09",
      "postDate": "2016-02-16",
      "message": "Approved",
      "authCode": "11111 ",
      "fraudResult": {
        "avsResult": "01",
        "cardValidationResult": "M"
      },
      "tokenResponse": {
        "tokenResponseCode": "802",
        "tokenMessage": "Account number was previously registered",
        "bin": "445701",
        "PaymentAccountID": "1111000194360009",
        "Type": "VI"
      },
      "enhancedAuthResponse": {
        "virtualAccountNumber": "false"
      },
      "TransactionID": "82917370336788986"
    }
  },
  "RequestID": "8f4e3838-576f-49e7-9e82-3d2e5b8f2906"
}
```

Now click into the feature you wish to validate. In this case the "Authorization and Capture"

![Dashboard Feature](http://apideveloper.vantiv.com/sites/default/files/Dashboard%20Feature.png)

Enter the TestId followed by the RequestID returned in the response. Now click on the yellow validate button. The system will provide a summary of all items that passed along with those that need to be fixed. 

![Validate a test](http://apideveloper.vantiv.com/sites/default/files/ValidateTest.png)



####Copyright (c) 2016 Vantiv, Inc. - All Rights Reserved.

Sample Code is for reference only and is solely intended to be used for educational purposes and is provided “AS IS” and “AS AVAILABLE” and without warranty. It is the responsibility of the developer to  develop and write its own code before successfully certifying their solution.  

This sample may not, in whole or in part, be copied, photocopied, reproduced, translated, or reduced to any electronic medium or machine-readable form without prior consent, in writing, from Vantiv, Inc.

Use, duplication or disclosure by the U.S. Government is subject to restrictions set forth in an executed license agreement and in subparagraph (c)(1) of the Commercial Computer Software-Restricted Rights Clause at FAR 52.227-19; subparagraph (c)(1)(ii) of the Rights in Technical Data and Computer Software clause at DFARS 252.227-7013, subparagraph (d) of the Commercial Computer Software--Licensing clause at NASA FAR supplement 16-52.227-86; or their equivalent.

Information in this sample code is subject to change without notice and does not represent a commitment on the part of Vantiv, Inc.  In addition to the foregoing, the Sample Code is subject to the terms and conditions set forth in the Vantiv Terms and Conditions of Use (http://www.apideveloper.vantiv.com) and the Vantiv Privacy Notice (http://www.vantiv.com/Privacy-Notice).  
