import Turtle.*;
import java.util.Scanner;

public class Army {
	private final int ARMY_SIZE = 5;
	private Turtle[] army = new Turtle[ARMY_SIZE];

	public static void main(String[] args) {
		Army army = new Army();
		army.welcome();
		army.initializeArray();
		army.formation();
		army.dropTail();
		army.march(55);
		army.turn();
		army.march(80);
		army.hexigon();
		army.begone();

	}

	public void welcome() {
		System.out.println("Choose the type of a turtle 5 times:\n");
		System.out.println("1. Simple\n2. Intelligent\n3. Drunk \n4. Jumpy\n5. Lazy\n6. Burmese");
	}

	public void initializeArray() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < ARMY_SIZE; i++) {
			int choice = sc.nextInt();
			while (choice > 6 || choice < 0) {
				System.out.println("The input is not valid. Please try again");
				choice = sc.nextInt();
			}
			this.turtleMaker(choice, i);
			army[i].tailUp();
		}
		sc.close();
	}

	// First step - place army on board.
	public void formation() {
		int dist = 480;
		for (int i = 0; i < 5; i++) {// first step
			if (army[i] instanceof DrunkTurtle) {
				((DrunkTurtle) army[i]).normalLeft(90);
				((DrunkTurtle) army[i]).normalForward(dist);
				((DrunkTurtle) army[i]).normalRight(90);
			} else {
				army[i].turnLeft(90);
				if (army[i] instanceof JumpyTurtle) {
					((JumpyTurtle) army[i]).normalForward(dist);
				} else {
					army[i].moveForward(dist);
				}
				army[i].turnRight(90);
			}
			dist -= 120;
		}
	}

	// Second step - tail down each turtle.
	public void dropTail() {
		for (int i = 0; i < ARMY_SIZE; i++) {
			army[i].tailDown();
		}
	}

	// Third & Fifth step - move army forward set number of steps.
	public void march(int distance) {
		for (int i = 0; i < ARMY_SIZE; i++) {
			army[i].moveForward(distance);
		}
	}

	// Fourth step - turn army left 45 degrees.
	public void turn() {
		for (int i = 0; i < ARMY_SIZE; i++) {
			army[i].turnLeft(45);
		}
	}

	// Sixth step - each turtle that can draw, draws.
	public void hexigon() {
		for (int i = 0; i < ARMY_SIZE; i++) {
			if (army[i] instanceof IntelligentTurtle) {
				((IntelligentTurtle) army[i]).draw(6, 26);
			}
		}
	}

	// Last step - hide the turtle army.
	public void begone() {
		for (int i = 0; i < ARMY_SIZE; i++) {
			if (army[i] instanceof LazyTurtle) {
				((LazyTurtle) army[i]).normalHide();
			}
			army[i].hide();
		}
	}

	/**
	 * @param choice - number of a turtle given by the user.
	 * @param i      - current array of turtles index.
	 */
	public void turtleMaker(int choice, int i) {
		if (choice == 1)
			this.army[i] = new Turtle();
		if (choice == 2)
			this.army[i] = new IntelligentTurtle();
		if (choice == 3)
			this.army[i] = new DrunkTurtle();
		if (choice == 4)
			this.army[i] = new JumpyTurtle();
		if (choice == 5)
			this.army[i] = new LazyTurtle();
		if (choice == 6)
			this.army[i] = new BurmeseTurtle();
	}
}
