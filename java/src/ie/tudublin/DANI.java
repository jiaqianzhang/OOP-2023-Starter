package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet{

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }


	public void setup() {
		colorMode(HSB);
		loadFile("small.txt");
	}

	public void keyPressed() {
		if (keyCode == ' ')
		{
            if ()
			{
            } 
			else 
			{
            }
        }

	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}


}
