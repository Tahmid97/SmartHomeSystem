package SmartHomeSystem;

/**
 * The UserProfile class handles all the information of an existing user such as
 * username, first name, last name. email, phone number, user ID and permission
 * set. This class also allows the user to change their information except for
 * the username. The UserManager class depends on this class to update the
 * current user’s information in the database.
 * 
 * The PermissionSet class determines which roles are allowed to execute certain
 * commands. The UserProfile class depends on this class to set the permission
 * roles to the user regarding executing certain commands.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 *
 */
public class UserProfile {

    private String username;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private PermissionSet permissions;
    
    public UserProfile(String username, String firstname, String lastname) {
        
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getFirstName() {
        return firstname;
    }
    
    public String getLastName() {
        return lastname;
    }
    
    public int getUserID() {
        return -1;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getPhoneNumber() {
        return phone;
    }
    
    public PermissionSet getPermissionSet() {
        return permissions;
    }
    
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }
    
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhoneNumber(String phone) {
        this.phone = phone;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public void serPermissionSet(PermissionSet permissions) {
        this.permissions = permissions;
    }
    
} //end UserProfile
