
package com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BankMpanOperationNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "bankMpanOperationNotifyRequest");
    private final static QName _TransNoDestination_QNAME = new QName("http://ws.tsm.cup.com/", "transNoDestination");
    private final static QName _TransTimeSource_QNAME = new QName("http://ws.tsm.cup.com/", "transTimeSource");
    private final static QName _OperationResultNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "operationResultNotifyRequest");
    private final static QName _MappingInquiryResponse_QNAME = new QName("http://ws.tsm.cup.com/", "mappingInquiryResponse");
    private final static QName _TriggerOtpResponse_QNAME = new QName("http://ws.tsm.cup.com/", "triggerOtpResponse");
    private final static QName _VerifyOtpRequest_QNAME = new QName("http://ws.tsm.cup.com/", "verifyOtpRequest");
    private final static QName _QuatoModifyNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "quatoModifyNotifyResponse");
    private final static QName _OperationResultNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "operationResultNotifyResponse");
    private final static QName _TriggerOtpRequest_QNAME = new QName("http://ws.tsm.cup.com/", "triggerOtpRequest");
    private final static QName _CupblackListSyncResponse_QNAME = new QName("http://ws.tsm.cup.com/", "cupblackListSyncResponse");
    private final static QName _MpanApplyExceptionNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "mpanApplyExceptionNotifyResponse");
    private final static QName _CupMpanOperationNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "cupMpanOperationNotifyRequest");
    private final static QName _MpanApplyExceptionNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "mpanApplyExceptionNotifyRequest");
    private final static QName _BankBlackListSyncRequest_QNAME = new QName("http://ws.tsm.cup.com/", "bankBlackListSyncRequest");
    private final static QName _InterfaceVersion_QNAME = new QName("http://ws.tsm.cup.com/", "interfaceVersion");
    private final static QName _BankMpanOperationNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "bankMpanOperationNotifyResponse");
    private final static QName _MappingNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "mappingNotifyRequest");
    private final static QName _TransactionNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "transactionNotifyResponse");
    private final static QName _MpanApplyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "mpanApplyRequest");
    private final static QName _TransNoSource_QNAME = new QName("http://ws.tsm.cup.com/", "transNoSource");
    private final static QName _Destination_QNAME = new QName("http://ws.tsm.cup.com/", "destination");
    private final static QName _MappingNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "mappingNotifyResponse");
    private final static QName _VerifyOtpResponse_QNAME = new QName("http://ws.tsm.cup.com/", "verifyOtpResponse");
    private final static QName _MpanCardMetaUpdateResponse_QNAME = new QName("http://ws.tsm.cup.com/", "mpanCardMetaUpdateResponse");
    private final static QName _CupblackListSyncRequest_QNAME = new QName("http://ws.tsm.cup.com/", "cupblackListSyncRequest");
    private final static QName _MappingInquiryRequest_QNAME = new QName("http://ws.tsm.cup.com/", "mappingInquiryRequest");
    private final static QName _BankBlackListSyncResponse_QNAME = new QName("http://ws.tsm.cup.com/", "bankBlackListSyncResponse");
    private final static QName _MpanCardMetaUpdateRequest_QNAME = new QName("http://ws.tsm.cup.com/", "mpanCardMetaUpdateRequest");
    private final static QName _TransactionNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "transactionNotifyRequest");
    private final static QName _Source_QNAME = new QName("http://ws.tsm.cup.com/", "source");
    private final static QName _QueryMpanStatusRequest_QNAME = new QName("http://ws.tsm.cup.com/", "queryMpanStatusRequest");
    private final static QName _MpanApplyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "mpanApplyResponse");
    private final static QName _QuatoModifyNotifyRequest_QNAME = new QName("http://ws.tsm.cup.com/", "quatoModifyNotifyRequest");
    private final static QName _TransType_QNAME = new QName("http://ws.tsm.cup.com/", "transType");
    private final static QName _QueryMpanStatusResponse_QNAME = new QName("http://ws.tsm.cup.com/", "queryMpanStatusResponse");
    private final static QName _TransTimeDestination_QNAME = new QName("http://ws.tsm.cup.com/", "transTimeDestination");
    private final static QName _CupMpanOperationNotifyResponse_QNAME = new QName("http://ws.tsm.cup.com/", "cupMpanOperationNotifyResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BankMpanOperationNotifyRequest }
     * 
     */
    public BankMpanOperationNotifyRequest createBankMpanOperationNotifyRequest() {
        return new BankMpanOperationNotifyRequest();
    }

    /**
     * Create an instance of {@link MappingInquiryResponse }
     * 
     */
    public MappingInquiryResponse createMappingInquiryResponse() {
        return new MappingInquiryResponse();
    }

    /**
     * Create an instance of {@link OperationResultNotifyRequest }
     * 
     */
    public OperationResultNotifyRequest createOperationResultNotifyRequest() {
        return new OperationResultNotifyRequest();
    }

    /**
     * Create an instance of {@link TriggerOtpResponse }
     * 
     */
    public TriggerOtpResponse createTriggerOtpResponse() {
        return new TriggerOtpResponse();
    }

    /**
     * Create an instance of {@link TriggerOtpRequest }
     * 
     */
    public TriggerOtpRequest createTriggerOtpRequest() {
        return new TriggerOtpRequest();
    }

    /**
     * Create an instance of {@link OperationResultNotifyResponse }
     * 
     */
    public OperationResultNotifyResponse createOperationResultNotifyResponse() {
        return new OperationResultNotifyResponse();
    }

    /**
     * Create an instance of {@link QuatoModifyNotifyResponse }
     * 
     */
    public QuatoModifyNotifyResponse createQuatoModifyNotifyResponse() {
        return new QuatoModifyNotifyResponse();
    }

    /**
     * Create an instance of {@link VerifyOtpRequest }
     * 
     */
    public VerifyOtpRequest createVerifyOtpRequest() {
        return new VerifyOtpRequest();
    }

    /**
     * Create an instance of {@link CupblackListSyncResponse }
     * 
     */
    public CupblackListSyncResponse createCupblackListSyncResponse() {
        return new CupblackListSyncResponse();
    }

    /**
     * Create an instance of {@link BankMpanOperationNotifyResponse }
     * 
     */
    public BankMpanOperationNotifyResponse createBankMpanOperationNotifyResponse() {
        return new BankMpanOperationNotifyResponse();
    }

    /**
     * Create an instance of {@link MappingNotifyRequest }
     * 
     */
    public MappingNotifyRequest createMappingNotifyRequest() {
        return new MappingNotifyRequest();
    }

    /**
     * Create an instance of {@link MpanApplyExceptionNotifyResponse }
     * 
     */
    public MpanApplyExceptionNotifyResponse createMpanApplyExceptionNotifyResponse() {
        return new MpanApplyExceptionNotifyResponse();
    }

    /**
     * Create an instance of {@link CupMpanOperationNotifyRequest }
     * 
     */
    public CupMpanOperationNotifyRequest createCupMpanOperationNotifyRequest() {
        return new CupMpanOperationNotifyRequest();
    }

    /**
     * Create an instance of {@link MpanApplyExceptionNotifyRequest }
     * 
     */
    public MpanApplyExceptionNotifyRequest createMpanApplyExceptionNotifyRequest() {
        return new MpanApplyExceptionNotifyRequest();
    }

    /**
     * Create an instance of {@link BankBlackListSyncRequest }
     * 
     */
    public BankBlackListSyncRequest createBankBlackListSyncRequest() {
        return new BankBlackListSyncRequest();
    }

    /**
     * Create an instance of {@link MappingNotifyResponse }
     * 
     */
    public MappingNotifyResponse createMappingNotifyResponse() {
        return new MappingNotifyResponse();
    }

    /**
     * Create an instance of {@link MappingInquiryRequest }
     * 
     */
    public MappingInquiryRequest createMappingInquiryRequest() {
        return new MappingInquiryRequest();
    }

    /**
     * Create an instance of {@link VerifyOtpResponse }
     * 
     */
    public VerifyOtpResponse createVerifyOtpResponse() {
        return new VerifyOtpResponse();
    }

    /**
     * Create an instance of {@link MpanCardMetaUpdateResponse }
     * 
     */
    public MpanCardMetaUpdateResponse createMpanCardMetaUpdateResponse() {
        return new MpanCardMetaUpdateResponse();
    }

    /**
     * Create an instance of {@link CupblackListSyncRequest }
     * 
     */
    public CupblackListSyncRequest createCupblackListSyncRequest() {
        return new CupblackListSyncRequest();
    }

    /**
     * Create an instance of {@link MpanApplyRequest }
     * 
     */
    public MpanApplyRequest createMpanApplyRequest() {
        return new MpanApplyRequest();
    }

    /**
     * Create an instance of {@link TransactionNotifyResponse }
     * 
     */
    public TransactionNotifyResponse createTransactionNotifyResponse() {
        return new TransactionNotifyResponse();
    }

    /**
     * Create an instance of {@link QuatoModifyNotifyRequest }
     * 
     */
    public QuatoModifyNotifyRequest createQuatoModifyNotifyRequest() {
        return new QuatoModifyNotifyRequest();
    }

    /**
     * Create an instance of {@link TransactionNotifyRequest }
     * 
     */
    public TransactionNotifyRequest createTransactionNotifyRequest() {
        return new TransactionNotifyRequest();
    }

    /**
     * Create an instance of {@link MpanCardMetaUpdateRequest }
     * 
     */
    public MpanCardMetaUpdateRequest createMpanCardMetaUpdateRequest() {
        return new MpanCardMetaUpdateRequest();
    }

    /**
     * Create an instance of {@link BankBlackListSyncResponse }
     * 
     */
    public BankBlackListSyncResponse createBankBlackListSyncResponse() {
        return new BankBlackListSyncResponse();
    }

    /**
     * Create an instance of {@link MpanApplyResponse }
     * 
     */
    public MpanApplyResponse createMpanApplyResponse() {
        return new MpanApplyResponse();
    }

    /**
     * Create an instance of {@link QueryMpanStatusRequest }
     * 
     */
    public QueryMpanStatusRequest createQueryMpanStatusRequest() {
        return new QueryMpanStatusRequest();
    }

    /**
     * Create an instance of {@link CupMpanOperationNotifyResponse }
     * 
     */
    public CupMpanOperationNotifyResponse createCupMpanOperationNotifyResponse() {
        return new CupMpanOperationNotifyResponse();
    }

    /**
     * Create an instance of {@link QueryMpanStatusResponse }
     * 
     */
    public QueryMpanStatusResponse createQueryMpanStatusResponse() {
        return new QueryMpanStatusResponse();
    }

    /**
     * Create an instance of {@link AccountInfoType }
     * 
     */
    public AccountInfoType createAccountInfoType() {
        return new AccountInfoType();
    }

    /**
     * Create an instance of {@link MappingInfoType }
     * 
     */
    public MappingInfoType createMappingInfoType() {
        return new MappingInfoType();
    }

    /**
     * Create an instance of {@link OtpResolutionType }
     * 
     */
    public OtpResolutionType createOtpResolutionType() {
        return new OtpResolutionType();
    }

    /**
     * Create an instance of {@link OtpResolutionListType }
     * 
     */
    public OtpResolutionListType createOtpResolutionListType() {
        return new OtpResolutionListType();
    }

    /**
     * Create an instance of {@link TermAndConditionInfoType }
     * 
     */
    public TermAndConditionInfoType createTermAndConditionInfoType() {
        return new TermAndConditionInfoType();
    }

    /**
     * Create an instance of {@link StoreIdentifierListType }
     * 
     */
    public StoreIdentifierListType createStoreIdentifierListType() {
        return new StoreIdentifierListType();
    }

    /**
     * Create an instance of {@link CardMetaDataType }
     * 
     */
    public CardMetaDataType createCardMetaDataType() {
        return new CardMetaDataType();
    }

    /**
     * Create an instance of {@link StatusType }
     * 
     */
    public StatusType createStatusType() {
        return new StatusType();
    }

    /**
     * Create an instance of {@link CardHolderInfoType }
     * 
     */
    public CardHolderInfoType createCardHolderInfoType() {
        return new CardHolderInfoType();
    }

    /**
     * Create an instance of {@link RiskInfoType }
     * 
     */
    public RiskInfoType createRiskInfoType() {
        return new RiskInfoType();
    }

    /**
     * Create an instance of {@link BlackListType }
     * 
     */
    public BlackListType createBlackListType() {
        return new BlackListType();
    }

    /**
     * Create an instance of {@link MpanPersoDataInfoType }
     * 
     */
    public MpanPersoDataInfoType createMpanPersoDataInfoType() {
        return new MpanPersoDataInfoType();
    }

    /**
     * Create an instance of {@link ApplicationIdListType }
     * 
     */
    public ApplicationIdListType createApplicationIdListType() {
        return new ApplicationIdListType();
    }

    /**
     * Create an instance of {@link MappingInfoListType }
     * 
     */
    public MappingInfoListType createMappingInfoListType() {
        return new MappingInfoListType();
    }

    /**
     * Create an instance of {@link PanblackListType }
     * 
     */
    public PanblackListType createPanblackListType() {
        return new PanblackListType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankMpanOperationNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "bankMpanOperationNotifyRequest")
    public JAXBElement<BankMpanOperationNotifyRequest> createBankMpanOperationNotifyRequest(BankMpanOperationNotifyRequest value) {
        return new JAXBElement<BankMpanOperationNotifyRequest>(_BankMpanOperationNotifyRequest_QNAME, BankMpanOperationNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transNoDestination")
    public JAXBElement<String> createTransNoDestination(String value) {
        return new JAXBElement<String>(_TransNoDestination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transTimeSource")
    public JAXBElement<String> createTransTimeSource(String value) {
        return new JAXBElement<String>(_TransTimeSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResultNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "operationResultNotifyRequest")
    public JAXBElement<OperationResultNotifyRequest> createOperationResultNotifyRequest(OperationResultNotifyRequest value) {
        return new JAXBElement<OperationResultNotifyRequest>(_OperationResultNotifyRequest_QNAME, OperationResultNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingInquiryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mappingInquiryResponse")
    public JAXBElement<MappingInquiryResponse> createMappingInquiryResponse(MappingInquiryResponse value) {
        return new JAXBElement<MappingInquiryResponse>(_MappingInquiryResponse_QNAME, MappingInquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerOtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "triggerOtpResponse")
    public JAXBElement<TriggerOtpResponse> createTriggerOtpResponse(TriggerOtpResponse value) {
        return new JAXBElement<TriggerOtpResponse>(_TriggerOtpResponse_QNAME, TriggerOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyOtpRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "verifyOtpRequest")
    public JAXBElement<VerifyOtpRequest> createVerifyOtpRequest(VerifyOtpRequest value) {
        return new JAXBElement<VerifyOtpRequest>(_VerifyOtpRequest_QNAME, VerifyOtpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuatoModifyNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "quatoModifyNotifyResponse")
    public JAXBElement<QuatoModifyNotifyResponse> createQuatoModifyNotifyResponse(QuatoModifyNotifyResponse value) {
        return new JAXBElement<QuatoModifyNotifyResponse>(_QuatoModifyNotifyResponse_QNAME, QuatoModifyNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperationResultNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "operationResultNotifyResponse")
    public JAXBElement<OperationResultNotifyResponse> createOperationResultNotifyResponse(OperationResultNotifyResponse value) {
        return new JAXBElement<OperationResultNotifyResponse>(_OperationResultNotifyResponse_QNAME, OperationResultNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TriggerOtpRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "triggerOtpRequest")
    public JAXBElement<TriggerOtpRequest> createTriggerOtpRequest(TriggerOtpRequest value) {
        return new JAXBElement<TriggerOtpRequest>(_TriggerOtpRequest_QNAME, TriggerOtpRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CupblackListSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "cupblackListSyncResponse")
    public JAXBElement<CupblackListSyncResponse> createCupblackListSyncResponse(CupblackListSyncResponse value) {
        return new JAXBElement<CupblackListSyncResponse>(_CupblackListSyncResponse_QNAME, CupblackListSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanApplyExceptionNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanApplyExceptionNotifyResponse")
    public JAXBElement<MpanApplyExceptionNotifyResponse> createMpanApplyExceptionNotifyResponse(MpanApplyExceptionNotifyResponse value) {
        return new JAXBElement<MpanApplyExceptionNotifyResponse>(_MpanApplyExceptionNotifyResponse_QNAME, MpanApplyExceptionNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CupMpanOperationNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "cupMpanOperationNotifyRequest")
    public JAXBElement<CupMpanOperationNotifyRequest> createCupMpanOperationNotifyRequest(CupMpanOperationNotifyRequest value) {
        return new JAXBElement<CupMpanOperationNotifyRequest>(_CupMpanOperationNotifyRequest_QNAME, CupMpanOperationNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanApplyExceptionNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanApplyExceptionNotifyRequest")
    public JAXBElement<MpanApplyExceptionNotifyRequest> createMpanApplyExceptionNotifyRequest(MpanApplyExceptionNotifyRequest value) {
        return new JAXBElement<MpanApplyExceptionNotifyRequest>(_MpanApplyExceptionNotifyRequest_QNAME, MpanApplyExceptionNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankBlackListSyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "bankBlackListSyncRequest")
    public JAXBElement<BankBlackListSyncRequest> createBankBlackListSyncRequest(BankBlackListSyncRequest value) {
        return new JAXBElement<BankBlackListSyncRequest>(_BankBlackListSyncRequest_QNAME, BankBlackListSyncRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "interfaceVersion")
    public JAXBElement<String> createInterfaceVersion(String value) {
        return new JAXBElement<String>(_InterfaceVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankMpanOperationNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "bankMpanOperationNotifyResponse")
    public JAXBElement<BankMpanOperationNotifyResponse> createBankMpanOperationNotifyResponse(BankMpanOperationNotifyResponse value) {
        return new JAXBElement<BankMpanOperationNotifyResponse>(_BankMpanOperationNotifyResponse_QNAME, BankMpanOperationNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mappingNotifyRequest")
    public JAXBElement<MappingNotifyRequest> createMappingNotifyRequest(MappingNotifyRequest value) {
        return new JAXBElement<MappingNotifyRequest>(_MappingNotifyRequest_QNAME, MappingNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transactionNotifyResponse")
    public JAXBElement<TransactionNotifyResponse> createTransactionNotifyResponse(TransactionNotifyResponse value) {
        return new JAXBElement<TransactionNotifyResponse>(_TransactionNotifyResponse_QNAME, TransactionNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanApplyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanApplyRequest")
    public JAXBElement<MpanApplyRequest> createMpanApplyRequest(MpanApplyRequest value) {
        return new JAXBElement<MpanApplyRequest>(_MpanApplyRequest_QNAME, MpanApplyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transNoSource")
    public JAXBElement<String> createTransNoSource(String value) {
        return new JAXBElement<String>(_TransNoSource_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "destination")
    public JAXBElement<String> createDestination(String value) {
        return new JAXBElement<String>(_Destination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mappingNotifyResponse")
    public JAXBElement<MappingNotifyResponse> createMappingNotifyResponse(MappingNotifyResponse value) {
        return new JAXBElement<MappingNotifyResponse>(_MappingNotifyResponse_QNAME, MappingNotifyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifyOtpResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "verifyOtpResponse")
    public JAXBElement<VerifyOtpResponse> createVerifyOtpResponse(VerifyOtpResponse value) {
        return new JAXBElement<VerifyOtpResponse>(_VerifyOtpResponse_QNAME, VerifyOtpResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanCardMetaUpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanCardMetaUpdateResponse")
    public JAXBElement<MpanCardMetaUpdateResponse> createMpanCardMetaUpdateResponse(MpanCardMetaUpdateResponse value) {
        return new JAXBElement<MpanCardMetaUpdateResponse>(_MpanCardMetaUpdateResponse_QNAME, MpanCardMetaUpdateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CupblackListSyncRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "cupblackListSyncRequest")
    public JAXBElement<CupblackListSyncRequest> createCupblackListSyncRequest(CupblackListSyncRequest value) {
        return new JAXBElement<CupblackListSyncRequest>(_CupblackListSyncRequest_QNAME, CupblackListSyncRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MappingInquiryRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mappingInquiryRequest")
    public JAXBElement<MappingInquiryRequest> createMappingInquiryRequest(MappingInquiryRequest value) {
        return new JAXBElement<MappingInquiryRequest>(_MappingInquiryRequest_QNAME, MappingInquiryRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankBlackListSyncResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "bankBlackListSyncResponse")
    public JAXBElement<BankBlackListSyncResponse> createBankBlackListSyncResponse(BankBlackListSyncResponse value) {
        return new JAXBElement<BankBlackListSyncResponse>(_BankBlackListSyncResponse_QNAME, BankBlackListSyncResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanCardMetaUpdateRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanCardMetaUpdateRequest")
    public JAXBElement<MpanCardMetaUpdateRequest> createMpanCardMetaUpdateRequest(MpanCardMetaUpdateRequest value) {
        return new JAXBElement<MpanCardMetaUpdateRequest>(_MpanCardMetaUpdateRequest_QNAME, MpanCardMetaUpdateRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransactionNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transactionNotifyRequest")
    public JAXBElement<TransactionNotifyRequest> createTransactionNotifyRequest(TransactionNotifyRequest value) {
        return new JAXBElement<TransactionNotifyRequest>(_TransactionNotifyRequest_QNAME, TransactionNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "source")
    public JAXBElement<String> createSource(String value) {
        return new JAXBElement<String>(_Source_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMpanStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "queryMpanStatusRequest")
    public JAXBElement<QueryMpanStatusRequest> createQueryMpanStatusRequest(QueryMpanStatusRequest value) {
        return new JAXBElement<QueryMpanStatusRequest>(_QueryMpanStatusRequest_QNAME, QueryMpanStatusRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MpanApplyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "mpanApplyResponse")
    public JAXBElement<MpanApplyResponse> createMpanApplyResponse(MpanApplyResponse value) {
        return new JAXBElement<MpanApplyResponse>(_MpanApplyResponse_QNAME, MpanApplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuatoModifyNotifyRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "quatoModifyNotifyRequest")
    public JAXBElement<QuatoModifyNotifyRequest> createQuatoModifyNotifyRequest(QuatoModifyNotifyRequest value) {
        return new JAXBElement<QuatoModifyNotifyRequest>(_QuatoModifyNotifyRequest_QNAME, QuatoModifyNotifyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transType")
    public JAXBElement<String> createTransType(String value) {
        return new JAXBElement<String>(_TransType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryMpanStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "queryMpanStatusResponse")
    public JAXBElement<QueryMpanStatusResponse> createQueryMpanStatusResponse(QueryMpanStatusResponse value) {
        return new JAXBElement<QueryMpanStatusResponse>(_QueryMpanStatusResponse_QNAME, QueryMpanStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "transTimeDestination")
    public JAXBElement<String> createTransTimeDestination(String value) {
        return new JAXBElement<String>(_TransTimeDestination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CupMpanOperationNotifyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.tsm.cup.com/", name = "cupMpanOperationNotifyResponse")
    public JAXBElement<CupMpanOperationNotifyResponse> createCupMpanOperationNotifyResponse(CupMpanOperationNotifyResponse value) {
        return new JAXBElement<CupMpanOperationNotifyResponse>(_CupMpanOperationNotifyResponse_QNAME, CupMpanOperationNotifyResponse.class, null, value);
    }

}
