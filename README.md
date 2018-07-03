# virtual-pet-shelter

WCCI Project.
🏥 An app. that simulates taking care pets in a shelter. Second iteration of virtual pet.

## Details

We're going to use TDD to drive the creation of an application that simulates you taking care of the pets in a shelter.

Include a game loop in this project, too. It should query the user, then call the appropriate method(s) on `VirtualPetShelter` and/or `VirtualPet`. In general, your `VirtualPetApp` should talk to your `VirtualPetShelter`, and your `VirtualPetShelter` should talk to your `VirtualPet`. Try to avoid `VirtualPetApp` talking directly to `VirtualPet` instances, apart from accessing basic information about pets (via `get*` methods).

### Example Interactions

```bash
Thank you for volunteering at Big Al's Virtual Pet Shelter and Delicatessen!

This is the status of your pets:

Name	|Hunger	|Thirst	|Boredom
--------|-------|-------|-------
Joey	|83     |34     |23
Johnny	|69     |49     |2
Dee Dee	|39     |18     |88
Tommy	|59     |19     |37

What would you like to do next?

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit
```
