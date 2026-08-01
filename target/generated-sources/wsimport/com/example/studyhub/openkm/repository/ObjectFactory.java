
package com.example.studyhub.openkm.repository;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.studyhub.openkm.repository package. 
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

    private static final QName _AppVersion_QNAME = new QName("http://ws.openkm.com", "appVersion");
    private static final QName _Document_QNAME = new QName("http://ws.openkm.com", "document");
    private static final QName _Folder_QNAME = new QName("http://ws.openkm.com", "folder");
    private static final QName _GetAppVersion_QNAME = new QName("http://ws.openkm.com", "getAppVersion");
    private static final QName _GetAppVersionResponse_QNAME = new QName("http://ws.openkm.com", "getAppVersionResponse");
    private static final QName _GetCategoriesFolder_QNAME = new QName("http://ws.openkm.com", "getCategoriesFolder");
    private static final QName _GetCategoriesFolderResponse_QNAME = new QName("http://ws.openkm.com", "getCategoriesFolderResponse");
    private static final QName _GetMailFolder_QNAME = new QName("http://ws.openkm.com", "getMailFolder");
    private static final QName _GetMailFolderResponse_QNAME = new QName("http://ws.openkm.com", "getMailFolderResponse");
    private static final QName _GetNodePath_QNAME = new QName("http://ws.openkm.com", "getNodePath");
    private static final QName _GetNodePathResponse_QNAME = new QName("http://ws.openkm.com", "getNodePathResponse");
    private static final QName _GetNodeUuid_QNAME = new QName("http://ws.openkm.com", "getNodeUuid");
    private static final QName _GetNodeUuidResponse_QNAME = new QName("http://ws.openkm.com", "getNodeUuidResponse");
    private static final QName _GetPersonalFolder_QNAME = new QName("http://ws.openkm.com", "getPersonalFolder");
    private static final QName _GetPersonalFolderResponse_QNAME = new QName("http://ws.openkm.com", "getPersonalFolderResponse");
    private static final QName _GetRepositoryUuid_QNAME = new QName("http://ws.openkm.com", "getRepositoryUuid");
    private static final QName _GetRepositoryUuidResponse_QNAME = new QName("http://ws.openkm.com", "getRepositoryUuidResponse");
    private static final QName _GetRootFolder_QNAME = new QName("http://ws.openkm.com", "getRootFolder");
    private static final QName _GetRootFolderResponse_QNAME = new QName("http://ws.openkm.com", "getRootFolderResponse");
    private static final QName _GetTemplatesFolder_QNAME = new QName("http://ws.openkm.com", "getTemplatesFolder");
    private static final QName _GetTemplatesFolderResponse_QNAME = new QName("http://ws.openkm.com", "getTemplatesFolderResponse");
    private static final QName _GetThesaurusFolder_QNAME = new QName("http://ws.openkm.com", "getThesaurusFolder");
    private static final QName _GetThesaurusFolderResponse_QNAME = new QName("http://ws.openkm.com", "getThesaurusFolderResponse");
    private static final QName _GetTrashFolder_QNAME = new QName("http://ws.openkm.com", "getTrashFolder");
    private static final QName _GetTrashFolderResponse_QNAME = new QName("http://ws.openkm.com", "getTrashFolderResponse");
    private static final QName _GetUpdateMessage_QNAME = new QName("http://ws.openkm.com", "getUpdateMessage");
    private static final QName _GetUpdateMessageResponse_QNAME = new QName("http://ws.openkm.com", "getUpdateMessageResponse");
    private static final QName _HasNode_QNAME = new QName("http://ws.openkm.com", "hasNode");
    private static final QName _HasNodeResponse_QNAME = new QName("http://ws.openkm.com", "hasNodeResponse");
    private static final QName _LockInfo_QNAME = new QName("http://ws.openkm.com", "lockInfo");
    private static final QName _Mail_QNAME = new QName("http://ws.openkm.com", "mail");
    private static final QName _Note_QNAME = new QName("http://ws.openkm.com", "note");
    private static final QName _PurgeTrash_QNAME = new QName("http://ws.openkm.com", "purgeTrash");
    private static final QName _PurgeTrashResponse_QNAME = new QName("http://ws.openkm.com", "purgeTrashResponse");
    private static final QName _Version_QNAME = new QName("http://ws.openkm.com", "version");
    private static final QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private static final QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private static final QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private static final QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private static final QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.studyhub.openkm.repository
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AppVersion }
     * 
     * @return
     *     the new instance of {@link AppVersion }
     */
    public AppVersion createAppVersion() {
        return new AppVersion();
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
     * Create an instance of {@link GetAppVersion }
     * 
     * @return
     *     the new instance of {@link GetAppVersion }
     */
    public GetAppVersion createGetAppVersion() {
        return new GetAppVersion();
    }

    /**
     * Create an instance of {@link GetAppVersionResponse }
     * 
     * @return
     *     the new instance of {@link GetAppVersionResponse }
     */
    public GetAppVersionResponse createGetAppVersionResponse() {
        return new GetAppVersionResponse();
    }

    /**
     * Create an instance of {@link GetCategoriesFolder }
     * 
     * @return
     *     the new instance of {@link GetCategoriesFolder }
     */
    public GetCategoriesFolder createGetCategoriesFolder() {
        return new GetCategoriesFolder();
    }

    /**
     * Create an instance of {@link GetCategoriesFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetCategoriesFolderResponse }
     */
    public GetCategoriesFolderResponse createGetCategoriesFolderResponse() {
        return new GetCategoriesFolderResponse();
    }

    /**
     * Create an instance of {@link GetMailFolder }
     * 
     * @return
     *     the new instance of {@link GetMailFolder }
     */
    public GetMailFolder createGetMailFolder() {
        return new GetMailFolder();
    }

    /**
     * Create an instance of {@link GetMailFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetMailFolderResponse }
     */
    public GetMailFolderResponse createGetMailFolderResponse() {
        return new GetMailFolderResponse();
    }

    /**
     * Create an instance of {@link GetNodePath }
     * 
     * @return
     *     the new instance of {@link GetNodePath }
     */
    public GetNodePath createGetNodePath() {
        return new GetNodePath();
    }

    /**
     * Create an instance of {@link GetNodePathResponse }
     * 
     * @return
     *     the new instance of {@link GetNodePathResponse }
     */
    public GetNodePathResponse createGetNodePathResponse() {
        return new GetNodePathResponse();
    }

    /**
     * Create an instance of {@link GetNodeUuid }
     * 
     * @return
     *     the new instance of {@link GetNodeUuid }
     */
    public GetNodeUuid createGetNodeUuid() {
        return new GetNodeUuid();
    }

    /**
     * Create an instance of {@link GetNodeUuidResponse }
     * 
     * @return
     *     the new instance of {@link GetNodeUuidResponse }
     */
    public GetNodeUuidResponse createGetNodeUuidResponse() {
        return new GetNodeUuidResponse();
    }

    /**
     * Create an instance of {@link GetPersonalFolder }
     * 
     * @return
     *     the new instance of {@link GetPersonalFolder }
     */
    public GetPersonalFolder createGetPersonalFolder() {
        return new GetPersonalFolder();
    }

    /**
     * Create an instance of {@link GetPersonalFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetPersonalFolderResponse }
     */
    public GetPersonalFolderResponse createGetPersonalFolderResponse() {
        return new GetPersonalFolderResponse();
    }

    /**
     * Create an instance of {@link GetRepositoryUuid }
     * 
     * @return
     *     the new instance of {@link GetRepositoryUuid }
     */
    public GetRepositoryUuid createGetRepositoryUuid() {
        return new GetRepositoryUuid();
    }

    /**
     * Create an instance of {@link GetRepositoryUuidResponse }
     * 
     * @return
     *     the new instance of {@link GetRepositoryUuidResponse }
     */
    public GetRepositoryUuidResponse createGetRepositoryUuidResponse() {
        return new GetRepositoryUuidResponse();
    }

    /**
     * Create an instance of {@link GetRootFolder }
     * 
     * @return
     *     the new instance of {@link GetRootFolder }
     */
    public GetRootFolder createGetRootFolder() {
        return new GetRootFolder();
    }

    /**
     * Create an instance of {@link GetRootFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetRootFolderResponse }
     */
    public GetRootFolderResponse createGetRootFolderResponse() {
        return new GetRootFolderResponse();
    }

    /**
     * Create an instance of {@link GetTemplatesFolder }
     * 
     * @return
     *     the new instance of {@link GetTemplatesFolder }
     */
    public GetTemplatesFolder createGetTemplatesFolder() {
        return new GetTemplatesFolder();
    }

    /**
     * Create an instance of {@link GetTemplatesFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetTemplatesFolderResponse }
     */
    public GetTemplatesFolderResponse createGetTemplatesFolderResponse() {
        return new GetTemplatesFolderResponse();
    }

    /**
     * Create an instance of {@link GetThesaurusFolder }
     * 
     * @return
     *     the new instance of {@link GetThesaurusFolder }
     */
    public GetThesaurusFolder createGetThesaurusFolder() {
        return new GetThesaurusFolder();
    }

    /**
     * Create an instance of {@link GetThesaurusFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetThesaurusFolderResponse }
     */
    public GetThesaurusFolderResponse createGetThesaurusFolderResponse() {
        return new GetThesaurusFolderResponse();
    }

    /**
     * Create an instance of {@link GetTrashFolder }
     * 
     * @return
     *     the new instance of {@link GetTrashFolder }
     */
    public GetTrashFolder createGetTrashFolder() {
        return new GetTrashFolder();
    }

    /**
     * Create an instance of {@link GetTrashFolderResponse }
     * 
     * @return
     *     the new instance of {@link GetTrashFolderResponse }
     */
    public GetTrashFolderResponse createGetTrashFolderResponse() {
        return new GetTrashFolderResponse();
    }

    /**
     * Create an instance of {@link GetUpdateMessage }
     * 
     * @return
     *     the new instance of {@link GetUpdateMessage }
     */
    public GetUpdateMessage createGetUpdateMessage() {
        return new GetUpdateMessage();
    }

    /**
     * Create an instance of {@link GetUpdateMessageResponse }
     * 
     * @return
     *     the new instance of {@link GetUpdateMessageResponse }
     */
    public GetUpdateMessageResponse createGetUpdateMessageResponse() {
        return new GetUpdateMessageResponse();
    }

    /**
     * Create an instance of {@link HasNode }
     * 
     * @return
     *     the new instance of {@link HasNode }
     */
    public HasNode createHasNode() {
        return new HasNode();
    }

    /**
     * Create an instance of {@link HasNodeResponse }
     * 
     * @return
     *     the new instance of {@link HasNodeResponse }
     */
    public HasNodeResponse createHasNodeResponse() {
        return new HasNodeResponse();
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
     * Create an instance of {@link Mail }
     * 
     * @return
     *     the new instance of {@link Mail }
     */
    public Mail createMail() {
        return new Mail();
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
     * Create an instance of {@link PurgeTrash }
     * 
     * @return
     *     the new instance of {@link PurgeTrash }
     */
    public PurgeTrash createPurgeTrash() {
        return new PurgeTrash();
    }

    /**
     * Create an instance of {@link PurgeTrashResponse }
     * 
     * @return
     *     the new instance of {@link PurgeTrashResponse }
     */
    public PurgeTrashResponse createPurgeTrashResponse() {
        return new PurgeTrashResponse();
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
     * Create an instance of {@link RepositoryException }
     * 
     * @return
     *     the new instance of {@link RepositoryException }
     */
    public RepositoryException createRepositoryException() {
        return new RepositoryException();
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
     * Create an instance of {@link AccessDeniedException }
     * 
     * @return
     *     the new instance of {@link AccessDeniedException }
     */
    public AccessDeniedException createAccessDeniedException() {
        return new AccessDeniedException();
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
     * Create an instance of {@link Node }
     * 
     * @return
     *     the new instance of {@link Node }
     */
    public Node createNode() {
        return new Node();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AppVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AppVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "appVersion")
    public JAXBElement<AppVersion> createAppVersion(AppVersion value) {
        return new JAXBElement<>(_AppVersion_QNAME, AppVersion.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppVersion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAppVersion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAppVersion")
    public JAXBElement<GetAppVersion> createGetAppVersion(GetAppVersion value) {
        return new JAXBElement<>(_GetAppVersion_QNAME, GetAppVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAppVersionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAppVersionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getAppVersionResponse")
    public JAXBElement<GetAppVersionResponse> createGetAppVersionResponse(GetAppVersionResponse value) {
        return new JAXBElement<>(_GetAppVersionResponse_QNAME, GetAppVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategoriesFolder")
    public JAXBElement<GetCategoriesFolder> createGetCategoriesFolder(GetCategoriesFolder value) {
        return new JAXBElement<>(_GetCategoriesFolder_QNAME, GetCategoriesFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCategoriesFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getCategoriesFolderResponse")
    public JAXBElement<GetCategoriesFolderResponse> createGetCategoriesFolderResponse(GetCategoriesFolderResponse value) {
        return new JAXBElement<>(_GetCategoriesFolderResponse_QNAME, GetCategoriesFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMailFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailFolder")
    public JAXBElement<GetMailFolder> createGetMailFolder(GetMailFolder value) {
        return new JAXBElement<>(_GetMailFolder_QNAME, GetMailFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMailFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailFolderResponse")
    public JAXBElement<GetMailFolderResponse> createGetMailFolderResponse(GetMailFolderResponse value) {
        return new JAXBElement<>(_GetMailFolderResponse_QNAME, GetMailFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodePath }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNodePath }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodePath")
    public JAXBElement<GetNodePath> createGetNodePath(GetNodePath value) {
        return new JAXBElement<>(_GetNodePath_QNAME, GetNodePath.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodePathResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNodePathResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodePathResponse")
    public JAXBElement<GetNodePathResponse> createGetNodePathResponse(GetNodePathResponse value) {
        return new JAXBElement<>(_GetNodePathResponse_QNAME, GetNodePathResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeUuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNodeUuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodeUuid")
    public JAXBElement<GetNodeUuid> createGetNodeUuid(GetNodeUuid value) {
        return new JAXBElement<>(_GetNodeUuid_QNAME, GetNodeUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNodeUuidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNodeUuidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNodeUuidResponse")
    public JAXBElement<GetNodeUuidResponse> createGetNodeUuidResponse(GetNodeUuidResponse value) {
        return new JAXBElement<>(_GetNodeUuidResponse_QNAME, GetNodeUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonalFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPersonalFolder")
    public JAXBElement<GetPersonalFolder> createGetPersonalFolder(GetPersonalFolder value) {
        return new JAXBElement<>(_GetPersonalFolder_QNAME, GetPersonalFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPersonalFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetPersonalFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getPersonalFolderResponse")
    public JAXBElement<GetPersonalFolderResponse> createGetPersonalFolderResponse(GetPersonalFolderResponse value) {
        return new JAXBElement<>(_GetPersonalFolderResponse_QNAME, GetPersonalFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepositoryUuid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRepositoryUuid }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRepositoryUuid")
    public JAXBElement<GetRepositoryUuid> createGetRepositoryUuid(GetRepositoryUuid value) {
        return new JAXBElement<>(_GetRepositoryUuid_QNAME, GetRepositoryUuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRepositoryUuidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRepositoryUuidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRepositoryUuidResponse")
    public JAXBElement<GetRepositoryUuidResponse> createGetRepositoryUuidResponse(GetRepositoryUuidResponse value) {
        return new JAXBElement<>(_GetRepositoryUuidResponse_QNAME, GetRepositoryUuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRootFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRootFolder")
    public JAXBElement<GetRootFolder> createGetRootFolder(GetRootFolder value) {
        return new JAXBElement<>(_GetRootFolder_QNAME, GetRootFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRootFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRootFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRootFolderResponse")
    public JAXBElement<GetRootFolderResponse> createGetRootFolderResponse(GetRootFolderResponse value) {
        return new JAXBElement<>(_GetRootFolderResponse_QNAME, GetRootFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTemplatesFolder")
    public JAXBElement<GetTemplatesFolder> createGetTemplatesFolder(GetTemplatesFolder value) {
        return new JAXBElement<>(_GetTemplatesFolder_QNAME, GetTemplatesFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTemplatesFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTemplatesFolderResponse")
    public JAXBElement<GetTemplatesFolderResponse> createGetTemplatesFolderResponse(GetTemplatesFolderResponse value) {
        return new JAXBElement<>(_GetTemplatesFolderResponse_QNAME, GetTemplatesFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getThesaurusFolder")
    public JAXBElement<GetThesaurusFolder> createGetThesaurusFolder(GetThesaurusFolder value) {
        return new JAXBElement<>(_GetThesaurusFolder_QNAME, GetThesaurusFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThesaurusFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getThesaurusFolderResponse")
    public JAXBElement<GetThesaurusFolderResponse> createGetThesaurusFolderResponse(GetThesaurusFolderResponse value) {
        return new JAXBElement<>(_GetThesaurusFolderResponse_QNAME, GetThesaurusFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrashFolder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrashFolder }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTrashFolder")
    public JAXBElement<GetTrashFolder> createGetTrashFolder(GetTrashFolder value) {
        return new JAXBElement<>(_GetTrashFolder_QNAME, GetTrashFolder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTrashFolderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTrashFolderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getTrashFolderResponse")
    public JAXBElement<GetTrashFolderResponse> createGetTrashFolderResponse(GetTrashFolderResponse value) {
        return new JAXBElement<>(_GetTrashFolderResponse_QNAME, GetTrashFolderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdateMessage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUpdateMessage }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUpdateMessage")
    public JAXBElement<GetUpdateMessage> createGetUpdateMessage(GetUpdateMessage value) {
        return new JAXBElement<>(_GetUpdateMessage_QNAME, GetUpdateMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUpdateMessageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUpdateMessageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUpdateMessageResponse")
    public JAXBElement<GetUpdateMessageResponse> createGetUpdateMessageResponse(GetUpdateMessageResponse value) {
        return new JAXBElement<>(_GetUpdateMessageResponse_QNAME, GetUpdateMessageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasNode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HasNode }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "hasNode")
    public JAXBElement<HasNode> createHasNode(HasNode value) {
        return new JAXBElement<>(_HasNode_QNAME, HasNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HasNodeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HasNodeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "hasNodeResponse")
    public JAXBElement<HasNodeResponse> createHasNodeResponse(HasNodeResponse value) {
        return new JAXBElement<>(_HasNodeResponse_QNAME, HasNodeResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeTrash }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurgeTrash }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeTrash")
    public JAXBElement<PurgeTrash> createPurgeTrash(PurgeTrash value) {
        return new JAXBElement<>(_PurgeTrash_QNAME, PurgeTrash.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurgeTrashResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PurgeTrashResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "purgeTrashResponse")
    public JAXBElement<PurgeTrashResponse> createPurgeTrashResponse(PurgeTrashResponse value) {
        return new JAXBElement<>(_PurgeTrashResponse_QNAME, PurgeTrashResponse.class, null, value);
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

}
