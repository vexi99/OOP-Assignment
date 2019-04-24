package ie.tudublin;

import processing.core.PApplet;
import java.util.Random;

public class StarBackground extends PApplet
{
    UI ui;
    
    public StarBackground(UI ui)
    {
        this.ui = ui;
    }

    public static float randomFloat()
    {
        Random random = new Random();
        float answer = rand.next
    }

    public void render()
    {
        //creating background for map
        ui.background(0);
        Random r = new Random();
        System.out.println(r);
    }
}