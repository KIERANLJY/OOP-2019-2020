package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
    float playerX;
    float playerY;
    float playerWidth;
    float bugX;
    float bugY;
    float bugWidth;

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        playerX = width/2;
        playerY = height-20;
        playerWidth = 50;
        bugX = width/2;
        bugY = 10;
        bugWidth = 10;
    }

    public void drawPlayer(float x, float y, float w)
    {
        stroke(255);
        fill(0);
        rect(x-w/2, y-10, w, 20, 10, 10, 0, 0);
        stroke(255);
        line(x, y-10, x, y-15);
    }

    public void drawBug(float x, float y, float r)
    {
        fill(255);
        ellipse(x, y, r, 2*r);
    }

    public void draw()
    {
        background(0);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX, bugY, bugWidth);
        if ((frameCount % 60) == 0)
        {
            bugMove();
        }
    }

    public void keyPressed()
	{
		if (keyCode == LEFT)
		{
            if (playerX > playerWidth/2)
            {
                playerX --;
            }
		}
		if (keyCode == RIGHT)
		{
            if (playerX < 500-playerWidth/2)
            {
                playerX ++;
            }
		}
		if (key == ' ')
		{
            stroke(255);
            line(playerX, playerY-10, playerX, 0);
        } 
    }

    public void bugMove()
    {
        bugX = bugX + random(-30, 30);
        bugY = bugY + 10;
    }
}