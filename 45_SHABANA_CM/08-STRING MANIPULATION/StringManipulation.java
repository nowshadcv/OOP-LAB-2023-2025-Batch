package shabana;

public class StringManipulation {
		public static void main(String[] args) {
			char arrSample[]= {'R','O','S','E'};
			String strSample1 =new String(arrSample);
			System.out.print(strSample1 + "\t");
			System.out.println("length of" + " is " + strSample1.length());
			byte ascii[]= {65,66,67,68,69,70};
			String strSample2 =new String(ascii);
			System.out.print(strSample1.concat(strSample2));
			String strSample3 =strSample1.concat(strSample2);
			System.out.print(strSample3 + "\t");
			String strSample4 =strSample1+strSample2;
			System.out.print(strSample4 + "\t");
			System.out.println("3rd char of " + strSample4 + "is" +strSample4.charAt(2) );
			char buf[]=new char[3];
			strSample4.getChars(2, 5, buf, 0);
			System.out.println("extracted chars " + strSample4 + "is" +new String(buf) );
			String strSample ="Rockstar";
			System.out.print(strSample.compareTo("ROCKSTAR")+ "\t");
			System.out.print(strSample.compareToIgnoreCase("ROCKSTAR")+ "\t");
			System.out.print(strSample.equals("ROCKSTAR")+ "\t");
			System.out.print(strSample.equalsIgnoreCase("ROCKSTAR")+ "\t");
			System.out.println("rockstar start with 'Ro':" +strSample.startsWith("Ro"));
			System.out.println("rockstar ends with 'Star':" +strSample.endsWith("Star"));
			System.out.println("rockstar contain 'tar':" +strSample.contains("tar"));
			System.out.println("index of 't' in rockstar:" +strSample.indexOf("t"));
			System.out.println("index of 'star' in Rockstar:" +strSample.indexOf("star"));
			System.out.println("all caps-rockstar :" +strSample.toUpperCase());
			System.out.println("all small rockstar:" +strSample.toLowerCase());
			System.out.println("replace star with et:" +strSample.replace("star","et"));
			String dval="3.456";
			String ival="6";
			System.out.println("double value of dval is:" + Double.valueOf(dval));
			System.out.println("double value of ival is:" + Integer.valueOf(ival));
			double a= Double.valueOf(dval);
			int b= Integer.valueOf(ival);
					
		}

	}


