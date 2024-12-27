
public class q8 {
	public static boolean q8(Node<Integer> L1, Node<Integer> L2) {
	    if (L1 == null || L2 == null) return false;

	    Node<Integer> originalL1 = L1;
	    Node<Integer> currentL2 = L2;

	    while (currentL2 != null) {
	        Node<Integer> currentL1 = originalL1;

	        while (currentL1 != null) {
	            if (currentL2 == null || !currentL2.getValue().equals(currentL1.getValue())) {
	                return false;
	            }
	            currentL1 = currentL1.getNext();
	            currentL2 = currentL2.getNext();
	        }
	    }

	    return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
