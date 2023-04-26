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
		String[] sonnet = new String[14]; // array for 14 lines of sonnett
		
		for(int i = 0; i < 14; i++)
		{
			String line = " "; // empty line for each iteration
			Word word = model.get((int) random(model.size())); // get a random word to start
	
			for (int j = 0; j < 8; j ++)
			{
				line += word.getWord() + " "; // append the word to the line
				ArrayList<Follow> follows = word.getFollows(); // get all the follows
	
				if (follows.size()> 0)
				{
					int randomIndex = (int) random(follows.size()); // choose a random follow word if the word has follows 
					String followWord = follows.get(randomIndex).getWord();
					for (Word w : model)
					{
						if (w.getWord().equals(followWord))
						{
							word = w;
							break;
						}
					}
				}
				else
				{
					break; // if the word has no follows then the sentence is finsihe
				}
			}
			sonnet[i] = line.trim(); // stores the line in the sonnet array
		}
		return sonnet;
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
		String[] lines = loadStrings(filename); // load the text file into a String array
        for (String line : lines)
		{
            String[] words = split(line, ' '); // split the line into an array of words
            for (String word : words)
			{
                word = word.replaceAll("[^\\w\\s]", ""); // remove punctuation characters
                word = word.toLowerCase(); // convert to lower case

                Word existingWord = findWord(word);// check if the word already exists in the model
                if (existingWord == null)
				{
                    Word newWord = new Word(word);// if the word does not exist, add it to the model
                    model.add(newWord);
                }
            }
        }
	}

	public Word findWord(String word)
	{
		for(Word w : model) // iterate each word in model
		{
			if (w.getWord().equals(word))// euqla() to compare word with word objects
			{
				return w; // return word object
			}
		}
		return null; // or null
	}

	public void printModel()
	{
		for (Word word : model)
		{
			System.out.print(word.getWord() + ": "); // prints each owrd
			ArrayList<Follow> follows = word.getFollows();
			for (Follow follow : follows)// iterlate through follows
			{
				System.out.print(follow.getWord() + "(" + follow.getCount() + ") "); // print word and count
			}
			System.out.println();
		}
	}
}