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

    // accessor method
    public String getWord() {
        return word;
    }


    public ArrayList<Follow> getFollows() {
        return follows;
    }

    // return string of word
    public String toString() 
    {
        String result = "Word: " + word + ", Follows: ";
        for (Follow follow : follows)// iterate through follow to return string of wrd
        {
            result += follow.toString() + " ";
        }
        return result;
    }

    public Follow findFollow(String word)
    {
        for (Follow follow : follows) // iterate through follow
        {
            if (follow.getWord().equals(word)) // find follow with same word
            {
                return follow; // return follow
            }
        }
        return null; // or null
    }

}
