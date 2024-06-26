package BoxingMatch;

public class Boxer {
	String name;
	int damage;
	int weight;
	int health;
	double dodge;
	
	Boxer(String name,int damage,int weight,int health,double dodge){
		this.name=name;
		this.damage=damage;
		this.weight=weight;
		this.health=health;
		this.dodge=dodge;
	}
	public boolean dodge() {
		double random=100*Math.random();
		return this.dodge>=random;
		
	}
	public int hit(Boxer foe) {
		System.out.println(this.name+" hit "+this.damage+">"+foe.name);
		if(dodge()) {
			System.out.println("The attack was defended!");
			return foe.health;
			
		}
		if(foe.health-this.damage<=0) {
			return 0;
		}
		return foe.health-this.damage;
		
	}

}
