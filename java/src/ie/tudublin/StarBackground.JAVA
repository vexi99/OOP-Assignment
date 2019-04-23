package ie.tudublin;

import processing.core.PApplet;

public class StarBackground extends PApplet
{
    UI ui;
    
    public StarBackground(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        //creating background for map
        ui.background(0);
    }
}