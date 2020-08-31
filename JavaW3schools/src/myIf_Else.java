//Java conditionals...
public class myIf_Else {
	public static void main(String args[]){
		//if-else statement...
		int x, y;
		x = 10; y = 15;
		if(x > y)
		{
			System.out.println("x is greater than y");
		}else
		{
			System.out.println("x is less than y\n");
		}
		//if-else-if statement...
		if(x > y)
		{
			System.out.println("x is greater than y");
		}else if(x == y)
		{
			System.out.println("x is equal to y");
		}else
		{
			System.out.println("x is less than y");
		}
		//The ternary operation=> variable = (condition) ? trueExpression : falseExpression;
		String result = (x < y) ? "x is less than y" : "x is grater than y";
		System.out.println(result);
	}
}
