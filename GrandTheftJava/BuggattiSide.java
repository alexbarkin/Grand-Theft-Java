/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   BuggattiSide.java is the file containing the class which runs the side view
	of the buggatti which encounters the overloaded chickens.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class BuggattiSide extends Thread
{
    private Console c;
    public void buggatti ()
    {
	Color tires = new Color (70, 70, 70);
	Color pavement = new Color (60, 60, 60);
	try
	{
	    Thread.sleep (1000);
	}
	catch (Exception ex)
	{
	}
	for (int i = 0 ; i < 400 ; i++)
	{
	    c.setColor (pavement);
	    c.fillRect (710 - i, 340, 126, 50);
	    c.setColor (Color.black);
	    c.fillOval (795 - i, 340, 40, 40);
	    c.fillRoundRect (740 - i, 340, 80, 40, 15, 15);
	    c.fillArc (710 - i, 350, 80, 60, 90, 90);
	    c.setColor (tires);
	    c.fillOval (725 - i, 370, 20, 20);
	    c.fillOval (800 - i, 370, 20, 20);
	    c.fillArc (718 - i, 355, 30, 20, 90, 90);
	    c.setColor (Color.gray);
	    c.fillArc (760 - i, 341, 60, 30, 90, 90);
	    c.fillArc (739 - i, 340, 20, 20, 90, 90);
	    c.setColor (Color.red);
	    c.drawArc (790 - i, 360, 30, 30, 90, 90);
	    c.drawLine (790 - i, 375, 750 - i, 375);
	    c.drawLine (805 - i, 360, 790 - i, 360);
	    c.setColor (Color.yellow);
	    c.fillOval (724 - i, 359, 5, 5);
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (Exception ex)
	    {
	    }
	}
    }


    public BuggattiSide (Console con)
    {
	c = con;
    }


    public void run ()
    {
	buggatti ();
    }
}


