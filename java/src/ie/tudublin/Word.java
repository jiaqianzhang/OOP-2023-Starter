package ie.tudublin;

import java.util.ArrayList;

public class Word
{
    ArrayList<Follow> follows; //array list called follow
    private String word; // string for word


    public Word(String word)
    {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public String getWord() {
        return word;
    }


    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public String toString() 
    {
        String result = "Word: " + word + ", Follows: ";
        for (Follow follow : follows)// for loop
        {
            result += follow.toString() + " ";
        }
        return result;
    }

}


// write me a java file called DANI.java. DANI is an AI capable of many tasks, such as writing Poetry. DANI works, by loading a text document and storing a list of each word from the document in an ArrayList along with an ArrayList of what words follow the word. Each word is listed once in the model, regardless of how many times it occurs in the document. Each word is printed and all of the words that follow the word in the text with a count of how many times it follows the word are listed. To write a poem, DANI picks one word at random from the model and starts with that. Then DANI looks to see what possible words will follow the chosen word and it picks one at random from the list for the next word. It then repeats the process until it has 8 words, or until it finds a word that has nothing following it - in which case it will terminate the sentence. It does this 14 times to write a poem as there are 14 lines in a sonnet. DANI prints the generated sonnet to the Processing window. Pressing SPACE will generate a new sonnet
