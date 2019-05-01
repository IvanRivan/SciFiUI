package ie.tudublin;

import processing.core.PApplet;

public class SemiCircle
{
    private float radius;
    private UI ui;
    private int x;
    private int y;
    private int h;
    private float start;
    private float stop;

    public SemiCircle(UI ui, float radius, int x, int y, int h, float start, float stop)
    {
        this.ui = ui;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.h = h;
        this.start = start;
        this.stop = stop;
    }

    public void render()
    {
        
        float expand = radius + 10;
        float inter = radius;

        if (ui.mouseX > x-radius && ui.mouseX < x+radius && ui.mouseY > y-radius && ui.mouseY < y+radius)
        {
            inter = PApplet.map(ui.mouseX, 0, radius, radius, expand);
        }
        ui.stroke(h);
        ui.strokeWeight(10);
        ui.noFill();
        ui.arc(x, y, inter, inter, start, stop); 
    }


}