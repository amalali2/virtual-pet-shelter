import java.util.Random;

public class VirtualPet {
	
		Random rand = new Random();
		private String name;
		private String description;
		private int hunger = rand.nextInt(20) + 1;
		private int boredom = rand.nextInt(20) + 1;
		private int thirst = rand.nextInt(20) + 1;
	
			public String getName() {
				return name;
			
			}
			
			public String getDescription() {
				return description;
				
			}
			
			public void hunger() {
				
				hunger -= 20;
				
				}
		
			public void bored(int val) {
				boredom -= 20;
				
				}
			
			public void thirst() {
				 thirst -= 20;
						
				}
			
			public void tick() {
				hunger += 10;
				thirst += 10;
				boredom += 15;
			}
			
			public int getHunger() {
				return hunger;
				
			}
			public int getBoredom() {
				return boredom;
				
			}
			public int getThirst() {
				return thirst;
				
			}
	
	
public VirtualPet (String name, String description, int hunger, int boredom, int thirst) {
	
		this.name = name;
		this.description = description;
		this.hunger = hunger;
		this.boredom = boredom;
		this.thirst = thirst;
		}

public VirtualPet (String name, String description) {
	
		this.name = name;
		this.description = description;
}
@Override
public String toString() {
	return (name + "\t\t|" + hunger + "\t|" + thirst + "\t|" + boredom);
	
	}
}

