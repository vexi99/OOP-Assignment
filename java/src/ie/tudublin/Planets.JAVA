package ie.tudublin;

import processing.core.PApplet;

public class Planets extends PApplet
{
    UI ui;
    private float scWidth;
    private float scHeight;
    private int i = 0;

    public Planets(UI ui, float scWidth, float scHeight)
    {
        //passing variables from UI.java
        this.ui = ui;
        this.scWidth = scWidth;
        this.scHeight = scHeight;
    }

    public void render()
    {
        //start by drawing the circles which show planets orbit around the sun.
        ui.noFill();
        ui.stroke(255);
        
        //Loop for drawing of all orbits 
        for (int i=100; i<780;i=i+110)
        {
            ui.circle(400,400,i);
        }
        

    }


}