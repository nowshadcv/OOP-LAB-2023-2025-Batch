package program16;



interface Student{
	int score=10;
	void displayScore();}
interface Sports{
	int score=25;
	void displayScore();}
class Result implements Student,Sports {
	public void displayScore() {
		System.out.println("Academic score is:" + Student.score);}
public void displaySportsscore() {
		System.out.println("Spoprts Score is: "+ Sports.score);}}
	

public class SportsStudentResult {

	public static void main(String[] args) {
		Result r=new Result();
		r.displayScore();
		r.displaySportsscore();}}
	
		