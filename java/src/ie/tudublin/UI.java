package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
    CenterCircle centerc;
    SemiCircle topSc;
    SemiCircle botSc;

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
        b = new Button(this, 50, 50, 100, 50, "I am a button");
        centerc = new CenterCircle(this, 150, width / 2, height / 2, 199);
        topSc = new SemiCircle(this, 200, width / 2 , (height / 2) - 20, 176, PI, TWO_PI);
        botSc = new SemiCircle(this, 200, width / 2, (height / 2 ) + 20, 176, 0, PI);
    }

    Radar radar;

    public void draw()
    {
        background(0);
        b.render();

        centerc.render();

        topSc.render();
        botSc.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

