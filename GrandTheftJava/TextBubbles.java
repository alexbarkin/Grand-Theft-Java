/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   TextBubbles.java is the file containing the class which draws the text
	bubbles for all the characters in MyCreation. This is used so the
	characters can communicate.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class TextBubbles
{
    private Console c;

    public void textOutput (int lines, int car, int words)
    {
	Color hills = new Color (160, 82, 45);
	Font talk = new Font ("Chiller", 0, 12);
	c.setColor (Color.white);
	int y = 0;
	int x = 1;
	if (car == 2)
	{
	    y = 239;
	}
	else if (car == 1)
	{
	    y = 225;
	}
	else if (car == 3)
	{
	    y = 205;
	    x = 100;
	}
	else if (car == 4)
	{
	    y = 239;
	    x = 50;
	}
	else if (car == 5)
	{
	    y = 239;
	    x = 10;
	}
	for (int i = 0 ; i < 200 ; i++)
	{
	    c.drawRoundRect (170 + 2 * x, y, x + 100 - i, lines * 20, 10, 10);
	}
	c.setFont (talk);
	c.setColor (Color.black);
	if (words == 1)
	{
	    c.drawString ("Buggatti-", 180, 240);
	    c.drawString ("Where's the", 180, 255);
	    c.drawString ("source code?", 180, 270);
	    try
	    {
		Thread.sleep (2000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	else if (words == 2)
	{
	    c.drawString ("Harley Davidson-", 180, 255);
	    c.drawString ("Even if I had it,", 180, 270);
	    c.drawString ("I'd never give it", 180, 285);
	    c.drawString ("to you!", 180, 300);
	    try
	    {
		Thread.sleep (3000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	else if (words == 3)
	{
	    c.drawString ("Truck- Hey! Move it! It's no stopping!", 375, 220);
	    try
	    {
		Thread.sleep (3000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	if (words == 4)
	{
	    c.drawString ("Buggatti-", 180, 240);
	    c.drawString ("Get back here!", 180, 255);
	    try
	    {
		Thread.sleep (1000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	if (words == 5)
	{
	    c.drawString ("Buggatti-", 280, 255);
	    c.drawString ("Why must chicken", 280, 275);
	    c.drawString ("cross roads?", 280, 295);
	    try
	    {
		Thread.sleep (4000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	if (words == 6)
	{
	    c.drawString ("Chicken-", 190, 255);
	    c.drawString ("Why are our", 190, 275);
	    c.drawString ("motives always", 190, 295);
	    c.drawString ("being questioned?", 190, 315);
	    try
	    {
		Thread.sleep (4000);
	    }
	    catch (Exception ex)
	    {
	    }
	}
	if (words == 5 || words == 6)
	{
	    c.setColor (hills);
	}
	for (int i = 0 ; i < 200 ; i++)
	{
	    c.drawRoundRect (170 + 2 * x, y, x + 100 - i, lines * 20, 10, 10);
	}
    }


    public TextBubbles (Console con)
    {
	c = con;
    }
}


