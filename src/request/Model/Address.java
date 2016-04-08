package request.Model;


public class Address {
    private String billingName = null;
	private String billingFirstName = null;
	private String billingMiddleInitial = null;
	private String billingLastName = null;
	private String billingCompanyName = null;
	private String billingAddress1 = null;
	private String billingAddress2 = null;
	private String billingAddress3 = null;
	private String billingCity = null;
	private String billingState = null;
	private String billingZipcode = null;
	private String billingEmail = null;
	private String billingPhone = null;
	private String shippingName = null;
	private String shippingFirstName = null;
	private String shippingMiddleInitial = null;
	private String shippingLastName = null;
	private String shippingCompanyName = null;
	private String shippingAddress1 = null;
	private String shippingAddress2 = null;
	private String shippingAddress3 = null;
	private String shippingCity = null;
	private String shippingState = null;
	private String shippingZipcode = null;
	private String shippingEmail = null;
	private String shippingPhone = null;
    private String billingCountry = null;
	private String shippingCountry = null;

	public String getBillingName() {
		return billingName;
	}
	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}
	public String getBillingFirstName() {
		return billingFirstName;
	}
	public void setBillingFirstName(String billingFirstName) {
		this.billingFirstName = billingFirstName;
	}
	public String getBillingMiddleInitial() {
		return billingMiddleInitial;
	}
	public void setBillingMiddleInitial(String billingMiddleInitial) {
		this.billingMiddleInitial = billingMiddleInitial;
	}
	public String getBillingLastName() {
		return billingLastName;
	}
	public void setBillingLastName(String billingLastName) {
		this.billingLastName = billingLastName;
	}
	public String getBillingCompanyName() {
		return billingCompanyName;
	}
	public void setBillingCompanyName(String billingCompanyName) {
		this.billingCompanyName = billingCompanyName;
	}
	public String getBillingAddress1() {
		return billingAddress1;
	}
	public void setBillingAddress1(String billingAddress1) {
		this.billingAddress1 = billingAddress1;
	}
	public String getBillingAddress2() {
		return billingAddress2;
	}
	public void setBillingAddress2(String billingAddress2) {
		this.billingAddress2 = billingAddress2;
	}
	public String getBillingAddress3() {
		return billingAddress3;
	}
	public void setBillingAddress3(String billingAddress3) {
		this.billingAddress3 = billingAddress3;
	}
	public String getBillingCity() {
		return billingCity;
	}
	public void setBillingCity(String billingCity) {
		this.billingCity = billingCity;
	}
	public String getBillingState() {
		return billingState;
	}
	public void setBillingState(String billingState) {
		this.billingState = billingState;
	}
	public String getBillingZipcode() {
		return billingZipcode;
	}
	public void setBillingZipcode(String billingZipcode) {
		this.billingZipcode = billingZipcode;
	}
	public String getBillingEmail() {
		return billingEmail;
	}
	public void setBillingEmail(String billingEmail) {
		this.billingEmail = billingEmail;
	}
	public String getBillingPhone() {
		return billingPhone;
	}
	public void setBillingPhone(String billingPhone) {
		this.billingPhone = billingPhone;
	}
	public String getShippingName() {
		return shippingName;
	}
	public void setShippingName(String shippingName) {
		this.shippingName = shippingName;
	}
	public String getShippingFirstName() {
		return shippingFirstName;
	}
	public void setShippingFirstName(String shippingFirstName) {
		this.shippingFirstName = shippingFirstName;
	}
	public String getShippingMiddleInitial() {
		return shippingMiddleInitial;
	}
	public void setShippingMiddleInitial(String shippingMiddleInitial) {
		this.shippingMiddleInitial = shippingMiddleInitial;
	}
	public String getShippingLastName() {
		return shippingLastName;
	}
	public void setShippingLastName(String shippingLastName) {
		this.shippingLastName = shippingLastName;
	}
	public String getShippingCompanyName() {
		return shippingCompanyName;
	}
	public void setShippingCompanyName(String shippingCompanyName) {
		this.shippingCompanyName = shippingCompanyName;
	}
	public String getShippingAddress1() {
		return shippingAddress1;
	}
	public void setShippingAddress1(String shippingAddress1) {
		this.shippingAddress1 = shippingAddress1;
	}
	public String getShippingAddress2() {
		return shippingAddress2;
	}
	public void setShippingAddress2(String shippingAddress2) {
		this.shippingAddress2 = shippingAddress2;
	}
	public String getShippingAddress3() {
		return shippingAddress3;
	}
	public void setShippingAddress3(String shippingAddress3) {
		this.shippingAddress3 = shippingAddress3;
	}
	public String getShippingCity() {
		return shippingCity;
	}
	public void setShippingCity(String shippingCity) {
		this.shippingCity = shippingCity;
	}
	public String getShippingState() {
		return shippingState;
	}
	public void setShippingState(String shippingState) {
		this.shippingState = shippingState;
	}
	public String getShippingZipcode() {
		return shippingZipcode;
	}
	public void setShippingZipcode(String shippingZipcode) {
		this.shippingZipcode = shippingZipcode;
	}
	public String getShippingEmail() {
		return shippingEmail;
	}
	public void setShippingEmail(String shippingEmail) {
		this.shippingEmail = shippingEmail;
	}
	public String getShippingPhone() {
		return shippingPhone;
	}
	public void setShippingPhone(String shippingPhone) {
		this.shippingPhone = shippingPhone;
	}
	public String getBillingCountry() {
        return billingCountry;
    }
    public void setBillingCountry(BillingCountry name) {
        this.billingCountry = name.toString();
    }
	public String getShippingCountry() {
        return shippingCountry;
    }
    public void setShippingCountry(ShippingCountry name) {
        this.shippingCountry = name.toString();
    }
	public enum BillingCountry {
        USA("USA"),
		AF("AF"),
		AX("AX"),
		AL("AL"),
		DZ("DZ"),
		AS("AS"),
		AD("AD"),
		AO("AO"),
		AI("AI"),
		AQ("AQ"),
		AG("AG"),
		AR("AR"),
		AM("AM"),
		AW("AW"),
		AU("AU"),
		AT("AT"),
		AZ("AZ"),
		BS("BS"),
		BH("BH"),
		BD("BD"),
		BB("BB"),
		BY("BY"),
		BE("BE"),
		BZ("BZ"),
		BJ("BJ"),
		BM("BM"),
		BT("BT"),
		BO("BO"),
		BQ("BQ"),
		BA("BA"),
		BW("BW"),
		BV("BV"),
		BR("BR"),
		IO("IO"),
		BN("BN"),
		BG("BG"),
		BF("BF"),
		BI("BI"),
		KH("KH"),
		CM("CM"),
		CA("CA"),
		CV("CV"),
		KY("KY"),
		CF("CF"),
		TD("TD"),
		CL("CL"),
		CN("CN"),
		CX("CX"),
		CC("CC"),
		CO("CO"),
		KM("KM"),
		CG("CG"),
		CD("CD"),
		CK("CK"),
		CR("CR"),
		CI("CI"),
		HR("HR"),
		CU("CU"),
		CW("CW"),
		CY("CY"),
		CZ("CZ"),
		DK("DK"),
		DJ("DJ"),
		DM("DM"),
		DO("DO"),
		TL("TL"),
		EC("EC"),
		EG("EG"),
		SV("SV"),
		GQ("GQ"),
		ER("ER"),
		EE("EE"),
		ET("ET"),
		FK("FK"),
		FO("FO"),
		FJ("FJ"),
		FI("FI"),
		FR("FR"),
		GF("GF"),
		PF("PF"),
		TF("TF"),
		GA("GA"),
		GM("GM"),
		GE("GE"),
		DE("DE"),
		GH("GH"),
		GI("GI"),
		GR("GR"),
		GL("GL"),
		GD("GD"),
		GP("GP"),
		GU("GU"),
		GT("GT"),
		GG("GG"),
		GN("GN"),
		GW("GW"),
		GY("GY"),
		HT("HT"),
		HM("HM"),
		HN("HN"),
		HK("HK"),
		HU("HU"),
		IS("IS"),
		IN("IN"),
		ID("ID"),
		IR("IR"),
		IQ("IQ"),
		IE("IE"),
		IM("IM"),
		IL("IL"),
		IT("IT"),
		JM("JM"),
		JP("JP"),
		JE("JE"),
		JO("JO"),
		KZ("KZ"),
		KE("KE"),
		KI("KI"),
		KP("KP"),
		KR("KR"),
		KW("KW"),
		KG("KG"),
		LA("LA"),
		LV("LV"),
		LB("LB"),
		LS("LS"),
		LR("LR"),
		LY("LY"),
		LI("LI"),
		LT("LT"),
		LU("LU"),
		MO("MO"),
		MK("MK"),
		MG("MG"),
		MW("MW"),
		MY("MY"),
		MV("MV"),
		ML("ML"),
		MT("MT"),
		MH("MH"),
		MQ("MQ"),
		MR("MR"),
		MU("MU"),
		YT("YT"),
		MX("MX"),
		FM("FM"),
		MD("MD"),
		MC("MC"),
		MN("MN"),
		MS("MS"),
		MA("MA"),
		MZ("MZ"),
		MM("MM"),
		NA("NA"),
		NR("NR"),
		NP("NP"),
		NL("NL"),
		AN("AN"),
		NC("NC"),
		NZ("NZ"),
		NI("NI"),
		NE("NE"),
		NG("NG"),
		NU("NU"),
		NF("NF"),
		MP("MP"),
		NO("NO"),
		OM("OM"),
		PK("PK"),
		PW("PW"),
		PS("PS"),
		PA("PA"),
		PG("PG"),
		PY("PY"),
		PE("PE"),
		PH("PH"),
		PN("PN"),
		PL("PL"),
		PT("PT"),
		PR("PR"),
		QA("QA"),
		RE("RE"),
		RO("RO"),
		RU("RU"),
		RW("RW"),
		BL("BL"),
		KN("KN"),
		LC("LC"),
		MF("MF"),
		VC("VC"),
		WS("WS"),
		SM("SM"),
		ST("ST"),
		SA("SA"),
		SN("SN"),
		SC("SC"),
		SL("SL"),
		SG("SG"),
		SX("SX"),
		SK("SK"),
		SI("SI"),
		SB("SB"),
		SO("SO"),
		ZA("ZA"),
		GS("GS"),
		ES("ES"),
		LK("LK"),
		SH("SH"),
		PM("PM"),
		SD("SD"),
		SR("SR"),
		SJ("SJ"),
		SZ("SZ"),
		SE("SE"),
		CH("CH"),
		SY("SY"),
		TW("TW"),
		TJ("TJ"),
		TZ("TZ"),
		TH("TH"),
		TG("TG"),
		TK("TK"),
		TO("TO"),
		TT("TT"),
		TN("TN"),
		TR("TR"),
		TM("TM"),
		TC("TC"),
		TV("TV"),
		UG("UG"),
		UA("UA"),
		AE("AE"),
		GB("GB"),
		US("US"),
		UM("UM"),
		UY("UY"),
		UZ("UZ"),
		VU("VU"),
		VA("VA"),
		VE("VE"),
		VN("VN"),
		VG("VG"),
		VI("VI"),
		WF("WF"),
		EH("EH"),
		YE("YE"),
		ZM("ZM"),
		ZW("ZW"),
		RS("RS"),
		ME("ME"),
		SS("SS");

        private String value;
        private BillingCountry(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
	public enum ShippingCountry {
        USA("USA"),
		AF("AF"),
		AX("AX"),
		AL("AL"),
		DZ("DZ"),
		AS("AS"),
		AD("AD"),
		AO("AO"),
		AI("AI"),
		AQ("AQ"),
		AG("AG"),
		AR("AR"),
		AM("AM"),
		AW("AW"),
		AU("AU"),
		AT("AT"),
		AZ("AZ"),
		BS("BS"),
		BH("BH"),
		BD("BD"),
		BB("BB"),
		BY("BY"),
		BE("BE"),
		BZ("BZ"),
		BJ("BJ"),
		BM("BM"),
		BT("BT"),
		BO("BO"),
		BQ("BQ"),
		BA("BA"),
		BW("BW"),
		BV("BV"),
		BR("BR"),
		IO("IO"),
		BN("BN"),
		BG("BG"),
		BF("BF"),
		BI("BI"),
		KH("KH"),
		CM("CM"),
		CA("CA"),
		CV("CV"),
		KY("KY"),
		CF("CF"),
		TD("TD"),
		CL("CL"),
		CN("CN"),
		CX("CX"),
		CC("CC"),
		CO("CO"),
		KM("KM"),
		CG("CG"),
		CD("CD"),
		CK("CK"),
		CR("CR"),
		CI("CI"),
		HR("HR"),
		CU("CU"),
		CW("CW"),
		CY("CY"),
		CZ("CZ"),
		DK("DK"),
		DJ("DJ"),
		DM("DM"),
		DO("DO"),
		TL("TL"),
		EC("EC"),
		EG("EG"),
		SV("SV"),
		GQ("GQ"),
		ER("ER"),
		EE("EE"),
		ET("ET"),
		FK("FK"),
		FO("FO"),
		FJ("FJ"),
		FI("FI"),
		FR("FR"),
		GF("GF"),
		PF("PF"),
		TF("TF"),
		GA("GA"),
		GM("GM"),
		GE("GE"),
		DE("DE"),
		GH("GH"),
		GI("GI"),
		GR("GR"),
		GL("GL"),
		GD("GD"),
		GP("GP"),
		GU("GU"),
		GT("GT"),
		GG("GG"),
		GN("GN"),
		GW("GW"),
		GY("GY"),
		HT("HT"),
		HM("HM"),
		HN("HN"),
		HK("HK"),
		HU("HU"),
		IS("IS"),
		IN("IN"),
		ID("ID"),
		IR("IR"),
		IQ("IQ"),
		IE("IE"),
		IM("IM"),
		IL("IL"),
		IT("IT"),
		JM("JM"),
		JP("JP"),
		JE("JE"),
		JO("JO"),
		KZ("KZ"),
		KE("KE"),
		KI("KI"),
		KP("KP"),
		KR("KR"),
		KW("KW"),
		KG("KG"),
		LA("LA"),
		LV("LV"),
		LB("LB"),
		LS("LS"),
		LR("LR"),
		LY("LY"),
		LI("LI"),
		LT("LT"),
		LU("LU"),
		MO("MO"),
		MK("MK"),
		MG("MG"),
		MW("MW"),
		MY("MY"),
		MV("MV"),
		ML("ML"),
		MT("MT"),
		MH("MH"),
		MQ("MQ"),
		MR("MR"),
		MU("MU"),
		YT("YT"),
		MX("MX"),
		FM("FM"),
		MD("MD"),
		MC("MC"),
		MN("MN"),
		MS("MS"),
		MA("MA"),
		MZ("MZ"),
		MM("MM"),
		NA("NA"),
		NR("NR"),
		NP("NP"),
		NL("NL"),
		AN("AN"),
		NC("NC"),
		NZ("NZ"),
		NI("NI"),
		NE("NE"),
		NG("NG"),
		NU("NU"),
		NF("NF"),
		MP("MP"),
		NO("NO"),
		OM("OM"),
		PK("PK"),
		PW("PW"),
		PS("PS"),
		PA("PA"),
		PG("PG"),
		PY("PY"),
		PE("PE"),
		PH("PH"),
		PN("PN"),
		PL("PL"),
		PT("PT"),
		PR("PR"),
		QA("QA"),
		RE("RE"),
		RO("RO"),
		RU("RU"),
		RW("RW"),
		BL("BL"),
		KN("KN"),
		LC("LC"),
		MF("MF"),
		VC("VC"),
		WS("WS"),
		SM("SM"),
		ST("ST"),
		SA("SA"),
		SN("SN"),
		SC("SC"),
		SL("SL"),
		SG("SG"),
		SX("SX"),
		SK("SK"),
		SI("SI"),
		SB("SB"),
		SO("SO"),
		ZA("ZA"),
		GS("GS"),
		ES("ES"),
		LK("LK"),
		SH("SH"),
		PM("PM"),
		SD("SD"),
		SR("SR"),
		SJ("SJ"),
		SZ("SZ"),
		SE("SE"),
		CH("CH"),
		SY("SY"),
		TW("TW"),
		TJ("TJ"),
		TZ("TZ"),
		TH("TH"),
		TG("TG"),
		TK("TK"),
		TO("TO"),
		TT("TT"),
		TN("TN"),
		TR("TR"),
		TM("TM"),
		TC("TC"),
		TV("TV"),
		UG("UG"),
		UA("UA"),
		AE("AE"),
		GB("GB"),
		US("US"),
		UM("UM"),
		UY("UY"),
		UZ("UZ"),
		VU("VU"),
		VA("VA"),
		VE("VE"),
		VN("VN"),
		VG("VG"),
		VI("VI"),
		WF("WF"),
		EH("EH"),
		YE("YE"),
		ZM("ZM"),
		ZW("ZW"),
		RS("RS"),
		ME("ME"),
		SS("SS");

        private String value;
        private ShippingCountry(String value) {
            this.value = value;
        }
        public String toString() {return value;}
    }
}