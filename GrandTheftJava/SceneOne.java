/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   SceneOne.java is the file containing the class which draws the background for
	the first scene of MyCreation. The scene is an urban setting with
	buildings and parks. This is at an intersection.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class SceneOne
{
    private Console c;

    public void backgroundScene ()
    {
	c.clear ();
	Font nike = new Font ("Monospaced", 0, 50);
	Font logos = new Font ("Serif", Font.ITALIC, 30);
	Color tree = new Color (0, 156, 0);
	Color bench = new Color (200, 200, 200);
	Color buildingOne = new Color (70, 70, 70);
	Color buildingTwo = new Color (110, 110, 110);
	c.setColor (Color.green);
	for (int i = 0 ; i < 180 ; i++)
	{
	    c.drawRect (0, 0, 220, 180 - i);
	    c.drawRect (420, 340, 220, 180 - i);
	}
	for (int i = 0 ; i < 35 ; i++)
	{

	    c.setColor (tree);
	    //tree 1
	    c.drawOval (120 + i / 2, 100 + i / 2, 30 - i, 30 - i);
	    c.drawOval (110 + i / 2, 100 + i / 2, 20 - i, 20 - i);
	    c.drawOval (140 + i / 2, 100 + i / 2, 20 - i, 20 - i);
	    c.drawOval (108 + i / 2, 120 + i / 2, 20 - i, 20 - i);
	    c.drawOval (108 + i / 2, 110 + i / 2, 20 - i, 20 - i);
	    c.drawOval (118 + i / 2, 120 + i / 2, 20 - i, 20 - i);
	    c.drawOval (128 + i / 2, 120 + i / 2, 20 - i, 20 - i);
	    c.drawOval (141 + i / 2, 110 + i / 2, 20 - i, 20 - i);
	    c.drawOval (141 + i / 2, 120 + i / 2, 20 - i, 20 - i);
	    //tree 2
	    c.drawOval (150 + i / 2, 30 + i / 2, 20 - i, 20 - i);
	    c.drawOval (140 + i / 2, 30 + i / 2, 25 - i, 25 - i);
	    c.drawOval (150 + i / 2, 45 + i / 2, 20 - i, 20 - i);
	    c.drawOval (138 + i / 2, 50 + i / 2, 20 - i, 25 - i);
	    c.drawOval (138 + i / 2, 40 + i / 2, 20 - i, 25 - i);
	    c.drawOval (148 + i / 2, 50 + i / 2, 20 - i, 25 - i);
	    //forest
	    c.drawOval (460 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (480 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (500 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (520 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (540 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (560 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (580 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (600 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (620 + i / 2, 380 + i / 2, 30 - i, 30 - i);
	    c.drawOval (460 + i / 2, 400 + i / 2, 30 - i, 30 - i);
	    c.drawOval (460 + i / 2, 420 + i / 2, 30 - i, 30 - i);
	    c.drawOval (460 + i / 2, 440 + i / 2, 30 - i, 30 - i);
	    c.drawOval (460 + i / 2, 460 + i / 2, 30 - i, 30 - i);
	    c.drawOval (460 + i / 2, 480 + i / 2, 30 - i, 30 - i);
	    //benchs
	    c.setColor (bench);
	    c.drawRect (190, 20, 15, 30 - i);
	    c.drawRect (70, 30, 10 - i / 3, 50);
	    c.drawRect (110, 30, 10 - i / 3, 50);
	    c.drawRect (87, 35, 15 - i / 2, 40);
	    c.setColor (Color.black);
	    c.drawRect (190, 16, 15 - i / 2, 5);
	    c.drawRect (190, 45, 15 - i / 2, 5);
	    c.drawRect (203, 16, 3, 34 - i);
	    c.drawLine (81 + i / 6, 30 + i / 6, 81 + i / 6, 80 - i / 6);
	    c.drawLine (104 + i / 6, 35 - i / 6, 104 + i / 6, 75 + i / 6);
	}
	for (int i = 0 ; i < 120 ; i++)
	{
	    //forest
	    c.setColor (tree);
	    c.drawRect (480, 400, 160, 100 - i);
	    //sidewalks
	    c.setColor (Color.gray);
	    c.drawRect (0, 320, 240, 20 - i / 6);
	    c.drawRect (220, 340, 20 - i / 6, 160);
	    c.drawRect (0, 180, 240, 20 - i / 6);
	    c.drawRect (220, 0, 20 - i / 6, 180);
	    c.drawRect (400, 180, 240, 20 - i / 6);
	    c.drawRect (400, 0, 20 - i / 6, 180);
	    c.drawRect (400, 320, 240, 20 - i / 6);
	    c.drawRect (400, 340, 20 - i / 6, 180);
	    //road
	    c.setColor (Color.black);
	    c.drawRect (0, 200, 640, 120 - i);
	    Color umbrella = new Color (10 + i, 255 - i, 100 + i);
	    c.setColor (umbrella);
	    c.drawRect (20 + i / 6, 80 + i / 6, 40 - i / 3, 40 - i / 3);
	}
	for (int i = 0 ; i < 160 ; i++)
	{
	    //building 1
	    c.setColor (Color.gray);
	    c.drawRect (200, 340, 20, 20 - i);
	    c.setColor (buildingOne);
	    c.drawRect (0, 340, 180, 160 - i);
	    c.drawArc (178, 340, 40 - i / 4, 40, 0, 90);
	    c.drawRect (180, 360, 40, 140 - i);
	    c.setColor (bench);
	    c.drawRect (0, 360, 180, 140 - i);
	    c.drawArc (160, 360, 40 - i / 4, 40, 0, 90);
	    c.drawRect (180, 380, 20, 160 - i);
	    //street
	    c.setColor (Color.black);
	    c.drawRect (240, 0, 160 - i, 500);
	}
	c.setColor (bench);
	for (int i = 0 ; i < 43 ; i++)
	{
	    c.drawArc (160, 360, 40 - i, 40, 0, 90);
	}
	c.setColor (Color.black);
	for (int x = 0 ; x < 191 ; x += 10)
	{
	    //Building 1 lines
	    c.drawLine (0 + x, 359, 0 + x, 340);
	}
	for (int x = 0 ; x < 131 ; x += 10)
	{
	    c.drawLine (201, 500 - x, 220, 500 - x);
	}
	c.drawArc (165, 345, 50, 50, 0, 90);
	c.drawArc (170, 350, 40, 40, 0, 90);
	for (int i = 0 ; i < 180 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawLine (500 + i / 20, 180 - i / 9, 520 + i / 20, 180 - i / 9);
	    c.drawLine (620 + i / 20, 180 - i / 9, 640 + i / 20, 180 - i / 9);
	    c.setColor (buildingTwo);
	    c.drawRect (420, 0, 220, 180 - i);
	}
	c.setColor (Color.black);
	c.drawLine (420, 180, 480, 60);
	c.drawLine (620, 60, 620, 0);
	c.drawLine (620, 60, 580, 180);
	c.drawRect (480, 0, 159, 60);
	c.setFont (nike);
	c.drawString ("Nike", 480, 95);
	c.setFont (logos);
	c.drawString ("Just Do It", 470, 125);
	c.drawString ("Pe", 610, 115);
	c.drawString ("Sa", 620, 145);
	try
	{
	    Thread.sleep (1500);
	}
	catch (Exception ex)
	{
	}
    }


    public SceneOne (Console con)
    {
	c = con;
	backgroundScene ();
    }
}
