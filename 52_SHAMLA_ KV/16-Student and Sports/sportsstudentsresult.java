package program;
interface Student {
	int score = 10;
	void displayScore();
}

interface Sports {
	int score = 25;
	void displaySportsScore();
}

class Result implements Student,Sports{
	public void displayScore() {
		System.out.println("Academic score is : "+ Student.score );
	}
	public void displaySportsScore() {
		System.out.println("Sports score is : "+ Sports.score );
	}
}

public class sportsstudentsresult {
	public static void main (String [] args) {
		Result r = new Result ();
		r.displayScore();
		r.displaySportsScore();
	}
	
}
