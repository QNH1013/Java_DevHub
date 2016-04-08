import java.net.InetSocketAddress;
import java.net.Proxy;

import request.Config;
import request.SampleRequests;
import request.Utilities;

public class Test {

	public static void main(String[] args) {
		
		//------------------------CONFIGURE THE API------------------------//
		
		// Config.license = "Enter your Vantiv license here"; // !!! REQUIRED !!!
		
		//   - The rest are all optional...
		
		// Config.baseEndpoint = "apis.cert.vantiv.com"; //this is the default
		// Config.version = 1; //this is the default value
		
		//   - If your company has a proxy, set the proxy object and if it uses authentication, base64 encode your username and password
		// Config.proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.example.com", 8080)); //sample proxy setting
		// Config.proxyAuth = "dXNlcm5hbWU6cGFzc3dvcmQ="; //Base64Encoded("username:password")
		
		//   - For debugging
		// Config.printRequest = true;
		// Config.printResponse = true;
		// Config.doNotSend = true; // if set to true, request.send() will return the request string and will not send the transaction
		
		//^^^^^^^^^^^^^^^^^^^^^^^^CONFIGURE THE API^^^^^^^^^^^^^^^^^^^^^^^^//
		
		//   Uncomment the sample transaction below that you would like to test
		
		//  CREDIT
		// sampleCreditAuthorization();
		// sampleCreditAuthorizationCompletion();
		// sampleCreditCaptureGivenAuth();
		// sampleCreditCredit();
		// sampleCreditForce();
		// sampleCreditReturn();
		// sampleCreditReversal();
		// sampleCreditSale();
		// sampleCreditVoid();
		
		//  DEBIT
		// sampleCheckCredit();
		// sampleCheckReturn();
		// sampleCheckSale();
		// sampleCheckVerification();
		// sampleCheckVoid();
		
		//  SERVICES
		// sampleCreatePlan();
		// sampleFraudCheck();
		// samplePaymentAccountCreate();
		// sampleScheduledTaskDelete();
		// sampleScheduledTaskUpdate();
		// samplePaymentAccountUpdate();
		// sampleUpdatePlan();
		
	}
	
	public static String sampleCreditAuthorization() {
		request.Credit.Authorization authorization = SampleRequests.sampleCreditAuthorization();
		String response = authorization.send();
		return response;
	}
	
	public static String sampleCreditAuthorizationCompletion() {
		request.Credit.Authorization authorization = SampleRequests.sampleCreditAuthorization();
		String response = authorization.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Credit.AuthorizationCompletion authorizationCompletion = SampleRequests.sampleCreditAuthorizationCompletion(transactionID);
			response = authorizationCompletion.send();
			return response;
		}
		System.out.println("Authorization failed. Cannot perform Authorization Completion transaction");
		return null;
	}
	
	public static String sampleCreditCaptureGivenAuth() {
		request.Credit.CaptureGivenAuth captureGivenAuth = SampleRequests.sampleCreditCaptureGivenAuth();
		String response = captureGivenAuth.send();
		return response;
	}
	
	public static String sampleCreditCredit() {
		request.Credit.Sale sale = SampleRequests.sampleCreditSale();
		String response = sale.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Credit.Credit credit = SampleRequests.sampleCreditCredit(transactionID);
			response = credit.send();
			return response;
		}
		System.out.println("Sale failed. Cannot perform Credit transaction");
		return null;
	}

	public static String sampleCreditForce() {
		request.Credit.Force force = SampleRequests.sampleCreditForce();
		String response = force.send();
		return response;
	}
	
	public static String sampleCreditReturn() {
		request.Credit.Return return_ = SampleRequests.sampleCreditReturn();
		String response = return_.send();
		return response;
	}
	
	public static String sampleCreditReversal() {
		request.Credit.Authorization authorization = SampleRequests.sampleCreditAuthorization();
		String response = authorization.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Credit.Reversal reversal = SampleRequests.sampleCreditReversal(transactionID);
			response = reversal.send();
			return response;
		}
		System.out.println("Authorization failed. Cannot perform Reversal transaction");
		return null;
	}
	
	public static String sampleCreditSale() {
		request.Credit.Sale sale = SampleRequests.sampleCreditSale();
		String response = sale.send();
		return response;
	}
	
	public static String sampleCreditVoid() {
		request.Credit.Sale sale = SampleRequests.sampleCreditSale();
		String response = sale.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Credit.Void void_ = SampleRequests.sampleCreditVoid(transactionID);
			response = void_.send();
			return response;
		}
		System.out.println("Sale failed. Cannot perform Void transaction");
		return null;
	}

	
	public static String sampleCheckCredit() {
		request.Check.Sale sale = SampleRequests.sampleCheckSale();
		String response = sale.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Check.Credit credit = SampleRequests.sampleCheckCredit(transactionID);
			response = credit.send();
			return response;
		}
		System.out.println("Sale failed. Cannot perform Credit transaction");
		return null;
	}
	
	public static String sampleCheckReturn() {
		request.Check.Return return_ = SampleRequests.sampleCheckReturn();
		String response = return_.send();
		return response;
	}
	
	public static String sampleCheckSale() {
		request.Check.Sale sale = SampleRequests.sampleCheckSale();
		String response = sale.send();
		return response;
	}
	
	public static String sampleCheckVerification() {
		request.Check.Verification verification = SampleRequests.sampleCheckVerification();
		String response = verification.send();
		return response;
	}
	
	public static String sampleCheckVoid() {
		request.Check.Sale sale = SampleRequests.sampleCheckSale();
		String response = sale.send();
		String transactionID = Utilities.getTransactionID(response);
		
		if(transactionID!=null) {
			request.Check.Void void_ = SampleRequests.sampleCheckVoid(transactionID);
			response = void_.send();
			return response;
		}
		System.out.println("Sale failed. Cannot perform Void transaction");
		return null;
	}

	
	public static String sampleCreatePlan() {
		request.Services.CreatePlan createPlan = SampleRequests.sampleServicesCreatePlan();
		String response = createPlan.send();
		return response;
	}

	public static String sampleFraudCheck() {
		request.Services.FraudCheck fraudCheck = SampleRequests.sampleServicesFraudCheck();
		String response = fraudCheck.send();
		return response;
	}

	public static String samplePaymentAccountCreate() {
		request.Services.PaymentAccountCreate paymentAccountCreate = SampleRequests.sampleServicesPaymentAccountCreate();
		String response = paymentAccountCreate.send();
		return response;
	}

	public static String sampleScheduledTaskDelete() {
		request.Services.ScheduledTaskDelete scheduledTaskDelete = SampleRequests.sampleServicesScheduledTaskDelete();
		String response = scheduledTaskDelete.send();
		return response;
	}

	public static String sampleScheduledTaskUpdate() {
		request.Services.ScheduledTaskUpdate scheduledTaskUpdate = SampleRequests.sampleServicesScheduledTaskUpdate();
		String response = scheduledTaskUpdate.send();
		return response;
	}

	public static String samplePaymentAccountUpdate() {
		request.Services.PaymentAccountUpdate paymentAccountUpdate = SampleRequests.sampleServicesPaymentAccountUpdate();
		String response = paymentAccountUpdate.send();
		return response;
	}

	public static String sampleUpdatePlan() {
		request.Services.UpdatePlan updatePlan = SampleRequests.sampleServicesUpdatePlan();
		String response = updatePlan.send();
		return response;
	}

}
