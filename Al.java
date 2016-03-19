import java.util.Random;
import java.util.Scanner;

public class Aleatoreo {
	public static void main(String[] args) {
		Random num = new Random();
		int m = num.nextInt(100);
		int N = m + 1;
		System.out.println("Guess the number:"); //you have 10 opprtunities: ");
			Scanner numer = new Scanner (System.in);
			int nu = numer.nextInt();
	if (N == nu){
		System.out.println("Congratulations you guess at the first time");
				}
	else {
		int counter = 1;
		boolean cond = true;
		//while (counter < 1){
		//while (counter < 9){
		while (cond) {
			counter = counter + 1;
			System.out.println("Guess again: ");
			Scanner nume = new Scanner (System.in);
			int nul = nume.nextInt();
				if (nul == N){
				System.out.println("You win after " + counter + " attempts");
				cond = false;
				}
				//else {
					//System.out.println("You lost");
				}
	}
	}
	}
	
//}
