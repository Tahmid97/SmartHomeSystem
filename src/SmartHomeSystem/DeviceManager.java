package SmartHomeSystem;


import java.util.ArrayList;
import java.awt.Color;
import CS2114.*;

/**
 * The DeviceManager class handles the database of the devices. In this class,
 * new devices are added to the database, an existing device’s device name and
 * device type are updated, and an existing device is deleted. The
 * SmartHomeSystem class depends on this class to allow the users to manage
 * their devices from Smart Home System Interface.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 *
 */
public class DeviceManager {
    private ArrayList<Device> devices;
    private int deviceID;
    
    
    private static int xMultiplier = 0; // Used to determine the device icon positions
    private static int yMultiplier = 0; // Used to determine the device icon positions
    
    public DeviceManager() {
        devices = new ArrayList<Device>();
        this.addDevice(); //Example to illustrate how the GUI will look
    }
    
    public void addDevice() {
        
        /** Will be changed with db management*/
        for(int i = 0; i < 12; i++)
            devices.add(new Device(5, "Device" + i)); // Example devices 
    }
    
    public void removeDevice(int deviceID) {
        
    }
    
    public void editDevice(int deviceID) {
        
    }
    
    /**
     * Can display up to 12 devices on user device
     * Reference to SmartHomeSystemHasBeen passed to go back to login screen
     */
    public void createDeviceManagerPage(Window userDevice, SmartHomeSystem system, String username) {
        
        userDevice.removeAllShapes();
        
        TextShape welcomeText = new TextShape(20, 20, "Welcome " + username);
        welcomeText.setBackgroundColor(Color.WHITE);
        userDevice.addShape(welcomeText);
        
        /*Back button functionality*/
        TextShape backText = new TextShape(370, 35, "Logout");
        backText.onClick(system, "createEntryPage");
        userDevice.addShape(backText);      
        Shape backButton = new Shape(370, 20, 50, 50, Color.ORANGE);
        backButton.onClick(system, "createEntryPage");
        userDevice.addShape(backButton);
        
        int x = system.WINDOW_WIDTH/3;
        int y = system.WINDOW_HEIGHT/7;
        
        /*Add a new device functionality*/
        TextShape addText = new TextShape(x, y + 20, "Add a new device");
        Shape addShape = new Shape(system.WINDOW_WIDTH/10, y, 350, 50, Color.ORANGE);
        userDevice.addShape(addText);
        userDevice.addShape(addShape);
        
        /*Remove a device functionality*/
        TextShape removeText = new TextShape(x, y + 80, "Remove a device");
        Shape removeShape = new Shape(system.WINDOW_WIDTH/10, y + 60, 350, 50, Color.ORANGE);
        userDevice.addShape(removeText);
        userDevice.addShape(removeShape);
        
        TextShape deviceText = new TextShape(x, y + 150, "Devices Available");
        deviceText.setBackgroundColor(Color.WHITE);
        userDevice.addShape(deviceText);
        
        /*Add device icon for each shape in the user device to select from*/
        resetMultiplier();
        for(Device device: devices) {
            Shape icon = device.makeDeviceIcon(xMultiplier, yMultiplier);
            updateMultiplier();
            TextShape deviceName = new TextShape(icon.getX() + 5, icon.getY() + 20, device.getDeviceName());
            deviceName.onClick(device, "createDeviceWindow");
            deviceName.setBackgroundColor(icon.getBackgroundColor());
            userDevice.addShape(deviceName);
            userDevice.addShape(icon);
        }
    }
    
    
    private void updateMultiplier() {
        xMultiplier = (xMultiplier + 1) % 4;
        if (xMultiplier == 0)
            yMultiplier = (yMultiplier + 1) % 4;
    }
    
    private void resetMultiplier() {
        xMultiplier = 0;
        yMultiplier = 0;
    }
    
} //end DeviceManager
