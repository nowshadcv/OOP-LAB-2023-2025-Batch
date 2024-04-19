package interfaceprogram;

interface Student{
	int Score=10;
	void displayScore();
}
interface Sports{
	int Score=25;
	void displaySportsScore();
}
class Result implements Student ,Sports{
	public void displayScore() {
		System.out.println("Academic Score is:"+Student .Score);
	}
	public void displaySportsScore() {
		System.out.println("Sports score is:"+Sports.Score);
	}
	
}
public class SportsStudentResult {

	public static void main(String[] args) {
		Result r = new Result();
		r.displayScore();
		r.displaySportsScore();
		// TODO Auto-generated method stub

	}

}
