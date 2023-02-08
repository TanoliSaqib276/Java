package datatypes;

import java.util.Arrays;

public class DataTypess {

	public static void main(String[] args) {
		
		
		//PREAMPTIVE DATA TYPE:
		
	/*	byte age = 12;
		int a=20;
		long b=20000000000L;
		float c=3.14f;
		double d=2.14354545745D;
		boolean isAdult = true;
		char g='@';
		
		System.out.println(age);
		System.out.println(g);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(isAdult);
		
		*/
		
		
		//NON-PREAMPTIVE DATA TYPE:
		
		//HAVE NO FIXED SIZE LIKE PREAMPTIVE DATA TYPE
		//HAVE THEIR OWN CERTAIN FUNCTION TO PERFORME OPERATION UNLIKE PREAMPTIVE DATA TYPE
		//NON-PREAMPTIVE DATA TYPE CAN BE DECLARE WITH THE HELP OF NEW KEYWORD
		//NEW KEYWORD CAN BE USED TO CREATE NEW NON-PREAMPTIVE OR REFERENCE DATA TYPE
		//IN STRING NEW KEYWORD IS NOT NECESSARY TO BE USED
		//STRINGS IN JAVA R IMMETUABLE
		
		//STRING
	/*	String name = "Saqib";
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.replace('S', 'K'));
		System.out.println(name);
		System.out.println(name.substring(0, 3));
	*/
		//ARRAYS
		//ARRAYS PROPERTIES CAN BE CALLED WITHOUT PARENTHESIS UNLIKE FUNCTION WITH PARENTHESIS 
		//OF STRING FUNCTION
		
		//INT ARRAY
	/*	int[] marks= new int[3];
		marks[0] = 98;
		marks[1] = 80;
		marks[2] = 70;
		System.out.println(marks[2]);
		*/
		//BOOLEAN ARRAY
	/*	boolean[] question = new boolean[4];
		question[0] = true;
		question[1] = false;
		question[2] = true;
		question[3] = false;
		System.out.println(question[1]);
		*/
		//ARRAY PROPERTIES
		
		//LENGTH
	/*	System.out.println(marks.length);
		System.out.println(question.length);
	*/	
		//SORT
	/*	System.out.println(marks[0]);//BEFORE SORTING
		Arrays.sort(marks);
		System.out.println(marks[0]);//AFTER SORTING
	*/	
		//2D ARRAY:
		
		int[][] marks = {{10,20,30},{40,50,60}};
		System.out.println(marks[1][2]);
		
		int[][] marks1 = new int[3][3];
 		marks1[0][0] = 10;
 		marks1[0][1] = 20;
 		marks1[0][2] = 30;
 		marks1[1][0] = 40;
 		marks1[1][1] = 50;
 		marks1[1][2] = 60;
 		System.out.println(marks1[1][2]);
	}

}
