package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;
import processing.core.PVector;

public class UI extends PApplet
{
    StarBackground sb;
    Sun sun;
    Planets planets1;
    Planets planets2;
    Planets planets3;
    Planets planets4;
    Planets planets5;
    Planets planets6;
    Planets planets7;

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        
        //passing variables to classes
        sb = new StarBackground(this, 800, 800);
        sun = new Sun(this, 800, 800);
        planets1 = new Planets(this, 4, 400, 400, 55, 244, 151, 12);
        planets2 = new Planets(this, 5, 400, 400, 110, 216, 158, 71);
        planets3 = new Planets(this, 6, 400, 400, 165, 183, 145, 82);
        planets4 = new Planets(this, 7, 400, 400, 220, 219, 188, 142);
        planets5 = new Planets(this, 8, 400, 400, 275, 174, 193, 139);
        planets6 = new Planets(this, 9, 400, 400, 330, 147, 160, 122);
        planets7 = new Planets(this, 10, 400, 400, 385, 213, 219, 201);
        //read from csv file
        
    }

    public void draw()
    {
        sb.render();
        sun.render();
        planets1.render();
        planets1.update();
        planets2.render();
        planets2.update();
        planets3.render();
        planets3.update();
        planets4.render();
        planets4.update();
        planets5.render();
        planets5.update();
        planets6.render();
        planets6.update();
        planets7.render();
        planets7.update();
    }

    /*public void readFile()
    {
        Table table = loadTable("PlanetData.csv", "header");

        for (TableRow tr : table.rows()) {
            Planets planets = new Planets(tr);
            planetList.add(planets);
        }
    }

    public void printFile()
    {
        for (Planets planets: planetList)
        {
            System.out.println(planetList);
        }
    }

    ArrayList<Planets> planetList = new ArrayList<Planets>();
    */
}

