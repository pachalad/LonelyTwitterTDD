package ca.ualberta.cs.lonelytwitter.test;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import android.test.ActivityInstrumentationTestCase2;


public class AbstractTweetTest extends 
		ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public AbstractTweetTest() {
		super(LonelyTwitterActivity.class);
	}
	public void testFiveIsFive(){
		assertEquals("Five is Five",5,5);
	}
	public void testAbstractTweet(){
	}

}
