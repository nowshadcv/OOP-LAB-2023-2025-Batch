package prgms;
interface student{
int score=10;
void displayScore();}
interface sports{
int score=25;
void displaySportsScore();}
class Result implements student,sports{
public void displayScore() {
System.out.println("Academic Score is :"+student.score);}
public void displaySportsScore() {
System.out.println("Sports Score is :"+sports.score);}}
public class SportStudentResult {
public static void main(String[] args) {
// TODO Auto-generated method stub
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}}