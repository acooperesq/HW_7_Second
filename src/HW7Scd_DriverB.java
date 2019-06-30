
	public class HW7Scd_DriverB {

		public static void main(String[] args) throws OutOfRangeArrExc {
			
		
			Enq_Deq person = new Enq_Deq();
			
			intro();
			
		
	 try {
			
			person.enque();
				
		
		} 
		 catch (ArrayIndexOutOfBoundsException exception)
		
			{  
			System.out.println("Error - Input Too Many Characters - But This Catch Stops Program from Exploding");
			System.out.println("However, Program Shall Proceed As if No Error Overflow Has Occurred");
		
			}
			
			person.deque();
	 	 
			
		}
		
		public static void intro()
			{
			
			System.out.println("WELCOME TO THE QUEUE/ DEQUE PROGRAM \n \n");
			
			System.out.println("Please Enter Up to Ten Alphabetic (Either Case) Characters -One at a time- - Please Enter Digit to DEQUE!");
			
			System.out.println("Only First Char read per entry - all other entries ignored!");
			
			System.out.println("\n\n     ENQUE");
	

			}
		
		
	}
