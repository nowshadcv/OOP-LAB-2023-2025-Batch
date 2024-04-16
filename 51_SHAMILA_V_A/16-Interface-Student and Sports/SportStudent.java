package project1;
interface Student{
	int score=10;
	void displayScore();
}
interface Sports{
	int score=25;
	void displaySportsScore();
}
class Result implements Student,Sports{
	public void displayScore() {
		System.out.println("Academic Score is : "+Student.score);
	}
	public void displaySportsScore() {
		System.out.println("Sports Score is : "+Sports.score);
	}
}

public class SportStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result r=new Result();
		r.displayScore();
		r.displaySportsScore();
	}

}


