package request.Model;


public class RecyclingRequest {
    private String recycleID = null;
    private String recycleBy = null;

	public String getRecycleID() {
		return recycleID;
	}
	public void setRecycleID(String recycleID) {
		this.recycleID = recycleID;
	}
	public String getRecycleBy() {
        return recycleBy;
    }
    public void setRecycleBy(RecycleBy name) {
        this.recycleBy = name.toString();
    }
	public enum RecycleBy {
        MERCHANT("Merchant"),
		LITLE("Litle"),
		NONE("None");

        private String value;
        private RecycleBy(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}