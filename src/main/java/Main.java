public static Node<Integer> q15(Node<Integer> a)
	{
		Node<Integer> head = a;
		if (head == null) return null;

		        Node<Integer> b = head; 
		int maxL = 1;      
	 	Node<Integer> currentS = head; 
		int currentL= 1;   
		Node<Integer> current = head.getNext();

		while (current != null) 
		{
		      if (current.getValue() == currentS.getValue()) 
		      {
		          currentL++;
		            } 
		      else 
		      {
		           if (currentL > maxL) 
		             {
		                 maxL = currentL;
		                 b = currentS;
		             }
		               
		              currentS = current;
		              currentL = 1;
		     }
		            current = current.getNext();
		}

		if (currentL > maxL) 
		        {
		            b = currentS;
		        }

		        return b;
		    }
	

