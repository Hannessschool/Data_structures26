//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello!\n");


        Car car = new Car("Volkswagen");
        Bike bike = new Bike("Harley");

        System.out.println(car.getName() + " is " + car.vehicleType);
        System.out.println(bike.getName() + " is " + bike.vehicleType);
    }

}