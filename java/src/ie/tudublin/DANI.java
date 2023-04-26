package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet{

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

    String[] sonnet;
	ArrayList<Word> model = new ArrayList<Word>(); // array list for words called model

    public String[] writeSonnet()
    {

    }


	public void setup() {
		colorMode(HSB);
		loadFile("shakespere.txt");
	}

	public void keyPressed() {

		if (keyCode == ' ')
		{
			sonnet = writeSonnet(); // generate a new sonnet and store it in
			println("Generated Sonnet:");
			for (String line : sonnet)
			{
				println(line); // print the sonnet to the console
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

		if (sonnet != null) // check if sonnet is generated
		{ 
			for (int i = 0; i < sonnet.length; i++)
			{
				text(sonnet[i], width / 2, (i + 1) * height / 16); // display each line of sonnet on screen
			}
		}
	}

	public void loadFile(String filename)
	{
		String[] lines = loadStrings(filename); // Load the text file into a String array
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

	public void findWord(String word)
	{

	}

	
}
