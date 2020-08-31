//To draw diamond shape using ascii characters...
import java.util.Scanner;
public class DiamondASCII {
	//Main method goes here...
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter diamond size : ");
		int size = scan.nextInt();
		System.out.println("Your diamond size will be : " + size);
		//Method invocation goes here...
		TopFrame(size);
		LeftDiamondRight(size);
		BottomFrame(size);
	}
	//*****************HELPER METHODS DEFINITIONS**********************
	//Method that draws the top part of the frame...
	public static void TopFrame(int size)
	{
		System.out.print("+");
        for(int i=0; i<size*2; i++)
        {
            System.out.print("-");
        }
        System.out.print("+\n");
	}//End of TopFrame method!!!
	//Method for LEFT frame, DIAMOND, and RIGHT frame.
	public static void LeftDiamondRight(int size){
		int i,j,k=1;
        for(i=0;i<(size*2-1);i++)
        {
            System.out.print("|");
            if(i==size-1&&size%2==0)
            {
                System.out.print("<");
                for(j=0;j<(size-1)*2;j++)
                {System.out.print("-");}
                System.out.print(">");
            }
            else if(i==size-1&&size%2==1)
            {
                System.out.print("<");
                for(j=0;j<(size-1)*2;j++)
                {System.out.print("=");}
                System.out.print(">");
            }
            else {

                if (i < size) {
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("/");
                    for (j = 0; j <i*2;j++)
                    {   if(i%2==0)
                       System.out.print("=");
                    else
                        System.out.print("-");
                    }
                    System.out.print("\\");
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        System.out.print(" ");
                    }
                }

                if (i >= size) {
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        System.out.print(" ");
                    }
                    System.out.print("\\");
                    for (j = 0; j <(size-1)*2-(k*2);j++)
                    {   if(i%2==0)
                        System.out.print("=");
                    else
                        System.out.print("-");
                    }
                    k++;
                    System.out.print("/");
                    for (j = 0; j<Math.abs(size-(i+1)); j++) {
                        System.out.print(" ");
                    }
                }
        }
            System.out.print("|\n");
    }
	}
	//Bottom frame...
	public static void BottomFrame(int size)
	{
		System.out.print("+");
        for(int i=0;i<size*2;i++)
        {
            System.out.print("-");
        }
        System.out.print("+\n");
	}
	
} //class ending curly bracket!!! do not delete!!!
