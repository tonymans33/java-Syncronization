import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Network {

    public static String[] generateDeviceName(String input){
        String[] info = new String[3];

        info[0] = input.substring(0, input.indexOf(" "));
        info[1] = input.split(" ")[1];

        return info;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is number of WI-FI Connections?");
        int wifiConnectionsNumber = input.nextInt();

        System.out.println("What is number of devices Clients want to connect?");
        int clientDevicesNumber = input.nextInt();

        String deviceNameAndType;
//        List<Device> devices = new ArrayList<Device>();

        for (int i=0 ; i<=clientDevicesNumber ; i++){

            deviceNameAndType = input.nextLine();
            System.out.print(deviceNameAndType.substring(0, deviceNameAndType.indexOf(" ")));

//            System.out.print(deviceNameAndType);

//            devices.add(new Device(generateDeviceName(deviceNameAndType)));

//            System.out.println(devices.get(i).getName());

        }

    }
}
