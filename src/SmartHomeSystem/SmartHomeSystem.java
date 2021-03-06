package SmartHomeSystem;

import java.awt.Color;
import CS2114.*;

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
    
    private Window userDevice;
    
    public final int WINDOW_WIDTH = 450;
    public final int WINDOW_HEIGHT = 650;
    
    /**
     * Constructor
     */
    public SmartHomeSystem() {
        userDevice = new Window("Smart Home System");
        userDevice.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        deviceManager = new DeviceManager();
        username = "user001"; // Username will be pulled from login information
    }
    
    public void addUser() {
        
    }
    
    public void removeUser() {
        
    }
    
    public void editUser() {
        
    }
    
    public void manageDevices(Shape loginShape) {
        deviceManager.createDeviceManagerPage(userDevice, this, username);
    }
    
    public void selectDeviceAndRunCommand(Device device, Command command) {
        
    }
    
    public void createEntryPage(Shape backButton) {
        userDevice.removeAllShapes();
        Shape signup = new Shape(50, 200, 350, 50, Color.orange);
        Shape login = new Shape(50, 270, 350, 50, Color.orange);
        login.onClick(this, "manageDevices");
        
        TextShape signupText = new TextShape(180, 220, "Sign Up");
        
        TextShape loginText = new TextShape(180, 290, "Log In");
        loginText.onClick(this, "manageDevices");
        
        userDevice.addShape(signupText);
        userDevice.addShape(loginText);
        userDevice.addShape(signup);
        userDevice.addShape(login);
    }
    
    
} //end SmartHomeSystem
