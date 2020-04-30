package interviewQuestionsSample;

public class PrintAllEvenNumberFrom1to100 {

	public static void main(String[] args) {
	
	
	oddNum();
	
	//	evenNum();

	
	}
		

	
	



	
	public static void evenNum() {
	
	 for (int i = 1; i <= 100; i++) {
		   //if number%2 == 0 it means its an even number
	   if (i % 2 == 0) {
		System.out.println(i);
	   }
	}
	
}

	public static void oddNum() {
		
		 for (int i = 1; i <= 100; i++) {
			   //if number%2 == 0 it means its an even number
		   if (i % 2 != 0) {
			System.out.println(i);
		   }
		}
		
	}
}



 

	


