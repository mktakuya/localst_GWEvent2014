package turtle;

public class Test {
	public static void main(String[] args){
		int TURTLE_NUM = 12;
		TurtleFrame f = new TurtleFrame(700, 500);
		Turtle[] turtles = {
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle(),
				new Turtle()
		};
		
		Turtle[] turtles2 = {
				new Turtle()
		};
		
		for (int i = 0; i < TURTLE_NUM; i++) {
			f.add(turtles[i]);
		}
		
		for (int i = 0; i < TURTLE_NUM; i++) {
			turtles[i].rt((i + 1) * 30);
			turtles[i].fd(100);
			//turtles[i].fd((i + 1) * 50);
		}
	}
}
