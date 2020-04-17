/**
 * 
 * Description:
 * 1. The SmartHomeSystem is the central part of the system.
 * 2. It communicates directly with the DeviceManager, which is responsible for
 * controlling connected Devices.
 * 3. SmartHomeSystem also prompts users for a Login and provides a way for new
 * users to Register.
 * 4. SmartHomeSystem also has to check with UserManager to ensure that a User
 * has sufficient permissions to execute a Command.
 * 
 * The SmartHomeSystem class manages the user and device actions and performs
 * executions of devices according to the given command. The Login class depends
 * on this class to allow only the authenticated user to access the Smart Home
 * System Interface.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 */

public class SmartHomeSystem {
    
    private UserManager userManager;
    private DeviceManager deviceManager;
    private String username;
    private Device device;
    private Command command;
    private Register userAdd;
    
    /**
     * Constructor
     */
    public SmartHomeSystem() {
        
    }
    
    public void addUser() {
        
    }
    
    public void removeUser() {
        
    }
    
    public void editUser() {
        
    }
    
    public void managerDevices() {
        
    }
    
    public void selectDeviceAndRunCommand(Device device, Command command) {
        
    }

} //end SmartHomeSystem
