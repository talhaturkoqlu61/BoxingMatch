package BoxingMatch;

public class Main {
	public static void main(String[]args) {
		Boxer b1=new Boxer("Talha",35,90,120,45.0);
		Boxer b2=new Boxer("Kerem",30,100,110,45.0);
		Ring r=new Ring(b1,b2,90,100);
		r.run();
	}

}
