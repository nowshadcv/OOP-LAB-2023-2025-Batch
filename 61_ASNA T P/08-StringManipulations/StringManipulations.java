package PackA;

public class StringManipulations {

	public static void main(String[] args) {
		 char arrSample[]= {'R','O','S','E'};
		 String strSample1=new String(arrSample);
		 System.out.println(strSample1 + "\t");
		 System.out.println("Length of " + strSample1 + " is: " + strSample1.length());
		 byte ascii[]= {65,66,67,68,69,70};
		 String strSample2=new String(ascii);
		 System.out.println(strSample2 + "\t");
		 String strSample3=strSample1.concat(strSample2);
		 System.out.println(strSample3 + "\t");
		 String strSample4=strSample1 + strSample2;
		 System.out.println(strSample4 + "\t");
		 System.out.println("3rd Char of "+strSample4+" is: "+ strSample4.charAt(2));
		 char buf[] = new char[3];
		 strSample4.getChars(2,5,buf,0);
		 System.out.println("Extracted Chars: "+ strSample4 + "" + new String(buf));
		 String strSample="Rockstar";
		 System.out.println(strSample.compareTo("ROCKSTAR")+ "\t");
		 System.out.println(strSample.compareToIgnoreCase("ROCKSTAR")+ "\t");
		 System.out.println(strSample.equals("ROCKSTAR") +  "\t");
	     System.out.println(strSample.equalsIgnoreCase("ROCKSTAR") + "\t");
	     System.out.println("RockStar starts with 'RO': " +strSample.startsWith("RO"));
	     System.out.println("RockStar ends with 'Star': " +strSample.endsWith("Star"));	
	     System.out.println("RockStar contains 'tar': " +strSample.contains("tar"));	
	     System.out.println("Index of 't' in RockStar: " +strSample.indexOf("t"));
	     System.out.println("Index of 'star' in RockStar: " +strSample.indexOf("star"));
	     System.out.println("All caps-RockStar: " +strSample.toUpperCase());
	     System.out.println("All small-RockStar: " +strSample.toLowerCase());
	     System.out.println("Replace start with et: " +strSample.replace("Star","et"));
	     String dval="3.456";
	     String ival="6";
	     System.out.println("Double value of dval is: " + Double.valueOf(dval));
	     System.out.println("Integer value of ival is: " + Integer.valueOf(ival));
	     double a = Double.valueOf(dval);
	     int b= Integer.valueOf(ival);
	     System.out.println(a+b);
		}
	  
	     

	}

}
