import java.util.NoSuchElementException;
import java.util.Scanner;


public class ParkingSimulator extends LinkedList {
	private static Node first;


	public ParkingSimulator() {
		super();
	}
	
	public Object removeLast(int value) {
	    
		if (first == null)
	        return first;

	    if (first.value == value)
	       return first.next;

	    Node current = first.next;
	    Node previous = first;

	    while (current != null) {
	        if (current.value == value) {
	            current = current.next;
	            if (previous == null) {
	                previous = current;
	            }
	            else {
	                previous.next = current;
	            }

	            break;
	        } else {
	            previous = current;
	            current = current.next;
	        }
	    }

	    return first;
	}
	
	public int getLiscencePlate() {
		double liscencePlate = Math.random()*1000;
		return (int) liscencePlate;
	}
	
	public void addLast(Object car) {
		Node newCar = new Node();
	    newCar.data = car;
	    first.next = newCar;
	}
	
	
	public void moveCar() {
		System.out.println("To add a car, please enter the liscence plate. To " +
				"remove a car, please enter a '-' symbol followed by the " +
				"lisence plate.");
		Scanner in = new Scanner(System.in);
		Node car = new Node();
		int liscence = in.nextInt();
	}
	
	public String toString()
	   {
	      String temp = "";
	      Node current = first;
	      while (current != null)
	      {
	         temp = temp + current.data.toString() + '\n';
	         current = current.next;
	      }
	      return temp;
	   }

}
