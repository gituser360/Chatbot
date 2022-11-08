import java.util.Scanner;

class Main {
  public static void main(String[] args)
	{
		Strongmanbot strong = new Strongmanbot();
		
		System.out.println (strong.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (strong.getResponse(statement));
			statement = in.nextLine();
		}
	}

}