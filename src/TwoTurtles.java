import Turtle.*;

public class TwoTurtles {
	private Turtle java = new Turtle();
	private Turtle python = new Turtle();

	public static void main(String[] args) {
		TwoTurtles turtles = new TwoTurtles();
		turtles.javaTurn();
		turtles.pythonTurn();
	}

	private void javaTurn() {
		// Java goes first.
		this.java.tailUp();
		this.java.turnLeft(90);
		this.java.moveForward(150);
		this.java.tailDown();
		this.java.turnLeft(135);
		this.java.moveForward(100);
		this.java.turnLeft(45);
		this.java.moveForward(300);
		this.java.turnLeft(135);
		this.java.moveForward(100);
		this.java.turnLeft(45);
		this.java.moveForward(300);
		this.java.hide();
	} // End of Java's Turn

	private void pythonTurn() {
		this.python.tailUp();
		this.python.turnLeft(90);
		this.python.moveForward(150);
		this.python.tailDown();
		this.python.turnRight(90);
		this.python.moveForward(175);
		this.python.turnRight(90);
		this.python.moveForward(300);
		this.python.turnRight(90);
		this.python.moveForward(175);
		this.python.tailUp();
		this.python.turnRight(90);
		this.python.moveForward(45);
		this.python.turnRight(90);
		this.python.moveForward(30);
		this.python.tailDown();
		this.python.moveForward(115);
		this.python.turnLeft(90);
		this.python.moveForward(210);
		this.python.turnLeft(90);
		this.python.moveForward(115);
		this.python.turnLeft(90);
		this.python.moveForward(210);
		this.python.hide();
	} // End of Python's Turn.
}
