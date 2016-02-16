package request.Boarding;

import request.Request;


public class RetrieveLegalEntity extends Request<RetrieveLegalEntity>  {
	

    public RetrieveLegalEntity(String entityID) {
        super("boarding", "services", "retrieveLegalEntity", "GET");
        super.queryParams.put("entityID",entityID);
    }

	
}