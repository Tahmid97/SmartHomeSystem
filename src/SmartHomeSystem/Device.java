package SmartHomeSystem;

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
    
    public Device(int deviceID, String deviceName) {
        
    }
    
    public String getDeviceName() {
        return null;
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
    
} //end Device
