
public class q9 {
	public static boolean q9(Node<Integer> L1, Node<Integer> L2) {
	    if (L1 == null) return true; 
	    if (L2 == null) return false; 

	    Node<Integer> currentL2 = L2;

	    while (currentL2 != null) {
	        Node<Integer> currentL1 = L1;
	        Node<Integer> a = currentL2;

	        while (currentL1 != null && a != null && currentL1.getValue().equals(a.getValue())) {
	            currentL1 = currentL1.getNext();
	            a = a.getNext();
	        }

	        if (currentL1 == null) {
	            return true;
	        }

	        currentL2 = currentL2.getNext();
	    }

	    return false; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
