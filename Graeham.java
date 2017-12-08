import java.util.*;
public class Graeham{

	public class DidYouMean {

		public void DidYouMean() {

			Scanner in = new Scanner(System.in);

        	String s = in.next();
        	int n = s.length();
        	int count = 0;
        	boolean isEqual = true;

        	for (int i = 0; i < n; i++) {
            	if ((s.charAt(i) == 'a') || (s.charAt(i) == 'o') || (s.charAt(i) == 'e') || (s.charAt(i) == 'i') || (s.charAt(i) == 'u')) {
                System.out.print(s.charAt(i));
                count = 0;
                isEqual = true;
            	} else {
            		if (count == 0) {
                    System.out.print(s.charAt(i));
                    count++;
            		} else if (count == 1) {
                    	System.out.print(s.charAt(i));
                    	isEqual = isEqual && ((s.charAt(i) == s.charAt(i - 1)));
                    	count++;
            		} else if (count > 1) {
            			if (isEqual && (s.charAt(i) == s.charAt(i - 1))) {
                        System.out.print(s.charAt(i));
                        count++;
                		} else {
                			System.out.print(" " + s.charAt(i));
                    		count=1;
                    		isEqual = true;
                		}
            		}
        		}
    		}
		}
	}

	public class LazySecurityGuard {

    	public void LazySecurityGuard(){

        	Scanner input = new Scanner(System.in);

        	double n = input.nextFloat();
        	double x = Math.ceil(Math.sqrt(n));

        	x += x * (x - 1) < n ? x : x - 1;
        	System.out.println((int) x * 2);
    	}
	}

	public class Fraction{

    	public void Fraction() {
    		
        	Scanner in = new Scanner(System.in);
        	int n = in.nextInt();
        	int x = (n % 2 == 1) ? n / 2 : (n / 2 % 2 == 1) ? n / 2 - 2 : n / 2 - 1;
        	System.out.println(x + " " + (n - x));
    	}
	}

}
