package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    
    
    public void settings()
    {
        size(800, 800);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
       
    }


    public void draw()
    {
        background(0);
        b.render();

        mc.update();
        mc.render();

        asdf.update();
        asdf.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");

            asdf.x--;
        }

        if (checkKey(RIGHT))
        {
            System.out.println("Right arrow key pressed");

            asdf.x++;
        }

        if (checkKey(UP))
        {
            System.out.println("Up arrow key pressed");

            asdf.y--;

        }

        if (checkKey(DOWN))
        {
            System.out.println("Down arrow key pressed");

            asdf.y++;
        }
    }
}

