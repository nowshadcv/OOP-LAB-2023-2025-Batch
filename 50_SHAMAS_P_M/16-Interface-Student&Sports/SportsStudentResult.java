package Sportsstudent;
interface Student{
	int score=10;
	void displayScore();
}
interface Sports{
	int score=25;
	void displaySportsScore();
}
interface arts{
	int score=35;
	void displayartsScore();
}
class Result implements Student,Sports,arts{

	@Override
	public void displayScore() {
		// TODO Auto-generated method stub
		System.out.println("Academic score is " +Student.score);
		
	}

	@Override
	public void displaySportsScore() {
		// TODO Auto-generated method stub
		System.out.println("Sports score is " +Sports.score);
	}
	public void displayartsScore() {
		// TODO Auto-generated method stub
		System.out.println("Arts score is " +arts.score);
		
	}
	
}
public class SportsStudentResult {
	public static void main(String[] args)
	{
		Result r = new Result();
		r.displayScore();
		r.displaySportsScore();
		r.displayartsScore();
	}
}
