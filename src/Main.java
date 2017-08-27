import java.util.List;

import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Main {

	public static void main (String[]args) throws TwitterException
	{
		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("Fh7piQWQDODoDZBus4InQt18u")
			.setOAuthConsumerSecret("actLZGHjQInGNN8WcZuUNqTMHPtOXnuTAUDqH8b47QubctrMHe")
			.setOAuthAccessToken("346826171-DUGmKTgT7uwK4idG1kxepWVnDLIC6LEEebmyVSOx")
			.setOAuthAccessTokenSecret("FjcdUkvbRtWecTNAL8H1h6pI0XwqJZqvAR5ghYGzt3RsQ");
		
		TwitterFactory tf = new TwitterFactory(configurationBuilder.build());
		twitter4j.Twitter twitter = tf.getInstance();
		
		List<Status> status = twitter.getUserTimeline();
		
		for(Status s: status)
		{
			System.out.println(s.getUser().getName()+"      "+ s.getText());
		}
	}
}
