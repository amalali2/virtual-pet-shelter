import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	Map<String,VirtualPet> vPets = new HashMap<>();
	
		public Collection<VirtualPet> getAllPets() {
			return vPets.values();
		}
		
		public void addPet(String name, VirtualPet pet) {
			vPets.put(pet.getName(), pet);
		}
		
		public VirtualPet findPet(String name) {
			return vPets.get(name);
		}
	
		public void adopt(VirtualPet pet) {
			vPets.remove(pet.getName(), pet);
			
		}
		
		public void feed(Collection<VirtualPet> pets, int qty) {
			for (VirtualPet pet: pets) {
				pet.hunger();
			}
			
		}
			
		public void water(Collection<VirtualPet> pets, int qty) {
			for (VirtualPet pet: pets) {
				pet.thirst();
			}
		}
		
		public void play(String name, int val) {
			vPets.get(name).bored(val);
				
			}
		
		public void allPetStatus(Collection<VirtualPet> pets) {
			System.out.println("\nBANGCHAN'S PETS\t|HUNGER\t|THIRST\t|BOREDOM|TIRED  |");
			System.out.println("----------------|-------|-------|-------|-------|");
			for (VirtualPet pet : pets) {
				System.out.println(pet.getName() + "\t\t| " + pet.getHunger()
					+ "\t| " + pet.getThirst() + "\t| " + pet.getBoredom()
					+ "\t| " + pet.getHunger() + "\t| ");
			}
			System.out.println("-------------------------------------------------");
		}
		
		
				
		public void updateAllTick(Collection<VirtualPet> pets) {
			for (VirtualPet pet: pets) {
				pet.tick();
			}
			
		}
		

	}


