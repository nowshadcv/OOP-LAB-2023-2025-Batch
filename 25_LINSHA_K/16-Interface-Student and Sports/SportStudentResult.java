package programs;

interface Student {
	 int score=10;
	 void displayScore();
	 
	}
	interface Sports{
		int score=25;
		void displaySportScore();
	}
	 class Result implements Student,Sports{
		public void displayScore() {
			System.out.println("academic Score is"+Student.score);
		}
		public void displaySportsScore() {
			System.out.println("Sports is"+Sports.score);
		}
	}
	 class SportStudentResult{
		public static void main(String args []) {
			Result r=new Result();
			r. displayScore();
			r. displaySportsScore();
		}
	}