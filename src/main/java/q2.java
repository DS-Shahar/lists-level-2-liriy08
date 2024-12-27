
public class q2 {
	public static Node<Integer> q2(Node<Integer> head) {
	    Node<Integer> a = null;

	    while (head != null) {
	        Node<Integer> minPrev = null;
	        Node<Integer> minNode = head;
	        Node<Integer> current = head;
	        Node<Integer> prev = null;

	        while (current != null) {
	            if (current.getValue() < minNode.getValue()) {
	                minPrev = prev;
	                minNode = current;
	            }
	            prev = current;
	            current = current.getNext();
	        }

	        if (minPrev != null) {
	            minPrev.setNext(minNode.getNext());
	        } else {
	            head = head.getNext();
	        }

	        minNode.setNext(a);
	        a = minNode;
	    }

	    Node<Integer> b = null;
	    while (a != null) {
	        Node<Integer> next = a.getNext();
	        a.setNext(b);
	        b = a;
	        a = next;
	    }

	    return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
