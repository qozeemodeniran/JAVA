
//Given a set of text scores for a class of students, compute the average and report which scores were below average. 
public class StudentsScore {
	public static void main(String args[]){
		//Entering all scores in string...
		String inputs = "30 40 70 50 100 90 60";
		//Splitting the array with whitespace...
		String[] vals = inputs.split(" ");
		//creating integer array of the same size...
		int[] score = new int[vals.length];
		//Converting string scores to integer and also summing them up...
		int total = 0;
		for(int i = 0; i < score.length; i++)
		{
			score[i] = Integer.parseInt(vals[i]);
			total += score[i];
		}
		//Computing the average...
		double average = (double)total / score.length;
		System.out.println("\nThe average was : "+average);
		//Comparing each score with the average...
		for(int j = 0; j < score.length; j++)
		{
			if(score[j] < average)
			{
				System.out.println("Score " + score[j] + " was less than the average.");
			}
		}
	}
}
