import javax.swing.JFrame;
import javax.swing.JPanel;

import twitter4j.TwitterException;

public class Main {

	
	public static void main (String[]args) throws TwitterException
	{
		
		FirstPage page = new FirstPage();
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(page);
		frame.add(panel);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
		
//		ConfigurationBuilder configurationBuilder = new ConfigurationBuilder();
//		configurationBuilder.setDebugEnabled(true).setOAuthConsumerKey("Fh7piQWQDODoDZBus4InQt18u")
//			.setOAuthConsumerSecret("actLZGHjQInGNN8WcZuUNqTMHPtOXnuTAUDqH8b47QubctrMHe")
//			.setOAuthAccessToken("346826171-DUGmKTgT7uwK4idG1kxepWVnDLIC6LEEebmyVSOx")
//			.setOAuthAccessTokenSecret("FjcdUkvbRtWecTNAL8H1h6pI0XwqJZqvAR5ghYGzt3RsQ");
//		
//		TwitterFactory tf = new TwitterFactory(configurationBuilder.build());
//		twitter4j.Twitter twitter = tf.getInstance();
//		
//		List<Status> status = twitter.getUserTimeline();
//		
//		for(Status s: status)
//		{
//			System.out.println(s.getUser().getName()+"      "+ s.getText());
//		}
	}
}
