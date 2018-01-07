/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   MyCreation.java is the file containing the class which runs the other classes
	that create the MyCreation assignment.
*/
import java.awt.*;
import hsa.Console;

// The "MyCreation" class.
public class MyCreation
{
    Console c; //The output console

    //This is the main method which runs all the other methods in the program in the order they are called
    public static void main (String[] args)
    {
	MyCreation c = new MyCreation ();
	c.introductionPic ();
	c.transition ();
	c.introduction (5);
	c.sceneOne ();
	c.buggattiTop (220);
	c.harleyTop (1);
	c.textBubbles (3, 1, 1);
	c.truckTop (300);
	c.textBubbles (4, 2, 2);
	c.textBubbles (1, 3, 3);
	c.harleyTop (2);
	c.textBubbles (2, 1, 4);
	c.buggattiTop (100);
	c.buggattiTop (400);
	c.truckTop (600);
	c.transition ();
	c.introduction (2);
	c.sceneTwo ();
	c.harleySide ();
	c.buggattiSide ();
	c.chicken ();
	c.textBubbles (3, 4, 5);
	c.textBubbles (4, 5, 6);
	c.transition ();
	c.introduction (6);
    }



    //adds the IntroductionPic thread to MyCreation
    public void introductionPic ()
    {
	IntroductionPic z = new IntroductionPic (c);
    }


    //adds the Transition thread to MyCreation
    public void transition ()
    {
	Transition z = new Transition (c);
    }


    //adds the Introduction thread to MyCreation
    public void introduction (int i)
    {
	Introduction a = new Introduction (c);
	a.background ();
	a.storyLine (i);
    }


    //adds the SceneOne thread to MyCreation
    public void sceneOne ()
    {
	SceneOne y = new SceneOne (c);
    }


    //adds the SceneTwo thread to MyCreation
    public void sceneTwo ()
    {
	SceneTwo x = new SceneTwo (c);
    }


    //adds the BuggattiTop thread to MyCreation
    public void buggattiTop (int z)
    {
	BuggattiTop w = new BuggattiTop (c);
	w.run (z);
    }


    //adds the HarleyTop thread to MyCreation
    public void harleyTop (int i)
    {
	HarleyTop v = new HarleyTop (c);
	v.run (i);
    }


    //adds the TextBubbles thread to MyCreation
    public void textBubbles (int lines, int car, int words)
    {
	TextBubbles t = new TextBubbles (c);
	t.textOutput (lines, car, words);
    }


    //adds the TruckTop thread to MyCreation
    public void truckTop (int x)
    {
	TruckTop u = new TruckTop (c);
	u.run (x);

    }


    //adds the HarleySide thread to MyCreation
    public void harleySide ()
    {
	HarleySide s = new HarleySide (c);
	s.run ();
    }


    //adds the BuggattiSide thread to MyCreation
    public void buggattiSide ()
    {
	BuggattiSide r = new BuggattiSide (c);
	r.start ();
    }


    //adds the Chicken thread to MyCreation
    public void chicken ()
    {
	//This is my overloaded method
	Chicken r = new Chicken (c);
	Chicken s = new Chicken (c, Color.green, 130, 12);
	Chicken t = new Chicken (c, Color.blue, Color.red, 190, 6);
	t.run ();
	s.run ();
	r.run ();
    }


    //Creates the console window and titles it "Grand Theft Java"
    public MyCreation ()
    {
	c = new Console ("Grand Theft Java");
    }
} //MyCreation class
