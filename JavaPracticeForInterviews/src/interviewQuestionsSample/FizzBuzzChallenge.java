package interviewQuestionsSample;

public class FizzBuzzChallenge {
	// write a program that prints the numbers from 1 to 100. But for multiple of three print "Fizz" 
		//instead of the number and for the multiples of five  print 
		// "Buzz". for number which are multiples both three and five print "FizzBuzz"
	
	
	//global variable
	 int z= 600;
	//local variable
	
	
	public static void main(String[] args) {
		//FizzBuzzChallenge FZ= new FizzBuzzChallenge();
		//int a=FZ.z;
	//	System.out.println(z);
		
	//	FZ.fizzBuzzChallenge();
		
		fizzBuzzChallenge();
		//System.out.println(z);
		
	

	}
	
	public static void fizzBuzzChallenge() {
		//for (data typinin, condition, increment){statement}
		
		for (int i=1 ; i<=100;i++) {
			
				//Modular  operator
				if (i % 15 == 0)
					System.out.println("Fizz Buzz,");
				else if (i % 3 == 0)
					System.out.println("Fizz, ");
				else if (i % 5 == 0)
					System.out.println("Buzz, ");
				else
					System.out.println(i);

			}
//		System.out.println(z);
			
	}
	

	
	}



