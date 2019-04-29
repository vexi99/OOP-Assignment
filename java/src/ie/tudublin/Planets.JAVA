package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;
import processing.core.PVector;

public class Planets extends PApplet
{
    UI ui;
    private String name;
    private String habital;
    private float orbitPeriod;
    private float starDist;
    private float planetRadius;
    private float planetMass;
    private int i = 0;
    private float radius;
    private PVector pos;
    public float speed;
    private float theta = 0;
    public float time = 1.0f / 60.0f;
    private int r;
    private int g;
    private int b;
    
    public Planets(UI ui, float speed, float x, float y, float radius, int r, int g, int b, TableRow row)
    {
    
        //passing variables from UI.java
        this.ui = ui;
        this.speed = speed;
        pos = new PVector(x, y);
        this.radius = radius;
        this.r = r;
        this.g = g;
        this.b = b;
        name = row.getString("Name");
        habital = row.getString("Habital Zone");
        orbitPeriod = row.getFloat("Orbital Period");
        starDist = row.getFloat("Distance from Star");
        planetRadius = row.getFloat("Planet radius");
        planetMass = row.getFloat("Planet Mass");
    }

    public void render()
    {
        //start drawing the planets
        ui.noStroke();
        ui.fill(r, g, b);
        
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.circle(x2, y2, 20);
        ui.text(name,x2, (y2 + 20));
    }

    public void update()
    {
        theta += PApplet.TWO_PI * time / speed;
        /*controlling statement to limit speed of planets rotation without this, the planets speed
        / could infinitely increase causing bugs
        */
        if (speed > 13)
        {
            speed -= 0.2;
        }
    }

    //Setter/Getter functions
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHabital()
    {
        return habital;
    }

    public void setHabital(String habital)
    {
        this.habital = habital;
    }

    public float getOrbit()
    {
        return orbitPeriod;
    }

    public void setOrbit(float orbitPeriod)
    {
       this.orbitPeriod = orbitPeriod; 
    }

    public float getStarDist()
    {
        return starDist;
    }

    public void setStarDist(float starDist)
    {
        this.starDist = starDist;
    }

    public float getPlanetRadius()
    {
        return planetRadius;
    }

    public void setPlanetRadius(float planetRadius)
    {
        this.planetRadius = planetRadius;
    }

    public float getPlanetMass()
    {
        return planetMass;
    }

    public void setPlanetMass(float planetMass)
    {
        this.planetMass = planetMass;
    }
}