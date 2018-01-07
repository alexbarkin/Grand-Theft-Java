/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   HarleySide.java is the file containing the class which draws the side view of
	the motorcycle. It is the original bandit who takes the source code.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class HarleySide implements Runnable
{
    private Console c;

    public void harley ()
    {
	int yPoints[] = {390, 380, 390, 400};
	Color chrome = new Color (120, 120, 120);
	Color pavement = new Color (60, 60, 60);
	for (int i = 0 ; i < 780 ; i++)
	{
	    int xPoints[] = {682 - i, 682 - i, 660 - i, 660 - i};
	    c.setColor (pavement);
	    c.fillRect (641 - i, 360, 105, 55);
	    c.setColor (Color.black);
	    c.fillOval (640 - i, 385, 30, 30);
	    c.fillOval (720 - i, 390, 25, 25);
	    c.fillPolygon (xPoints, yPoints, 4);
	    c.fillRect (682 - i, 370, 2, 20);
	    c.drawArc (683 - i, 360, 20, 15, 90, 180);
	    c.setColor (chrome);
	    c.fillRoundRect (680 - i, 380, 45, 30, 10, 10);
	    c.fillArc (700 - i, 370, 20, 20, 0, 180);
	    try
	    {
		Thread.sleep (4);
	    }
	    catch (Exception ex)
	    {
	    }
	}
    }



    public HarleySide (Console con)
    {
	c = con;
    }


    public void run ()
    {
	harley ();
    }
}
