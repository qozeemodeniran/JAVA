package Java_inheritance;

class Olaitan extends Odeniran {
	private String color = "black";
		
	public static void main(String args[]) {
		Olaitan Ahmed = new Olaitan();
		Olaitan Azeezat = new Olaitan();
		
		Ahmed.Character();
		Azeezat.Character();
			
		System.out.println(Ahmed.home_town + " " + Ahmed.color);
		System.out.println(Azeezat.home_town);
	}
}
