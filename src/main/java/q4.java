
public class q4 {
	public static boolean q4(Node<Integer> head) {
	    Node<Integer> current = head;

	    while (current != null) {
	        Node<Integer> checker = head;

	        while (checker != current) {
	            if (checker.getValue().equals(current.getValue())) {
	                return false; 
	            }
	            checker = checker.getNext();
	        }

	        current = current.getNext();
	    }

	    return true; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
