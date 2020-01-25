package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import model.User;
import model.UserBusinessLogic;

public class TestUsernameLogic
{
	
	UserBusinessLogic userLogic = new UserBusinessLogic();
	User user = new User("Zachary", "Hayes");
	
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testGenerateUsername()
	{
		userLogic.generateUsername(user);
		assertEquals("zhayes", user.getUsername());
	}
	
	@Test
	public void testUsernameAllLowercase()
	{
		userLogic.generateUsername(user);
		assertTrue(usernameIsLowercase(user.getUsername()));
	}
	
	// Returns true if all characters in username are lowercase.
	private boolean usernameIsLowercase(String username)
	{
		char[] charArray = username.toCharArray();
        
        for(int i=0; i < charArray.length; i++){
            
            //if any character is not in lower case, return false
            if( !Character.isLowerCase( charArray[i] ))
                return false;
        }
        
        return true;
	}

}
