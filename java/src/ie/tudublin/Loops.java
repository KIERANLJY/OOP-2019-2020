package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{	
	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		
	}

	
	public void keyPressed()
	{

	}	


	public void draw()
	{	
		background(0);
		
		stroke(255);
		line(10, 10, 100, 10);
		line(10, 20, 100, 20);
		line(10, 30, 100, 30);

		for(int y = 10; y <= 40; y += 10)
		{
			line(200, y, 300, y);
		}

		int yy = 10;
		while(yy < 50)
		{
			line(10, yy, 100, yy);
			yy += 10;
		}

		int i = 0;
		while(i < 10)
		{
			i ++;
		}

		for(int j = 0; j < 100; j ++)
		{

		}
	}
}
