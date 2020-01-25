package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import model.User;
import model.UserBusinessLogic;

public class TestEmailLogic
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
		assertEquals("zhayes@dmacc.edu", user.getUsername());
	}

}
