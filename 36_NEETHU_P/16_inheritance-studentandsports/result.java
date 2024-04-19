package project16;
interface Student {
    int score = 10;
    void displayScore();}
interface Sports {
    int score = 25;
    void displaySportsScore ();}
public class result implements Student,Sports {  
	    public void displayScore () {
	        System.out.println("Academic Score is: " + Student.score);}
	    public void displaySportsScore () {
	        System.out.println ("Sports Score is: " + Sports.score);}}
class SportStudentResult {
	    public static void main (String [ ] args){ 
	        result r = new result ();
	        r. displayScore();
	        r. displaySportsScore ( );}} 

