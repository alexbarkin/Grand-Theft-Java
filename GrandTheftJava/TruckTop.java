/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   TruckTop.java is the file containing the class which runs the top view
	of the truck which allows the motorcycle to escape the confrontation
	with the buggatti
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class TruckTop extends Thread
{
    private Console c;

    public void truck (int x)
    {
	int yPoints[] = {285, 255, 250, 290};
	int a = 0;
	Color offSetBlack = new Color (85, 85, 85);
	for (int i = 0 ; i < x ; i++)
	{
	    if (x == 600)
	    {
		a = 300;
	    }
	    int xPoints[] = {750 - a - i, 750 - a - i, 760 - a - i, 760 - a - i};
	    c.setColor (Color.black);
	    c.fillRect (730 - a - i, 239, 111, 62);
	    c.setColor (offSetBlack);
	    c.fillPolygon (xPoints, yPoints, 4);
	    c.fillRect (740 - a - i, 240, 5, 60);
	    c.setColor (Color.white);
	    c.fillRoundRect (760 - a - i, 250, 80, 40, 5, 5);
	    c.fillRoundRect (730 - a - i, 250, 20, 40, 15, 15);
	    c.setColor (Color.gray);
	    c.fillRect (744 - a - i, 250, 10, 40);
	    c.fillRoundRect (730 - a - i, 250, 5, 40, 15, 15);
	    c.setColor (Color.yellow);
	    c.fillArc (730 - a - i, 250, 10, 10, 90, 90);
	    c.fillArc (730 - a - i, 280, 10, 10, 180, 90);
	    try
	    {
		Thread.sleep (6);
	    }
	    catch (Exception ex)
	    {
	    }
	}
    }


    public TruckTop (Console con)
    {
	c = con;
    }


    public void run (int x)
    {
	truck (x);
    }
}
