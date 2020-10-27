
package coffee;



public class OldMachine {
	
	public void selectA() {
		System.out.println(“A - Selected”);
	}
	Public void selectB() {
		System.out.println(“B - Selected”);
	}
	
	
	public static class MakeCoffee{
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("\nWants to Start Mechine Y or N ?");
	        char d;
	        d = scan.next().charAt(0);
	        if(d == 'Y' || d == 'y'){
	            CoffeeMachine cm = new CoffeeMachine();    
	            cm.start();     
	            System.out.println("Shutting Down...\n");
	        }else
	            System.out.println("Shutting Down...\n");
	    }
	}

}
