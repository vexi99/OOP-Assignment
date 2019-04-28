package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;
import processing.core.PVector;

public class Planets2 extends PApplet
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
    private float frequency;
    private float theta = 0;
    public float timeDelta = 1.0f / 60.0f;
    
    public Planets2(UI ui, float frequency, float x, float y, float radius)
    {
    
        //passing variables from UI.java
        this.ui = ui;
        this.frequency = frequency;
        pos = new PVector(x, y);
        this.radius = radius;
        /*
        name = row.getString("Name");
        habital = row.getString("Habital Zone");
        orbitPeriod = row.getFloat("Orbital Period");
        starDist = row.getFloat("Distance from Star");
        planetRadius = row.getFloat("Planet radius");
        planetMass = row.getFloat("Planet Mass");*/
    }

    public void render()
    {
        //start by drawing the circles which show planets orbit around the sun.
        ui.noFill();
        ui.stroke(255);
        
        
        //Loop for drawing of all orbits 
        for (int i=110; i<780;i=i+110)
        {
            ui.circle(400,400,i);
        }
        
        //start drawing the planets
        ui.noStroke();
        ui.fill(165, 126, 87);
        
        float x2 = pos.x + (float) Math.sin(theta) * radius;
        float y2 = pos.y - (float) Math.cos(theta) * radius;
        ui.circle(x2, y2, 20);

    }

    public void update()
    {
        //pos.x++;
        theta += PApplet.TWO_PI * timeDelta * 0.5;
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