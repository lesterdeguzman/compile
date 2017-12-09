import java.util.Scanner;
public class MikkaCompilation {

	public class ClassroomWatch {

		public void ClassroomWatch() {

			Scanner kbd = new Scanner(System.in);
			int n = kbd.nextInt();
			int k = 0;
			int[] array = new int[90];
			int k1 = k;
			for(int i = 1; i <= 81; i++) {

				int x = n - i;
				int sum = 0;

				while(x > 0) {

					sum += x % 10;
					x /= 10;
				}

				if(sum == i) {

					array[k1++] = n - i;
				}
			}

			k = k1;

			System.out.println(k);

			for(int i = k - 1; i >= 0; i--) {

				System.out.println(array[i]);
			}
		}
	}

	public class Fraction {

	      int gcd(int a, int b) {
	          if (b == 0) {
	               return a;
	          } else {
	               return gcd(b, a % b);
	          }
	     }

	     public  void Fraction() {

	          Scanner s = new Scanner(System.in);
	          int     n = s.nextInt();

	          for (int i = n / 2; i > 0; i--) {
	               if (gcd(i, n - i) == 1) {
	                    System.out.println(i + " " + (n - i));

	                    break;
	               }
	          }
	     }
	}

	public class TableTennis {

		public void TableTennis() {

			Scanner scan = new Scanner(System.in);
			int numOfPeople = scan.nextInt();
			long j = scan.nextInt();
			int numOfWins = scan.nextInt();
			long k = 0;

			for(int i = 1; i < numOfPeople; i++) {
				int c = scan.nextInt();
				if (c > numOfWins) {
					k = 1;
					numOfWins = c;
				}else {
					k++;
				}
				if (k >= j) {
					break;
				}
			}
			System.out.print(numOfWins);
		}
	}

}
