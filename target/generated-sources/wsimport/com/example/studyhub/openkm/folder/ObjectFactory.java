
package com.example.studyhub.openkm.folder;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.studyhub.openkm.folder package. 
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

    private static final QName _Create_QNAME = new QName("http://ws.openkm.com", "create");
    private static final QName _CreateResponse_QNAME = new QName("http://ws.openkm.com", "createResponse");
    private static final QName _CreateSimple_QNAME = new QName("http://ws.openkm.com", "createSimple");
    private static final QName _CreateSimpleResponse_QNAME = new QName("http://ws.openkm.com", "createSimpleResponse");
    private static final QName _Delete_QNAME = new QName("http://ws.openkm.com", "delete");
    private static final QName _DeleteResponse_QNAME = new QName("http://ws.openkm.com", "deleteResponse");
    private static final QName _Document_QNAME = new QName("http://ws.openkm.com", "document");
    private static final QName _Folder_QNAME = new QName("http://ws.openkm.com", "folder");
    private static final QName _GetChildren_QNAME = new QName("http://ws.openkm.com", "getChildren");
    private static final QName _GetChildrenResponse_QNAME = new QName("http://ws.openkm.com", "getChildrenResponse");
    private static final QName _GetChilds_QNAME = new QName("http://ws.openkm.com", "getChilds");
    private static final QName _GetChildsResponse_QNAME = new QName("http://ws.openkm.com", "getChildsResponse");
    private static final QName _GetPath_QNAME = new QName("http://ws.openkm.com", "getPath");
    private static final QName _GetPathResponse_QNAME = new QName("http://ws.openkm.com", "getPathResponse");
    private static final QName _GetProperties_QNAME = new QName("http://ws.openkm.com", "getProperties");
    private static final QName _GetPropertiesResponse_QNAME = new QName("http://ws.openkm.com", "getPropertiesResponse");
    private static final QName _IsValid_QNAME = new QName("http://ws.openkm.com", "isValid");
    private static final QName _IsValidResponse_QNAME = new QName("http://ws.openkm.com", "isValidResponse");
    private static final QName _LockInfo_QNAME = new QName("http://ws.openkm.com", "lockInfo");
    private static final QName _Mail_QNAME = new QName("http://ws.openkm.com", "mail");
    private static final QName _Move_QNAME = new QName("http://ws.openkm.com", "move");
    private static final QName _MoveResponse_QNAME = new QName("http://ws.openkm.com", "moveResponse");
    private static final QName _Note_QNAME = new QName("http://ws.openkm.com", "note");
    private static final QName _Rename_QNAME = new QName("http://ws.openkm.com", "rename");
    private static final QName _RenameResponse_QNAME = new QName("http://ws.openkm.com", "renameResponse");
    private static final QName _Version_QNAME = new QName("http://ws.openkm.com", "version");
    private static final QName _LockException_QNAME = new QName("http://ws.openkm.com", "LockException");
    private static final QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private static final QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private static final QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private static final QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private static final QName _ExtensionException_QNAME = new QName("http://ws.openkm.com", "ExtensionException");
    private static final QName _AutomationException_QNAME = new QName("http://ws.openkm.com", "AutomationException");
    private static final QName _ItemExistsException_QNAME = new QName("http://ws.openkm.com", "ItemExistsException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.studyhub.openkm.folder
     * 
     */
    public ObjectFactory() {
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
     * Create an instance of {@link Version }
     * 
     * @return
     *     the new instance of {@link Version }
     */
    public Version createVersion() {
        return new Version();
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
     * Create an instance of {@link ItemExistsException }
     * 
     * @return
     *     the new instance of {@link ItemExistsException }
     */
    public ItemExistsException createItemExistsException() {
        return new ItemExistsException();
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

}
