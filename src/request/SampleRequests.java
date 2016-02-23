package request;

import request.Model.*;

public class SampleRequests {

    public static request.Credit.Authorization sampleCreditAuthorization() {
        request.Credit.Authorization authorization = new request.Credit.Authorization();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        authorization.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        authorization.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("10.00");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        authorization.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        authorization.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        authorization.setApplication(application);

        return authorization;
    }

	public static request.Credit.Reversal sampleCreditReversal(String transactionID) {
        request.Credit.Reversal reversal = new request.Credit.Reversal();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        reversal.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        reversal.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        reversal.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        reversal.setApplication(application);

        return reversal;
    }

	public static request.Credit.AuthorizationCompletion sampleCreditAuthorizationCompletion(String transactionID) {
        request.Credit.AuthorizationCompletion authorizationCompletion = new request.Credit.AuthorizationCompletion();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        authorizationCompletion.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        authorizationCompletion.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        authorizationCompletion.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        authorizationCompletion.setApplication(application);

        return authorizationCompletion;
    }

	public static request.Credit.CaptureGivenAuth sampleCreditCaptureGivenAuth() {
        request.Credit.CaptureGivenAuth captureGivenAuth = new request.Credit.CaptureGivenAuth();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        captureGivenAuth.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        captureGivenAuth.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setAuthorizationDate("1111-11-11");
		transaction.setApprovalNumber("1234");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        captureGivenAuth.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        captureGivenAuth.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        captureGivenAuth.setApplication(application);

        return captureGivenAuth;
    }

	public static request.Credit.Credit sampleCreditCredit(String transactionID) {
        request.Credit.Credit credit = new request.Credit.Credit();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        credit.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        credit.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        credit.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        credit.setApplication(application);

        return credit;
    }

	public static request.Credit.Force sampleCreditForce() {
        request.Credit.Force force = new request.Credit.Force();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        force.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        force.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        force.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        force.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        force.setApplication(application);

        return force;
    }

	public static request.Credit.Return sampleCreditReturn() {
        request.Credit.Return return_ = new request.Credit.Return();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        return_.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        return_.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("123");
		transaction.setTransactionAmount("10.00");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        return_.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        return_.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        return_.setApplication(application);

        return return_;
    }

	public static request.Credit.Sale sampleCreditSale() {
        request.Credit.Sale sale = new request.Credit.Sale();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        sale.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        sale.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        sale.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        sale.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        sale.setApplication(application);

        return sale;
    }

	public static request.Credit.Void sampleCreditVoid(String transactionID) {
        request.Credit.Void void_ = new request.Credit.Void();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        void_.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        void_.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        void_.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        void_.setApplication(application);

        return void_;
    }


	public static request.Check.Credit sampleCheckCredit(String transactionID) {
        request.Check.Credit credit = new request.Check.Credit();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        credit.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        credit.setTransaction(transaction);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        credit.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        credit.setApplication(application);

        return credit;
    }

	public static request.Check.Return sampleCheckReturn() {
        request.Check.Return return_ = new request.Check.Return();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        return_.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("708388073320126000");
		transaction.setTransactionAmount("12.56");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        return_.setTransaction(transaction);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setAccountNumber("234");
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setCheckNumber("456");
		demandDepositAccount.setCCDPaymentInformation("567");
        return_.setDemandDepositAccount(demandDepositAccount);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        return_.setAddress(address);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        return_.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        return_.setApplication(application);

        return return_;
    }

	public static request.Check.Sale sampleCheckSale() {
        request.Check.Sale sale = new request.Check.Sale();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        sale.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        sale.setTransaction(transaction);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        sale.setAddress(address);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setCheckNumber("456");
        sale.setDemandDepositAccount(demandDepositAccount);

		PaymentAccount paymentAccount = new PaymentAccount();
		paymentAccount.setPaymentAccountID("1232343454565");
        sale.setPaymentAccount(paymentAccount);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        sale.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        sale.setApplication(application);

        return sale;
    }

	public static request.Check.Verification sampleCheckVerification() {
        request.Check.Verification verification = new request.Check.Verification();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        verification.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        verification.setTransaction(transaction);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        verification.setAddress(address);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setAccountNumber("234");
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setCheckNumber("456");
		demandDepositAccount.setCCDPaymentInformation("567");
        verification.setDemandDepositAccount(demandDepositAccount);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        verification.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        verification.setApplication(application);

        return verification;
    }

	public static request.Check.Void sampleCheckVoid(String transactionID) {
        request.Check.Void void_ = new request.Check.Void();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        void_.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        void_.setTransaction(transaction);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        void_.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        void_.setApplication(application);

        return void_;
    }


	public static request.Services.CreatePlan sampleServicesCreatePlan() {
        request.Services.CreatePlan createPlan = new request.Services.CreatePlan();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        createPlan.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setActive("true");
		scheduledTask.setScheduledTaskID("12");
		scheduledTask.setName("NewPlan");
		scheduledTask.setDescription("Created New Plan");
		scheduledTask.setRunFrequency("WEEKLY");
		scheduledTask.setAmount("12.00");
		scheduledTask.setRunCycles("5");
		scheduledTask.setTrialRunCycles("7");
		scheduledTask.setTrialRunFrequency("DAY");
        createPlan.setScheduledTask(scheduledTask);

        return createPlan;
    }

	public static request.Services.FraudCheck sampleServicesFraudCheck() {
        request.Services.FraudCheck fraudCheck = new request.Services.FraudCheck();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        fraudCheck.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        fraudCheck.setReports(reports);

		AdvancedFraudChecks advancedFraudChecks = new AdvancedFraudChecks();
		advancedFraudChecks.setThreatMetrixSessionID("123");
        fraudCheck.setAdvancedFraudChecks(advancedFraudChecks);

		Application application = new Application();
		application.setApplicationID("1234");
        fraudCheck.setApplication(application);

        return fraudCheck;
    }

	public static request.Services.PaymentAccountCreate sampleServicesPaymentAccountCreate() {
        request.Services.PaymentAccountCreate paymentAccountCreate = new request.Services.PaymentAccountCreate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        paymentAccountCreate.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        paymentAccountCreate.setReports(reports);

		Card card = new Card();
		card.setAccountNumber("5454545454545454");
        paymentAccountCreate.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        paymentAccountCreate.setApplication(application);

        return paymentAccountCreate;
    }

	public static request.Services.ScheduledTaskDelete sampleServicesScheduledTaskDelete() {
        request.Services.ScheduledTaskDelete scheduledTaskDelete = new request.Services.ScheduledTaskDelete();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        scheduledTaskDelete.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setSubscriptionID("12432463563564");
        scheduledTaskDelete.setScheduledTask(scheduledTask);

        return scheduledTaskDelete;
    }

	public static request.Services.ScheduledTaskUpdate sampleServicesScheduledTaskUpdate() {
        request.Services.ScheduledTaskUpdate scheduledTaskUpdate = new request.Services.ScheduledTaskUpdate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        scheduledTaskUpdate.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setSubscriptionID("12432463563564");
		scheduledTask.setBillingDate("2019-10-21");
        scheduledTaskUpdate.setScheduledTask(scheduledTask);

        return scheduledTaskUpdate;
    }

	public static request.Services.PaymentAccountUpdate sampleServicesPaymentAccountUpdate() {
        request.Services.PaymentAccountUpdate paymentAccountUpdate = new request.Services.PaymentAccountUpdate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        paymentAccountUpdate.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        paymentAccountUpdate.setReports(reports);

		Card card = new Card();
		card.setCVV("123");
        paymentAccountUpdate.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        paymentAccountUpdate.setApplication(application);

		PaymentAccount paymentAccount = new PaymentAccount();
		paymentAccount.setPaymentAccountID("1112000188575454");
        paymentAccountUpdate.setPaymentAccount(paymentAccount);

        return paymentAccountUpdate;
    }

	public static request.Services.UpdatePlan sampleServicesUpdatePlan() {
        request.Services.UpdatePlan updatePlan = new request.Services.UpdatePlan();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        updatePlan.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setActive("false");
		scheduledTask.setScheduledTaskID("12");
        updatePlan.setScheduledTask(scheduledTask);

        return updatePlan;
    }


	public static request.Boarding.RetrieveMccList sampleBoardingRetrieveMccList() {
        request.Boarding.RetrieveMccList retrieveMccList = new request.Boarding.RetrieveMccList();

        

        return retrieveMccList;
    }

	public static request.Boarding.CreateLegalEntity sampleBoardingCreateLegalEntity() {
        request.Boarding.CreateLegalEntity createLegalEntity = new request.Boarding.CreateLegalEntity();

        LegalEntity legalEntity = new LegalEntity();
		legalEntity.setName("Legal Entity Name");
		legalEntity.setType("CORPORATION");
		legalEntity.setTaxID("12345");
		legalEntity.setAnnualCreditCardSalesVolume("80000000");
		legalEntity.setHasAcceptedCreditCards("true");
		legalEntity.setYearsInBusiness("12");
        createLegalEntity.setLegalEntity(legalEntity);

		Address address = new Address();
		address.setAddress1("Street Address 1");
		address.setAddress2("Street Address 2");
		address.setCity("City");
		address.setState("MA");
		address.setZip("01730");
		address.setCountry("USA");
        createLegalEntity.setAddress(address);

		Principal principal = new Principal();
		principal.setTitle("Chief Financial Officer");
		principal.setFirstName("p first");
		principal.setLastName("p last");
		principal.setEmail("emailAddress");
		principal.setSSN("123459876");
		principal.setContactPhone("7817659800");
		principal.setDateOfBirth("1980-10-12");
		principal.setDriversLicense("892327409832");
		principal.setDriversLicenseState("MA");
		Address principalAddress = new Address();
		principalAddress.setAddress1("Street Address 1");
		principalAddress.setAddress2("Street Address 2");
		principalAddress.setCity("Boston");
		principalAddress.setState("MA");
		principalAddress.setZip("01890");
		principalAddress.setCountry("USA");
        principal.setAddress(principalAddress);
        createLegalEntity.setPrincipal(principal);

        return createLegalEntity;
    }

	public static request.Boarding.CreateSubMerchant sampleBoardingCreateSubMerchant() {
        request.Boarding.CreateSubMerchant createSubMerchant = new request.Boarding.CreateSubMerchant("82915251623280808");

        Merchant merchant = new Merchant();
		merchant.setName("Merchant Name");
		merchant.setURL("http://merchantUrl");
		merchant.setCustomerServiceNumber("8407809000");
		merchant.setHardCodedBillingDescriptor("billing Descriptor");
		merchant.setMaxTransactionAmount("8400");
		merchant.setCategoryCode("5074");
		merchant.setBankRoutingNumber("011103093");
		merchant.setBankAccountNumber("84012312415");
		merchant.setPSPMerchantID("123456");
		merchant.setSettlementCurrency("USD");
		merchant.setFraudEnabled("true");
        createSubMerchant.setMerchant(merchant);

		Address address = new Address();
		address.setAddress1("Street Address 1");
		address.setAddress2("Street Address 2");
		address.setCity("City");
		address.setState("MA");
		address.setZip("01730");
		address.setCountry("USA");
        createSubMerchant.setAddress(address);

		PrimaryContact primaryContact = new PrimaryContact();
		primaryContact.setFirstName("John");
		primaryContact.setLastName("Doe");
		primaryContact.setPhone("9785552222");
		primaryContact.setEmail("John.Doe@company.com");
        createSubMerchant.setPrimaryContact(primaryContact);

        return createSubMerchant;
    }

	public static request.Boarding.RetrieveLegalEntity sampleBoardingRetrieveLegalEntity() {
        request.Boarding.RetrieveLegalEntity retrieveLegalEntity = new request.Boarding.RetrieveLegalEntity("82915251623280808");

        

        return retrieveLegalEntity;
    }

	public static request.Boarding.RetrieveSubMerchant sampleBoardingRetrieveSubMerchant() {
        request.Boarding.RetrieveSubMerchant retrieveSubMerchant = new request.Boarding.RetrieveSubMerchant("82915251623280808", "82915269567038420");

        

        return retrieveSubMerchant;
    }

	public static request.Boarding.UpdateLegalEntity sampleBoardingUpdateLegalEntity() {
        request.Boarding.UpdateLegalEntity updateLegalEntity = new request.Boarding.UpdateLegalEntity("82915251623280808");

        Address address = new Address();
		address.setAddress1("Street Address 1");
		address.setAddress2("Street Address 2");
		address.setCity("City");
		address.setState("MA");
		address.setZip("01730");
		address.setCountry("USA");
        updateLegalEntity.setAddress(address);

        return updateLegalEntity;
    }

	public static request.Boarding.UpdateSubMerchant sampleBoardingUpdateSubMerchant() {
        request.Boarding.UpdateSubMerchant updateSubMerchant = new request.Boarding.UpdateSubMerchant("82915251623280808", "82915269567038420");

        Merchant merchant = new Merchant();
		merchant.setFraudEnabled("true");
        updateSubMerchant.setMerchant(merchant);

        return updateSubMerchant;
    }

}