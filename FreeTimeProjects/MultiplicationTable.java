public class MultiplicationTable {
// MAIN METHOD
public static void main(String[] args) {
// DISPLAY THE TABLE HEADING
System.out.println("         Multiplication table");

//DISPLAY THE NUMBER TITLE 
System.out.println("    ");
for ( j =1; j <= 9; j++)
	
	
	


//DISPLAY TABLE BODY
for (int i = 1; i <= 9; i++) {
	System.out.print(i + " | ");
for (int j = 1; j <= 9; j++) {
	//DISPLAY THE PRODUCT AND ALIGN PROPERLY 
	System.out.printf("%4d", i * j);
	}
	System.out.println();
  }
 }
}