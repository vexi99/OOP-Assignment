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
    Menu menu;
    Planets planets1;
    Planets planets2;
    Planets planets3;
    Planets planets4;
    Planets planets5;
    Planets planets6;
    Planets planets7;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = false;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }

    public void settings()
    {
        size(800, 800);
    }

    public void setup()
    {
        //read from a csv file
        readFile();
        
        //passing variables to classes
        sb = new StarBackground(this, 800, 800);

        sun = new Sun(this, 800, 800);

        menu = new Menu(this);

        planets1 = new Planets(this, 4, 400, 400, 55, 244, 151, 12);
        planets2 = new Planets(this, 5, 400, 400, 110, 216, 158, 71);
        planets3 = new Planets(this, 6, 400, 400, 165, 183, 145, 82);
        planets4 = new Planets(this, 7, 400, 400, 220, 219, 188, 142);
        planets5 = new Planets(this, 8, 400, 400, 275, 174, 193, 139);
        planets6 = new Planets(this, 9, 400, 400, 330, 147, 160, 122);
        planets7 = new Planets(this, 10, 400, 400, 385, 213, 219, 201);
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
        
        if (checkKey(LEFT))
        {
            System.out.println("Slowing down planets..");
            planets1.speed+= 0.1;
            planets2.speed+= 0.1;
            planets3.speed+= 0.1;
            planets4.speed+= 0.1;
            planets5.speed+= 0.1;
            planets6.speed+= 0.1;
            planets7.speed+= 0.1;   
        }

        if (checkKey(RIGHT))
        {
            System.out.println("Speeding up planets..");
            planets1.speed-=0.1;
            planets2.speed-=0.1;
            planets3.speed-=0.1;
            planets4.speed-=0.1;
            planets5.speed-=0.1;
            planets6.speed-=0.1;
            planets7.speed-=0.1;
        }

        if (checkKey(' '))
        {
            System.out.println("Setting planets to normal speed");
            planets1.speed=4;
            planets2.speed=5;
            planets3.speed=6;
            planets4.speed=7;
            planets5.speed=8;
            planets6.speed=9;
            planets7.speed=10;
        }

        if (checkKey(ENTER))
        {
            menu.render();
        }
    }

    public void readFile()
    {
        //read in file data
        Table table = loadTable("PlanetData.csv", "header");
    }

    public void printFile()
    {
        //print file data to output
        for (int i = 0; i<table.getRowCount(); i++) 
        {
            TableRow row = table.getRow(i);
            System.out.println(row.getString("Name"));
        }
    }

    ArrayList<Planets> planetList = new ArrayList<Planets>();
    
}

