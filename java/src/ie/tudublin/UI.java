package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    CenterCircle centerc;

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
        fullScreen(); 
    }

    public void setup()
    {
        float centerx = width / 2;
        float centery = height / 2;

        b = new Button(this, 50, 50, 100, 50, "I am a button");
        mc = new MovingCircle(this, centerx, height * .75f, 50);
        radar = new Radar(this, 1, centerx, centery, 100);
        centerc = new CenterCircle(this, 150, width / 2, height / 2, 199);
        topCenter_sc = new SemiCircle(this, 180, width / 2 , height / 2, 166);
        botCenter_sc = new SemiCircle(this, 180, width / 2, (height / 2 ) - 10, 166);
    }

    Radar radar;

    public void draw()
    {
        background(0);
        b.render();

        mc.update();
        mc.render();

        centerc.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

