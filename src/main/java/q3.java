
public class q3 {
	public static int q3(Node<Integer> head, int value) {
	    int index = 0;
	    int firstIndex = -1;
	    int lastIndex = -1;

	    Node<Integer> current = head;
	    while (current != null) {
	        if (current.getValue() == value) {
	            if (firstIndex == -1) {
	                firstIndex = index;
	            }
	            lastIndex = index;
	        }
	        current = current.getNext();
	        index++;
	    }

	    if (firstIndex == -1) {
	        return -1;
	    }

	    return lastIndex - firstIndex;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
