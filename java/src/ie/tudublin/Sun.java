package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;

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
        ui.circle(scWidth/2, scHeight/2, 50);
        ui.textAlign(CENTER);
        ui.textSize(10);
        ui.text("TRAPPIST-1", scWidth/2, scHeight/2 - 30);
    }
}


/*
/ "Sun" class which handles the drawing of the sun "TRAPPIST-1".
/ Which is at the center of the "Trappist-1" solar system which 
/ my project is based on.
*/