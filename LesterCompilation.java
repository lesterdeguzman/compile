import java.util.*;
public class LesterCompilation {

	public class Chores {

		public void Chores() {

			Scanner s = new Scanner(System.in);

			int n = s.nextInt(), k = s.nextInt(), x = s.nextInt();
			int r = x * k;
			for (int i = 0; i < n - k; i++) {
				r += s.nextInt();
    		}

    		System.out.println(r);

  		}
	}

  	public class NikitaString {

		public void NikitaString() {

			Scanner sc = new Scanner(System.in);

			while(sc.hasNext())
			{
			String in = sc.nextLine();
			int part1 = 0;
			int part2 = 0;
			int part3 = 0;
			for(int i = 0;i < in.length();i ++){
				if(in.charAt(i) == 'a'){
					part1 ++;part3 ++;
				}
				if(in.charAt(i) == 'b'){
					part2 ++;
				}
				part2 = Math.max(part1,part2);
				part3 = Math.max(part3,part2);
				//System.out.print(part1 + " ");
				//System.out.print(part2 + " ");
				//System.out.println(part3);
			}

			System.out.println(part3);

			}
		}
	}

	public class TripForMeal {

		public void TripForMeal() {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int dist = 0;
		num--;

		if (num-- > 0) dist += Math.min(a, b);
		if (dist > 0) dist += num * Math.min(Math.min(a, b), c);

		System.out.println(dist);

		}
	}

}
