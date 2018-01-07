import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Buggatti extends Thread
{
    private Console c;
    public void car ()
    {
	Color sunRoof = new Color (145, 145, 145);
	Color glass = new Color (205, 205, 205);
	Color car = new Color (50, 50, 50);
	try
	{
	    Thread.sleep (300);
	}
	catch (Exception ex)
	{
	}
	for (int i = 0 ; i < 180 ; i++)
	{
	    c.setColor (Color.black);
	    c.fillRect (309, -103 + i, 57, 102);
	    c.setColor (Color.gray);
	    c.fillRoundRect (314, -100 + i, 49, 55, 25, 25);
	    c.setColor (car);
	    c.fillRoundRect (319, -102 + i, 39, 100, 5, 5);
	    c.fillOval (310, -100 + i, 15, 15);
	    c.fillOval (351, -100 + i, 15, 15);
	    c.setColor (Color.red);
	    c.fillArc (327, -90 + i, 10, 80, 0, 180);
	    c.fillArc (342, -90 + i, 10, 80, 0, 180);
	    c.setColor (sunRoof);
	    c.fillRect (323, -45 + i, 30, 20);
	    c.setColor (glass);
	    c.fillRoundRect (323, -28 + i, 30, 12, 5, 5);
	    c.setColor (Color.gray);
	    c.fillRoundRect (319, -9 + i, 39, 8, 5, 5);
	    c.setColor (Color.yellow);
	    c.fillRoundRect (319, -9 + i, 10, 8, 5, 5);
	    c.fillRoundRect (348, -9 + i, 10, 8, 5, 5);
	    try
	    {
		Thread.sleep (10 - i / 20);
	    }
	    catch (Exception ex)
	    {
	    }
	}
    }


    public Buggatti (Console con)
    {

	c = con;
    }


    public void run ()
    {
	car ();
    }
}
