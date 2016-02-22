package warriorProject;

public class Start
{
	static City city = new City();
	public static void main(String[]args)
	 {
		Welcome intro = new Welcome();
		intro.welcomeMessage();
		System.out.println("\n\n* * * * * * *\n City Ruler\n* * * * * * *\n");
		System.out.println("Welcome to the city of Berg warrior. I am very grateful that you are here.");
		System.out.println("A number of terrifying creatures have begun to lay siege to our city, and while we have tried to hold them back, they have defeated all of our strongest soldiers.");
		System.out.println("We are no longer able to protect ourselves and soon we will all be destroyed.");
		System.out.println("You are our last hope.");
		city.city();		
	 }
} 