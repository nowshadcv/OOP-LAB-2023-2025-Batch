package InterfaceStudentSports;

interface Student{
	int score = 10;
	void displayScore();
}

interface Sports{
	int score = 25;
	void dispalySportsScore();
}

class Result implements Student, Sports{
	public void displayScore() {
		System.out.println("Academic Score is :" + Student.score);
	}
	public void dispalySportsScore() {
		System.out.println("Sports Score is :" + Sports.score);
	}
}

public class SportsStudentResult {
	public static void main(String[] args) {
		Result r = new Result();
		r.displayScore();
		r.dispalySportsScore();
	}
}
