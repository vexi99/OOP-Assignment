package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;

public class StarBackground extends PApplet
{
    UI ui;
    private float screenWidth;
    private float screenHeight;
    
    public StarBackground(UI ui, float screenWidth, float screenHeight)
    {
        this.ui = ui;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
    }

    public void render()
    {
        //creating background for map
        ui.background(0);
        
        //creating stars to populate background
        for (int i = 0; i < screenWidth; i=i + 50)
        {
            for (int j = 40; j < screenHeight; j=j+70)
            {
                //star Colour
                ui.stroke(241, 244, 66);
                //Star locations drawn using a for loop
                ui.point(i, j);
            }
        }

        //start by drawing the circles which show the planets orbit around the sun.
        ui.noFill();
        ui.stroke(255);
        
        
        //Loop for drawing of all orbits increments by 110 which is the diameter of the circles.
        for (int i=110; i<780;i=i+110)
        {
            ui.circle(400,400,i);
        }

        ui.textSize(10);
        ui.fill(255);
        ui.textAlign(CENTER);
        ui.text("Hold Enter for info", 45, 15);
        
    }
}