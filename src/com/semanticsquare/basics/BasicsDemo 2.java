class BasicsDemo {
  // Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J1a_Introduction.html
  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
  }
  static void primitives(){
    System.out.println("Primitives demo");
    int intHex = 0x0041;
    System.out.println("intHex: " + intHex);
    int intBinary = 0b01010111;
    System.out.println("intBinary: "+intBinary);
    int intUnderscore = 1_23_456;
    System.out.println("intUnderscore: " +intUnderscore);
    char charA = 'A';
    char charInt = 65;
    System.out.println("charInt: " + charInt);
    char charUnicode1 = '\u0041';
    char charUnicode2 = 0x41;
    char charBinary = 0b01000001;
    System.out.println("charUnicode1: " + charUnicode1 );
    System.out.println("charUnicode2: " + charUnicode2 );
    System.out.println("charBinary: " + charBinary);
    


  }
  public static void main(String[] args) {
	   	// Language Basics 1
		primitives();
  }
}
