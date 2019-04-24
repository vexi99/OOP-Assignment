package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    StarBackground sb;
    Sun sun;

    
    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        //passing variables to classes
        sb = new StarBackground(this, 800, 800);
        sun = new Sun(this, 800, 800);
    }


    public void draw()
    {
        //background(0);
        sb.render();
        sun.render();
        
    }
}

