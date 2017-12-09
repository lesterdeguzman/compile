import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.*;
import java.io.*;

public class AvilaCompile {
	   public class SearchforPrettyIntegers{
		private InputStream is;
		private PrintWriter out;
		int MOD = (int)(1e9+7);
		ArrayList<Integer>[] amp;
		public void searchforPrettyInteger() {
			new Thread(null, new Runnable() {
			public void run() {
				try {
	 } catch (Exception e)
				{
					System.out.println(e);
				}
			}
		}, "1", 1 << 26).start();
			new SearchforPrettyIntegers().soln();
		}
		char ch[][];
		ArrayList<Integer>[] g;
        ArrayList<Integer> ar[];
		long ok[];
		char a[][];
		int phi[]=new int[500005];
		void solve()
        {
		int n=ni();
		int m=ni();
		int min1=10;
		int min2=10;
		int a[]=na(n);
		int b[]=na(m);
		int ans=100;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int x=a[i]+(10*b[j]);
				int y=(a[i]*10)+b[j];
				if(ans>x)
					ans=x;
				if(ans>y)
					ans=y;
				if(a[i]==b[j])
					if(ans>a[i])
						ans=a[i];
			}
		}
		out.println(ans);

        }



		public int find(int v,int start,int end,int l,int r){
    	    if(r < start || end < l)
    	    {
    	    	return 0;
    	    }
    	    if(l <= start && end <= r)
    	    {
    	        return (tre[v]);
    	    }
    	    int mid = (start + end) / 2;
    	    int p1 = find(2*v, start, mid, l, r);
    	    int p2 = find(2*v+1, mid+1, end, l, r);
    	    return p1+p2;
    	}
		int tre[]=new int[4000005];
		public void Update(int v,int tl,int tr,int index,int val){
    		if(tl==tr)
    		{
    			tre[v]=val;
    		}
    		else
    		{
    			int mid=(tl+tr)/2;
    			if(tl <= index &&index <= mid)
    	        {
    	            Update(2*v,tl, mid, index, val);
    	        }
    	        else
    	        {
    	        	Update(2*v+1,mid+1,tr, index, val);
    	        }
    			tre[v]=((tre[2*v]+tre[2*v+1]));
    		}
    	}

		public int find1(int v,int start,int end,int l,int r)
    	{
    	    if(r < start || end < l)
    	    {
    	    	return 0;
    	    }
    	    if(l <= start && end <= r)
    	    {
    	        return (tre1[v]);
    	    }
    	    int mid = (start + end) / 2;
    	    int p1 = find1(2*v, start, mid, l, r);
    	    int p2 = find1(2*v+1, mid+1, end, l, r);
    	    return Math.max(p1, p2);
    	}
		int tre1[]=new int[8000005];
		public void Update1(int v,int tl,int tr,int index,int val)
    	{
    		if(tl==tr)
    		{
    			tre1[v]=val;
    		}
    		else
    		{
    			int mid=(tl+tr)/2;
    			if(tl <= index &&index <= mid)
    	        {
    	            Update1(2*v,tl, mid, index, val);
    	        }
    	        else
    	        {
    	        	Update1(2*v+1,mid+1,tr, index, val);
    	        }
    			tre1[v]=(Math.max(tre1[2*v],tre1[2*v+1]));
    		}
    	}

            boolean isPrime(int x)
            {
            if(x==0||x==1)
            	return false;
			for(int i = 2;i*1L*i<=x;i++) if(x%i==0) return false;
			return true;
		}
	    int  p ;
	    long modInverse(long a, long mOD2){
	        return  power(a, mOD2-2, mOD2);
		}
		long power(long x, long y, long m)
		{
		if (y == 0)
	    return 1;
		long p = power(x, y/2, m) % m;
		p = (p * p) % m;

		return (y%2 == 0)? p : (x * p) % m;
		}
		public long gcd(long a, long b){
			if(b==0) return a;
			return gcd(b,a%b);
		}
		class Pair1 implements Comparable<Pair1>{
			long a;
			long b;
			long c;
			Pair1(long x,long y,long z){
			this.a=x;
			this.b=y;
			this.c=z;
			}
			public int hashCode() {
				return Objects.hash();
			}

			public int compareTo(Pair1 arg0) {
				return (int)(arg0.c-c);
			}
		}
		long power(long x, long y, int mod){
			long ans = 1;
			while(y>0){
				if(y%2==0){
					x = (x*x)%mod;
					y/=2;
				}
				else{
					ans = (x*ans)%mod;
					y--;
				}
			}
			return ans;
		}
		void soln() {
			is = System.in;
			out = new PrintWriter(System.out);
			long s = System.currentTimeMillis();
			solve();
            out.flush();
		}
 		private byte[] inbuf = new byte[1024];
		public int lenbuf = 0, ptrbuf = 0;
		private int readByte() {
			if (lenbuf == -1)
				throw new InputMismatchException();
			if (ptrbuf >= lenbuf) {
				ptrbuf = 0;
				try {
					lenbuf = is.read(inbuf);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return -1;
			}
			return inbuf[ptrbuf++];
		}
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
		private int skip() {
			int b;
			while ((b = readByte()) != -1 && isSpaceChar(b));
			return b;
		}
		private double nd() {
			return Double.parseDouble(ns());
		}
		private char nc() {
			return (char) skip();
		}
		private String ns() {
			int b = skip();
			StringBuilder sb = new StringBuilder();
			while (!(isSpaceChar(b))) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
		private char[] ns(int n) {
			char[] buf = new char[n];
			int b = skip(), p = 0;
			while (p < n && !(isSpaceChar(b))) {
				buf[p++] = (char) b;
				b = readByte();
			}
			return n == p ? buf : Arrays.copyOf(buf, p);
		}
		private int[][] nm(int n, int m) {
			int[][] map = new int[n][m];
			for (int i = 0; i < n; i++){
				for(int j=0;j<m;j++)
					map[i][j]=ni();
			}
			return map;
		}
		private int[] na(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = ni();
			return a;
		}
		private int ni() {
			int num = 0, b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}
				b = readByte();
			}
		}
		private long nl() {
			long num = 0;
			int b;
			boolean minus = false;
			while ((b = readByte()) != -1 && !((b >= '0' && b <= '9') || b == '-'));
			if (b == '-') {
				minus = true;
				b = readByte();
			}
			while (true) {
				if (b >= '0' && b <= '9') {
					num = num * 10 + (b - '0');
				} else {
					return minus ? -num : num;
				}	b = readByte();
			}
		}
		private boolean oj = System.getProperty("ONLINE_JUDGE") != null;
		private void tr(Object... o) {
			if (!oj)
				System.out.println(Arrays.deepToString(o));
		}
	}

//////////////////////////////////////////////////////////////////////////////////
public class SlavaAndTanks {
    public void SlavaAndTanks() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(in, out);
        out.close();
    }
}

class Task {
    public void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i <= n; i+=2) {
            res.add(i);
        }
        for (int i = 1; i <= n; i+=2) {
            res.add(i);
        }
        for (int i = 2; i <= n; i+=2) {
            res.add(i);
        }
        out.println(res.size());
        for (Integer re : res) {
            out.print(re + " ");
        }
    }

}

class Utils {

    public int binarySearch(int[] a, int key) {
        int s = 0;
        int f = a.length;
        while (f > s) {
            int mid = (s + f) / 2;
            if (a[mid] > key) {
                f = mid - 1;
            } else if (a[mid] <= key) {
                s = mid + 1;
            }
        }
        return -1;
    }

    public long gcd(long a, long b) {
        return b != 0 ? gcd(b, a % b) : a;
    }

    public long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    	ArrayList<Integer> prime(int number) {
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                a.add(i);
                number /= i;
                i = 1;
            }
        }
        a.add(number);
        return a;
    }
}

	class Pair<T, U> {
   		public T a;
    	public U b;

    public Pair(T a, U b) {
        this.a = a;
        this.b = b;
    	}

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        if (a != null ? !a.equals(pair.a) : pair.a != null) return false;
        return b != null ? b.equals(pair.b) : pair.b == null;
    	}

    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    	}
	}


			class Vect {
    			public int a;
    			public int b;

    		public Vect(int a, int b) {
        		this.a = a;
        		this.b = b;
    			}

    		public boolean equals(Object o) {
        		if (this == o) return true;
        		if (o == null || getClass() != o.getClass()) return false;
        		Vect vect = (Vect) o;
				if (a != vect.a) return false;
        			return b == vect.b;
   	 			}

    		public int hashCode() {
        		int result = a;
        		result = 31 * result + b;
        		return result;
    			}
			}

				class Tri {
   					 public int a;
  					 public int b;
  					 public int c;

    			public Tri(int a, int b, int c) {
      	  			this.a = a;
   		  			this.b = b;
        			this.c = c;
    				}
				}

class Triple<T, U, P> {
    public T a;
    public U b;
    public P c;

    public Triple(T a, U b, P c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triple<?, ?, ?> triple = (Triple<?, ?, ?>) o;

        if (a != null ? !a.equals(triple.a) : triple.a != null) return false;
        return b != null ? b.equals(triple.b) : triple.b == null;
    }

    public int hashCode() {
        int result = a != null ? a.hashCode() : 0;
        result = 31 * result + (b != null ? b.hashCode() : 0);
        return result;
    }
}

class Scanner {
    BufferedReader in;
    StringTokenizer tok;

    public Scanner(InputStream in) {
        this.in = new BufferedReader(new InputStreamReader(in));
        tok = new StringTokenizer("");
    }

    private String tryReadNextLine() {
        try {
            return in.readLine();
        } catch (Exception e) {
            throw new InputMismatchException();
        }
    }

    public String nextToken() {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(next());
        }
        return tok.nextToken();
    }

    public String next() {
        String newLine = tryReadNextLine();
        if (newLine == null)
            throw new InputMismatchException();
        return newLine;
    }

    public int nextInt() {
        return Integer.parseInt(nextToken());
    }

    public long nextLong() {
        return Long.parseLong(nextToken());
    }
}
/////////////////////////////////////////////////////////////////////////////////////////
public class OneTwoThree{
    public void OneTwoThree(){
        new OneTwoThree(System.in, System.out);
    }

    private class Solver implements Runnable{
        long k;
        int a, b, startLevel, aliceWinsInCycle, bobWinsInCycle;
        int[][] choiceA, choiceB, wins;
        boolean[][] vis;
        boolean foundStart, endsBeforeCycle;
        InputReader in;
        PrintWriter out;

        void solve() throws IOException{
            k = in.nextLong();
            a = in.nextInt() - 1;
            b = in.nextInt() - 1;
            choiceA = new int[3][3];
            choiceB = new int[3][3];
            wins = new int[11][2];
            vis = new boolean[3][3];
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    choiceA[i][j] = in.nextInt() - 1;
            for (int i = 0; i < 3; i++)
                for (int j = 0; j < 3; j++)
                    choiceB[i][j] = in.nextInt() - 1;
            Point point = new Point(-1, -1);
            int cycleSize = getCycleSize(a, b, point, 1, k);
            if (endsBeforeCycle)
                out.println(wins[(int) k][0] + " " + wins[(int) k][1]);
            else{
                long aliceWins = wins[startLevel - 1][0];
                long bobWins = wins[startLevel - 1][1];
                aliceWinsInCycle -= wins[startLevel][0];
                bobWinsInCycle -= wins[startLevel][1];
                k -= (startLevel - 1);
                long times = k / cycleSize;
                int remaining = (int) (k % cycleSize);
                aliceWins += times * aliceWinsInCycle;
                bobWins += times * bobWinsInCycle;

                if (remaining > 0){
                    aliceWins += (wins[startLevel + remaining - 1][0] - wins[startLevel - 1][0]);
                    bobWins += (wins[startLevel + remaining - 1][1] - wins[startLevel - 1][1]);
                }

                out.println(aliceWins + " " + bobWins);
            }
        }

        boolean doesAliceWin(int a, int b){
            return (a == 2 && b == 1) || (a == 1 && b == 0) || (a == 0 && b == 2);
        }

        int getCycleSize(int x, int y, Point point, int level, long gamesRemaining){
            wins[level][0] = wins[level - 1][0];
            wins[level][1] = wins[level - 1][1];

            if (x != y && doesAliceWin(x, y))
                wins[level][0]++;
            else if (x != y)
                wins[level][1]++;

            if (vis[x][y]){
                point.x = x;
                point.y = y;
                aliceWinsInCycle = wins[level][0];
                bobWinsInCycle = wins[level][1];

                return 1;
            }

            vis[x][y] = true;

            if (gamesRemaining == 1){
                endsBeforeCycle = true;

                return 0;
            }

            int xx = getCycleSize(choiceA[x][y], choiceB[x][y], point, level + 1, gamesRemaining - 1);

            if (point.x == x && point.y == y){
                startLevel = level;
                foundStart = true;
            }

            if (foundStart)
                return xx;

            return xx + 1;
        }

        Solver(InputReader in, PrintWriter out){
            this.in = in;
            this.out = out;
        }

        @Override
        public void run(){
            try{
                solve();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

    }

    private class InputReader{
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        int read(){
            if (numChars == -1)
                throw new InputMismatchException();

            if (curChar >= numChars){
                curChar = 0;
                try{
                    numChars = stream.read(buf);
                }
                catch (IOException e)
                {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }

            return buf[curChar++];
        }

        int nextInt(){
            int c = read();

            while (isSpaceChar(c))
                c = read();
            	int sgn = 1;

            if (c == '-'){
                sgn = -1;
                c = read();
            } int res = 0;

            do{
                if (c < '0' || c > '9')
                throw new InputMismatchException();
                res *= 10;
                res += c & 15;
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        long nextLong(){
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sign = 1;

            if (c == '-'){
                sign = -1;
                c = read();
            }
            long result = 0;
            do{
                if (c < '0' || c > '9')
                    throw new InputMismatchException();

                result *= 10;
                result += c & 15;

                c = read();
            } while (!isSpaceChar(c));

            return result * sign;
        }

        boolean isSpaceChar(int c){
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        void close(){
            try{
                stream.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }

        InputReader(InputStream stream)
        {
            this.stream = stream;
        }

    }

    private OneTwoThree(InputStream inputStream, OutputStream outputStream)
    {
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Thread thread = new Thread(null, new Solver(in, out), "Solver", 1 << 29);

        thread.start();
        try
        {
            thread.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        in.close();
        out.flush();
        out.close();
    }

}
}