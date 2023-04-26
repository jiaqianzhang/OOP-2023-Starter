package ie.tudublin;

public class Follow
{      
    private String word;
    private int count;
    
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

    public String toString()
    {
        return word + " : " + "( " + count + " )";
    }
}
