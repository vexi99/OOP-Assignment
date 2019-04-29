package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;
import processing.core.PVector;

public class Menu extends PApplet
{
    UI ui;
    private float scHeight;
    private float scWidth;
    public Menu(UI ui, float scHeight, float scWidth)
    {
        this.ui = ui;
        this.scHeight = scHeight;
        this.scWidth = scWidth;
    }

    public void render()
    {
        ui.background(0);
        ui.fill(255);
        ui.textAlign(CENTER);
        ui.textSize(37);
        ui.text("Hello this is help the menu", scHeight/2,100);
        ui.text("Left Arrow Key Slows Down The Planets", scHeight/2, 200);
        ui.text("Right Arrow Key Speeds Up The Planets", scHeight/2, 300);
        ui.text("Space Bar Normalises Planet's Speed", scHeight/2, 400);
        ui.text("-------------------------------------------------------------------------", scHeight/2, 450);
        ui.text("TRAPPIST-1 is a miniscule solar system", scHeight/2, 500);
        ui.text("In which the planets orbit a dwarf star", scHeight/2, 600);
        ui.text("3 planets are in the habital zone for humans", scHeight/2, 700);

    }
}