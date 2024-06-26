package BoxingMatch;

public class Ring {
	Boxer b1;
	Boxer b2;
	int minweight;
	int maxweight;
	Ring(Boxer b1,Boxer b2,int minweight,int maxweight){
		this.b1=b1;
		this.b2=b2;
		this.minweight=minweight;
		this.maxweight=maxweight;
	}
	public boolean checkWeight() {
		if((this.b1.weight<=this.maxweight&&this.b1.weight>=this.minweight)&&(this.b2.weight>=this.minweight&&this.b2.weight<=this.maxweight)) {
			return true;
		}
		else {
			
			return false;
		}
	}
	void printScore() {
		System.out.println("-----------");
		System.out.println(this.b1.name+" existing health\t:"+this.b1.health);
		System.out.println(this.b2.name+" existing health\t:"+this.b2.health);
	}
	public boolean isWin() {
		if(this.b1.health<=0) {
			return true;
		}
		else if(this.b2.health<=0) {
			return true;
		}
		return false;
	}
	public void run() {
		if(checkWeight()) {
			System.out.println("FIRST ROUND!");
			while(b1.health>0&&b2.health>0) {
				double random=Math.random();
				if(random<=0.5) {
					System.out.println("NEW ROUND!");
					b2.health=b1.hit(b2);
					if(isWin()) {
						System.out.println(b1.name+" WON!");
						break;
					}
					
				}
				else {
					System.out.println("NEW ROUND!");
					b1.health=b2.hit(b1);
					if(isWin()) {
						System.out.println(b2.name+" WON!");
						break;
					}
				}
				printScore();
						
				
			}
		}
		else {
			System.out.println("The boxers'weight doesn't match with each other!");
		}
	}

}
