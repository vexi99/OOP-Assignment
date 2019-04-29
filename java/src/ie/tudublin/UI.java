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
    TableRow row;
    Table table;
    String namee;

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

        menu = new Menu(this, 800,800);

        planets1 = new Planets(this, 4, 400, 400, 55, 244, 151, 12, row);
        planets2 = new Planets(this, 5, 400, 400, 110, 216, 158, 71, row);
        planets3 = new Planets(this, 6, 400, 400, 165, 183, 145, 82, row);
        planets4 = new Planets(this, 7, 400, 400, 220, 219, 188, 142, row);
        planets5 = new Planets(this, 8, 400, 400, 275, 174, 193, 139, row);
        planets6 = new Planets(this, 9, 400, 400, 330, 147, 160, 122, row);
        planets7 = new Planets(this, 10, 400, 400, 385, 213, 219, 201, row);
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

        //setting Name of planets, encountered errors in doing so, this was was the only way which worked
        row = table.getRow(0);
        planets1.setName(row.getString("Name"));
        planets1.getName();

        row = table.getRow(1);
        planets2.setName(row.getString("Name"));
        planets2.getName();

        row = table.getRow(2);
        planets3.setName(row.getString("Name"));
        planets3.getName();

        row = table.getRow(3);
        planets4.setName(row.getString("Name"));
        planets4.getName();

        row = table.getRow(4);
        planets5.setName(row.getString("Name"));
        planets5.getName();

        row = table.getRow(5);
        planets6.setName(row.getString("Name"));
        planets6.getName();

        row = table.getRow(6);
        planets7.setName(row.getString("Name"));
        planets7.getName();
        
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
        table = loadTable("PlanetData.csv", "header");
        
        //print file data to output
        System.out.println("Printing of Stars Information: ");
        for (int i = 0; i<table.getRowCount(); i++) 
        {
            row = table.getRow(i);
            System.out.println(" ");
            System.out.println("Name: ");
            System.out.println(row.getString("Name"));
            System.out.println("Orbital Period: ");
            System.out.println(row.getFloat("Orbital Period"));
            System.out.println("Distance from Star: ");
            System.out.println(row.getFloat("Distance from Star"));
            System.out.println("Planet radius: ");
            System.out.println(row.getFloat("Planet radius"));
            System.out.println("Planet Mass: ");
            System.out.println(row.getFloat("Planet Mass"));
            System.out.println("Habital Zone? :");
            System.out.println(row.getString("Habital Zone"));
            System.out.println(" ");

            
        }
    }
}

/* "UI" class which handles the drawing of most of the main items within the assignment
*/

