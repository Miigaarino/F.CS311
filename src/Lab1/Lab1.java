package Lab1;

public class Lab1 {
	
	   public static void main(String [] args)
	   {  
	      int x;
	      ArrayQueue q = new ArrayQueue(3);
	      // add a few elements
	      q.put(new Integer(1));
	      q.put(new Integer(2));
	      q.put(new Integer(3));
	      q.put(new Integer(4));

	      // remove and add to test wraparound array doubling
	      q.remove();
	      q.remove();
	      q.put(new Integer(5));
	      q.put(new Integer(6));
	      q.put(new Integer(7));
	      q.put(new Integer(8));
	      q.put(new Integer(9));
	      q.put(new Integer(10));
	      q.put(new Integer(11));
	      q.put(new Integer(12));

	      // delete all elements
	      while (!q.isEmpty())
	      {
	         System.out.println("Rear element is " + q.getRearElement());
	         System.out.println("Front element is " + q.getFrontElement());
	         System.out.println("Removed the element " + q.remove());
	      }
	   }  
}
