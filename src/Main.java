public class Main {
    public static void main(String[] args) {

        System.out.println("Hello!\n");
        Vehicle car = new Car("Volkswagen");
        Vehicle bike = new Bike("Harley");
        Vehicle todaysVehicle;
        car.price = 10000;
        bike.price = 500;

        todaysVehicle = car;
        System.out.printf("Idag åker jag: %s%n", todaysVehicle.getName());

        todaysVehicle = bike;
        System.out.printf("Imorgon åker jag: %s%n", todaysVehicle.getName());

        System.out.println(car.getName() + " is " + car.getVehicleType());
        System.out.println(bike.getName() + " is " + bike.getVehicleType());

        System.out.println(car.getName() + " kostar " + car.getPrice());

        System.out.println(car.getName() + " säger " + car.soundWarning());
        System.out.println(bike.getName() + ":n säger " + bike.soundWarning());

        Hat hat = new Hat(20);

        hat.mend();

        //Shirt shirt = new Shirt("Shortsleeved shirt", "green", 10);
        //Shirt shirt2 = new Shirt("Longsleeved shirt", "red", 12);
        //Shirt shirt3 = new Shirt("Unsleeved shirt", "grey", 7);

        //Pants pants = new Pants("Jeans", "dark blue", 17);
        //Pants pants2 = new Pants("Khakis", "light brown", 13);
        //Pants pants3 = new Pants("Costume pants", "black", 25);



        //System.out.println("The " + shirt.getType() + " is available in " + shirt.getColor() + " color and costs " + shirt.getPrice() + " euros");
        //System.out.println("The " + shirt2.getType() + " is available in " + shirt2.getColor() + " color and costs " + shirt2.getPrice() + " euros");
        //System.out.println("The " + shirt3.getType() + " is available in " + shirt3.getColor() + " color and costs " + shirt3.getPrice() + " euros");

        //shirt2.setColor("yellow");
        //shirt2.setPrice(13);

        //System.out.println("The " + shirt2.getType() + " is available in " + shirt2.getColor() + " color and costs " + shirt2.getPrice() + " euros");

        //System.out.println("The " + pants.getType() + " are available in " + pants.getColor() + " color and cost " + pants.getPrice() + " euros");
        //System.out.println("The " + pants2.getType() + " are available in " + pants2.getColor() + " color and cost " + pants2.getPrice() + " euros");
        //System.out.println("The " + pants3.getType() + " are available in " + pants3.getColor() + " color and cost " + pants3.getPrice() + " euros");

        //pants.setColor("light blue");
        //pants.setPrice(16);

        //System.out.println("The " + pants.getType() + " are available in " + pants.getColor() + " color and cost " + pants.getPrice() + " euros");



    }
}
