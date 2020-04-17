package SmartHomeSystem;
import java.awt.Color;
import CS2114.*;

/**
 * The Device class handles all the information of an existing user's devices
 * such as device name, device role, device type, and device ID. This class also
 * allows the user to change their device’s name, type, and role. The
 * DeviceManager class depends on this class to update the current device
 * information in the database.
 * 
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 *
 */
public class Device {
    
    private String deviceName;
    private int deviceID;
    private Command command;
    private String deviceType;
    private DeviceRole role;
    
    private Shape icon;
    
    
    public Device(int deviceID, String deviceName) {
        this.deviceName = deviceName;
    }
    
    public String getDeviceName() {
        return this.deviceName;
    }
    
    public int getDeviceID() {
        return -1;
    }
    
    public String getDeviceType() {
        return null;
    }
    
    public void setDeviceType(String deviceType) {
        
    }
    
    public void setDeviceName(String deviceName) {
        
    }
    
    public Command deviceCommand() {
        return null;
    }
    
    public void inputNewDeviceInfo(String deviceName, String deviceType) {
        
    }
    
    public void setDeviceRole(DeviceRole role) {
        
    }
    
    public DeviceRole getDeviceRole() {
        return null;
    }
    
    public void createDeviceWindow(Shape shape) {
        Window deviceWindow = new Window(deviceName);
        deviceWindow.setSize(400, 400);
        
        Button quitButton = new Button("Quit"); 
        deviceWindow.addButton(quitButton, WindowSide.SOUTH);
    }
    
    public Shape makeDeviceIcon(int xMul, int yMul) { 
        icon = new Shape(50 + 90*xMul, 270 + 90*yMul, 70, 70, Color.lightGray);
        icon.onClick(this, "createDeviceWindow");
        return icon;
    }
} //end Device
