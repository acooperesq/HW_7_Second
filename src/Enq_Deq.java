
	import java.util.*;

 public class Enq_Deq {
	
	 	int count1 =0, tempi=0;  // used in loops to enque-deque
		boolean answer1 = false;  // is input a character?
		char temp, z;			// used to save user input; used in forcing an error
		char c1[];  
		Scanner scanner = new Scanner(System.in);
		
		OutOfRangeArrExc problem_zero = new OutOfRangeArrExc("User Has Entered NO Alphabetic Characters But Instead Has Ended Program");
		
		public Enq_Deq()		// constructor
		
		{
			count1 =0;
			answer1 = false;
			c1 = new char[10];
			
		}
		
	
		public void enque() throws OutOfRangeArrExc
		 {
			
			for (int i =0; i < 12; i++) 
			
			{  // allowing the FOR LOOP to get BIGGER than array so that a non-char can be entered to end inputting chars - 
				// thereby also enabling an opportunity for error message!



				System.out.println("Enter Character or non-char to exit");
			
				
				temp = scanner.next().charAt(0);  //   
				
				
				
				answer1 = Character.isLetter(temp);
				
					if (!answer1)
					{
						
						System.out.println("You Have Chosen to Exit the Queue");
						break;
					}
					
					
					tempi = count1;
					
					if (count1 >=10)   //  forcing an error ....
						z = c1[count1];
					
					if (tempi == 0)
						c1[0]= temp;
				
				for ( i = count1; i> 0; i--)  // creating an printing out building a queue
				{
					
					
					
					c1[i] = c1[i-1];
					
					
					
					 System.out.println("Internal Enque:  [" + i +  "]:"  + c1[i] + " \n  \n");
				}
				
				c1[0]= temp;
				
				for ( i = 0; i<= count1; i++)
				{
					System.out.println("Enque:  [" + i +  "]:"  + c1[i] + " \n  \n");
				}
				
				
				count1++;
				
			
			}

			 
			}
	
		
		
		
		public void deque() throws OutOfRangeArrExc  // this is if zero, then error message 
		//  [upper boundary dealt by try-catch statement in main method
		//  
		{
		
		tempi = count1;
		
		 for (int j =0; j < tempi; j++)
		 {
			 
			System.out.println(" EACH STEP AFTER ENQUE:  [" + j +  "]: "  + c1[j] + " in array");
			}
			
			
			if (count1 == 0)
			throw problem_zero;
		 
		 
			  
			  System.out.println("\n\n     DEQUE  EACH STEP SHOWN BELOW");
			  
			 
			   
	
			  for (int j=0; j < tempi; j++)
			  {
				  for (int m = 1; m< tempi; m++)
				  			{
				 
								c1[m-1] = c1[m];
								
							}
				  
				  c1[tempi -1] = '\0';  // deleting the previous value in the queue - the one that got left behind
				  
				  for (int k =0; k < tempi; k++)
					{
						 
						System.out.println(" EACH STEP AFTER DEQUE:  [" + k +  "]: "  + c1[k] + " in array ");
						}
				  System.out.println(" \n");
				}
				  
				
					  tempi--;
			  	  
			  	
			  } 	
			  			
			
		}
		
		
		
		 
		 
 
 
	
	


