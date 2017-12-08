import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Sunshine {
    
	static ArrayList<Integer> order = new ArrayList<>();
    static int                time  = 0;

    // Third Program
    static int           n, start[], end[], a[];
    static List<Integer> list[];

    public void DanilPartTimeJob() {

        // ******************
        FastReader  in = new FastReader(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        n     = in.nextInt();
        start = new int[n + 1];
        end   = new int[n + 1];
        a     = new int[n + 1];
        list  = new List[n + 1];

        for (int i = 0; i <= n; i++)
            {
            list[i] = new ArrayList<>();
            }

        for (int i = 2; i <= n; i++)
            {
            int u = in.nextInt(),
                v = i;

            list[u].add(v);
            list[v].add(u);
            }

        for (int i = 1; i <= n; i++)
            {
            a[i] = in.nextInt();
            }

        dfs(0, 1);

        SegTree seg = new SegTree(time);

        seg.build();

        int q = in.nextInt();

        for (int i = 0; i < q; i++)
            {
            String s = in.next();
            int    x = in.nextInt();

            if (s.charAt(0) == 'p')
                {
                seg.update(x);
                }
            else
                {
                pw.println(seg.query(x));
                }
            }

        pw.close();
    }

    // Second Program
    public static void FairGame() {
       
    	InputStream  inputStream  = System.in;
        OutputStream outputStream = System.out;
        InputReader  in           = new InputReader(inputStream);
        OutputWriter out          = new OutputWriter(outputStream);
        fairGame     solver       = new fairGame();

        solver.solve(1, in, out);
        out.close();
    }

    static void debug(Object... obj) {
       
    	System.err.println(Arrays.deepToString(obj));
    }

    static void dfs(int p, int u) {
       
    	start[u] = ++time;
        order.add(u);

        for (int v : list[u])
            {
            if (v != p)
                {
                dfs(u, v);
                }
            }

        end[u] = time;
    }

    // First Program
    public void tripForMeal876A() {
       
    	Scanner ab   = new Scanner(System.in);
        int     num  = ab.nextInt();
        int     a    = ab.nextInt();
        int     b    = ab.nextInt();
        int     c    = ab.nextInt();
        int     dist = 0;

        num--;

        if (num-- > 0)
            {
            dist += Math.min(a, b);
            }

        if (dist > 0)
            {
            dist += num * Math.min(Math.min(a, b), c);
            }

        System.out.println(dist);
    }

    static class FastReader {
        static final int ints[] = new int[128];
        private byte[]   inbuf  = new byte[1024];
        private int      lenbuf = 0,
                         ptrbuf = 0;
        InputStream      is;

        public FastReader(InputStream is) {
            for (int i = '0'; i <= '9'; i++)
                {
                ints[i] = i - '0';
                }

            this.is = is;
        }

        public String next() {
            int           b  = skip();
            StringBuilder sb = new StringBuilder();

            while (!(isSpaceChar(b)))
                {    // when nextLine, (isSpaceChar(b) && b != ' ')
                sb.appendCodePoint(b);
                b = readByte();
                }

            return sb.toString();
        }

        public char[] next(int n) {
            
        	char[] buf = new char[n];
            int    b   = skip(),
                   p   = 0;

            while ((p < n) &&!(isSpaceChar(b)))
                {
                buf[p++] = (char) b;
                b        = readByte();
                }

            return (n == p)
                   ? buf
                   : Arrays.copyOf(buf, p);
        }

        public double nextDouble() {
            
        	return Double.parseDouble(next());
        }

        public int nextInt() {
           
        	int     num   = 0, b;
            boolean minus = false;

            while ((b = readByte()) != -1 &&!(((b >= '0') && (b <= '9')) || (b == '-')));

            if (b == '-')
                {
                minus = true;
                b     = readByte();
                }

            while (true)
                {
                if ((b >= '0') && (b <= '9'))
                    {
                    num = (num << 3) + (num << 1) + ints[b];
                    }
                else
                    {
                    return minus
                           ? -num
                           : num;
                    }

                b = readByte();
                }
        }

        public long nextLong() {
            
        	long    num = 0;
            int     b;
            boolean minus = false;

            while ((b = readByte()) != -1 &&!(((b >= '0') && (b <= '9')) || (b == '-')));

            if (b == '-')
                {
                minus = true;
                b     = readByte();
                }

            while (true)
                {
                if ((b >= '0') && (b <= '9'))
                    {
                    num = (num << 3) + (num << 1) + ints[b];
                    }
                else
                    {
                    return minus
                           ? -num
                           : num;
                    }

                b = readByte();
                }
        }

        public int readByte() {
           
        	if (lenbuf == -1)
                {
                throw new InputMismatchException();
                }

            if (ptrbuf >= lenbuf)
                {
                ptrbuf = 0;

                try {
                    lenbuf = is.read(inbuf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (lenbuf <= 0)
                    {
                    return -1;
                    }
                }

            return inbuf[ptrbuf++];
        }

        public int skip() {
            
        	int b;

            while ((b = readByte()) != -1 && isSpaceChar(b));

            return b;
        }

        public boolean isSpaceChar(int c) {
            return !((c >= 33) && (c <= 126));
        }
    }


    static class InputReader {
       
    	private byte[]                      buf = new byte[1024];
        private InputStream                 stream;
        private int                         curChar;
        private int                         numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
      
        	this.stream = stream;
        }

        public int nextInt() {
          
        	int c = read();

            while (isSpaceChar(c))
                {
                c = read();
                }

            int sgn = 1;

            if (c == '-')
                {
                sgn = -1;
                c   = read();
                }

            int res = 0;

            do
                {
                if ((c < '0') || (c > '9'))
                    {
                    throw new InputMismatchException();
                    }

                res *= 10;
                res += c - '0';
                c   = read();
                }
            while (!isSpaceChar(c));

            return res * sgn;
        }

        public int read() {
           
        	if (numChars == -1)
                {
                throw new InputMismatchException();
                }

            if (curChar >= numChars)
                {
                curChar = 0;

                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }

                if (numChars <= 0)
                    {
                    return -1;
                    }
                }

            return buf[curChar++];
        }

        public boolean isSpaceChar(int c) {
           
        	if (filter != null)
                {
                return filter.isSpaceChar(c);
                }

            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            
        	return (c == ' ') || (c == '\n') || (c == '\r') || (c == '\t') || (c == -1);
        }

        public interface SpaceCharFilter {
           
        	public boolean isSpaceChar(int ch);
        }
    }


    static class OutputWriter {
       
    	private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            
        	writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            
        	this.writer = new PrintWriter(writer);
        }

        public void close() {
            
        	writer.close();
        }

        public void print(Object... objects) {
            
        	for (int i = 0; i < objects.length; i++)
                {
                if (i != 0)
                    {
                    writer.print(' ');
                    }

                writer.print(objects[i]);
                }
        }

        public void println(Object... objects) {
            
        	print(objects);
            writer.println();
        }
    }


    static class SegTree {
        
    	int size   = (int) 2e6;
        int n,
            seg[]  = new int[size],
            lazy[] = new int[size],
            tot[]  = new int[size];

        SegTree(int N) {
            n = N;
        }

        void build() {
            
        	build(1, 1, n);
        }

        void build(int p, int s, int e) {
            
        	if (s == e)
                {
                seg[p] = a[order.get(s - 1)];
                tot[p] = 1;

                return;
                }

            if (s > e)
                {
                return;
                }

            int m = (s + e) / 2,
                l = 2 * p,
                r = l + 1;

            build(l, s, m);
            build(r, m + 1, e);
            seg[p] = seg[l] + seg[r];
            tot[p] = tot[l] + tot[r];
        }

        void push_down(int p, int l, int r) {
           
        	if (lazy[p] == 0)
                {
                return;
                }

            lazy[p] = 0;
            lazy[l] ^= 1;
            lazy[r] ^= 1;
            seg[l]  = tot[l] - seg[l];
            seg[r]  = tot[r] - seg[r];
        }

        int query(int p) {
            
        	return query(1, 1, n, start[p], end[p]);
        }

        int query(int p, int s, int e, int a, int b) {
            
        	if ((s >= a) && (e <= b))
                {
                return seg[p];
                }

            if ((s > e) || (s > b) || (e < a))
                {
                return 0;
                }

            int m = (s + e) / 2,
                l = 2 * p,
                r = l + 1;

            push_down(p, l, r);

            return query(l, s, m, a, b) + query(r, m + 1, e, a, b);
        }

        void update(int p) {
            
        	update(1, 1, n, start[p], end[p]);
        }

        void update(int p, int s, int e, int a, int b) {
            
        	if ((s >= a) && (e <= b))
                {
                lazy[p] ^= 1;
                seg[p]  = tot[p] - seg[p];

                return;
                }

            if ((s > e) || (s > b) || (e < a))
                {
                return;
                }

            int m = (s + e) / 2,
                l = 2 * p,
                r = l + 1;

            push_down(p, l, r);
            update(l, s, m, a, b);
            update(r, m + 1, e, a, b);
            seg[p] = seg[l] + seg[r];
        }
    }


    static class fairGame {
        
    	public void solve(int testNumber, InputReader scan, OutputWriter out) {
            int                       array[] = new int[105];
            HashMap<Integer, Integer> map     = new HashMap<>();
            HashSet<Integer>          set     = new HashSet<>();
            ArrayList<Integer>        list    = new ArrayList<>();
            int                       n       = scan.nextInt();

            for (int i = 0; i < n; i++)
                {
                int a = scan.nextInt();

                if (map.containsKey(a))
                    {
                    map.put(a, map.get(a) + 1);
                    }
                else
                    {
                    map.put(a, 1);
                    }

                array[a]++;
                }

            if (map.size() != 2)
                {
                out.println("NO");

                return;
                }
            else
                {
                for (Map.Entry<Integer, Integer> entry : map.entrySet())
                    {
                    list.add(entry.getKey());
                    }

                if (map.get(list.get(0)) != map.get(list.get(1)))
                    {
                    out.println("NO");
                    }
                else
                    {
                    out.println("YES");
                    out.println(list.get(0), list.get(1));
                    }
                }
        }
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
