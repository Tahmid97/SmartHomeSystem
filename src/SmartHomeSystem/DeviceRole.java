package SmartHomeSystem;

import java.util.ArrayList;

/**
 * The DeviceRole class determines the types of roles that an existing user can
 * have and creates a device role for that user. The Device class depends on
 * this class to set roles to the device and store its role in the database.
 * 
 * @author tahmid97
 * @author partner1
 * @author partner2
 * @author partner3
 * @author partner4
 *
 */
public class DeviceRole {

    /**
     * This list was marked as private in the UML. But I think making it public
     * makes more sense.
     */
    public static final ArrayList<DeviceRole> roles = null;
    private String deviceName;


    public DeviceRole(String deviceName) {

    }


    public static void createDeviceRole(String deviceName) {

    }

} // end DeviceRole
