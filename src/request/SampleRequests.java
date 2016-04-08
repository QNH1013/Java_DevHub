package request;

import request.Model.*;

public class SampleRequests {

    public static request.Credit.Authorization sampleCreditAuthorization() {
        request.Credit.Authorization authorizationRequest = new request.Credit.Authorization();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        authorizationRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        authorizationRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("10.00");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        authorizationRequest.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        authorizationRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        authorizationRequest.setApplication(application);

        return authorizationRequest;
    }

	public static request.Credit.Reversal sampleCreditReversal(String transactionID) {
        request.Credit.Reversal reversalRequest = new request.Credit.Reversal();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        reversalRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        reversalRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        reversalRequest.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        reversalRequest.setApplication(application);

        return reversalRequest;
    }

	public static request.Credit.AuthorizationCompletion sampleCreditAuthorizationCompletion(String transactionID) {
        request.Credit.AuthorizationCompletion authorizationCompletionRequest = new request.Credit.AuthorizationCompletion();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        authorizationCompletionRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        authorizationCompletionRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        authorizationCompletionRequest.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        authorizationCompletionRequest.setApplication(application);

        return authorizationCompletionRequest;
    }

	public static request.Credit.CaptureGivenAuth sampleCreditCaptureGivenAuth() {
        request.Credit.CaptureGivenAuth captureGivenAuthRequest = new request.Credit.CaptureGivenAuth();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        captureGivenAuthRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        captureGivenAuthRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setAuthorizationDate("1111-11-11");
		transaction.setApprovalNumber("1234");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        captureGivenAuthRequest.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        captureGivenAuthRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        captureGivenAuthRequest.setApplication(application);

        return captureGivenAuthRequest;
    }

	public static request.Credit.Credit sampleCreditCredit(String transactionID) {
        request.Credit.Credit creditRequest = new request.Credit.Credit();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        creditRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        creditRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        creditRequest.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        creditRequest.setApplication(application);

        return creditRequest;
    }

	public static request.Credit.Force sampleCreditForce() {
        request.Credit.Force forceRequest = new request.Credit.Force();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        forceRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        forceRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        forceRequest.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        forceRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        forceRequest.setApplication(application);

        return forceRequest;
    }

	public static request.Credit.Return sampleCreditReturn() {
        request.Credit.Return returnRequest = new request.Credit.Return();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        returnRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        returnRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("123");
		transaction.setTransactionAmount("10.00");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        returnRequest.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        returnRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        returnRequest.setApplication(application);

        return returnRequest;
    }

	public static request.Credit.Sale sampleCreditSale() {
        request.Credit.Sale saleRequest = new request.Credit.Sale();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        saleRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        saleRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        saleRequest.setTransaction(transaction);

		Card card = new Card();
		card.setCardNumber("4457010000000009");
		card.setExpirationMonth("01");
		card.setExpirationYear("16");
		card.setCVV("349");
		card.setType(Card.Type.VI);
        saleRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        saleRequest.setApplication(application);

        return saleRequest;
    }

	public static request.Credit.Void sampleCreditVoid(String transactionID) {
        request.Credit.Void voidRequest = new request.Credit.Void();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        voidRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        voidRequest.setReports(reports);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        voidRequest.setTransaction(transaction);

		Application application = new Application();
		application.setApplicationID("1234");
        voidRequest.setApplication(application);

        return voidRequest;
    }


	public static request.Check.Credit sampleCheckCredit(String transactionID) {
        request.Check.Credit creditRequest = new request.Check.Credit();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        creditRequest.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        creditRequest.setTransaction(transaction);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        creditRequest.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        creditRequest.setApplication(application);

        return creditRequest;
    }

	public static request.Check.Return sampleCheckReturn() {
        request.Check.Return returnRequest = new request.Check.Return();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        returnRequest.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("708388073320126000");
		transaction.setTransactionAmount("12.56");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        returnRequest.setTransaction(transaction);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setAccountNumber("234");
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setCheckNumber("456");
		demandDepositAccount.setCCDPaymentInformation("567");
        returnRequest.setDemandDepositAccount(demandDepositAccount);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        returnRequest.setAddress(address);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        returnRequest.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        returnRequest.setApplication(application);

        return returnRequest;
    }

	public static request.Check.Sale sampleCheckSale() {
        request.Check.Sale saleRequest = new request.Check.Sale();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        saleRequest.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        saleRequest.setTransaction(transaction);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        saleRequest.setAddress(address);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setCheckNumber("456");
        saleRequest.setDemandDepositAccount(demandDepositAccount);

		PaymentAccount paymentAccount = new PaymentAccount();
		paymentAccount.setPaymentAccountID("1232343454565");
        saleRequest.setPaymentAccount(paymentAccount);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        saleRequest.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        saleRequest.setApplication(application);

        return saleRequest;
    }

	public static request.Check.Verification sampleCheckVerification() {
        request.Check.Verification verificationRequest = new request.Check.Verification();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        verificationRequest.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setReferenceNumber("1");
		transaction.setTransactionAmount("100.10");
		transaction.setOrderSource(Transaction.OrderSource.ECOMMERCE);
        verificationRequest.setTransaction(transaction);

		Address address = new Address();
		address.setBillingName("John Smith");
		address.setBillingAddress1("1 Main St.");
		address.setBillingCity("Burlington");
		address.setBillingState("MA");
		address.setBillingZipcode("01803-3747");
		address.setBillingEmail("jdoe@litle.com");
		address.setBillingPhone("978-551-0040");
		address.setBillingCountry(Address.BillingCountry.USA);
        verificationRequest.setAddress(address);

		DemandDepositAccount demandDepositAccount = new DemandDepositAccount();
		demandDepositAccount.setDDAAccountType("Checking");
		demandDepositAccount.setAccountNumber("234");
		demandDepositAccount.setRoutingNumber("123234345");
		demandDepositAccount.setCheckNumber("456");
		demandDepositAccount.setCCDPaymentInformation("567");
        verificationRequest.setDemandDepositAccount(demandDepositAccount);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        verificationRequest.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        verificationRequest.setApplication(application);

        return verificationRequest;
    }

	public static request.Check.Void sampleCheckVoid(String transactionID) {
        request.Check.Void voidRequest = new request.Check.Void();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        voidRequest.setCredentials(credentials);

		Transaction transaction = new Transaction();
		transaction.setTransactionID(transactionID);
        voidRequest.setTransaction(transaction);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        voidRequest.setReports(reports);

		Application application = new Application();
		application.setApplicationID("1234");
        voidRequest.setApplication(application);

        return voidRequest;
    }


	public static request.Services.CreatePlan sampleServicesCreatePlan() {
        request.Services.CreatePlan createPlanRequest = new request.Services.CreatePlan();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        createPlanRequest.setCredentials(credentials);

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
        createPlanRequest.setScheduledTask(scheduledTask);

        return createPlanRequest;
    }

	public static request.Services.FraudCheck sampleServicesFraudCheck() {
        request.Services.FraudCheck fraudCheckRequest = new request.Services.FraudCheck();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        fraudCheckRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        fraudCheckRequest.setReports(reports);

		AdvancedFraudChecks advancedFraudChecks = new AdvancedFraudChecks();
		advancedFraudChecks.setThreatMetrixSessionID("123");
        fraudCheckRequest.setAdvancedFraudChecks(advancedFraudChecks);

		Application application = new Application();
		application.setApplicationID("1234");
        fraudCheckRequest.setApplication(application);

        return fraudCheckRequest;
    }

	public static request.Services.PaymentAccountCreate sampleServicesPaymentAccountCreate() {
        request.Services.PaymentAccountCreate paymentAccountCreateRequest = new request.Services.PaymentAccountCreate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        paymentAccountCreateRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        paymentAccountCreateRequest.setReports(reports);

		Card card = new Card();
		card.setAccountNumber("5454545454545454");
        paymentAccountCreateRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        paymentAccountCreateRequest.setApplication(application);

        return paymentAccountCreateRequest;
    }

	public static request.Services.ScheduledTaskDelete sampleServicesScheduledTaskDelete() {
        request.Services.ScheduledTaskDelete scheduledTaskDeleteRequest = new request.Services.ScheduledTaskDelete();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        scheduledTaskDeleteRequest.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setSubscriptionID("12432463563564");
        scheduledTaskDeleteRequest.setScheduledTask(scheduledTask);

        return scheduledTaskDeleteRequest;
    }

	public static request.Services.ScheduledTaskUpdate sampleServicesScheduledTaskUpdate() {
        request.Services.ScheduledTaskUpdate scheduledTaskUpdateRequest = new request.Services.ScheduledTaskUpdate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        scheduledTaskUpdateRequest.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setSubscriptionID("12432463563564");
		scheduledTask.setBillingDate("2019-10-21");
        scheduledTaskUpdateRequest.setScheduledTask(scheduledTask);

        return scheduledTaskUpdateRequest;
    }

	public static request.Services.PaymentAccountUpdate sampleServicesPaymentAccountUpdate() {
        request.Services.PaymentAccountUpdate paymentAccountUpdateRequest = new request.Services.PaymentAccountUpdate();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        paymentAccountUpdateRequest.setCredentials(credentials);

		Reports reports = new Reports();
		reports.setReportGroup("1243");
        paymentAccountUpdateRequest.setReports(reports);

		Card card = new Card();
		card.setCVV("123");
        paymentAccountUpdateRequest.setCard(card);

		Application application = new Application();
		application.setApplicationID("1234");
        paymentAccountUpdateRequest.setApplication(application);

		PaymentAccount paymentAccount = new PaymentAccount();
		paymentAccount.setPaymentAccountID("1112000188575454");
        paymentAccountUpdateRequest.setPaymentAccount(paymentAccount);

        return paymentAccountUpdateRequest;
    }

	public static request.Services.UpdatePlan sampleServicesUpdatePlan() {
        request.Services.UpdatePlan updatePlanRequest = new request.Services.UpdatePlan();

        Credentials credentials = new Credentials();
		credentials.setAcceptorID("1147003");
        updatePlanRequest.setCredentials(credentials);

		ScheduledTask scheduledTask = new ScheduledTask();
		scheduledTask.setActive("false");
		scheduledTask.setScheduledTaskID("12");
        updatePlanRequest.setScheduledTask(scheduledTask);

        return updatePlanRequest;
    }

}