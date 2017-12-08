import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class VitugCodes {

	public String decompose(long n) {
		List<Long> decomposeArray = Decomposer(n, n * n);
		
		// no valid solution exists
		if(decomposeArray == null) return "";
		
	    // remove the last element
		decomposeArray.remove(decomposeArray.size() - 1);
		List<String> result = new ArrayList<>();
		
		for(Long ele : decomposeArray){
			result.add(String.valueOf(ele.longValue()));
		}
		
		return String.join(" ", result);
	}
	
	/**
	 * Recursion to get the list of decompose
	 * @param n
	 * @param remain
	 * @return
	 */
	public List<Long> Decomposer(long n, long remain){
		// basic case
		if(remain == 0){
			List<Long> r = new ArrayList<Long>();
			r.add(n);
			return r;
		}
		
		// iterate all element less than n
		for(long i = n - 1 ; i > 0; i--){
			if((remain - i * i) >= 0){
				List<Long> r = Decomposer(i, (remain - i * i));
				
				// only get the answer
				if(r != null){
					r.add(n);
					return r;
				}
			}
		}
		
		// no answer
		return null;
	}
	


    private static Stack<Integer> stack = new Stack<Integer>();
    private static Scanner input = new Scanner(System.in);


    public static void calculator() throws Exception {

        System.out.println("Welcome to the RPN Calculator program!");

        takeInput();
    }

    private static void takeInput() {
        String numOrOperand = " ";
        while (!numOrOperand.equals("x")) {
            System.out.println("Enter next input: ");
            numOrOperand = input.next();
            try {
                int intNumOrOperand = Integer.valueOf(numOrOperand);
                stack.push(intNumOrOperand);
            } catch (Exception e) {
                if (numOrOperand.equals("*")) {
                    stack.push(stack.pop() * stack.pop());

                } else if (numOrOperand.equals("/")) {
                    stack.push((int) stack.pop() / stack.pop());

                } else if (numOrOperand.equals("+")) {
                    stack.push(stack.pop() + stack.pop());

                } else if (numOrOperand.equals("-")) {
                    stack.push(stack.pop() - stack.pop());

                } else if (numOrOperand.equals("=")) {
                    System.out.println(stack.pop());

                } else if (numOrOperand.equals("c")) {
                    if (!stack.empty()) {
                        for (int i = 0; i < stack.size(); i++) {
                            stack.pop();
                        }
                    }
                } else if (numOrOperand.equals("w")) {
                    for (int i = 0; i < stack.size(); i++) {
                        System.out.println(stack.get(i));
                    }
                }
            }

        }
    }



  /*  public static void main(String[] args) {
        try {
            calculator();
        } catch (Exception e) {
            System.out.println("Oops, that doesn't work... ");
        }

    }*/
	
    public static int braces(String str) {
        Stack<Character> stack = new Stack<Character>(); 
        int index = 0; 
        while(index < str.length()){ 
            char c = str.charAt(index); 
            if(c == '(' || c == '+' || c == '-' || c == '*' || c == '/'){ 
                stack.push(c); 
            } 
            else if(c == ')'){ 
                if(stack.peek() == '('){ 
                    return 1; 
                } else{ 
                    while(!stack.isEmpty() && stack.peek() != '('){ 
                        stack.pop(); 
                    } 
                    stack.pop(); 
                } 
            } 
            index++; 
        } 
        return 0; 
    }
    /*public static void main(String[] args){
        String a = "(a)";
        System.out.println(braces(a));
    }*/

}