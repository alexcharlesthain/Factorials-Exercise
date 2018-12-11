package factorialQuestions;

public class FactorialExercises {

	// testing if the no. 3628800 is a factorial or not//

	public static void main(String[] args) {

		int a = 3628800;
		findFactorial(a);

	}

	public static void findFactorial(int b) {
		int x, fact = 1;
		for (x = 1; x <= b; x++) {
			fact = fact * x;

		}

		System.out.println(b  + " = " + fact); //

	}
}