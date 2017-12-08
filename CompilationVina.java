package compilation;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.*;
import java.util.*;
import static java.util.Arrays.fill;


public class CompilationVina {
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

	    private static int getMex(int n, int x, int mex, Scanner keyboard, boolean[] array) {
	        int num;
	        int req;

	        for (int i = 0; i < n; i++) {
	            num        = keyboard.nextInt();
	            array[num] = true;
	        }

	        int len = array.length;

	        for (int i = 0; i < len; i++) {
	            if (array[i] == false) {
	                mex = i;

	                break;
	            }
	        }

	        if (mex == x) {
	            req = 0;
	        } else if (mex > x) {
	            req = 1;
	        } else {
	            int count = 0;

	            for (int i = mex; i < x; i++) {
	                if (array[i] == false) {
	                    count++;
	                }
	            }

	            if (array[x] == true) {
	                count++;
	            }

	            req = count;
	        }

	        return req;
	    }
	
	
	public static void restorationOfString() {
	}
		private FastScanner in1;
	    private PrintWriter out2;
	
	    
	    public void runMethod() throws IOException {
	        in1 = new FastScanner(System.in);

	        // in = new FastScanner(new FileInputStream(".in"));
	        out2 = new PrintWriter(System.out);

	        // out = new PrintWriter(new FileOutputStream(".out"));
	        solve();
	        out2.flush();
	        out2.close();
	    }

	    private void solve() throws IOException {
	        int      n       = in1.nextInt();
	        char[][] strings = new char[n][];

	        for (int i = 0; i < n; i++) {
	            strings[i] = in1.nextLine().toCharArray();
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < strings[i].length; j++) {
	                strings[i][j] -= 'a';
	            }
	        }

	        int       alphabet = 'z' + 1 - 'a';
	        boolean[] have     = new boolean[alphabet];

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < strings[i].length; j++) {
	                have[strings[i][j]] = true;
	            }
	        }

	        int[] next = new int[alphabet];

	        fill(next, -1);

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j + 1 < strings[i].length; j++) {
	                if (next[strings[i][j]] == -1) {
	                    next[strings[i][j]] = strings[i][j + 1];
	                } else if (next[strings[i][j]] != strings[i][j + 1]) {
	                    out.print("NO");

	                    return;
	                }
	            }
	        }

	        boolean[] begin = new boolean[alphabet];

	        fill(begin, true);

	        for (int i = 0; i < alphabet; i++) {
	            if (next[i] != -1) {
	                begin[next[i]] = false;
	            }
	        }

	        boolean[]     used = new boolean[alphabet];
	        StringBuilder ans  = new StringBuilder();

	        for (int i = 0; i < alphabet; i++) {
	            if (have[i] &&!used[i] && begin[i]) {
	                for (int j = i; j != -1; j = next[j]) {
	                    if (used[j]) {
	                        out.print("NO");

	                        return;
	                    }

	                    ans.append((char) (j + 'a'));
	                    used[j] = true;
	                }
	            }
	        }

	        for (int i = 0; i < alphabet; i++) {
	            if (have[i] &&!used[i]) {
	                out.print("NO");

	                return;
	            }
	        }

	        out.print(ans.toString());
	    }

	    class FastScanner {
	        StringTokenizer st;
	        BufferedReader  br;

	        FastScanner(InputStream s) {
	            br = new BufferedReader(new InputStreamReader(s));
	        }

	        String next() throws IOException {
	            while ((st == null) ||!st.hasMoreTokens()) {
	                st = new StringTokenizer(br.readLine());
	            }

	            return st.nextToken();
	        }

	        double nextDouble() throws IOException {
	            return Double.parseDouble(next());
	        }

	        int nextInt() throws IOException {
	            return Integer.parseInt(next());
	        }

	        String nextLine() throws IOException {
	            return br.readLine();
	        }

	        long nextLong() throws IOException {
	            return Long.parseLong(next());
	        }

	        boolean hasNext() throws IOException {
	            return br.ready() || ((st != null) && st.hasMoreTokens());
	        }

	        boolean hasNextLine() throws IOException {
	            return br.ready();
	        }
	    }
	
	
	public static void NumberOnBoard(){
	}
		
		static final boolean ONLINE_JUDGE = System.getProperty("ONLINE_JUDGE") != null;
	    int                  INF          = -1000 * 1000 * 1000 - 100;
	    Random               rnd          = new Random();
	    String               delimiter    = " ";
	    BufferedReader       in;
	    PrintWriter          out;
	    StringTokenizer      tok;

	    void numberOnTheBoard() throws FileNotFoundException {
	        if (ONLINE_JUDGE) {
	            in  = new BufferedReader(new InputStreamReader(System.in));
	            out = new PrintWriter(System.out);
	        } else {
	            in  = new BufferedReader(new FileReader("input.txt"));
	            out = new PrintWriter("output.txt");
	        }

	        tok = new StringTokenizer("");
	    }

	    long binPow(long a, long b) {
	        if (b == 0) {
	            return 1;
	        }

	        if (b % 2 == 1) {
	            return a * binPow(a, b - 1);
	        } else {
	            long c = binPow(a, b / 2);

	            return c * c;
	        }
	    }

	    long checkBit(long mask, int bit) {
	        return (mask >> bit) & 1;
	    }

	    int countPow(int m, int n) {
	        int ans = 0;

	        while ((m % n == 0) && (m > 0)) {
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

	    
	    long pow(long x, long k) {
	        long ans = 1;

	        for (int i = 0; i < k; ++i) {
	            ans *= x;
	        }

	        return ans;
	    }

	    int[] rA(int b) {
	        int a[] = new int[b];

	        for (int i = 0; i < b; i++) {
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
	        while (!tok.hasMoreTokens()) {
	            String nextLine = readLine();

	            if (null == nextLine) {
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

	        for (int index = 0; index < size; ++index) {
	            array[index] = rI();
	        }

	        Arrays.sort(array);

	        int[] sortedArray = new int[size];

	        for (int index = 0; index < size; ++index) {
	            sortedArray[index] = array[index];
	        }

	        return sortedArray;
	    }

	    char[] reverseCharArray(char[] arr) {
	        char[] ans = new char[arr.length];

	        for (int i = 0; i < arr.length; ++i) {
	            ans[i] = arr[arr.length - i - 1];
	        }

	        return ans;
	    }

	    void run() throws IOException {
	        solve();
	        out.close();
	    }

	    void solveD() throws IOException {
	        int    k   = rI();
	        char[] s   = rS().toCharArray();
	        int    n   = s.length;
	        int[]  arr = new int[n];
	        int    sum = 0;

	        for (int i = 0; i < n; ++i) {
	            sum    += s[i] - '0';
	            arr[i] = s[i] - '0';
	        }

	        Arrays.sort(arr);

	        int i = 0;

	        while (sum < k) {
	            sum += 9 - arr[i];
	            i++;
	        }

	        out.println(i);
	    }

	    int[] sortedIntArray(int size, int[] array) throws IOException {
	        for (int index = 0; index < size; ++index) {
	            array[index] = rI();
	        }

	        Arrays.sort(array);

	        int[] sortedArray = new int[size];

	        for (int index = 0; index < size; ++index) {
	            sortedArray[index] = array[index];
	        }

	        return sortedArray;
	    }

	    int sqrt(double m) {
	        int l = 0;
	        int r = 1000000000 + 9;
	       

	        while (r - l > 1) {
	            int mid = (r + l) / 2;

	            if (mid * mid > m) {
	                r = mid;
	            } else {
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
}