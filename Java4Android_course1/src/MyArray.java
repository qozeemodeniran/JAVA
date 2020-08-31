
public class MyArray {
	public static void main(String[] args){
		double[] number = new double[5];
		number[2] = 30;
		number[3] = 50;
		if(number[2] < number[3])
		{
			number[4] = number[3] - number[2];
//			System.out.print(number[]+"\t");
		}
		for(int i = 0; i < number.length; i++)
		{
			System.out.print(number[i]+"\t");
		}
		System.out.println();
		System.out.println();
		for(int j = 0; j < number.length; j++)
		{
			number[j] = 10 - j;
			System.out.print(number[j]+"\t");
		}
	}
}
