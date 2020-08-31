/*The aim of this program is to show the 
maximum acceleration needed by a plane
to take off*/
public class PlaneClass {
	//Creating takeOff() method..
	public void takeOff(){
		System.out.println("The plane is moving as fast as possible");
	}
	//Creating planeAcc()method and adding a parameter...
	public void planeAcc(int max_acc){
		System.out.println("Maximum acceleration needed to take-off is : " + max_acc + "km/hr");
	}
	//This is the main method...
	public static void main(String args[]){
		//Creating object plane..
		PlaneClass plane = new PlaneClass();
		//calling the methods on object plane...
		plane.takeOff();
		plane.planeAcc(100);
	}
}
