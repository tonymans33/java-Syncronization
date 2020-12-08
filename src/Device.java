public class Device {

    private String name;
    private String type;

    public Device(String[] input){

        name = input[0];
        type = input[1];

    }

    public String getName(){
        return name;
    }

    public String getType(){
        return type;
    }

}
