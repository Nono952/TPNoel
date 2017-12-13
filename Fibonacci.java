import java.util.Scanner;

class Fibonacci {
	public static void main(String[] args) {
		int c = 5;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Choisir une valeur y/n >> ");
		String choice = sc.nextLine();
		
		if(choice.equals("y")) {
			System.out.print("Entrez la valeur: ");
			c = sc.nextInt();
		}
		
		for(int i=0; i<c; i++) {
			System.out.println(fib(i));
		}
	}
	
	public static int fib(int n) {
		if (n < 2) return(n);
		return(fib(n-2) + fib(n-1));
	}
}