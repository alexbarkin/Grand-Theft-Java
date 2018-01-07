/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   HarleyTop.java is the file containing the class which draws the top view of
	the motorcycle. It is the original bandit who takes the source code.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class HarleyTop
{
    private Console c;
    public void bike (int z)
    {
	Color seat = new Color (219, 119, 19);
	Color bag = new Color (99, 99, 99);
	Color offBlack = new Color (59, 59, 59);
	int nPoints = 4;
	if (z == 1)
	{
	    for (int i = 0 ; i < 300 ; i++)
	    {
		int xPoints[] = {340, 320, 324, 336};
		int yPoints[] = {600 - i, 600 - i, 580 - i, 580 - i};
		int yPointsTwo[] = {580 - i, 580 - i, 560 - i, 560 - i};
		c.setColor (Color.black);
		c.fillRect (309, 549 - i, 42, 62);
		c.setColor (offBlack);
		c.fillOval (325, 530 - i, 10, 20);
		c.fillOval (325, 590 - i, 10, 20);
		c.fillRect (315, 570 - i, 30, 5);
		c.setColor (bag);
		c.fillOval (320, 540 - i, 20, 30);
		c.fillPolygon (xPoints, yPoints, nPoints);
		c.setColor (offBlack);
		c.fillRect (310, 550 - i, 40, 3);
		c.fillArc (300, 540 - i, 20, 20, 270, 90);
		c.fillArc (340, 540 - i, 20, 20, 180, 90);
		c.setColor (seat);
		c.fillPolygon (xPoints, yPointsTwo, nPoints);
		try
		{
		    Thread.sleep (10 - i / 29);
		}
		catch (Exception ex)
		{
		}
	    }
	}
	if (z == 2)
	{
	    c.setColor (Color.black);
	    for (int i = 0 ; i < 42 ; i++)
	    {
		c.fillRect (309, 231, 42 - i, 82);
	    }

	    for (int i = 0 ; i < 370 ; i++)
	    {
		int xPointsTwo[] = {320 - i, 320 - i, 340 - i, 340 - i};
		int xPoints[] = {340 - i, 340 - i, 360 - i, 360 - i};
		int yPoints[] = {264, 276, 280, 260};
		c.setColor (Color.black);
		c.fillRect (309 - i, 249, 62, 42);
		c.setColor (offBlack);
		c.fillOval (290 - i, 265, 20, 10);
		c.fillOval (350 - i, 265, 20, 10);
		c.fillRect (335 - i, 255, 5, 30);
		c.setColor (bag);
		c.fillOval (300 - i, 260, 30, 20);
		c.fillPolygon (xPoints, yPoints, nPoints);
		c.setColor (offBlack);
		c.fillRect (310 - i, 250, 3, 40);
		c.fillArc (300 - i, 240, 20, 20, 270, 90);
		c.fillArc (300 - i, 280, 20, 20, 0, 90);
		c.setColor (seat);
		c.fillPolygon (xPointsTwo, yPoints, nPoints);
		try
		{
		    Thread.sleep (10 - i / 29);
		}
		catch (Exception ex)
		{
		}
	    }
	}
    }


    public HarleyTop (Console con)
    {
	c = con;
    }


    public void run (int i)
    {
	bike (i);
    }
}
