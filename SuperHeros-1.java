/**
 * A very basic WonderWoman class that inherits from, or extends, the basic Person class
 *
 * 
 * @author   Ahmet Yilmaz
 * @version  1.0
 */

public class SuperHeros extends Person
{
	//Private properties for SuperHeros object in addition to the
	//inherited properties from the Person class
	private int	strength;
	private String secretIdentity;
	private String characterName;
	private int numberOfLives;
	
	/**
	* No argument constructor that creates a generic SuperHeros object
	*/
	public SuperHeros()
	{
		super();					
		
		strength = 10;
		secretIdentity = "Clark";
		characterName = "Superman";
		numberOfLives = 1;
	}
	
	/**
	* A constructor with the most common values for an SuperHeros object supplied
	*
	* @param fN				The real life name of the new SuperHeros object
	* @param lN				The real life last name of the new SuperHeros object
	* @param sex			The gender or sex of the new SuperHeros object (valid values are "male", "female", and "unspecified")
	* @param age			The age in years of the new SuperHeros object (age must be a positive integer less than 128)
	* @param numLives		The SuperHeros must have at least 1 life.
	* @param strength		The power of the SuperHeros character. The power must be between 0 and 10. 
	*
	* @throws IllegalArgumentException		Thrown if the passed in gender is not "male", "female", or "unspecified";
	*										or if the age is negative; or if the number of lives of SuperHeros is less than 1
	*										; or if the strength is less than zero or greater than 10 or if the secret identity is not "Clark", "Engineer", "Programmer".
	* 
	*/
	public SuperHeros(String fN, String lN, String sex, byte age, int numLives, int strength)
	{
		// I call the (String, String, String, byte) version of the Person constructor so
		//  I use super class with the correct arguments
		
		super(fN, lN, sex, age);
		if (strength >= 0 && strength <= 10)
		{
			this.strength = strength;
		}
		else
		{
			throw new IllegalArgumentException("All SuperHeros strength be rated out of 10! ");
		}
		if ( numLives >=1 )
		{
			numLives = numberOfLives;
		}
		else
		{
			throw new IllegalArgumentException("All SuperHeros must have at least 1 life! ");
		}
	}
	
	/**
	* A constructor with the most common values for an SuperHeros object supplied
	*
	* @param fN				The real life name of the new SuperHeros object
	* @param lN				The real life last name of the new SuperHeros object
	* @param sex			The gender or sex of the new SuperHeros object (valid values are "male", "female", and "unspecified")
	* @param age			The age in years of the new SuperHeros object (age must be a positive integer less than 128)
	* @param numLives		The SuperHeros must have at least 1 life.
	* @param strength		The power of the SuperHeros character. The power must be between 0 and 10. 
	* @param secretID		The secret identity of the SuperHeros character.
	* @param charName		The character name of the SuperHeros. (valid values are "WonderWoman", "SuperMan", and "KarateKid")
	* 
	* @throws	IllegalArgumentException Thrown ,
	* 			
	*			if the character name is not either "WonderWoman", "SuperMan", "KarateKid"!
	*			if the strength is not between 0 and 10,
	*			or if the number of lives is less than 1
	*/
	
	public SuperHeros(String fN, String lN, String mN, String title, String suffix, String sex, byte age, int strengthRate, int numLife, String characterName, String secretIdentity) throws IllegalArgumentException
	{
		super(fN, lN, mN, title, suffix, sex, age);
		if (strengthRate >= 0 || strengthRate <= 10)
		{
			strengthRate = strength;
		}
		else
		{
			throw new IllegalArgumentException("All SuperHeros strength must be rated out of 10 (between 0 and 10)");	
		}
		if (characterName.equals("WonderWoman") || characterName.equals("SuperMan") || characterName.equals("KarateKid" ))
		{
			this.characterName = characterName;
		}
		else
		{
			throw new IllegalArgumentException("All SuperHeros character names must be one of \"WonderWoman\", \"SuperMan\", \"KarateKid\"");
		}
		if (secretIdentity.equals("Clark") || secretIdentity.equals("Engineer") || secretIdentity.equals("Programmer" ))
		{
			this.secretIdentity = secretIdentity;
		}
		else
		{
			throw new IllegalArgumentException("All SuperHeros character names must be one of \"WonderWoman\", \"SuperMan\", \"KarateKid\"");
		}
		if (numLife >= 1)
		{
			numberOfLives = numLife;
		}
		else
		{
			throw new IllegalArgumentException("SuperHeros must have at least 1 life");
		}
	}
	
	/**
	* A set method that sets the strength values of SuperHeros object
	*
	* @param strength	The strength values of SuperHeros object(strength must be rated between 0 and 10)
	* @throws IllegalArgumentException Thrown if the strength values is not between 0 and 10
	*/
	public void setStrength(int strength)
	{
		if (strength < 0 || strength > 10)
				{
					throw new IllegalArgumentException("All SuperHeros strength must be rated out of 10 (between 0 and 10)");
				}
				else
				{
					this.strength = strength;
		}
	}
	
	/**
	* A set method that sets the character name of the SuperHeros objects(valid values are:  "WonderWoman", "SuperMan", "KarateKid")
	*
	* @param characterName		The Character Name of this SuperHeros Object
	*
	* @throws IllegalArgumentException		Thrown if the character names is not one of "WonderWoman", "SuperMan", "KarateKid"
	*/
	public void setCharacterName(String charName)
	{
		if (charName.equals("WonderWoman") || charName.equals("SuperMan") || charName.equals("KarateKid"))
		{
			characterName = charName;
		}
		else
		{
			throw new IllegalArgumentException("All character names must be one of the following \"WonderWoman\", \"SuperMan\", \"KarateKid\"");
		}
	}
	
	/**
	* A set method to declare secret identities for this SuperHeros object
	*
	* @param	secretIdentity		The secret identity of this SuperHeros object
	* @throws IllegalArgumentException		Thrown if the secret identities is not one of "Clark", "Engineer", "Programmer"
	*/
	public void setSecretIdentity(String secretID)
	{
		if (secretID.equals("Clark") || secretID.equals("Engineer") || secretID.equals("Programmer"))
		{
			secretIdentity = secretID;
		}
		else
		{
			throw new IllegalArgumentException("All secret identities must be one of the following \"Clark\", \"Engineer\", \"Programmer\"");
		}
	}
	
	/**
	* A set method that sets the number of lives of this SuperHeros object
	*
	* @param	numberOfLives		The number of lives of this SuperHeros object (SuperHeros must have at least 1 life)
	*
	* @throws	IllegalArgumentException Thrown if the number of lives entered is less than one
	*/
	public void setNumberOfLives(int numLives)
	{
		if (numLives > 1)
		{
			numberOfLives = numLives;
		}
		else
		{
			throw new IllegalArgumentException("SuperHeros objects must have at least 1 life");
		}
	}
	
	/**
	* A get method to retrieve this SuperHeros object's strength values
	*
	* @return The strength values of this SuperHeros object
	*/
	public int getStrength()
	{
		return strength;
	}
	
	/**
	* A get method to retrieve this SuperHeros Object's character names
	*
	* @return	The character names of this SuperHeros object
	*/
	public String getCharacterName()
	{
		return characterName;
	}
	
	/**
	* A get method to retrieve this SuperHeros object's secret identities
	*
	* @return The secret identities of this SuperHeros object
	*/
	public String getSecretIdentity()
	{
		return secretIdentity;
	}
	
	/**
	* A get method to retrieve this SuperHeros number of lives
	*
	* @return The number of lives of this SuperHeros object
	*/
	public double getNumberOfLives()
	{
		return numberOfLives;
	}
}