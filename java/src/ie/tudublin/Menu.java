package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;
import processing.core.PVector;

public class Menu extends PApplet
{
    UI ui;
    public Menu(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        ui.background(225);
    }
}