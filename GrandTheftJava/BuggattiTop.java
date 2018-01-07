/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   BuggattiTop.java is the file containing the class which draws the top view
	of the buggatti, which questions the motorcycle, and turns.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class BuggattiTop extends Thread
{
    private Console c;
    public void car (int x)
    {
	Color sunRoof = new Color (145, 145, 145);
	Color glass = new Color (205, 205, 205);
	Color car = new Color (50, 50, 50);
	int y = 0;
	if (x == 100 || x == 220)
	{
	    for (int i = 0 ; i < x ; i++)
	    {
		if (x == 100)
		{
		    y = 220;
		}
		c.setColor (Color.black);
		c.fillRect (309, y - 103 + i, 57, 100);
		c.setColor (Color.gray);
		c.fillRoundRect (314, y - 100 + i, 49, 55, 25, 25);
		c.setColor (car);
		c.fillRoundRect (319, y - 102 + i, 39, 100, 5, 5);
		c.fillOval (310, y - 100 + i, 15, 15);
		c.fillOval (351, y - 100 + i, 15, 15);
		c.setColor (Color.red);
		c.fillArc (327, y - 90 + i, 10, 80, 0, 180);
		c.fillArc (342, y - 90 + i, 10, 80, 0, 180);
		c.setColor (sunRoof);
		c.fillRect (323, y - 45 + i, 30, 20);
		c.setColor (glass);
		c.fillRoundRect (323, y - 28 + i, 30, 12, 5, 5);
		c.setColor (Color.gray);
		c.fillRoundRect (319, y - 9 + i, 39, 8, 5, 5);
		c.setColor (Color.yellow);
		c.fillRoundRect (319, y - 9 + i, 10, 8, 5, 5);
		c.fillRoundRect (348, y - 9 + i, 10, 8, 5, 5);
		if (x == 220)
		{
		    try
		    {
			Thread.sleep (10 - i / 18);
		    }
		    catch (Exception ex)
		    {
		    }
		}
		else if (x == 100)
		{
		    try
		    {
			Thread.sleep (1);
		    }
		    catch (Exception ex)
		    {
		    }
		}
	    }
	}

	if (x == 400)
	{
	    c.setColor (Color.black);
	    for (int i = 0 ; i < 57 ; i++)
	    {
		c.drawRect (309, 217, 56 - i, 100);
	    }
	    for (int i = 0 ; i < x ; i++)
	    {
		c.setColor (Color.black);
		c.fillRect (291 - i, 258, 100, 57);
		c.setColor (Color.gray);
		c.fillRoundRect (330 - i, 260, 55, 49, 25, 25);
		c.setColor (car);
		c.fillRoundRect (290 - i, 265, 100, 39, 5, 5);
		c.fillOval (374 - i, 258, 15, 15);
		c.fillOval (374 - i, 298, 15, 15);
		c.setColor (Color.red);
		c.fillArc (300 - i, 270, 80, 10, 270, 180);
		c.fillArc (300 - i, 290, 80, 10, 270, 180);
		c.setColor (sunRoof);
		c.fillRect (310 - i, 270, 20, 30);
		c.setColor (glass);
		c.fillRoundRect (310 - i, 270, 12, 30, 5, 5);
		c.setColor (Color.gray);
		c.fillRoundRect (290 - i, 265, 8, 39, 5, 5);
		c.setColor (Color.yellow);
		c.fillRoundRect (290 - i, 265, 8, 10, 5, 5);
		c.fillRoundRect (290 - i, 294, 8, 10, 5, 5);
		try
		{
		    Thread.sleep (2);
		}
		catch (Exception ex)
		{
		}
	    }
	}
    }


    public BuggattiTop (Console con)
    {

	c = con;
    }


    public void run (int z)
    {
	car (z);
    }
}
