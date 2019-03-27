import processing.core.PApplet;
import processing.core.PVector;

public class Assignment extends PApplet {

    private void drawGrid() {
        textAlign(CENTER, CENTER);
        for (int i = -5; i <= 5; i++) {
            float x = map(i, -5, 5, border, width - border);
            stroke(0, 0, 255);
            line(x, border, x, height - border);
            fill(255);
            text(i, x, border / 2);
            stroke(0, 0, 255);
            line(border, x, width - border, x);
            fill(255);
            text(i, border / 2, x);
        }
    }

    private void draw() {
        background(0);
        drawGrid(); 
    }
    
    
}



