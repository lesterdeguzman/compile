import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.LinkedList;

public class GavinCompilation {
	public boolean isValid(String braces) {
		// Add code here
		if (braces.length() % 2 != 0) {
			return false;
		}

		char[] bracesArray = braces.toCharArray();
		List<Character> bracesList = new ArrayList<>();

		for (char c : bracesArray) {
			bracesList.add(c);
		}

		for (int i = 0; i < bracesList.size() - 1;) {
			if (bracesList.get(i) == '(' && bracesList.get(i + 1) == ')') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '['
					&& bracesList.get(i + 1) == ']') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			} else if (bracesList.get(i) == '{'
					&& bracesList.get(i + 1) == '}') {
				bracesList.remove(i);
				bracesList.remove(i);
				i = 0;
				continue;
			}

			i++;
		}

		return (bracesList.isEmpty())
				? true
				: false;
	}

	public static int longestSlideDown(int[][] pyramid) {
		// Code Goes Here..
		int[] interim = null;

		for (int i = pyramid.length - 2; i >= 0; i--) {

			interim = new int[pyramid[i].length];

			for (int j = 0; j < pyramid[i].length; j++) {
				interim[j] += (pyramid[i + 1][j] > pyramid[i + 1][j + 1])
						? (pyramid[i][j] + pyramid[i + 1][j])
						: (pyramid[i][j] + pyramid[i + 1][j + 1]);
			}

			System.arraycopy(interim, 0, pyramid[i], 0, interim.length);
		}

		return interim[0];
	}







    public int loopSize(Node node) {
        HashSet<Node> nodes = new HashSet<>();
        LinkedList<Node> list = new LinkedList<>();

        while (node != null) {
            if (nodes.contains(node)) break;

            nodes.add(node);
            list.offer(node);
            node = node.getNext();
        }

        int tail = 0;
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) == node) {
                tail = i;
                break;
            }
        }

        return nodes.size() - tail;
    }

    private class Node {
        public Node getNext() {
            return null;
        }
   }
