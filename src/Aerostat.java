public class Aerostat implements Flyable{
    private int lenght;
    private int speed;
    private String model;

    public Aerostat(int lenght, int speed, String model) {
        this.lenght = lenght;
        this.speed = speed;
        this.model= model;
    }
    public  void  fly(){
        System.out.println("Аэростат полетел. ");
    }
}
