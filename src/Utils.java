public class Utils {

    public static void hello(){
        System.out.println("hello");
    }

    public static boolean isPositiveInteger(String str){
        return str.matches("-?\\d+");
    }

}
