import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Slumptalgenerator. Genererar ett slumpmässigt tal mellan 1 till 100. Tryck enter för att generera slumptalet");

        while (true) {
            ;

            try {
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("q")) {
                    System.out.println("Tack och hej");
                    break;
                }

                if (!input.isEmpty()) {
                    Integer.parseInt(input);
                }

                int randomNumber = random.nextInt(100) + 1;
                System.out.println("Slumptal: " + randomNumber);

            } catch (NumberFormatException e) {
                System.out.println("Ogiltig inmatning!");
            }
            System.out.println("tryck enter för ett nytt slumptal, eller q för att avsluta.");
        }
        scanner.close();
    }
}

        /*BikeShop bikeshop = new BikeShop();
        bikeshop.addBike(new Bike("Scott", 500));
        bikeshop.getBike(0).addSpec("suspension", "hardtail");
        bikeshop.addBike(new Bike("Helkama", 400));
        bikeshop.getBike(1).addSpec("suspension", "none");
        bikeshop.addBike(new Bike("Jopo", 300));
        bikeshop.getBike(2).addSpec("wheel-size", "29 inch");


        System.out.println(bikeShop.getBike(1).getSpecsString());


        System.out.println("Välkommen till Bike Shop! Våra cyklar: ");
        for (int i = 0; i < bikeshop.getBikeCount(); i++){
        Bike bike = bikeshop.getBike(i);
        System.out.printf("%d - %s %.2f € saldo: %d\n%s",
                i + 1,
                bike.getName(),
                bike.getPrice(),
                bike.getStock(),
                bike.getSpecsString());
        }


        while (true) {
            System.out.printf("\n Vilken cykel vill du köpa? 1-%d) eller q för att avsluta: ",
                    bikeshop.getBikeCount());
            String bikeInput = textInput.nextLine();

            if (bikeInput.equalsIgnoreCase("q"));
            System.out.println("Tack och välkommen åter");
            System.exit(0);
        }

            try {

                int chosenBike = Integer.parseInt(BikeInput);
                Bike bikeOwned = bikeshop.getBike(chosenBike);
                System.out.printf("Grattis, du äger nu cykel %s\n", bikeOwned.getName());
                break;

            } catch (NumberFormatException e) {
                System.out.println("Du måste ge ett heltal");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Det finns ingen sådan cykel");
            }



        Vehicle car = new Car("Volkswagen");
        Vehicle bike = new Bike("Harley");
        Vehicle todaysVehicle;
        car.price = 10000;
        bike.price = 500;

        car.refuel(50);
        bike.refuel(60);

        System.out.printf("%s fuel %d (total fuel: %d)\n",
        car.getName(),
        car.getFuel(),
        car.totalFuel());

        todaysVehicle = car;
        System.out.printf("Idag åker jag: %s%n", todaysVehicle.getName());

        todaysVehicle = bike;
        System.out.printf("Imorgon åker jag: %s%n", todaysVehicle.getName());

        System.out.println(car.getName() + " is " + car.getVehicleType());
        System.out.println(bike.getName() + " is " + bike.getVehicleType());

        System.out.println(car.getName() + " kostar " + car.getPrice());

        System.out.println(car.getName() + " säger " + car.soundWarning());


        Hat hat = new Hat(20);


        Shirt shirt = new Shirt("Shortsleeved shirt", "green", 10);
        Shirt shirt2 = new Shirt("Longsleeved shirt", "red", 12);
        Shirt shirt3 = new Shirt("Unsleeved shirt", "grey", 7);

        Pants pants = new Pants("Jeans", "dark blue", 17);
        Pants pants2 = new Pants("Khakis", "light brown", 13);
        Pants pants3 = new Pants("Costume pants", "black", 25);


        System.out.println("The " + shirt.getType() + " is available in " + shirt.getColor() + " color and costs " + shirt.getPrice() + " euros");
        System.out.println("The " + shirt2.getType() + " is available in " + shirt2.getColor() + " color and costs " + shirt2.getPrice() + " euros");
        System.out.println("The " + shirt3.getType() + " is available in " + shirt3.getColor() + " color and costs " + shirt3.getPrice() + " euros");

        shirt2.setColor("yellow");
        shirt2.setPrice(13);

        System.out.println("The " + shirt2.getType() + " is available in " + shirt2.getColor() + " color and costs " + shirt2.getPrice() + " euros");

        System.out.println("The " + pants.getType() + " are available in " + pants.getColor() + " color and cost " + pants.getPrice() + " euros");
        System.out.println("The " + pants2.getType() + " are available in " + pants2.getColor() + " color and cost " + pants2.getPrice() + " euros");
        System.out.println("The " + pants3.getType() + " are available in " + pants3.getColor() + " color and cost " + pants3.getPrice() + " euros");

        pants.setColor("light blue");
        pants.setPrice(16);

        System.out.println("The " + pants.getType() + " are available in " + pants.getColor() + " color and cost " + pants.getPrice() + " euros")*/


    //}


