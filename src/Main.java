//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello!\n");


        Car car = new Car("Volkswagen");
        Car car2 = new Car("Tesla");

        System.out.println(car.getName());
        car.setName("Volvo");
        System.out.println(car.getName());
        System.out.println(car2.getName());
    }

}