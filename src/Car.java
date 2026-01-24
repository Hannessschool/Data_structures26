public class Car extends Vehicle {

    double discount = 0.9;

    private double fuel = 0;

    public Car(String name){
        super(name, "motorized");
        super.discount = 0.9;
    }
    @Override
    public String soundWarning(){
        return "tut-tut";
    }

    public void refuel(){
        fuel = 100;
    }
}

