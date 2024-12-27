
public class q5 {
	public static Node<Integer> q5(Node<Integer> head) {
	    if (head == null) {
	        return null; 
	    }

	    Node<Integer> a = new Node<>(0); 
	    Node<Integer> tail = a;

	    Node<Integer> current = head;
	    while (current != null) {
	        if (!existsInList(a.getNext(), current.getValue())) {
	            tail.setNext(new Node<>(current.getValue()));
	            tail = tail.getNext();
	        }
	        current = current.getNext();
	    }

	    return a.getNext(); 
	}

	public static boolean existsInList(Node<Integer> head, int value) {
	    Node<Integer> current = head;
	    while (current != null) {
	        if (current.getValue() == value) {
	            return true; 
	        }
	        current = current.getNext();
	    }
	    return false; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
