package adapterpattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

	OldCofffeeMachine theMachine;
	private OldCofffeeMachine NewCoffeeMachine;

	public CoffeeTouchscreenAdapter(OldMachine newMachine) {
		theMachine = NewCoffeeMachine;
	}
	
	public void chooseFirstSelection() {
		theMachine.selectA();
	}
	
	public void chooseSecondSelection() {
		theMachine.selectB();
}
}
