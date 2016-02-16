package request.Model;


public class Terminal {
    private String terminalID = null;
    private String capability = null;
	private String entryMode = null;
	private String cardholderID = null;
	private String capabilityOfCatTerminal = null;

	public String getTerminalID() {
		return terminalID;
	}
	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}
	public String getCapability() {
        return capability;
    }
    public void setCapability(Capability name) {
        this.capability = name.toString();
    }
	public String getEntryMode() {
        return entryMode;
    }
    public void setEntryMode(EntryMode name) {
        this.entryMode = name.toString();
    }
	public String getCardholderID() {
        return cardholderID;
    }
    public void setCardholderID(CardholderID name) {
        this.cardholderID = name.toString();
    }
	public String getCapabilityOfCatTerminal() {
        return capabilityOfCatTerminal;
    }
    public void setCapabilityOfCatTerminal(CapabilityOfCatTerminal name) {
        this.capabilityOfCatTerminal = name.toString();
    }
	public enum Capability {
        NOT_USED("notused"),
		MAG_STRIPE("magstripe"),
		KEYED_ONLY("keyedonly");

        private String value;
        private Capability(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum EntryMode {
        NOT_USED("notused"),
		KEYED("keyed"),
		TRACK1("track1"),
		TRACK2("track2"),
		COMPLETE_READ("completeread");

        private String value;
        private EntryMode(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum CardholderID {
        SIGNATURE("signature"),
		PIN("pin"),
		NO_PIN("nopin"),
		DIRECT_MARKET("directmarket");

        private String value;
        private CardholderID(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum CapabilityOfCatTerminal {
        SELF_SERVICE("self service");

        private String value;
        private CapabilityOfCatTerminal(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}