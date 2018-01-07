/*
   Name: Alex Barkin
   Teacher: Ms. Dyke
   Date: Oct 20th 2014
   IntroductionPic.java is the file containing the class which draws the
	introduction picture of the lamborghini and the title Grand Theft Java.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class IntroductionPic
{
    private Console c;
    public void background ()
    {
	for (int i = 0 ; i < 640 ; i++)
	{
	    Color backGround = new Color (26 - i / 100, 235 - i / 6, 242 - i / 6);
	    c.setColor (backGround);
	    c.drawRect (0, 0, 640 - i, 500 - i / 2);
	}
    }


    public void title ()
    {
	Font text = new Font ("Magneto", 0, 70);
	Font java = new Font ("Harlow Solid Italic", Font.BOLD, 200);
	Font v = new Font ("Times New Roman", Font.BOLD, 200);
	Font name = new Font ("Monospaced", 0, 13);
	c.setColor (Color.black);
	c.setFont (text);
	c.drawString ("Grand Theft", 110, 60);
	c.setFont (java);
	c.drawString ("Java", 150, 200);
	c.setFont (v);
	c.drawString ("V", 490, 350);
	for (int i = 0 ; i < 120 ; i++)
	{
	    c.drawRect (493, 280, 115, 30 - i / 4);
	}
	c.setColor (Color.white);
	c.setFont (name);
	c.drawString ("By Alex Barkin", 493, 300);
    }


    public void car ()
    {
	Color windShield = new Color (32, 32, 46);
	Color trim = new Color (192, 192, 192);
	Color scallop = new Color (59, 162, 14);
	Color hood = new Color (103, 103, 103);
	for (int i = 0 ; i < 165 ; i++)
	{
	    c.setColor (windShield);
	    c.drawLine (112 + i, 341 + i / 33, 240 + i - 41, 275 + i / 33);
	}
	for (int i = 0 ; i < 34 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawLine (276, 345, 340, 330 - i);
	}
	for (int i = 0 ; i < 23 ; i++)
	{
	    c.setColor (windShield);
	    c.drawLine (340 + i, 299 - i - 1, 340 + i, 330 + i);
	}
	for (int i = 0 ; i < 120 ; i++)
	{
	    c.setColor (windShield);
	    c.drawLine (363 + i / 3, 278, 363 + i / 2, 352 - i / 4);
	    c.drawLine (120 - i / 6, 450 + i / 6, 60, 450 + i / 6);
	    c.drawLine (120 - i / 7, 450 - i / 4, 60, 450 - i / 4);
	    c.drawLine (100 + i / 6, 420 - i / 4, 200, 420 - i / 4);
	    c.setColor (Color.green);
	    c.drawLine (400 + i / 3, 278 - i / 40, 408 + i / 2, 298);
	    c.drawLine (410 + i / 3, 298 + i / 4, 466 + i / 4, 298 + i / 6);
	    c.drawLine (420 + i / 24, 320 + i / 6, 496, 318);
	    c.drawLine (425 + i / 24, 340 + i / 24, 496 + i / 24, 318 + i / 24);
	    c.drawLine (430 - i / 10, 345 - i / 10, 430 - i / 12, 410 + i / 24);
	    c.drawLine (365 + i / 2, 441 - i / 4, 364 + i / 2, 345 - i / 6);
	    c.drawLine (100 + i / 6, 470 - i / 6, 200, 470 - i / 6);
	    c.drawLine (100 + i / 6, 420 - i / 4, 60 + i / 12, 420 - i / 4);
	    c.setColor (hood);
	    c.drawLine (120 - i / 6, 450 - i / 4, 200, 450 - i / 4);
	    c.drawLine (240 + i / 6, 390 - i / 4, 70 + i / 12, 390 - i / 4);
	    c.drawLine (260 + i / 4, 360 - i / 8, 80 + i / 4, 360 - i / 6);
	    c.setColor (Color.black);
	    c.drawLine (417 + i / 4, 318, 407, 288);
	}
	for (int i = 0 ; i < 180 ; i++)
	{
	    c.setColor (Color.green);
	    c.drawLine (200 + i, 275 - i / 16, 345 + i / 2, 280 - i / 32);

	}
	for (int i = 0 ; i < 71 ; i++)
	{
	    c.setColor (Color.green);
	    c.drawLine (431, 346, 501, 324 + i / 3);
	    c.drawArc (431, 345, 70 - i, 70 - i, 90, 90);
	    c.drawArc (431, 345, 70, 70 - i, 0, 90);
	    c.drawArc (295, 405, 70 - i, 70 - i, 90, 90);
	    c.drawArc (295, 405, 70, 70 - i, 0, 90);
	    c.drawLine (295 - i, 470, 295, 400);
	    c.drawLine (295, 470, 295 - i, 400);
	    c.drawLine (365 - i / 3, 350 - i / 4, 365 - i / 3, 405);
	    c.drawLine (341 - i, 331 + i / 4, 341 - i, 405);
	    c.drawLine (270, 347, 270 - i, 410);
	    c.drawLine (200 + i / 2, 390 - i / 7, 200 + i / 3, 410);
	    c.setColor (trim);
	    c.drawOval (432 + i / 2, 348 + i / 2, 68 - i, 68 - i);
	    c.drawOval (296 + i / 2, 407 + i / 2, 68 - i, 68 - i);
	    c.setColor (windShield);
	    c.drawLine (235 + i / 3, 410 + i / 3, 235 + i / 3, 460 - i / 3);
	    c.drawLine (235 - i / 4, 410, 235 - i / 4, 460 + i / 6);
	    c.drawLine (218 - i / 4, 410, 218 - i / 4, 470);
	}
	c.setColor (Color.black);
	c.drawLine (424, 340, 421, 325);
	c.drawLine (425, 340, 496, 318);
	c.drawLine (430, 345, 501, 323);
	c.drawLine (496, 318, 501, 323);
	c.drawLine (496, 318, 440, 275);
	c.drawLine (440, 275, 345, 283);
	c.drawLine (378, 263, 440, 275);
	c.drawLine (378, 263, 200, 275);
	c.drawLine (502, 380, 502, 323);
	c.drawArc (431, 346, 70, 70, 0, 180);
	c.drawArc (295, 405, 70, 70, 0, 180);
	c.drawLine (431, 346, 431, 410);
	c.drawLine (431, 346, 426, 341);
	c.drawLine (341, 331, 341, 407);
	c.drawLine (365, 441, 431, 411);
	c.drawLine (365, 441, 365, 350);
	c.drawLine (295, 470, 295, 440);
	c.drawLine (295, 470, 60, 470);
	c.drawLine (60, 420, 79, 359);
	c.drawLine (113, 339, 80, 359);
	c.drawLine (155, 420, 155, 450);
	for (int i = 0 ; i < 21 ; i++)
	{
	    c.setColor (Color.black);
	    c.drawOval (460 + i / 4, 377 + i / 4, 10 - i / 2, 10 - i / 2);
	    c.drawOval (325 + i / 4, 437 + i / 4, 10 - i / 2, 10 - i / 2);
	    c.setColor (scallop);
	    c.drawLine (370, 360, 425, 340 + i);
	    c.drawLine (420, 400, 424 + i / 4, 340 + i / 4);
	    c.drawLine (410 + i / 3, 400, 405 + i, 360);
	    c.drawLine (420, 400 - i, 370, 410);
	}

	for (int i = 0 ; i < 130 ; i++)
	{
	    c.setColor (trim);
	    c.drawLine (210 + i / 4, 405, 210 + i / 2, 393 - i / 6);
	    c.drawLine (97 - i / 4, 405, 102 - i / 4, 390);
	}
	for (int i = 0 ; i < 41 ; i++)
	{
	    c.setColor (Color.green);
	    c.drawOval (357 + i / 4, 325 + i / 4, 10 - i / 2, 20 - i);
	    c.drawOval (358 + i / 4, 323 + i / 4, 30 - i, 15 - i);
	    c.setColor (Color.yellow);
	    c.drawOval (235 + i / 4, 388 + i / 4, 10 - i / 2, 10 - i);
	    c.drawOval (71 + i / 4, 391 + i / 4, 10 - i / 2, 10 - i);
	    c.drawOval (250 + i / 4, 383 + i / 4, 5 - i, 5 - i);
	    c.drawLine (225 + i / 6, 403, 220 + i / 6, 393);
	    c.drawLine (85 + i / 6, 403, 90 + i / 6, 393);
	}
	try
	{
	    Thread.sleep (3000);
	}
	catch (Exception ex)
	{
	}
    }



    public IntroductionPic (Console con)
    {
	c = con;
	background ();
	title ();
	car ();
    }
}
