package ie.tudublin;

public class Follow
{      
    private String word; // string for words
    private int count; // int for counting
    
    public Follow(String word, int count)
    {
        this.word = word;
        this.count = count;

    }

    // accessor methods
    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    // print word and count
    public String toString()
    {
        return word + " : " + "( " + count + " )";
    }


}
