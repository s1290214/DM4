import java.util.Random;
public class DM4 {
    public static void main(String[] args) {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	    
	String name;
	int rand;
	int heads = 0, tails = 0;

	printf("Who are you? ");
	name = sc.next();
	System.out.println("Hello, "+name+"!");
	    
	System.out.println("Tossing a coin ...");
	int i = 1;
	while(i<=3){
	    rand = r.nextInt(2);
	    switch(rand){
	    case 0:
	    heads ++;
	    System.out.println("Round "+i+": Heads");
	    break;

	    case 1:
		tails ++;
		System.out.println("Round "+i+": Tails");
		break;
	    }
	    i++;
	}
	System.out.println("Heads: "+heads+", Tails: "+tails);
	if(heads > tails) System.out.println("You won!");
	else System.out.println("You lost...");
	    
    }
}
