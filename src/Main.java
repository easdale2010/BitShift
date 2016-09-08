
public class Main {

	private static void printHex(int value) {
		System.out.printf("%x\n", value);
	}

	private static void printBin(int value) {
		System.out.println(Integer.toBinaryString(value));
	}

	public static void main(String[] args) {
		int colour = 0xFF00FF;
		printHex(colour);
		printBin(colour);

		System.out.println();
		System.out.println("Red");
		int r = (colour & 0xFF0000) >> 16;
		printHex(r);
		printBin(r);

		System.out.println();
		System.out.println("Green");
		int g = (colour & 0xFF00) >> 8;
		printHex(g);
		printBin(g);

		System.out.println();
		System.out.println("Blue");
		int b = (colour & 0xFF);
		printHex(b);
		printBin(b);

		System.out.println();
		System.out.println("Red, Green, Blue");
		int result = r << 16 | g << 8 | b;
		printHex(result);
		printBin(result);

		////// XOR
		System.out.println();
		System.out.println("XOR");
		int a = 0x12; //18
		int z = 0x7;
		printBin(a);
		printBin(z);
		printBin(a ^ z);
		// 10010
		// 00111
		// -----
		// 10101

		/// Not
		System.out.println();
		System.out.println("NOT");
		int n = 0x12; //18

		printBin(~a);
		//n = 00000000000000000000000000010010
		//    11111111111111111111111111101101

	}

}
