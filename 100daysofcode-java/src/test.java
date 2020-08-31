
public class test {
	public static void main(String args[]){
		int s = 0;
		int[] a = {12, 23, 34, 45, 56};
		for(int i = 1; i < a.length; i++){
			s += a[i];
		}
		System.out.println(s);
	}
}
