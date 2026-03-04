public class Utils {

    static void loopBackwards(int i, int min)
    {
        if (i < 0) return;
        System.out.println(i + " ");
        loopBackwards(i-1, min);
    }

    static int pow(int i, int exp)
    {
        if(exp <= 1) return i;
        int res = i * pow(i, exp-1);
        return res;
    }


    public static void hello(){
        System.out.println("hello");
    }

    public static boolean isPositiveInteger(String str){
        return str.matches("-?\\d+");
    }

}
