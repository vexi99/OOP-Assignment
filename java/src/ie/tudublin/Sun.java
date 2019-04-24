package ie.tudublin;

import processing.core.PApplet;

public class Sun extends PApplet
{
    UI ui;
    private float scWidth;
    private float scHeight;

    public Sun(UI ui, float scWidth, float scHeight)
    {
        //passing variables from UI.java
        this.ui = ui;
        this.scWidth = scWidth;
        this.scHeight = scHeight;
    }

    public void render()
    {
        //start of drawing of sun
        ui.fill(255, 0, 16);
        ui.noStroke();
        ui.circle(400,400,50);
    }
}


/*
/ "Sun" class which handles the drawing of the sun "TRAPPIST-1".
/ Which is at the center of the "Trappist-1" solar system which 
/ my project is based on.
*/