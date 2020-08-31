
public class MyArray {
	public static void main(String[] args){
		int[] grade = {90, 70, 50, 30};
		grade[0] = 100;
		for(int i = 0; i < grade.length; i++)
		{
			System.out.println(grade[i]);
		}
		System.out.println();
		for (int i : grade)
		{	
			System.out.println(i);
		}
		System.out.println();
			//Multidimensional array...
		String[][] nameAge = {{"Qozeem"}, {"26"}};
		System.out.println(nameAge[0][0]);
		System.out.println(nameAge[1][0]);
		System.out.println("My name is "+ nameAge[0][0] + ". I am "+ nameAge[1][0]+ " years old");
	}
}
