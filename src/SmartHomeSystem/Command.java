package SmartHomeSystem;

/**
 * The Command class handles the commands given by the user for the appropriate
 * devices. The class is responsible for turning devices on/off, and adjusting
 * their associated values by following correct commands. The SmartHomeSystem
 * class depends on this class to execute commands issued by the user from the
 * Smart Home System Interface. The Device class also depends on this class to
 * get the specific commands designed for a specific device.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 *
 */
public class Command {
    
    private String commandName;
    private boolean state;
    private int value;
    private Device device;
    
    public Command() {
        
    }
    
    public String getCommandName() {
        return null;
    }
    
    public void setValue(int val) {
        
    }
    
    public int getCurrentValue() {
        return -1;
    }
    
    public boolean getCurrentPowerState() {
        return false;
    }
    
    public void setPowerState(boolean st) {
        
    }
    
    public void executeCommand(Device device, String commandName) {
        
    }
    
} //end Command
