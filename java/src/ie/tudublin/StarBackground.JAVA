package ie.tudublin;

import processing.core.PApplet;

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
                ui.stroke(241, 244, 66);
                ui.point(i, j);
            }
        }
        
    }
}