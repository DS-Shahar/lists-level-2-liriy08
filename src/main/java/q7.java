
public class q7 {
	public static void q7(Node<Integer> head) {
	    if (head == null) return;

	    Node<Integer> start = head;
	    Node<Integer> bestStart = head;
	    int currentLength = 1;
	    int maxLength = 1;

	    Node<Integer> current = head;
	    while (current.hasNext()) {
	        if (current.getNext().getValue() >= current.getValue()) {
	            currentLength++;
	            if (currentLength > maxLength) {
	                maxLength = currentLength;
	                bestStart = start;
	            }
	        } else {
	            currentLength = 1;
	            start = current.getNext();
	        }
	        current = current.getNext();
	    }

	    // Print the longest sequence
	    for (int i = 0; i < maxLength; i++) {
	        System.out.print(bestStart.getValue() + " ");
	        bestStart = bestStart.getNext();
	    }
	    System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
