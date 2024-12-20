public class Collatz {
    // Demonstrates the Collatz conjecture.
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
        String mode = (args[1]);
        String verbose = "v";
        String consice = "c";

        if (mode.equals(verbose)) {
      	  for (int i = 1; i <= N; i++) {
       	  	int currentNum = i;
         	int count = 0; 

            do {
				System.out.print(currentNum + " ");  
                if (currentNum % 2 == 0) {
                    currentNum = currentNum / 2; 
                } else {
                    currentNum = ((currentNum * 3) + 1); 
                } 
                   count++;
       		 } while (currentNum != 1);
            System.out.print("1 ");
            count++;
            System.out.print("(" + count + ")");
            System.out.println();	
		}
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
    if (mode.equals(consice)) {
        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

    }
    }
}






