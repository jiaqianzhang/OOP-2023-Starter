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

	public void loadFile()
	{
		String[] lines = loadStrings("small.txt"); // Load the text file into a String array
        for (String line : lines)
		{
            String[] words = split(line, ' '); // Split the line into an array of words
            for (String word : words)
			{
                word = word.replaceAll("[^\\w\\s]", ""); // Remove punctuation characters
                word = word.toLowerCase(); // Convert the word to lower case

                // Check if the word already exists in the model
                Word existingWord = findWord(word);
                if (existingWord == null)
				{
                    // If the word does not exist, add it to the model
                    Word newWord = new Word(word);
                    model.add(newWord);
                }
            }
        }
	}

	public Word findWord(String word)
	{
		for(Word w : model)
		{
			if (w.getWord().equals(word))
			{
				return w;
			}
		}

	}

	public void printModel()
	{

	}



}
