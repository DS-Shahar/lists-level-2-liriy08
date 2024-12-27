
public class q1 {
	public static Node<Integer> q1(Node<Integer> L1, Node<Integer> L2) {
	    Node<Integer> a = new Node<>(0);
	    Node<Integer> current = a;

	    while (L1 != null && L2 != null) {
	        if (L1.getValue() <= L2.getValue()) {
	            current.setNext(L1);
	            L1 = L1.getNext();
	        } else {
	            current.setNext(L2);
	            L2 = L2.getNext();
	        }
	        current = current.getNext();
	    }

	    if (L1 != null) {
	        current.setNext(L1);
	    } else {
	        current.setNext(L2);
	    }

	    return a.getNext();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
