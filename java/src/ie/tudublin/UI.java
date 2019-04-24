package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    StarBackground sb;
    
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        sb = new StarBackground(this, 800, 800);
    }


    public void draw()
    {
        //background(0);
        sb.render();
        
    }
}

