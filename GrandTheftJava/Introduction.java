/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   Introduction.java is the file containing the class which introduces each scene.
	It is responsible for telling the storyline of MyCreation.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Introduction
{
    private Console c;
    public void background ()
    {
	c.clear ();
	c.setColor (Color.black);
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.drawRect (0, 0, 640 - i, 500 - i / 2);
	}
    }


    public void storyLine (int a)
    {
	String text = " ";
	int x = 100;
	Font introFont = new Font ("Monospaced", 0, 15);
	c.setFont (introFont);
	c.setColor (Color.green);
	if (a == 5)
	{
	    text = "--You, Buggatti, have been chosen to retrieve the missing source code.-";
	}
	else if (a == 2)
	{
	    text = "----The chase continued for hours, until they reached a desert road.---";
	}
	else if (a == 6)
	{
	    text = "-----Congratulations, you have successfully found the source code.-----";
	}
	for (int y = 0 ; y < a ; y++)
	{
	    for (int i = 0 ; i < 71 ; i++)
	    {
		c.drawString (Character.toString (text.charAt (i)), i * 9, x);
		try
		{

		    Thread.sleep (40);
		}
		catch (InterruptedException e)
		{
		}
		if (a == 5)
		{
		    if (i * 9 >= 630 && y == 0)
		    {
			text = "-----The java source code contains secret government access codes.-----";

			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 1)
		    {
			text = "---It's crucial that these codes be returned to the government or the--";

			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 2)
		    {
			text = "entire nation is unsafe. We trust that you can retreive the data before";
			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 3)
		    {
			text = "-the bandit Harley Davidson tries to use it. Your country, thanks you.-";
			x += 15;
		    }
		}
		else if (a == 2)
		{
		    if (i * 9 >= 630 && y == 0)
		    {
			text = "Both vehicles were tired and low on fuel. The chase was near finished.-";
			x += 15;
		    }
		}
		else if (a == 6)
		{
		    if (i * 9 >= 630 && y == 0)
		    {
			text = "--The chickens were crossing the road to transfer the source code from-";
			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 1)
		    {
			text = "--Harley Davidson to a buyer. Your questioning got them to return the--";
			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 2)
		    {
			text = "source code. The code is now safe in the white house where it belongs.-";
			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 3)
		    {
			text = "------------------Once again, your country thanks you.-----------------";
			x += 15;
		    }
		    else if (i * 9 >= 630 && y == 4)
		    {
			text = "--------------------------------THE END--------------------------------";
			x += 15;
		    }
		}
	    }
	}
	try
	{

	    Thread.sleep (1000);
	}
	catch (InterruptedException e)
	{
	}
    }



    public Introduction (Console con)
    {
	c = con;
    }
}
