package request.Boarding;

import request.Request;


public class RetrieveSubMerchant extends Request<RetrieveSubMerchant>  {
	

    public RetrieveSubMerchant(String entityID, String subMerchantID) {
        super("boarding", "services", "retrieveSubMerchant", "GET");
        super.queryParams.put("entityID",entityID);
		super.queryParams.put("subMerchantID",subMerchantID);
    }

	
}