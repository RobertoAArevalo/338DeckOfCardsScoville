// Richard Garcia 
//Module 3: Deck Of Cards (Group Project)
//03/17/2022
import java.util.*;
import java.lang.Math;
public class DecksOfCards
{
    public static void main(String[] args)
    {
        Card card1 = new Card();
        Card card2 = new Card('7',Card.Suit.HEARTS);
    }
   
}
class Card
{
  //String str = "A","2","3","4","5","6","7","8","9","10",
    public enum Suit
    {
        //clubs, diamonds, hearts, spades;
        //private char value;
        //private Suit suit;
        SPADES, HEARTS, DIAMONDS, CLUBS;
        
    }
    
    //private static final int MIN_RANK = 1;
    //private static final int MAX_RANK = 13;
    
    private char value;
    private Suit suit;
    private boolean cardError;
    
    public Card(char value, Suit suit) 
    {
        set(value,suit);
    }
    public Card()//default constructor
    {
        set('A',Suit.SPADES);       
    }
    public Card(Card origCard)
    {
        set(origCard.value,origCard.suit);
    }
    public String toString()
    {
        if(cardError == true)
        {
           return "** illegal **";
        }
        else
           return suit + " " + value;//
        
    }
    public boolean set(char value, Suit suit)//mutator
    {
       if (isValid(value,suit) == true)
       { 
           this.value = value;
           this.suit = suit;
           cardError = true;
           return true;
       }
       cardError = false;
       return false;
    }
    public char getValue()//accessors
    {
       return value;
    }
    /*public char setValue(char value)//mutators(setters)
    {
       this.value = value;
    }*/

    public Suit getSuit()
    {
       return suit;
    }
    public boolean cardError()
    {
        return cardError;
    }
    /*public boolean setSuit(Suit suit)//mutators(setters)
    {
       this.suit = suit;
    }*/

    public boolean equals(Card otherCard)
    {
        if(suit == otherCard.getSuit() && value == otherCard.getValue() && 
                cardError == otherCard.cardError() )
            return true;
        return false;
    }
    private boolean isValid(char value,Suit suit)
    {
       if ((value == '2') || (value == '3') || (value == '4') || (value == '5')
          || (value == '6') || (value == '7') || (value == '8') ||
          (value == '9') || (value == 'T') || (value == 'J') || (value == 'Q')
          || (value == 'K') || (value == 'A'))
       {
          return true;
       }
       else
       {
          return false;
       }

    }
    
}
class Hand//going to contain outputs
{
    
}
class Deck//going to contain outputs
{
    public static final int MAX_CARDS = 312;
    private static Card [] masterPack = new Card [52];
    
    private static Card [] cards;
    private static int topCard;
    
    public Deck(int numPacks) 
    {
        allocateMasterPack();
    }
    public Deck()
    {
        // numpacks1
    }
    public void init(int numPacks) 
    {
        
    }
    public void shuffle()
    {
        int i = 0;
        Random pullcard = new Random();
        for (i = cards.length - 1; i > 0; i--)
        {
           int j = pullcard.nextInt(i+1);
           Card temp = cards[i];
           cards[j] = cards[i];
           cards[i] = temp;
           //Card[] newCards = new Card[i];
        }
        
    }
    public Card dealCard() 
    {
        
    }
    public int getTopCard()
    {
       return topCard;
    }
    public Card inspectCard(int k) 
    {
        
    }
    private static void allocateMasterPack()
    {
       // if masterPack is empty build it
       // not empty do nothing
       // 2 nested loops to build the deck
       //loop for char value & loop for Suit suit

    }
}

