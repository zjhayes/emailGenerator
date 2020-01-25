package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;

import model.User;
import model.UserBusinessLogic;

public class TestUsernameLogic
{
	
	UserBusinessLogic userLogic = new UserBusinessLogic();
	User user1 = new User("Zachary", "Hayes");
	User user2 = new User("Abraham", "Van Helsing");
	
	@Before
	public void setUp() throws Exception
	{
	}

	@Test
	public void testGenerateUsername()
	{
		userLogic.generateUsername(user1);
		assertEquals("zhayes", user1.getUsername());
	}

}
