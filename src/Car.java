public class Car extends Vehicle {

private double fuel = 0;

public Car(String name){
        super(name, "motorized");
        super.discount = 0.9;
        }
@Override
public String soundWarning(){
        return "tut-tut";
        }

/*public void refuel(int amount){
        fuel += amount;
        totalFuel += amount;
        }*/

public double getFuel(){
        return fuel;
        }

    /*public double getTotalFuel(){
        return totalFuel;
        }*/

}

