// This class generates the username and email for new users based on their name.
// When a user is added to the business system, this will generate their users info
// based on company standards.

// Zachary Hayes - zjhayes@dmacc.edu

package model;

public class UserBusinessLogic
{
	String domain = "dmacc.edu";
	
	public String generateUsername(User user)
	{
		String firstInitial = user.getFirstName().substring(0,1);
		String username = firstInitial + user.getLastName();
		username = username.toLowerCase();
		
		user.setUsername(username);
		return username;
	}
	
	public String generateEmail(User user)
	{	
		if(user.getUsername() == null)
		{
			generateUsername(user);
		}
		
		String email = user.getUsername() + "@" + domain;
		
		user.setEmail(email);
		return email;
	}
	
}
