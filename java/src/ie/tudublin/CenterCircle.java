package ie.tudublin;

import processing.core.PApplet;

public class CenterCircle
{
    private float radius;
    private UI ui;
    private int x;
    private int y;
    private int h;

    public CenterCircle(UI ui, float radius, int x, int y, int h)
    {
        this.ui = ui;
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public void render()
    {
        int outline = h - 40;
        float expand = radius + 10;
        float inter = radius;

        if (ui.mouseX > x-radius && ui.mouseX < x+radius && ui.mouseY > y-radius && ui.mouseY < y+radius)
        {
            inter = PApplet.map(ui.mouseX, 0, radius, radius, expand);
        }
        ui.stroke(outline);
        ui.strokeWeight(20);
        ui.fill(h);
        ui.circle(x, y, inter); 
    }


}

