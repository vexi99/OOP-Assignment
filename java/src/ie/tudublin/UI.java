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
    Planets planets;
    Radar radar;

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        
        //passing variables to classes
        sb = new StarBackground(this, 800, 800);
        sun = new Sun(this, 800, 800);
        planets = new Planets(this, 1, 400, 400, 100);
        radar = new Radar(this, 1, 400,400,100);
        //read from csv file
        
    }

    public void draw()
    {
        sb.render();
        sun.render();
        planets.render();

        radar.update();
        radar.render();
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

