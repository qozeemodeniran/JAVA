
public class Array3 {
	public static void main(String args[])
	{
		//Array initialization...
		int[] score = {40, 50, 10, 59, 90};
		double ave = average(score);
		System.out.println("Average is : "+ ave);
	}
	public static double average(int[] arr)
	{
		int total = 0;
		for(int i = 0; i < arr.length; i++)
		{
			total += arr[i];
		}
		return (double) total / arr.length;
	}
}
