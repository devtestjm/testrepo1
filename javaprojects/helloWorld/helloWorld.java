import java.util.*;

public class helloWorld {

	public static void GarbageCollector1() {

		System.out.println("[debug] Entered GC...");
		// Runtime rt1 = new Runtime.getRuntime();
		Runtime rt1 = Runtime.getRuntime();
		System.out.println("Memory before GC request: " + rt1.freeMemory());
		rt1.gc();
		System.out.println("Memory after GC: " + rt1.freeMemory());
		System.out.println("[debug] Done GC method");
	}

	public static void printTest(String input1) {
	
		System.out.println("[debug] Entered printTest method");
		System.out.println(" ");
		System.out.println("Printing from inside method, received: " + input1);
		System.out.println("[debug] Done printTest");
	
	}

	public static void run() {

		System.out.println("[debug] Entered Run method");
		helloWorld hw1 = new helloWorld();
		// Input in1 = new Input(); This line for input doesnt work, using scanner instead
		Scanner in1 = new Scanner(System.in);
		
		System.out.println("[debug] Running HW1 instance...calling Method printTest");
		
		String input_name;
		System.out.println("Please enter a name: ");
		input_name = in1.nextLine();
		System.out.println("[debug] user entered ["+ "input_name" + "]");
		hw1.printTest(input_name);
		GarbageCollector1();
		System.out.println("[debug] done running hw1 instance.");		

	}
	
	public static void main(String[] args) {

		String str1;
		
		str1 = "Joe Mamba";

		System.out.println("Hello World to everyone!");
		System.out.println("Test input str1: " + str1);
		System.out.println("[debug] calling method...");
		
		
		// printTest pt1 = new printTest();
		helloWorld.printTest(str1);
		printTest(str1 + "-2");
		System.out.println("[debug] done calling method...");
			

		run();
		System.out.println("[debug] end of main method");


	}


}
