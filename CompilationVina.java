package compilation;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.*;

import java.util.*;

public class CompilationVina {

    static final boolean   ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
    private static Scanner inn;
    int                    INF       = -1000 * 1000 * 1000 - 100;
    Random                 rnd       = new Random();
    String                 delimiter = " ";
    BufferedReader         in;
    PrintWriter            out;
    StringTokenizer        tok;

    public static void ChthollyRequest() {
        inn = new Scanner(System.in);

        long k = inn.nextLong();
        long p = inn.nextLong();
        long i = 1;
        long s = 0;

        while (i <= k)
            {
            long m = (i * sq(10, len(i))) + rev(i);

            s += m;
            i++;

            // System.out.println(m);
            }

        System.out.println(s % p);
    }
    		//862A
    public static void MahmoudAndEhabAndTheMEX() {
        int     n, x,
                mex      = -1, req;
        Scanner keyboard = new Scanner(System.in);

        n = keyboard.nextInt();
        x = keyboard.nextInt();

        boolean[] array = new boolean[101];

        Arrays.fill(array, false);
        req = getMex(n, x, mex, keyboard, array);
        System.out.println(req);
    }

    public static void NumberOnBoard() {}

    long binPow(long a, long b) {
        if (b == 0)
            {
            return 1;
            }

        if (b % 2 == 1)
            {
            return a * binPow(a, b - 1);
            }
        else
            {
            long c = binPow(a, b / 2);

            return c * c;
            }
    }

    long checkBit(long mask, int bit) {
        return (mask >> bit) & 1;
    }

    int countPow(int m, int n) {
        int ans = 0;

        while ((m % n == 0) && (m > 0))
            {
            ans++;
            m /= n;
            }

        return ans;
    }

    int gcd(int a, int b) {
        return (b == 0)
               ? a
               : gcd(b, a % b);
    }

    static long len(long a) {
        long t = 0;

        while (a != 0)
            {
            a = a / 10;
            t++;
            }

        return t;
    }

    void numberOnTheBoard() throws FileNotFoundException {
        if (ONLINE_JUDGE)
            {
            in  = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            }
        else
            {
            in  = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
            }

        tok = new StringTokenizer("");
    }

    long pow(long x, long k) {
        long ans = 1;

        for (int i = 0; i < k; ++i)
            {
            ans *= x;
            }

        return ans;
    }

    int[] rA(int b) {
        int a[] = new int[b];

        for (int i = 0; i < b; i++)
            {
            try {
                a[i] = rI();
            } catch (IOException e) {
                e.printStackTrace();
            }
            }

        return a;
    }

    double rD() throws IOException {
        return Double.parseDouble(rS());
    }

    int rI() throws IOException {
        return Integer.parseInt(rS());
    }

    long rL() throws IOException {
        return Long.parseLong(rS());
    }

    String rS() throws IOException {
        while (!tok.hasMoreTokens())
            {
            String nextLine = readLine();

            if (null == nextLine)
                {
                return null;
                }

            tok = new StringTokenizer(nextLine);
            }

        return tok.nextToken(delimiter);
    }

    String readLine() throws IOException {
        return in.readLine();
    }

    int[] readSortedIntArray(int size) throws IOException {
        Integer[] array = new Integer[size];

        for (int index = 0; index < size; ++index)
            {
            array[index] = rI();
            }

        Arrays.sort(array);

        int[] sortedArray = new int[size];

        for (int index = 0; index < size; ++index)
            {
            sortedArray[index] = array[index];
            }

        return sortedArray;
    }

    static long rev(long a) {
        long   n  = len(a);
        long[] ax = new long[100];
        long   m  = n;;

        for (int i = 0; i < n; i++)
            {
            ax[i] = a / sq(10, m - 1);
            a     = a % sq(10, m - 1);
            m--;
            }

        long s = 0;

        // for(dint i=0;i<n;i++)
        // {
        // System.out.print(ax[i]);
        // }
        // System.out.println();
        for (int i = (int) (n - 1); i >= 0; i--)
            {
            s = s + ax[i] * sq(10, (i));
            }

        return s;
    }

    char[] reverseCharArray(char[] arr) {
        char[] ans = new char[arr.length];

        for (int i = 0; i < arr.length; ++i)
            {
            ans[i] = arr[arr.length - i - 1];
            }

        return ans;
    }

    void run() throws IOException {
        out.close();
    }

    void solveD() throws IOException {
        int    k   = rI();
        char[] s   = rS().toCharArray();
        int    n   = s.length;
        int[]  arr = new int[n];
        int    sum = 0;

        for (int i = 0; i < n; ++i)
            {
            sum    += s[i] - '0';
            arr[i] = s[i] - '0';
            }

        Arrays.sort(arr);

        int i = 0;

        while (sum < k)
            {
            sum += 9 - arr[i];
            i++;
            }

        out.println(i);
    }

    int[] sortedIntArray(int size, int[] array) throws IOException {
        for (int index = 0; index < size; ++index)
            {
            array[index] = rI();
            }

        Arrays.sort(array);

        int[] sortedArray = new int[size];

        for (int index = 0; index < size; ++index)
            {
            sortedArray[index] = array[index];
            }

        return sortedArray;
    }

    static long sq(long a, long n) {
        long s = 1;

        for (long i = 0; i < n; i++)
            {
            s = s * a;
            }

        return s;
    }

    int sqrt(double m) {
        int l = 0;
        int r = 1000000000 + 9;

        while (r - l > 1)
            {
            int mid = (r + l) / 2;

            if (mid * mid > m)
                {
                r = mid;
                }
            else
                {
                l = mid;
                }
            }

        return l;
    }

    boolean isLower(char a) {
        return ((int) a) >= 97
               ? true
               : false;
    }

    private static int getMex(int n, int x, int mex, Scanner keyboard, boolean[] array) {
        int num;
        int req;

        for (int i = 0; i < n; i++)
            {
            num        = keyboard.nextInt();
            array[num] = true;
            }

        int len = array.length;

        for (int i = 0; i < len; i++)
            {
            if (array[i] == false)
                {
                mex = i;

                break;
                }
            }

        if (mex == x)
            {
            req = 0;
            }
        else if (mex > x)
            {
            req = 1;
            }
        else
            {
            int count = 0;

            for (int i = mex; i < x; i++)
                {
                if (array[i] == false)
                    {
                    count++;
                    }
                }

            if (array[x] == true)
                {
                count++;
                }

            req = count;
            }

        return req;
    }
    
}



