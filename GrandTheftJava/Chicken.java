/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   Chicken.java is the file containing the class which creates three chickens of
	different colors and locations. These chicken go infront of the bugatti
	and stop it. The chicken end up having the source code and the buggatti
	is successful in it's mission.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Chicken extends Thread
{
    private Console c;
    private Color bird = (Color.orange);
    private Color beak;
    private int x = 70;
    private int delay = 60;

    public void chicken ()
    {
	Color road = new Color (60, 60, 60);
	int xPoints[] = {212, 222, 222};
	for (int i = 0 ; i < x ; i++)
	{
	    int yPoints[] = {530 - i, 517 - i, 524 - i};
	    c.setColor (road);
	    c.fillRect (212, 515 - i, 61, 50);
	    if (i >= 76 && i <= 126)
	    {
		c.setColor (Color.yellow);
		c.drawLine (212, 440, 273, 440);
	    }
	    c.setColor (beak);
	    c.fillPolygon (xPoints, yPoints, 3);
	    c.setColor (bird);
	    c.fillOval (220, 515 - i, 10, 10);
	    c.fillRoundRect (222, 525 - i, 30, 10, 15, 15);
	    c.fillArc (222, 512 - i, 60, 40, 180, 90);
	    c.fillArc (227, 536 - i, 46, 30, 0, 90);
	    c.setColor (Color.black);
	    c.drawLine (240, 550 - i, 240, 560 - i);
	    c.drawLine (230, 544 - i, 230, 554 - i);
	    c.drawLine (235, 558 - i, 240, 560 - i);
	    c.drawLine (235, 561 - i, 240, 560 - i);
	    c.drawLine (238, 563 - i, 240, 560 - i);
	    c.fillOval (223, 517 - i, 3, 3);
	    c.drawLine (225, 552 - i, 230, 554 - i);
	    c.drawLine (225, 555 - i, 230, 554 - i);
	    c.drawLine (228, 557 - i, 230, 554 - i);
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }



    public Chicken (Console con)
    {
	c = con;
    }


    public Chicken (Console con, Color y, int a, int w)
    {
	c = con;
	bird = y;
	x = a;
	delay = w;
    }


    public Chicken (Console con, Color y, Color e, int a, int w)
    {
	c = con;
	beak = e;
	bird = y;
	x = a;
	delay = w;
    }


    public void run ()
    {
	chicken ();
    }
}
