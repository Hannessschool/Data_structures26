public class Numbertaker {
    public static void intro(){
        System.out.println("Hej, vänligen ange ett heltal (negativa heltal accepteras också)");
    }

    public static boolean isInteger(String stri){
        return stri.matches("^-?\\d+$");
    }
}
