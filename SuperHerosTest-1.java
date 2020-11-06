/*
* This is to test the SuperHeros class
*/

public class SuperHerosTest
{
	public static void main(String[] args)
	{
		//Try and catch exception blocks below
		try
		{
			//Every constructor is called to ensure it is working
			SuperHeros e1 = new SuperHeros();
			//Cast the byte below
			SuperHeros e2 = new SuperHeros("Christopher", "Reeve", "male", (byte) 57, 1, 10);
			//Make sure to test your code with some errors also.
			SuperHeros e3 = new SuperHeros ("Gal", "Gadot", null, null, null , "female", (byte) 34, 10, 1, "WonderWoman", "Programmer");
			
			//Print out SuperHeros Object's values
			System.out.print(e2.getFirstName() + " " + e2.getLastName()+ " " + e2.getGender());
			System.out.println(", with Strength value: " + e1.getStrength() + " is a(n) " + e1.getSecretIdentity() + " has " + e1.getNumberOfLives() + " number of lives" + ", and character name is: " + e1.getCharacterName());
			
			//Update some SuperHeros objects
			e3.setAge((byte) 45);
			e2.setStrength(9);
			
			//Print out some more SuperHeros objects after updates
			System.out.print(e3.getFirstName() + " " + e3.getLastName() + ", " + e3.getGender());
			System.out.println(", with Strength value: " + e3.getStrength() + " is a(n) " + e3.getSecretIdentity() + " has " + e3.getNumberOfLives() + "number of lives" + ", and character name is: " + e3.getCharacterName());
		}
		catch (IllegalArgumentException iae)
		{
			System.out.println(iae.getMessage());
		}
	}
}