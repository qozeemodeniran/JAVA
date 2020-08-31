package InnerClasses;

public class MainClass {
	public static void main(String args[]) {
		OuterClass myOuterClass = new OuterClass();
		OuterClass.InnerClass myInnerClass = myOuterClass.new InnerClass();
		
		System.out.println(myOuterClass.x + myInnerClass.y);
	}
}
