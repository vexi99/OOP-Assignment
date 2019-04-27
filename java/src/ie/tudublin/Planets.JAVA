package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;
import java.util.ArrayList;

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

    public Planets(UI ui)
    {
    
        //passing variables from UI.java
        this.ui = ui;
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
        
        for (int i=55;i<400;i=i+55)
        {
            ui.circle(400,(400+i),20);
            /*This loop works by incrementing the Y co-ord by 55, which is 
            / the radius of the circle used to draw the orbit lines.
            */
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