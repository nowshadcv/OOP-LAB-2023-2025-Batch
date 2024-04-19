package project16;

interface Student{
	int score=10;
	void displayscore();}
interface Sports{
	int score=25;
	void displayscore();}

class Result implements Student,Sports{
	public void displayscore() {
		System.out.println("Academic score is :" + Student.score);}
	public void displaysportsscore() {
		System.out.println("Sports score is :" + Sports.score);}}

public class SportsStudentResult {

	public static void main(String[] args) {
		Result r=new Result();
		r.displayscore();
		r.displaysportsscore();}}
