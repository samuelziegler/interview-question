import java.util.Arraylist;
import java.util.Random;

public class Deck
{
    private int x;
    private int value;
    private int randomnumber;
    private int high;
    private int low;
    
    public Deck()
    {
        ArrayList deck = new ArrayList(51);
        x = 1;
        for (int i=0;i<52;i++)
        {
            deck.add(x);
            x++;
        }
    }
    
    public shuffleddeck()
    {
        ArrayList shuffleddeck = new ArrayList(51);
    }
    
    public void Shuffle()
    {
        if (deck.size()>0)
        {
            low = 0;
            high = deck.size();
            int randomnumber = (int)(Math.random()*(high-low))+low;
            shuffleddeck.add(randomnumber);
        }
    }
    System.out.print("The deck is shuffled!");
}