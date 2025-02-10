public class Duck extends Bird implements Flyable{
    public Duck(int height, int weight, double wingspan) {
        super(height, weight, wingspan);
    }
    @Override
    public  void fly(){
        System.out.println("Утка полетела ");
    }
}
