
public class ParkingSimulatorTest {
	public static void main(String[] args)
	   {
	       ParkingSimulator driveway = new ParkingSimulator();
	       driveway.addLast(1);
	       driveway.addLast(2);
	       driveway.addLast(3);
	       driveway.addLast(4);
	       System.out.println(driveway);
	       driveway.removeLast(4);
	       System.out.println(driveway);
	
	   }

}
