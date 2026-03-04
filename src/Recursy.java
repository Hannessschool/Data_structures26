public class Recursy {
    static int ops = 0;

    static void loop(int i, int max)
    {
        if (i > max) return;
        System.out.println(i + " ");
        loop(i+1, max);
    }


    //Fibonacci

    static int fib(int  n)
    {
        ops++;
        if(n <= 1) return n;
        return fib(n-1) + fib(n-2);
    }

    static int[] fibCache = new int[10000];  //memoisering = se til att man inte behöver ta och räkna ut samma värden om och om igen, utan spara dem
    static int fastFib(int  n)
    {
        ops++;
        if(n <= 1) return n;
        if (fibCache[n] != 0) return fibCache[n];
        int ret = fastFib(n-1) + fastFib(n-2);
        fibCache[n] = ret;
        return ret;
    }

}
