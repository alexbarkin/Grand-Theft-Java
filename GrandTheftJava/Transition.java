/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   Transition.java is the file containing the class which draws the transitions
   between scenes. This is used to make my program smooth and look good. It is a
   circle expanding outwards.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Transition
{
    private Console c;
    public void fade ()
    {
	c.setColor (Color.black);
	for (int i = 0 ; i < 1000 ; i++)
	{
	    c.drawOval (320 - i / 2, 250 - i / 2, i, i);
	    try
	    {
		Thread.sleep (1);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	c.clear ();
    }


    public Transition (Console con)
    {
	c = con;
	fade ();
    }
}
