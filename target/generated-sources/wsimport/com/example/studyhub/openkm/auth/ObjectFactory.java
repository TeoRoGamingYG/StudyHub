
package com.example.studyhub.openkm.auth;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.studyhub.openkm.auth package. 
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

    private static final QName _GetGrantedRoles_QNAME = new QName("http://ws.openkm.com", "getGrantedRoles");
    private static final QName _GetGrantedRolesResponse_QNAME = new QName("http://ws.openkm.com", "getGrantedRolesResponse");
    private static final QName _GetGrantedUsers_QNAME = new QName("http://ws.openkm.com", "getGrantedUsers");
    private static final QName _GetGrantedUsersResponse_QNAME = new QName("http://ws.openkm.com", "getGrantedUsersResponse");
    private static final QName _GetMail_QNAME = new QName("http://ws.openkm.com", "getMail");
    private static final QName _GetMailResponse_QNAME = new QName("http://ws.openkm.com", "getMailResponse");
    private static final QName _GetName_QNAME = new QName("http://ws.openkm.com", "getName");
    private static final QName _GetNameResponse_QNAME = new QName("http://ws.openkm.com", "getNameResponse");
    private static final QName _GetRoles_QNAME = new QName("http://ws.openkm.com", "getRoles");
    private static final QName _GetRolesByUser_QNAME = new QName("http://ws.openkm.com", "getRolesByUser");
    private static final QName _GetRolesByUserResponse_QNAME = new QName("http://ws.openkm.com", "getRolesByUserResponse");
    private static final QName _GetRolesResponse_QNAME = new QName("http://ws.openkm.com", "getRolesResponse");
    private static final QName _GetUsers_QNAME = new QName("http://ws.openkm.com", "getUsers");
    private static final QName _GetUsersByRole_QNAME = new QName("http://ws.openkm.com", "getUsersByRole");
    private static final QName _GetUsersByRoleResponse_QNAME = new QName("http://ws.openkm.com", "getUsersByRoleResponse");
    private static final QName _GetUsersResponse_QNAME = new QName("http://ws.openkm.com", "getUsersResponse");
    private static final QName _GrantRole_QNAME = new QName("http://ws.openkm.com", "grantRole");
    private static final QName _GrantRoleResponse_QNAME = new QName("http://ws.openkm.com", "grantRoleResponse");
    private static final QName _GrantUser_QNAME = new QName("http://ws.openkm.com", "grantUser");
    private static final QName _GrantUserResponse_QNAME = new QName("http://ws.openkm.com", "grantUserResponse");
    private static final QName _Login_QNAME = new QName("http://ws.openkm.com", "login");
    private static final QName _LoginResponse_QNAME = new QName("http://ws.openkm.com", "loginResponse");
    private static final QName _Logout_QNAME = new QName("http://ws.openkm.com", "logout");
    private static final QName _LogoutResponse_QNAME = new QName("http://ws.openkm.com", "logoutResponse");
    private static final QName _RevokeRole_QNAME = new QName("http://ws.openkm.com", "revokeRole");
    private static final QName _RevokeRoleResponse_QNAME = new QName("http://ws.openkm.com", "revokeRoleResponse");
    private static final QName _RevokeUser_QNAME = new QName("http://ws.openkm.com", "revokeUser");
    private static final QName _RevokeUserResponse_QNAME = new QName("http://ws.openkm.com", "revokeUserResponse");
    private static final QName _DatabaseException_QNAME = new QName("http://ws.openkm.com", "DatabaseException");
    private static final QName _PathNotFoundException_QNAME = new QName("http://ws.openkm.com", "PathNotFoundException");
    private static final QName _AccessDeniedException_QNAME = new QName("http://ws.openkm.com", "AccessDeniedException");
    private static final QName _RepositoryException_QNAME = new QName("http://ws.openkm.com", "RepositoryException");
    private static final QName _PrincipalAdapterException_QNAME = new QName("http://ws.openkm.com", "PrincipalAdapterException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.studyhub.openkm.auth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetGrantedRoles }
     * 
     * @return
     *     the new instance of {@link GetGrantedRoles }
     */
    public GetGrantedRoles createGetGrantedRoles() {
        return new GetGrantedRoles();
    }

    /**
     * Create an instance of {@link GetGrantedRolesResponse }
     * 
     * @return
     *     the new instance of {@link GetGrantedRolesResponse }
     */
    public GetGrantedRolesResponse createGetGrantedRolesResponse() {
        return new GetGrantedRolesResponse();
    }

    /**
     * Create an instance of {@link GetGrantedUsers }
     * 
     * @return
     *     the new instance of {@link GetGrantedUsers }
     */
    public GetGrantedUsers createGetGrantedUsers() {
        return new GetGrantedUsers();
    }

    /**
     * Create an instance of {@link GetGrantedUsersResponse }
     * 
     * @return
     *     the new instance of {@link GetGrantedUsersResponse }
     */
    public GetGrantedUsersResponse createGetGrantedUsersResponse() {
        return new GetGrantedUsersResponse();
    }

    /**
     * Create an instance of {@link GetMail }
     * 
     * @return
     *     the new instance of {@link GetMail }
     */
    public GetMail createGetMail() {
        return new GetMail();
    }

    /**
     * Create an instance of {@link GetMailResponse }
     * 
     * @return
     *     the new instance of {@link GetMailResponse }
     */
    public GetMailResponse createGetMailResponse() {
        return new GetMailResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     * @return
     *     the new instance of {@link GetName }
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     * @return
     *     the new instance of {@link GetNameResponse }
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetRoles }
     * 
     * @return
     *     the new instance of {@link GetRoles }
     */
    public GetRoles createGetRoles() {
        return new GetRoles();
    }

    /**
     * Create an instance of {@link GetRolesByUser }
     * 
     * @return
     *     the new instance of {@link GetRolesByUser }
     */
    public GetRolesByUser createGetRolesByUser() {
        return new GetRolesByUser();
    }

    /**
     * Create an instance of {@link GetRolesByUserResponse }
     * 
     * @return
     *     the new instance of {@link GetRolesByUserResponse }
     */
    public GetRolesByUserResponse createGetRolesByUserResponse() {
        return new GetRolesByUserResponse();
    }

    /**
     * Create an instance of {@link GetRolesResponse }
     * 
     * @return
     *     the new instance of {@link GetRolesResponse }
     */
    public GetRolesResponse createGetRolesResponse() {
        return new GetRolesResponse();
    }

    /**
     * Create an instance of {@link GetUsers }
     * 
     * @return
     *     the new instance of {@link GetUsers }
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }

    /**
     * Create an instance of {@link GetUsersByRole }
     * 
     * @return
     *     the new instance of {@link GetUsersByRole }
     */
    public GetUsersByRole createGetUsersByRole() {
        return new GetUsersByRole();
    }

    /**
     * Create an instance of {@link GetUsersByRoleResponse }
     * 
     * @return
     *     the new instance of {@link GetUsersByRoleResponse }
     */
    public GetUsersByRoleResponse createGetUsersByRoleResponse() {
        return new GetUsersByRoleResponse();
    }

    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     * @return
     *     the new instance of {@link GetUsersResponse }
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }

    /**
     * Create an instance of {@link GrantRole }
     * 
     * @return
     *     the new instance of {@link GrantRole }
     */
    public GrantRole createGrantRole() {
        return new GrantRole();
    }

    /**
     * Create an instance of {@link GrantRoleResponse }
     * 
     * @return
     *     the new instance of {@link GrantRoleResponse }
     */
    public GrantRoleResponse createGrantRoleResponse() {
        return new GrantRoleResponse();
    }

    /**
     * Create an instance of {@link GrantUser }
     * 
     * @return
     *     the new instance of {@link GrantUser }
     */
    public GrantUser createGrantUser() {
        return new GrantUser();
    }

    /**
     * Create an instance of {@link GrantUserResponse }
     * 
     * @return
     *     the new instance of {@link GrantUserResponse }
     */
    public GrantUserResponse createGrantUserResponse() {
        return new GrantUserResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     * @return
     *     the new instance of {@link Login }
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     * @return
     *     the new instance of {@link LoginResponse }
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Logout }
     * 
     * @return
     *     the new instance of {@link Logout }
     */
    public Logout createLogout() {
        return new Logout();
    }

    /**
     * Create an instance of {@link LogoutResponse }
     * 
     * @return
     *     the new instance of {@link LogoutResponse }
     */
    public LogoutResponse createLogoutResponse() {
        return new LogoutResponse();
    }

    /**
     * Create an instance of {@link RevokeRole }
     * 
     * @return
     *     the new instance of {@link RevokeRole }
     */
    public RevokeRole createRevokeRole() {
        return new RevokeRole();
    }

    /**
     * Create an instance of {@link RevokeRoleResponse }
     * 
     * @return
     *     the new instance of {@link RevokeRoleResponse }
     */
    public RevokeRoleResponse createRevokeRoleResponse() {
        return new RevokeRoleResponse();
    }

    /**
     * Create an instance of {@link RevokeUser }
     * 
     * @return
     *     the new instance of {@link RevokeUser }
     */
    public RevokeUser createRevokeUser() {
        return new RevokeUser();
    }

    /**
     * Create an instance of {@link RevokeUserResponse }
     * 
     * @return
     *     the new instance of {@link RevokeUserResponse }
     */
    public RevokeUserResponse createRevokeUserResponse() {
        return new RevokeUserResponse();
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
     * Create an instance of {@link PrincipalAdapterException }
     * 
     * @return
     *     the new instance of {@link PrincipalAdapterException }
     */
    public PrincipalAdapterException createPrincipalAdapterException() {
        return new PrincipalAdapterException();
    }

    /**
     * Create an instance of {@link IntegerPair }
     * 
     * @return
     *     the new instance of {@link IntegerPair }
     */
    public IntegerPair createIntegerPair() {
        return new IntegerPair();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRoles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGrantedRoles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedRoles")
    public JAXBElement<GetGrantedRoles> createGetGrantedRoles(GetGrantedRoles value) {
        return new JAXBElement<>(_GetGrantedRoles_QNAME, GetGrantedRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedRolesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGrantedRolesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedRolesResponse")
    public JAXBElement<GetGrantedRolesResponse> createGetGrantedRolesResponse(GetGrantedRolesResponse value) {
        return new JAXBElement<>(_GetGrantedRolesResponse_QNAME, GetGrantedRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGrantedUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedUsers")
    public JAXBElement<GetGrantedUsers> createGetGrantedUsers(GetGrantedUsers value) {
        return new JAXBElement<>(_GetGrantedUsers_QNAME, GetGrantedUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGrantedUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetGrantedUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getGrantedUsersResponse")
    public JAXBElement<GetGrantedUsersResponse> createGetGrantedUsersResponse(GetGrantedUsersResponse value) {
        return new JAXBElement<>(_GetGrantedUsersResponse_QNAME, GetGrantedUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMail }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMail")
    public JAXBElement<GetMail> createGetMail(GetMail value) {
        return new JAXBElement<>(_GetMail_QNAME, GetMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetMailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getMailResponse")
    public JAXBElement<GetMailResponse> createGetMailResponse(GetMailResponse value) {
        return new JAXBElement<>(_GetMailResponse_QNAME, GetMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRoles }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRoles")
    public JAXBElement<GetRoles> createGetRoles(GetRoles value) {
        return new JAXBElement<>(_GetRoles_QNAME, GetRoles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRolesByUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesByUser")
    public JAXBElement<GetRolesByUser> createGetRolesByUser(GetRolesByUser value) {
        return new JAXBElement<>(_GetRolesByUser_QNAME, GetRolesByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesByUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRolesByUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesByUserResponse")
    public JAXBElement<GetRolesByUserResponse> createGetRolesByUserResponse(GetRolesByUserResponse value) {
        return new JAXBElement<>(_GetRolesByUserResponse_QNAME, GetRolesByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRolesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getRolesResponse")
    public JAXBElement<GetRolesResponse> createGetRolesResponse(GetRolesResponse value) {
        return new JAXBElement<>(_GetRolesResponse_QNAME, GetRolesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsers }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsers")
    public JAXBElement<GetUsers> createGetUsers(GetUsers value) {
        return new JAXBElement<>(_GetUsers_QNAME, GetUsers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersByRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersByRole")
    public JAXBElement<GetUsersByRole> createGetUsersByRole(GetUsersByRole value) {
        return new JAXBElement<>(_GetUsersByRole_QNAME, GetUsersByRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersByRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersByRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersByRoleResponse")
    public JAXBElement<GetUsersByRoleResponse> createGetUsersByRoleResponse(GetUsersByRoleResponse value) {
        return new JAXBElement<>(_GetUsersByRoleResponse_QNAME, GetUsersByRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUsersResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "getUsersResponse")
    public JAXBElement<GetUsersResponse> createGetUsersResponse(GetUsersResponse value) {
        return new JAXBElement<>(_GetUsersResponse_QNAME, GetUsersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrantRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantRole")
    public JAXBElement<GrantRole> createGrantRole(GrantRole value) {
        return new JAXBElement<>(_GrantRole_QNAME, GrantRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrantRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantRoleResponse")
    public JAXBElement<GrantRoleResponse> createGrantRoleResponse(GrantRoleResponse value) {
        return new JAXBElement<>(_GrantRoleResponse_QNAME, GrantRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrantUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantUser")
    public JAXBElement<GrantUser> createGrantUser(GrantUser value) {
        return new JAXBElement<>(_GrantUser_QNAME, GrantUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GrantUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GrantUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "grantUserResponse")
    public JAXBElement<GrantUserResponse> createGrantUserResponse(GrantUserResponse value) {
        return new JAXBElement<>(_GrantUserResponse_QNAME, GrantUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "loginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "logout")
    public JAXBElement<Logout> createLogout(Logout value) {
        return new JAXBElement<>(_Logout_QNAME, Logout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LogoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "logoutResponse")
    public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
        return new JAXBElement<>(_LogoutResponse_QNAME, LogoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRole }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeRole }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeRole")
    public JAXBElement<RevokeRole> createRevokeRole(RevokeRole value) {
        return new JAXBElement<>(_RevokeRole_QNAME, RevokeRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeRoleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeRoleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeRoleResponse")
    public JAXBElement<RevokeRoleResponse> createRevokeRoleResponse(RevokeRoleResponse value) {
        return new JAXBElement<>(_RevokeRoleResponse_QNAME, RevokeRoleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeUser")
    public JAXBElement<RevokeUser> createRevokeUser(RevokeUser value) {
        return new JAXBElement<>(_RevokeUser_QNAME, RevokeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevokeUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RevokeUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws.openkm.com", name = "revokeUserResponse")
    public JAXBElement<RevokeUserResponse> createRevokeUserResponse(RevokeUserResponse value) {
        return new JAXBElement<>(_RevokeUserResponse_QNAME, RevokeUserResponse.class, null, value);
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
