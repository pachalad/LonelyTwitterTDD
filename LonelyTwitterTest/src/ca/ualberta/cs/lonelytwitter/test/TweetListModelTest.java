package ca.ualberta.cs.lonelytwitter.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.AbstractTweet;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.data.TweetListModel;


public class TweetListModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{
	public TweetListModelTest(){
		super(LonelyTwitterActivity.class);
	}
	public void testFiveIsFive(){
		assertEquals("Five is Five",5,5);
	} 
	public void testAddTweets(){
		TweetListModel model=new TweetListModel();
		Tweet t=new Tweet("Hello");
		model.addTweet(t);
		assertTrue("The model contains tweet t",model.getList().contains(t));
		
		Tweet t2=new Tweet("Hello");
		try{
			model.addTweet(t2);
			fail();
		}catch (Exception e){
			assertTrue("The exception is an illegal arguement",e.getMessage()=="The exception is an illegal arguement");
		}
		
	}
	public void testHasTweet(){
		TweetListModel model=new TweetListModel();
		Tweet t=new Tweet("Hello");
		Tweet t2=new Tweet("Hello");
		model.addTweet(t);
		assertTrue("The tweet contains the same tweet",model.hasTweet(t2));
		
		
	}
	public void testGetCount(){
		TweetListModel model=new TweetListModel();
		Tweet t=new Tweet("Hello");
		model.addTweet(t);
		assertTrue("The number is not the same",model.getCount()==1);
		Tweet t2=new Tweet("Hell");
		model.addTweet(t2);
		assertTrue("The number is not 2",model.getCount()==2);
		
	}
	public void testRemoveTweet(){
		TweetListModel model=new TweetListModel();
		Tweet t=new Tweet("Hello");
		model.addTweet(t);
		model.removeTweet(t);
		assertTrue("It didnt remove the one item",model.getCount()==0);
		model.removeTweet(t);
		assertTrue("It removed somethign that doestn exist",model.getCount()==0);	
	}
	public void testGetTweets(){
		TweetListModel model=new TweetListModel();
		TweetListModel model2=new TweetListModel();
		Tweet t1=new Tweet("hello");
		try
		{
			Thread.sleep(10000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Tweet t2=new Tweet("no");
		model2.addTweet(t2);
		model2.addTweet(t1);
		model.addTweet(t2);
		model.addTweet(t1);
		assertFalse("Its not sorted",model.getTweets()==model2.getList());
		
		
	}
}
