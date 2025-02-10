import java.util.List;

public class Main {
    public static void main(String[] args) {
        Duck d1 = new Duck(20,1,60);
        Duck d2 = new Duck(25,2,80);
        Aerostat ae1 = new Aerostat(180,80,"Kirov");
        Aerostat ae2 = new Aerostat(250,150,"Zeppelin");
        Aircraft ac1 = new Aircraft(140,"Kerosene",800,"Boeing 747");
        Aircraft ac2 = new Aircraft(18,"Kerosene",4800,"F16 Falcon");

    List<Flyable> list = List.of(
            d1,d2,ae1,ae2,ac1,ac2
    );
        for (Flyable flyable : list){
            flyable.fly();
        }
    }
}