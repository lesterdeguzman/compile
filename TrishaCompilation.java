import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.*;

public class TrishaCompilation {

		private static int[] array;
		private static boolean[] visited;
		private static ArrayList<Integer> components = new ArrayList<Integer>();

		public void BufferedReader() throws IOException {
			BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(f.readLine());
			array = new int[N];
			visited = new boolean[N];
			StringTokenizer st = new StringTokenizer(f.readLine());
			for (int i = 0; i < N; i++) {
				array[i] = Integer.parseInt(st.nextToken()) - 1;
			}
			for (int i = 0; i < N; i++) {
				if (!visited[i])
					dfs(i);
			}
			Collections.sort(components);
			int size = components.size();
			long result = 0L;
			if (size != 1) {
				int[] results = new int[size - 1];
				for (int i = 0; i < size - 2; i++) {
					results[i] = components.get(i);
				}
				results[size - 2] = components.get(size - 2) + components.get(size - 1);
				for (int i : results) {
					result += (long) i * (long) i;
				}
			} else {
				result = (long) components.get(0) * (long) components.get(0);
			}
			System.out.println(result);
		}

		public static void dfs(int start) {
			int index = start;
			int count = 0;
			while (true) {
				count++;
				visited[index] = true;
				int next = array[index];
				if (next == start)
					break;
				index = next;
			}
			components.add(count);
		}

		public static void printArray(int[] array) {
			for (int i : array)
				System.out.print(i + " ");
			System.out.println();
		}

		public static void printArrayListInteger(ArrayList<Integer> array) {
			for (int i : array)
				System.out.print(i + " ");
			System.out.println();
		}

	//second
	public class KRounding {
	    public void KRounding() {
	    		Scanner s = new Scanner(System.in);
	    		long a, b;
	    		a = s.nextLong();
	    		b = s.nextLong();
	    		for(long i=0; i<b; i++){
	    				if(a%2==0){
	    					a/=2;
	    				}
	    				if (a%5==0){
	    					a/=5;
	    				}
	    		}
	    		System.out.print((int)a);
	    		for(long i=0; i<b; i++){
	    				System.out.print("0");
	    	}
	    }
	}

	//third
	public class Eternal {
	    public  void Eternal() {

	       long x;
	       long y;
	       long result = 1;
	       Scanner sc = new Scanner(System.in);
	       x = sc.nextLong();
	       y = sc.nextLong();
	       long count = y-x;

	       if (x == 0){
			   x = 1;
	       }

	       for (int i=0; i<count; i++){
	       	   if (result == 0){
	       	   		break;
	       	   }
	       	   result *= (y%10);
	       	   result %= 10;
	       	   y--;
	       }

	       System.out.println(result%10);
	       sc.close();
	    }
	}
}




