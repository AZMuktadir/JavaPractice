package interviewQuestionsSample;

public class SwappintWithoutThirdVariable {

	public static void main(String[] args) {
		int x = 5; 
		int y = 10; 
		
		//before swapping
		
		System.out.println(x);
		System.out.println(y);
		System.out.println("***************************");
		x = x * y; //50
		 y = x / y;  //5
		 x = x / y; //10
		  
		//after swapping
		System.out.println(x);
		System.out.println(y);

	}

}
