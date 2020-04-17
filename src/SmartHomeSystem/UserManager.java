package SmartHomeSystem;

import java.util.HashMap;

/**
 * The UserManager class handles the database of the users. In this class, newly
 * registered users are added to the database, profile information of existing
 * users is updated, and account deletion of existing users is performed. Also,
 * the Login class depends on this class to check if the user exists in the
 * database and matches the username and password associated with the account.
 * And, the SmartHomeSystem class depends on it to add a new user, update the
 * existing user’s profile or delete the existing user’s profile.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 */
public class UserManager {
    
    private HashMap<Integer, UserProfile> users;
    private int userID;
    
    public UserManager() {
        
    }
    
    public UserProfile getUserProfile(String username) {
        return null;
    }
    
    public void addUserProfile(String username, String firstname, String lastname, String password, String email, String phone) {
        
    }
    
    public void removeUserProfile(int userID, String username) {
        
    }
    
    public void updateUserProfile(int userID, String username) {
        
    }
    
} //end UserManager
