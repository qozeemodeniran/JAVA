//Java program for math class...
public class myMaths {
	public static void main(String args[]){
		//Printing minimum,maximum,absolute,square root,random numbers, values...
		System.out.println(Math.max(-1, 0)); //output 0.
		System.out.println(Math.min(-1, 0)); //output -1.
		System.out.println(Math.abs(-1)); //output 1.
		System.out.println(Math.sqrt(4)); //output 2.
		System.out.println(Math.random()); //outputs a random number between 0.0 to 1.0.
		int randomNum = (int)(Math.random() * 101);  // 0 to 100
		System.out.println(randomNum);
	}
}
