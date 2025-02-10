public class Aircraft {
    private int lenght;
    private String fuelType;
    private int speed;
    private String model;

    public Aircraft(int lenght, String fuelType, int speed, String model) {
        this.lenght = lenght;
        this.fuelType = fuelType;
        this.speed = speed;
        this.model=model;
    }
    public  void  fly(){
        System.out.println("Самолет полетел. ");
    }
}
