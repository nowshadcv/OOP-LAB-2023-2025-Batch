package projectb;
class Result implements Student,Sports{
	public void displayScore() {
		System.out.println("Academi Score is :"+Student.score);}
	public void displaySportsScore()
	{
		System.out.println("Sports Score is :"+Sports.score);
	}
}

public class SportStudentResult {
	
	public static void main(String[] args) {
		Result r=new Result();
		r.displayScore();
		r.displaySportsScore();
	}

}
		

	


