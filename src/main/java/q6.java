
public class q6 {
	public static int q6(Node<Integer> head) {
	    if (head == null) return 0;

	    int maxLength = 0; 
	    int currentLength = 1; 

	    Node<Integer> current = head;
	    while (current.hasNext()) {
	        if (current.getNext().getValue() >= current.getValue()) {
	            currentLength++; 
	        } else {
	            if (currentLength > maxLength) {
	                maxLength = currentLength; 
	            }
	            currentLength = 1; 
	        }
	        current = current.getNext();
	    }

	    if (currentLength > maxLength) {
	        maxLength = currentLength;
	    }

	    return maxLength;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
