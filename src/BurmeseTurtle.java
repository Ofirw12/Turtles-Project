public class BurmeseTurtle extends IntelligentTurtle {
	
	public void draw(int sides, double size) {
		if (Math.random() <= 0.6) { // 60% to draw 1 sides less.
			super.draw(sides - 1, size);
		} else {
			super.draw(sides, 18); // 40% to draw 18 size sides.
		}
	}
}
