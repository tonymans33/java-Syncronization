import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is number of WI-FI Connections?");
        int wifiConnectionsNumber = input.nextInt();

        System.out.println("What is number of devices Clients want to connect?");
        int clientDevicesNumber = input.nextInt();

        String[] deviceNameAndType = new String[clientDevicesNumber+1];
        for (int i=0 ; i<=clientDevicesNumber ; i++){
             deviceNameAndType[i] = input.nextLine();
        }
    }
}
