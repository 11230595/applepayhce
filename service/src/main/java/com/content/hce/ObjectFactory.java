
package com.content.hce;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.content.hce package. 
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

    private final static QName _Extensions_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "extensions");
    private final static QName _SuspensionControl_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "SuspensionControl");
    private final static QName _ProcessingEnd_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "ProcessingEnd");
    private final static QName _FunctionCallIdentifier_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "FunctionCallIdentifier");
    private final static QName _RelatesTo_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceHeader/", "RelatesTo");
    private final static QName _ProcessingStart_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "ProcessingStart");
    private final static QName _MessageID_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceHeader/", "MessageID");
    private final static QName _Action_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceHeader/", "Action");
    private final static QName _Service_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "Service");
    private final static QName _AcceptableValidityPeriod_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "AcceptableValidityPeriod");
    private final static QName _SecureElement_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "SecureElement");
    private final static QName _TranCode_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "tranCode");
    private final static QName _ValidityPeriod_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceBody/", "ValidityPeriod");
    private final static QName _To_QNAME = new QName("http://www.artery.org/projects/NBUnionPayHceHeader/", "To");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.content.hce
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FunctionExecutionStatus }
     * 
     */
    public FunctionExecutionStatus createFunctionExecutionStatus() {
        return new FunctionExecutionStatus();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityResponse }
     * 
     */
    public CheckGlobalEligibilityResponse createCheckGlobalEligibilityResponse() {
        return new CheckGlobalEligibilityResponse();
    }

    /**
     * Create an instance of {@link TerminateServiceRequest }
     * 
     */
    public TerminateServiceRequest createTerminateServiceRequest() {
        return new TerminateServiceRequest();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceRequest }
     * 
     */
    public SuspendOrResumeServiceRequest createSuspendOrResumeServiceRequest() {
        return new SuspendOrResumeServiceRequest();
    }

    /**
     * Create an instance of {@link TerminateServiceResponse }
     * 
     */
    public TerminateServiceResponse createTerminateServiceResponse() {
        return new TerminateServiceResponse();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityRequest }
     * 
     */
    public CheckGlobalEligibilityRequest createCheckGlobalEligibilityRequest() {
        return new CheckGlobalEligibilityRequest();
    }

    /**
     * Create an instance of {@link DeployServiceRequest }
     * 
     */
    public DeployServiceRequest createDeployServiceRequest() {
        return new DeployServiceRequest();
    }

    /**
     * Create an instance of {@link ServiceInstanceReference }
     * 
     */
    public ServiceInstanceReference createServiceInstanceReference() {
        return new ServiceInstanceReference();
    }

    /**
     * Create an instance of {@link ActivationInfo }
     * 
     */
    public ActivationInfo createActivationInfo() {
        return new ActivationInfo();
    }

    /**
     * Create an instance of {@link PanUpdateInfo }
     * 
     */
    public PanUpdateInfo createPanUpdateInfo() {
        return new PanUpdateInfo();
    }

    /**
     * Create an instance of {@link HceCardInfo }
     * 
     */
    public HceCardInfo createHceCardInfo() {
        return new HceCardInfo();
    }

    /**
     * Create an instance of {@link ApplyInfo }
     * 
     */
    public ApplyInfo createApplyInfo() {
        return new ApplyInfo();
    }

    /**
     * Create an instance of {@link ResponseData }
     * 
     */
    public ResponseData createResponseData() {
        return new ResponseData();
    }

    /**
     * Create an instance of {@link EntityInfo }
     * 
     */
    public EntityInfo createEntityInfo() {
        return new EntityInfo();
    }

    /**
     * Create an instance of {@link ApplyResponse }
     * 
     */
    public ApplyResponse createApplyResponse() {
        return new ApplyResponse();
    }

    /**
     * Create an instance of {@link FunctionExecutionStatus.StatusCodeData }
     * 
     */
    public FunctionExecutionStatus.StatusCodeData createFunctionExecutionStatusStatusCodeData() {
        return new FunctionExecutionStatus.StatusCodeData();
    }

    /**
     * Create an instance of {@link DeployServiceResponse }
     * 
     */
    public DeployServiceResponse createDeployServiceResponse() {
        return new DeployServiceResponse();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityResponse.Extensions }
     * 
     */
    public CheckGlobalEligibilityResponse.Extensions createCheckGlobalEligibilityResponseExtensions() {
        return new CheckGlobalEligibilityResponse.Extensions();
    }

    /**
     * Create an instance of {@link TerminateServiceRequest.Extensions }
     * 
     */
    public TerminateServiceRequest.Extensions createTerminateServiceRequestExtensions() {
        return new TerminateServiceRequest.Extensions();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceRequest.Extensions }
     * 
     */
    public SuspendOrResumeServiceRequest.Extensions createSuspendOrResumeServiceRequestExtensions() {
        return new SuspendOrResumeServiceRequest.Extensions();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataResponse }
     * 
     */
    public ExchangeServiceDataResponse createExchangeServiceDataResponse() {
        return new ExchangeServiceDataResponse();
    }

    /**
     * Create an instance of {@link ExchangeServiceDataRequest }
     * 
     */
    public ExchangeServiceDataRequest createExchangeServiceDataRequest() {
        return new ExchangeServiceDataRequest();
    }

    /**
     * Create an instance of {@link SuspendOrResumeServiceResponse }
     * 
     */
    public SuspendOrResumeServiceResponse createSuspendOrResumeServiceResponse() {
        return new SuspendOrResumeServiceResponse();
    }

    /**
     * Create an instance of {@link TerminateServiceResponse.Extensions }
     * 
     */
    public TerminateServiceResponse.Extensions createTerminateServiceResponseExtensions() {
        return new TerminateServiceResponse.Extensions();
    }

    /**
     * Create an instance of {@link CheckGlobalEligibilityRequest.Extensions }
     * 
     */
    public CheckGlobalEligibilityRequest.Extensions createCheckGlobalEligibilityRequestExtensions() {
        return new CheckGlobalEligibilityRequest.Extensions();
    }

    /**
     * Create an instance of {@link DeployServiceRequest.Extensions }
     * 
     */
    public DeployServiceRequest.Extensions createDeployServiceRequestExtensions() {
        return new DeployServiceRequest.Extensions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "extensions")
    public JAXBElement<String> createExtensions(String value) {
        return new JAXBElement<String>(_Extensions_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "SuspensionControl")
    public JAXBElement<String> createSuspensionControl(String value) {
        return new JAXBElement<String>(_SuspensionControl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "ProcessingEnd")
    public JAXBElement<String> createProcessingEnd(String value) {
        return new JAXBElement<String>(_ProcessingEnd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "FunctionCallIdentifier")
    public JAXBElement<String> createFunctionCallIdentifier(String value) {
        return new JAXBElement<String>(_FunctionCallIdentifier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", name = "RelatesTo")
    public JAXBElement<String> createRelatesTo(String value) {
        return new JAXBElement<String>(_RelatesTo_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "ProcessingStart")
    public JAXBElement<String> createProcessingStart(String value) {
        return new JAXBElement<String>(_ProcessingStart_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", name = "MessageID")
    public JAXBElement<String> createMessageID(String value) {
        return new JAXBElement<String>(_MessageID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", name = "Action")
    public JAXBElement<String> createAction(String value) {
        return new JAXBElement<String>(_Action_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "Service")
    public JAXBElement<String> createService(String value) {
        return new JAXBElement<String>(_Service_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "AcceptableValidityPeriod")
    public JAXBElement<String> createAcceptableValidityPeriod(String value) {
        return new JAXBElement<String>(_AcceptableValidityPeriod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "SecureElement")
    public JAXBElement<String> createSecureElement(String value) {
        return new JAXBElement<String>(_SecureElement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "tranCode")
    public JAXBElement<String> createTranCode(String value) {
        return new JAXBElement<String>(_TranCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceBody/", name = "ValidityPeriod")
    public JAXBElement<String> createValidityPeriod(String value) {
        return new JAXBElement<String>(_ValidityPeriod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.artery.org/projects/NBUnionPayHceHeader/", name = "To")
    public JAXBElement<String> createTo(String value) {
        return new JAXBElement<String>(_To_QNAME, String.class, null, value);
    }

}
