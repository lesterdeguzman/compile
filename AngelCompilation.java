import java.util.Scanner;

public class AngelCompilation {

	public static void Apartment() {

		Scanner kbd = new Scanner(System.in);

        int a = kbd.nextInt(), b = kbd.nextInt();
        if (b == 0) {
        System.out.println(0 + " " + 0);
        return;
        }
        int min = Math.min(a - b, 1), max;
        if ((a - b)/b >= 2) max =  b*2;
        else max = a-b;
        	System.out.println(min + " " + max);
    }

	public static void SaveTheProblem() {

		Scanner kbd = new Scanner (System.in);

		int a = kbd.nextInt();
		if (a == 1){
			System.out.println("1 1");
			System.out.println("1");
		} else {
			System.out.println((a - 1)*2+ " " +2);
			System.out.println("1 2");

		}
	}

	public static void MaximumSplitting() {

		Scanner kbd = new Scanner(System.in);

		int n = kbd.nextInt();
		for (int i = 0; i < n; i++) {
		int num = kbd.nextInt();
			if (num % 4 == 0) {
				System.out.println(num / 4);
			} else if (num % 4 == 1) {
				if (num < 9) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 9) / 4) + 1);
				}
			} else if (num % 4 == 2) {
				if (num < 6) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 6) / 4) + 1);
				}
			} else if (num % 4 == 3) {
				if (num < 15) {
					System.out.println(-1);
				} else {
					System.out.println(((num - 15) / 4) + 2);
				}
			}
		}
	}

}