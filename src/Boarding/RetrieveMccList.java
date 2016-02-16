package request.Boarding;

import request.Request;


public class RetrieveMccList extends Request<RetrieveMccList>  {
	

    public RetrieveMccList() {
        super("boarding", "services", "retrieveMccList", "GET");
        
    }

	
}