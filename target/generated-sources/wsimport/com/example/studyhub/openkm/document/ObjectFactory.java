
package com.example.studyhub.openkm.document;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.studyhub.openkm.document package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _CancelCheckout_QNAME = new QName("http://ws.openkm.com", "cancelCheckout");
    private static final QName _CancelCheckoutResponse_QNAME = new QName("http://ws.openkm.com", "cancelCheckoutResponse");
    private static final QName _Checkin_QNAME = new QName("http://ws.openkm.com", "checkin");
    private static final QName _CheckinResponse_QNAME = new QName("http://ws.openkm.com", "checkinResponse");
    private static final QName _Checkout_QNAME = new QName("http://ws.openkm.com", "checkout");
    private static final QName _CheckoutResponse_QNAME = new QName("http://ws.openkm.com", "checkoutResponse");
    private static final QName _Create_QNAME = new QName("http://ws.openkm.com", "create");
    private static final QName _CreateResponse_QNAME = new QName("http://ws.openkm.com", "createResponse");
    private static final QName _CreateSimple_QNAME = new QName("http://ws.openkm.com", "createSimple");
    private static final QName _CreateSimpleResponse_QNAME = new QName("http://ws.openkm.com", "createSimpleResponse");
    private static final QName _Delete_QNAME = new QName("http://ws.openkm.com", "delete");
    private static final QName _DeleteResponse_QNAME = new QName("http://ws.openkm.com", "deleteResponse");
    private static final QName _Document_QNAME = new QName("http://ws.openkm.com", "document");
    private static final QName _Folder_QNAME = new QName("http://ws.openkm.com", "folder");
    private static final QName _ForceCancelCheckout_QNAME = new QName("http://ws.openkm.com", "forceCancelCheckout");
    private static final QName _ForceCancelCheckoutResponse_QNAME = new QName("http://ws.openkm.com", "forceCancelCheckoutResponse");
    private static final QName _ForceUnlock_QNAME = new QName("http://ws.openkm.com", "forceUnlock");
    private static final QName _ForceUnlockResponse_QNAME = new QName("http://ws.openkm.com", "forceUnlockResponse");
    private static final QName _GetChildren_QNAME = new QName("http://ws.openkm.com", "getChildren");
    private static final QName _GetChildrenResponse_QNAME = new QName("http://ws.openkm.com", "getChildrenResponse");
    private static final QName _GetChilds_QNAME = new QName("http://ws.openkm.com", "getChilds");
    private static final QName _GetChildsResponse_QNAME = new QName("http://ws.openkm.com", "getChildsResponse");
    private static final QName _GetContent_QNAME = new QName("http://ws.openkm.com", "getContent");
    private static final QName _GetContentByVersion_QNAME = new QName("http://ws.openkm.com", "getContentByVersion");
    private static final QName _GetContentByVersionResponse_QNAME = new QName("http://ws.openkm.com", "getContentByVersionResponse");
    private static final QName _GetContentResponse_QNAME = new QName("http://ws.openkm.com", "getContentResponse");
    private static final QName _GetPath_QNAME = new QName("http://ws.openkm.com", "getPath");
    private static final QName _GetPathResponse_QNAME = new QName("http://ws.openkm.com", "getPathResponse");
    private static final QName _GetProperties_QNAME = new QName("http://ws.openkm.com", "getProperties");
    private static final QName _GetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "getPropertiesResponse");
    private static final QName _GetVersionHistory_QNAME = new QName("http://ws.openkm.com", "getVersionHistory");
    private static final QName _GetVersionHistoryResponse_QNAME = new QName("http://ws.openkm.com", "getVersionHistoryResponse");
    private static final QName _GetVersionHistorySize_QNAME = new QName("http://ws.openkm.com", "getVersionHistorySize");
    private static final QName _GetVersionHistorySizeResponse_QNAME = new QName("http://ws.openkm.com", "getVersionHistorySizeResponse");
    private static final QName _IsValid_QNAME = new QName("http://ws.openkm.com", "isValid");
    private static final QName _IsValidResponse_QNAME = new QName("http://ws.openkm.com", "isValidResponse");
    private static final QName _Lock_QNAME = new QName("http://ws.openkm.com", "lock");
    private static final QName _LockInfo_QNAME = new QName("http://ws.openkm.com", "lockInfo");
    private static final QName _LockResponse_QNAME = new QName("http://ws.openkm.com", "lockResponse");
    private static final QName _Mail_QNAME = new QName("http://ws.openkm.com", "mail");
    private static final QName _Move_QNAME = new QName("http://ws.openkm.com", "move");
    private static final QName _MoveResponse_QNAME = new QName("http://ws.openkm.com", "moveResponse");
    private static final QName _Note_QNAME = new QName("http://ws.openkm.com", "note");
    private static final QName _Purge_QNAME = new QName("http://ws.openkm.com", "purge");
    private static final QName _PurgeResponse_QNAME = new QName("http://ws.openkm.com", "purgeResponse");
    private static final QName _PurgeVersionHistory_QNAME = new QName("http://ws.openkm.com", "purgeVersionHistory");
    private static final QName _PurgeVersionHistoryResponse_QNAME = new QName("http://ws.openkm.com", "purgeVersionHistoryResponse");
    private static final QName _Rename_QNAME = new QName("http://ws.openkm.com", "rename");
    private static final QName _RenameResponse_QNAME = new QName("http://ws.openkm.com", "renameResponse");
    private static final QName _RestoreVersion_QNAME = new QName("http://ws.openkm.com", "restoreVersion");
    private static final QName _RestoreVersionResponse_QNAME = new QName("http://ws.openkm.com", "restoreVersionResponse");
    private static final QName _SetProperties_QNAME = new QName("http://ws.openkm.com", "setProperties");
    private static final QName _SetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "setPropertiesResponse");
    private static final QName _Unlock_QNAME = new QName("http://ws.openkm.com", "unlock");
    private static final QName _UnlockResponse_QNAME = new QName("http://ws.openkm.com", "unlockResponse");
    private static final QName _Version_QNAME = new QName("http://ws.openkm.com", "version");
    private static final QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private static final QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private static final QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private static final QName _ExtensionException_QNAME = new QName("http://ws.openkm.com", "ExtensionException");
    private static final QName _AutomationException_QNAME = new QName("http://ws.openkm.com", "AutomationException");
    private static final QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private static final QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private static final QName _IOException_QNAME = new QName("http://ws.openkm.com", "IOException");
    private static final QName _VersionException_QNAME = new QName("http://ws.openkm.com", "VersionException");
    private static final QName _VirusDetectedException_QNAME = new QName("http://ws.openkm.com", "VirusDetectedException");
    private static final QName _UnsupportedMimeTypeException_QNAME = new QName("http://ws.openkm.com", "UnsupportedMimeTypeException");
    private static final QName _FileSizeExceededException_QNAME = new QName("http://ws.openkm.com", "FileSizeExceededException");
    private static final QName _UserQuotaExceededException_QNAME = new QName("http://ws.openkm.com", "UserQuotaExceededException");
    private static final QName _ItemExistsException_QNAME = new QName("http://ws.openkm.com", "ItemExistsException");
    private static final QName _PrincipalAdapterException_QNAME = new QName("http://ws.openkm.com", "PrincipalAdapterException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.studyhub.openkm.document
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CancelCheckout }
     * 
     * @return
     *     the new instance of {@link CancelCheckout }
     */
    public CancelCheckout createCancelCheckout() {
        return new CancelCheckout();
    }

    /**
     * Create an instance of {@link CancelCheckoutResponse }
     * 
     * @return
     *     the new instance of {@link CancelCheckoutResponse }
     */
    public CancelCheckoutResponse createCancelCheckoutResponse() {
        return new CancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link Checkin }
     * 
     * @return
     *     the new instance of {@link Checkin }
     */
    public Checkin createCheckin() {
        return new Checkin();
    }

    /**
     * Create an instance of {@link CheckinResponse }
     * 
     * @return
     *     the new instance of {@link CheckinResponse }
     */
    public CheckinResponse createCheckinResponse() {
        return new CheckinResponse();
    }

    /**
     * Create an instance of {@link Checkout }
     * 
     * @return
     *     the new instance of {@link Checkout }
     */
    public Checkout createCheckout() {
        return new Checkout();
    }

    /**
     * Create an instance of {@link CheckoutResponse }
     * 
     * @return
     *     the new instance of {@link CheckoutResponse }
     */
    public CheckoutResponse createCheckoutResponse() {
        return new CheckoutResponse();
    }

    /**
     * Create an instance of {@link Create }
     * 
     * @return
     *     the new instance of {@link Create }
     */
    public Create createCreate() {
        return new Create();
    }

    /**
     * Create an instance of {@link CreateResponse }
     * 
     * @return
     *     the new instance of {@link CreateResponse }
     */
    public CreateResponse createCreateResponse() {
        return new CreateResponse();
    }

    /**
     * Create an instance of {@link CreateSimple }
     * 
     * @return
     *     the new instance of {@link CreateSimple }
     */
    public CreateSimple createCreateSimple() {
        return new CreateSimple();
    }

    /**
     * Create an instance of {@link CreateSimpleResponse }
     * 
     * @return
     *     the new instance of {@link CreateSimpleResponse }
     */
    public CreateSimpleResponse createCreateSimpleResponse() {
        return new CreateSimpleResponse();
    }

    /**
     * Create an instance of {@link Delete }
     * 
     * @return
     *     the new instance of {@link Delete }
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     * @return
     *     the new instance of {@link DeleteResponse }
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Document }
     * 
     * @return
     *     the new instance of {@link Document }
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Folder }
     * 
     * @return
     *     the new instance of {@link Folder }
     */
    public Folder createFolder() {
        return new Folder();
    }

    /**
     * Create an instance of {@link ForceCancelCheckout }
     * 
     * @return
     *     the new instance of {@link ForceCancelCheckout }
     */
    public ForceCancelCheckout createForceCancelCheckout() {
        return new ForceCancelCheckout();
    }

    /**
     * Create an instance of {@link ForceCancelCheckoutResponse }
     * 
     * @return
     *     the new instance of {@link ForceCancelCheckoutResponse }
     */
    public ForceCancelCheckoutResponse createForceCancelCheckoutResponse() {
        return new ForceCancelCheckoutResponse();
    }

    /**
     * Create an instance of {@link ForceUnlock }
     * 
     * @return
     *     the new instance of {@link ForceUnlock }
     */
    public ForceUnlock createForceUnlock() {
        return new ForceUnlock();
    }

    /**
     * Create an instance of {@link ForceUnlockResponse }
     * 
     * @return
     *     the new instance of {@link ForceUnlockResponse }
     */
    public ForceUnlockResponse createForceUnlockResponse() {
        return new ForceUnlockResponse();
    }

    /**
     * Create an instance of {@link GetChildren }
     * 
     * @return
     *     the new instance of {@link GetChildren }
     */
    public GetChildren createGetChildren() {
        return new GetChildren();
    }

    /**
     * Create an instance of {@link GetChildrenResponse }
     * 
     * @return
     *     the new instance of {@link GetChildrenResponse }
     */
    public GetChildrenResponse createGetChildrenResponse() {
        return new GetChildrenResponse();
    }

    /**
     * Create an instance of {@link GetChilds }
     * 
     * @return
     *     the new instance of {@link GetChilds }
     */
    public GetChilds createGetChilds() {
        return new GetChilds();
    }

    /**
     * Create an instance of {@link GetChildsResponse }
     * 
     * @return
     *     the new instance of {@link GetChildsResponse }
     */
    public GetChildsResponse createGetChildsResponse() {
        return new GetChildsResponse();
    }

    /**
     * Create an instance of {@link GetContent }
     * 
     * @return
     *     the new instance of {@link GetContent }
     */
    public GetContent createGetContent() {
        return new GetContent();
    }

    /**
     * Create an instance of {@link GetContentByVersion }
     * 
     * @return
     *     the new instance of {@link GetContentByVersion }
     */
    public GetContentByVersion createGetContentByVersion() {
        return new GetContentByVersion();
    }

    /**
     * Create an instance of {@link GetContentByVersionResponse }
     * 
     * @return
     *     the new instance of {@link GetContentByVersionResponse }
     */
    public GetContentByVersionResponse createGetContentByVersionResponse() {
        return new GetContentByVersionResponse();
    }

    /**
     * Create an instance of {@link GetContentResponse }
     * 
     * @return
     *     the new instance of {@link GetContentResponse }
     */
    public GetContentResponse createGetContentResponse() {
        return new GetContentResponse();
    }

    /**
     * Create an instance of {@link GetPath }
     * 
     * @return
     *     the new instance of {@link GetPath }
     */
    public GetPath createGetPath() {
        return new GetPath();
    }

    /**
     * Create an instance of {@link GetPathResponse }
     * 
     * @return
     *     the new instance of {@link GetPathResponse }
     */
    public GetPathResponse createGetPathResponse() {
        return new GetPathResponse();
    }

    /**
     * Create an instance of {@link GetProperties }
     * 
     * @return
     *     the new instance of {@link GetProperties }
     */
    public GetProperties createGetProperties() {
        return new GetProperties();
    }

    /**
     * Create an instance of {@link GetPropertiesResponse }
     * 
     * @return
     *     the new instance of {@link GetPropertiesResponse }
     */
    public GetPropertiesResponse createGetPropertiesResponse() {
        return new GetPropertiesResponse();
    }

    /**
     * Create an instance of {@link GetVersionHistory }
     * 
     * @return
     *     the new instance of {@link GetVersionHistory }
     */
    public GetVersionHistory createGetVersionHistory() {
        return new GetVersionHistory();
    }

    /**
     * Create an instance of {@link GetVersionHistoryResponse }
     * 
     * @return
     *     the new instance of {@link GetVersionHistoryResponse }
     */
    public GetVersionHistoryResponse createGetVersionHistoryResponse() {
        return new GetVersionHistoryResponse();
    }

    /**
     * Create an instance of {@link GetVersionHistorySize }
     * 
     * @return
     *     the new instance of {@link GetVersionHistorySize }
     */
    public GetVersionHistorySize createGetVersionHistorySize() {
        return new GetVersionHistorySize();
    }

    /**
     * Create an instance of {@link GetVersionHistorySizeResponse }
     * 
     * @return
     *     the new instance of {@link GetVersionHistorySizeResponse }
     */
    public GetVersionHistorySizeResponse createGetVersionHistorySizeResponse() {
        return new GetVersionHistorySizeResponse();
    }

    /**
     * Create an instance of {@link IsValid }
     * 
     * @return
     *     the new instance of {@link IsValid }
     */
    public IsValid createIsValid() {
        return new IsValid();
    }

    /**
     * Create an instance of {@link IsValidResponse }
     * 
     * @return
     *     the new instance of {@link IsValidResponse }
     */
    public IsValidResponse createIsValidResponse() {
        return new IsValidResponse();
    }

    /**
     * Create an instance of {@link Lock }
     * 
     * @return
     *     the new instance of {@link Lock }
     */
    public Lock createLock() {
        return new Lock();
    }

    /**
     * Create an instance of {@link LockInfo }
     * 
     * @return
     *     the new instance of {@link LockInfo }
     */
    public LockInfo createLockInfo() {
        return new LockInfo();
    }

    /**
     * Create an instance of {@link LockResponse }
     * 
     * @return
     *     the new instance of {@link LockResponse }
     */
    public LockResponse createLockResponse() {
        return new LockResponse();
    }

    /**
     * Create an instance of {@link Mail }
     * 
     * @return
     *     the new instance of {@link Mail }
     */
    public Mail createMail() {
        return new Mail();
    }

    /**
     * Create an instance of {@link Move }
     * 
     * @return
     *     the new instance of {@link Move }
     */
    public Move createMove() {
        return new Move();
    }

    /**
     * Create an instance of {@link MoveResponse }
     * 
     * @return
     *     the new instance of {@link MoveResponse }
     */
    public MoveResponse createMoveResponse() {
        return new MoveResponse();
    }

    /**
     * Create an instance of {@link Note }
     * 
     * @return
     *     the new instance of {@link Note }
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link Purge }
     * 
     * @return
     *     the new instance of {@link Purge }
     */
    public Purge createPurge() {
        return new Purge();
    }

    /**
     * Create an instance of {@link PurgeResponse }
     * 
     * @return
     *     the new instance of {@link PurgeResponse }
     */
    public PurgeResponse createPurgeResponse() {
        return new PurgeResponse();
    }

    /**
     * Create an instance of {@link PurgeVersionHistory }
     * 
     * @return
     *     the new instance of {@link PurgeVersionHistory }
     */
    public PurgeVersionHistory createPurgeVersionHistory() {
        return new PurgeVersionHistory();
    }

    /**
     * Create an instance of {@link PurgeVersionHistoryResponse }
     * 
     * @return
     *     the new instance of {@link PurgeVersionHistoryResponse }
     */
    public PurgeVersionHistoryResponse createPurgeVersionHistoryResponse() {
        return new PurgeVersionHistoryResponse();
    }

    /**
     * Create an instance of {@link Rename }
     * 
     * @return
     *     the new instance of {@link Rename }
     */
    public Rename createRename() {
        return new Rename();
    }

    /**
     * Create an instance of {@link RenameResponse }
     * 
     * @return
     *     the new instance of {@link RenameResponse }
     */
    public RenameResponse createRenameResponse() {
        return new RenameResponse();
    }

    /**
     * Create an instance of {@link RestoreVersion }
     * 
     * @return
     *     the new instance of {@link RestoreVersion }
     */
    public RestoreVersion createRestoreVersion() {
        return new RestoreVersion();
    }

    /**
     * Create an instance of {@link RestoreVersionResponse }
     * 
     * @return
     *     the new instance of {@link RestoreVersionResponse }
     */
    public RestoreVersionResponse createRestoreVersionResponse() {
        return new RestoreVersionResponse();
    }

    /**
     * Create an instance of {@link SetProperties }
     * 
     * @return
     *     the new instance of {@link SetProperties }
     */
    public SetProperties createSetProperties() {
        return new SetProperties();
    }

    /**
     * Create an instance of {@link SetPropertiesResponse }
     * 
     * @return
     *     the new instance of {@link SetPropertiesResponse }
     */
    public SetPropertiesResponse createSetPropertiesResponse() {
        return new SetPropertiesResponse();
    }

    /**
     * Create an instance of {@link Unlock }
     * 
     * @return
     *     the new instance of {@link Unlock }
     */
    public Unlock createUnlock() {
        return new Unlock();
    }

    /**
     * Create an instance of {@link UnlockResponse }
     * 
     * @return
     *     the new instance of {@link UnlockResponse }
     */
    public UnlockResponse createUnlockResponse() {
        return new UnlockResponse();
    }

    /**
     * Create an instance of {@link Version }
     * 
     * @return
     *     the new instance of {@link Version }
     */
    public Version createVersion() {
        return new Version();
    }

    /**
     * Create an instance of {@link DatabaseException }
     * 
     * @return
     *     the new instance of {@link DatabaseException }
     */
    public DatabaseException createDatabaseException() {
        return new DatabaseException();
    }

    /**
     * Create an instance of {@link PathNotFoundException }
     * 
     * @return
     *     the new instance of {@link PathNotFoundException }
     */
    public PathNotFoundException createPathNotFoundException() {
        return new PathNotFoundException();
    }

    /**
     * Create an instance of {@link RepositoryException }
     * 
     * @return
     *     the new instance of {@link RepositoryException }
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
    }

    /**
     * Create an instance of {@link ExtensionException }
     * 
     * @return
     *     the new instance of {@link ExtensionException }
     */
    public ExtensionException createExtensionException() {
        return new ExtensionException();
    }

    /**
     * Create an instance of {@link AutomationException }
     * 
     * @return
     *     the new instance of {@link AutomationException }
     */
    public AutomationException createAutomationException() {
        return new AutomationException();
    }

    /**
     * Create an instance of {@link LockException }
     * 
     * @return
     *     the new instance of {@link LockException }
     */
    public LockException createLockException() {
        return new LockException();
    }

    /**
     * Create an instance of {@link AccessDeniedException }
     * 
     * @return
     *     the new instance of {@link AccessDeniedException }
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
    }

    /**
     * Create an instance of {@link IOException }
     * 
     * @return
     *     the new instance of {@link IOException }
     */
    public IOException createIOException() {
        return new IOException();
    }

    /**
     * Create an instance of {@link VersionException }
     * 
     * @return
     *     the new instance of {@link VersionException }
     */
    public VersionException createVersionException() {
        return new VersionException();
    }

    /**
     * Create an instance of {@link VirusDetectedException }
     * 
     * @return
     *     the new instance of {@link VirusDetectedException }
     */
    public VirusDetectedException createVirusDetectedException() {
        return new VirusDetectedException();
    }

    /**
     * Create an instance of {@link UnsupportedMimeTypeException }
     * 
     * @return
     *     the new instance of {@link UnsupportedMimeTypeException }
     */
    public UnsupportedMimeTypeException createUnsupportedMimeTypeException() {
        return new UnsupportedMimeTypeException();
    }

    /**
     * Create an instance of {@link FileSizeExceededException }
     * 
     * @return
     *     the new instance of {@link FileSizeExceededException }
     */
    public FileSizeExceededException createFileSizeExceededException() {
        return new FileSizeExceededException();
    }

    /**
     * Create an instance of {@link UserQuotaExceededException }
     * 
     * @return
     *     the new instance of {@link UserQuotaExceededException }
     */
    public UserQuotaExceededException createUserQuotaExceededException() {
        return new UserQuotaExceededException();
    }

    /**
     * Create an instance of {@link ItemExistsException }
     * 
     * @return
     *     the new instance of {@link ItemExistsException }
     */
    public ItemExistsException createItemExistsException() {
        return new ItemExistsException();
    }

    /**
     * Create an instance of {@link PrincipalAdapterException }
     * 
     * @return
     *     the new instance of {@link PrincipalAdapterException }
     */
    public PrincipalAdapterException createPrincipalAdapterException() {
        return new PrincipalAdapterException();
    }

    /**
     * Create an instance of {@link Node }
     * 
     * @return
     *     the new instance of {@link Node }
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelCheckout }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "cancelCheckout")
    public JAXBElement<CancelCheckout> createCancelCheckout(CancelCheckout value) {
        return new JAXBElement<>(_CancelCheckout_QNAME, CancelCheckout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelCheckoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CancelCheckoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "cancelCheckoutResponse")
    public JAXBElement<CancelCheckoutResponse> createCancelCheckoutResponse(CancelCheckoutResponse value) {
        return new JAXBElement<>(_CancelCheckoutResponse_QNAME, CancelCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkin }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Checkin }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkin")
    public JAXBElement<Checkin> createCheckin(Checkin value) {
        return new JAXBElement<>(_Checkin_QNAME, Checkin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckinResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkinResponse")
    public JAXBElement<CheckinResponse> createCheckinResponse(CheckinResponse value) {
        return new JAXBElement<>(_CheckinResponse_QNAME, CheckinResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Checkout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Checkout }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkout")
    public JAXBElement<Checkout> createCheckout(Checkout value) {
        return new JAXBElement<>(_Checkout_QNAME, Checkout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CheckoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "checkoutResponse")
    public JAXBElement<CheckoutResponse> createCheckoutResponse(CheckoutResponse value) {
        return new JAXBElement<>(_CheckoutResponse_QNAME, CheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Create }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "create")
    public JAXBElement<Create> createCreate(Create value) {
        return new JAXBElement<>(_Create_QNAME, Create.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createResponse")
    public JAXBElement<CreateResponse> createCreateResponse(CreateResponse value) {
        return new JAXBElement<>(_CreateResponse_QNAME, CreateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimple }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSimple }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimple")
    public JAXBElement<CreateSimple> createCreateSimple(CreateSimple value) {
        return new JAXBElement<>(_CreateSimple_QNAME, CreateSimple.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSimpleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateSimpleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "createSimpleResponse")
    public JAXBElement<CreateSimpleResponse> createCreateSimpleResponse(CreateSimpleResponse value) {
        return new JAXBElement<>(_CreateSimpleResponse_QNAME, CreateSimpleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Document }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "folder")
    public JAXBElement<Folder> createFolder(Folder value) {
        return new JAXBElement<>(_Folder_QNAME, Folder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckout }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceCancelCheckout")
    public JAXBElement<ForceCancelCheckout> createForceCancelCheckout(ForceCancelCheckout value) {
        return new JAXBElement<>(_ForceCancelCheckout_QNAME, ForceCancelCheckout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForceCancelCheckoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceCancelCheckoutResponse")
    public JAXBElement<ForceCancelCheckoutResponse> createForceCancelCheckoutResponse(ForceCancelCheckoutResponse value) {
        return new JAXBElement<>(_ForceCancelCheckoutResponse_QNAME, ForceCancelCheckoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceUnlock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForceUnlock }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceUnlock")
    public JAXBElement<ForceUnlock> createForceUnlock(ForceUnlock value) {
        return new JAXBElement<>(_ForceUnlock_QNAME, ForceUnlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForceUnlockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ForceUnlockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "forceUnlockResponse")
    public JAXBElement<ForceUnlockResponse> createForceUnlockResponse(ForceUnlockResponse value) {
        return new JAXBElement<>(_ForceUnlockResponse_QNAME, ForceUnlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildren")
    public JAXBElement<GetChildren> createGetChildren(GetChildren value) {
        return new JAXBElement<>(_GetChildren_QNAME, GetChildren.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildrenResponse")
    public JAXBElement<GetChildrenResponse> createGetChildrenResponse(GetChildrenResponse value) {
        return new JAXBElement<>(_GetChildrenResponse_QNAME, GetChildrenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChilds }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChilds }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChilds")
    public JAXBElement<GetChilds> createGetChilds(GetChilds value) {
        return new JAXBElement<>(_GetChilds_QNAME, GetChilds.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetChildsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getChildsResponse")
    public JAXBElement<GetChildsResponse> createGetChildsResponse(GetChildsResponse value) {
        return new JAXBElement<>(_GetChildsResponse_QNAME, GetChildsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContent }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContent")
    public JAXBElement<GetContent> createGetContent(GetContent value) {
        return new JAXBElement<>(_GetContent_QNAME, GetContent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentByVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContentByVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentByVersion")
    public JAXBElement<GetContentByVersion> createGetContentByVersion(GetContentByVersion value) {
        return new JAXBElement<>(_GetContentByVersion_QNAME, GetContentByVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentByVersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContentByVersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentByVersionResponse")
    public JAXBElement<GetContentByVersionResponse> createGetContentByVersionResponse(GetContentByVersionResponse value) {
        return new JAXBElement<>(_GetContentByVersionResponse_QNAME, GetContentByVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetContentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetContentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getContentResponse")
    public JAXBElement<GetContentResponse> createGetContentResponse(GetContentResponse value) {
        return new JAXBElement<>(_GetContentResponse_QNAME, GetContentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPath }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPath }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPath")
    public JAXBElement<GetPath> createGetPath(GetPath value) {
        return new JAXBElement<>(_GetPath_QNAME, GetPath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPathResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPathResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPathResponse")
    public JAXBElement<GetPathResponse> createGetPathResponse(GetPathResponse value) {
        return new JAXBElement<>(_GetPathResponse_QNAME, GetPathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProperties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetProperties }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getProperties")
    public JAXBElement<GetProperties> createGetProperties(GetProperties value) {
        return new JAXBElement<>(_GetProperties_QNAME, GetProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPropertiesResponse")
    public JAXBElement<GetPropertiesResponse> createGetPropertiesResponse(GetPropertiesResponse value) {
        return new JAXBElement<>(_GetPropertiesResponse_QNAME, GetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVersionHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistory")
    public JAXBElement<GetVersionHistory> createGetVersionHistory(GetVersionHistory value) {
        return new JAXBElement<>(_GetVersionHistory_QNAME, GetVersionHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVersionHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistoryResponse")
    public JAXBElement<GetVersionHistoryResponse> createGetVersionHistoryResponse(GetVersionHistoryResponse value) {
        return new JAXBElement<>(_GetVersionHistoryResponse_QNAME, GetVersionHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySize }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySize }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistorySize")
    public JAXBElement<GetVersionHistorySize> createGetVersionHistorySize(GetVersionHistorySize value) {
        return new JAXBElement<>(_GetVersionHistorySize_QNAME, GetVersionHistorySize.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySizeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetVersionHistorySizeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getVersionHistorySizeResponse")
    public JAXBElement<GetVersionHistorySizeResponse> createGetVersionHistorySizeResponse(GetVersionHistorySizeResponse value) {
        return new JAXBElement<>(_GetVersionHistorySizeResponse_QNAME, GetVersionHistorySizeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsValid }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "isValid")
    public JAXBElement<IsValid> createIsValid(IsValid value) {
        return new JAXBElement<>(_IsValid_QNAME, IsValid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsValidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IsValidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "isValidResponse")
    public JAXBElement<IsValidResponse> createIsValidResponse(IsValidResponse value) {
        return new JAXBElement<>(_IsValidResponse_QNAME, IsValidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Lock }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "lock")
    public JAXBElement<Lock> createLock(Lock value) {
        return new JAXBElement<>(_Lock_QNAME, Lock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LockInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "lockInfo")
    public JAXBElement<LockInfo> createLockInfo(LockInfo value) {
        return new JAXBElement<>(_LockInfo_QNAME, LockInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "lockResponse")
    public JAXBElement<LockResponse> createLockResponse(LockResponse value) {
        return new JAXBElement<>(_LockResponse_QNAME, LockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mail }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "mail")
    public JAXBElement<Mail> createMail(Mail value) {
        return new JAXBElement<>(_Mail_QNAME, Mail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Move }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Move }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "move")
    public JAXBElement<Move> createMove(Move value) {
        return new JAXBElement<>(_Move_QNAME, Move.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MoveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MoveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "moveResponse")
    public JAXBElement<MoveResponse> createMoveResponse(MoveResponse value) {
        return new JAXBElement<>(_MoveResponse_QNAME, MoveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Note }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Purge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Purge }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purge")
    public JAXBElement<Purge> createPurge(Purge value) {
        return new JAXBElement<>(_Purge_QNAME, Purge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurgeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeResponse")
    public JAXBElement<PurgeResponse> createPurgeResponse(PurgeResponse value) {
        return new JAXBElement<>(_PurgeResponse_QNAME, PurgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeVersionHistory")
    public JAXBElement<PurgeVersionHistory> createPurgeVersionHistory(PurgeVersionHistory value) {
        return new JAXBElement<>(_PurgeVersionHistory_QNAME, PurgeVersionHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurgeVersionHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeVersionHistoryResponse")
    public JAXBElement<PurgeVersionHistoryResponse> createPurgeVersionHistoryResponse(PurgeVersionHistoryResponse value) {
        return new JAXBElement<>(_PurgeVersionHistoryResponse_QNAME, PurgeVersionHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Rename }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Rename }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "rename")
    public JAXBElement<Rename> createRename(Rename value) {
        return new JAXBElement<>(_Rename_QNAME, Rename.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RenameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RenameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "renameResponse")
    public JAXBElement<RenameResponse> createRenameResponse(RenameResponse value) {
        return new JAXBElement<>(_RenameResponse_QNAME, RenameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestoreVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "restoreVersion")
    public JAXBElement<RestoreVersion> createRestoreVersion(RestoreVersion value) {
        return new JAXBElement<>(_RestoreVersion_QNAME, RestoreVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestoreVersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestoreVersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "restoreVersionResponse")
    public JAXBElement<RestoreVersionResponse> createRestoreVersionResponse(RestoreVersionResponse value) {
        return new JAXBElement<>(_RestoreVersionResponse_QNAME, RestoreVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetProperties }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetProperties }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setProperties")
    public JAXBElement<SetProperties> createSetProperties(SetProperties value) {
        return new JAXBElement<>(_SetProperties_QNAME, SetProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPropertiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SetPropertiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "setPropertiesResponse")
    public JAXBElement<SetPropertiesResponse> createSetPropertiesResponse(SetPropertiesResponse value) {
        return new JAXBElement<>(_SetPropertiesResponse_QNAME, SetPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unlock }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Unlock }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unlock")
    public JAXBElement<Unlock> createUnlock(Unlock value) {
        return new JAXBElement<>(_Unlock_QNAME, Unlock.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnlockResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnlockResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "unlockResponse")
    public JAXBElement<UnlockResponse> createUnlockResponse(UnlockResponse value) {
        return new JAXBElement<>(_UnlockResponse_QNAME, UnlockResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Version }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "version")
    public JAXBElement<Version> createVersion(Version value) {
        return new JAXBElement<>(_Version_QNAME, Version.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatabaseException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatabaseException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "DatabaseException")
    public JAXBElement<DatabaseException> createDatabaseException(DatabaseException value) {
        return new JAXBElement<>(_DatabaseException_QNAME, DatabaseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PathNotFoundException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PathNotFoundException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "PathNotFoundException")
    public JAXBElement<PathNotFoundException> createPathNotFoundException(PathNotFoundException value) {
        return new JAXBElement<>(_PathNotFoundException_QNAME, PathNotFoundException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RepositoryException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "RepositoryException")
    public JAXBElement<RepositoryException> createRepositoryException(RepositoryException value) {
        return new JAXBElement<>(_RepositoryException_QNAME, RepositoryException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExtensionException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExtensionException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ExtensionException")
    public JAXBElement<ExtensionException> createExtensionException(ExtensionException value) {
        return new JAXBElement<>(_ExtensionException_QNAME, ExtensionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AutomationException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AutomationException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "AutomationException")
    public JAXBElement<AutomationException> createAutomationException(AutomationException value) {
        return new JAXBElement<>(_AutomationException_QNAME, AutomationException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LockException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LockException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "LockException")
    public JAXBElement<LockException> createLockException(LockException value) {
        return new JAXBElement<>(_LockException_QNAME, LockException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccessDeniedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "AccessDeniedException")
    public JAXBElement<AccessDeniedException> createAccessDeniedException(AccessDeniedException value) {
        return new JAXBElement<>(_AccessDeniedException_QNAME, AccessDeniedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IOException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "IOException")
    public JAXBElement<IOException> createIOException(IOException value) {
        return new JAXBElement<>(_IOException_QNAME, IOException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VersionException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VersionException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "VersionException")
    public JAXBElement<VersionException> createVersionException(VersionException value) {
        return new JAXBElement<>(_VersionException_QNAME, VersionException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirusDetectedException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VirusDetectedException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "VirusDetectedException")
    public JAXBElement<VirusDetectedException> createVirusDetectedException(VirusDetectedException value) {
        return new JAXBElement<>(_VirusDetectedException_QNAME, VirusDetectedException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsupportedMimeTypeException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnsupportedMimeTypeException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "UnsupportedMimeTypeException")
    public JAXBElement<UnsupportedMimeTypeException> createUnsupportedMimeTypeException(UnsupportedMimeTypeException value) {
        return new JAXBElement<>(_UnsupportedMimeTypeException_QNAME, UnsupportedMimeTypeException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSizeExceededException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSizeExceededException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "FileSizeExceededException")
    public JAXBElement<FileSizeExceededException> createFileSizeExceededException(FileSizeExceededException value) {
        return new JAXBElement<>(_FileSizeExceededException_QNAME, FileSizeExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserQuotaExceededException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserQuotaExceededException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "UserQuotaExceededException")
    public JAXBElement<UserQuotaExceededException> createUserQuotaExceededException(UserQuotaExceededException value) {
        return new JAXBElement<>(_UserQuotaExceededException_QNAME, UserQuotaExceededException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemExistsException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemExistsException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "ItemExistsException")
    public JAXBElement<ItemExistsException> createItemExistsException(ItemExistsException value) {
        return new JAXBElement<>(_ItemExistsException_QNAME, ItemExistsException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrincipalAdapterException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PrincipalAdapterException }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "PrincipalAdapterException")
    public JAXBElement<PrincipalAdapterException> createPrincipalAdapterException(PrincipalAdapterException value) {
        return new JAXBElement<>(_PrincipalAdapterException_QNAME, PrincipalAdapterException.class, null, value);
    }

}
