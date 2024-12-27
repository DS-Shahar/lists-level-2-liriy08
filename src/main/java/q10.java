
public class q10 {
	public static boolean q10(Node<Integer> head) {
	    if (head == null) return false;  

	    boolean[] a = new boolean[10];  
	    Node<Integer> current = head;

	    while (current != null) {
	        int value = current.getValue();

	        if (value >= 1 && value <= 10) {  
	            a[value - 1] = true;  
	        }

	        current = current.getNext(); 
	    }

	    for (int i = 0; i < 10; i++) {
	        if (!a[i]) {
	            return false;  
	        }
	    }

	    return true;  
	}
	public static boolean q102(Node<Integer> head) {
	    if (head == null) return false; 

	    for (int i = 1; i <= 10; i++) {
	        if (!helper(head, i)) {
	            return false;  
	        }
	    }

	    return true; 
	}

	public static boolean helper(Node<Integer> head, int value) {
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
