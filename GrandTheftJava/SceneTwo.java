/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   SceneTwo.java is the file containing the class which draws the background
	of the second scene of MyCreation. This scene is a desert road with
	rolling hills.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class SceneTwo
{
    private Console c;

    public void backgroundSceneTwo ()
    {
	Color hills = new Color (160, 82, 45);
	Color sky = new Color (0, 135, 255);
	Color cactus = new Color (0, 85, 0);
	Color road = new Color (60, 60, 60);
	for (int i = 0 ; i < 640 ; i++)
	{
	    c.setColor (sky);
	    c.drawLine (0 + i, 0, 0 + i, 260);
	    c.setColor (road);
	    c.drawLine (0 + i, 320, 0 + i, 500);
	    c.setColor (hills);
	    c.drawLine (0 + i, 220, 0 + i, 320);
	    c.setColor (Color.yellow);
	    c.drawLine (0, 440, 640, 440);
	}
	c.setColor (hills);
	for (int i = 0 ; i < 300 ; i++)
	{
	    c.drawArc (-20 + i / 2, 140 + i / 2, 300 - i, 240 - i, 0, 180);
	    c.drawArc (200 + i / 2, 140 + i / 2, 360 - i, 200 - i, 0, 180);
	    c.drawArc (500 + i / 2, 140 + i / 2, 200 - i, 200 - i, 0, 180);
	}
	c.setColor (Color.yellow);
	for (int i = 0 ; i < 220 ; i++)
	{
	    c.drawArc (540 + i / 2, -120 + i / 2, 220 - i, 220 - i, 180, 90);
	}
	c.setColor (cactus);
	c.drawArc (160, 140, 40, 40, 0, 90);
	c.drawArc (200, 140, 40, 40, 90, 90);
	c.drawLine (200, 160, 200, 140);
	c.drawArc (350, 130, 40, 40, 0, 90);
	c.drawArc (390, 130, 40, 40, 90, 90);
	c.drawLine (390, 150, 390, 130);
	c.drawArc (550, 120, 40, 40, 0, 90);
	c.drawArc (590, 120, 40, 40, 90, 90);
	c.drawLine (590, 140, 590, 120);
    }


    public SceneTwo (Console con)
    {
	c = con;
	backgroundSceneTwo ();
    }
}
