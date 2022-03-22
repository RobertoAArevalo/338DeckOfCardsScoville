/*
Write a Java program: Deck of Cards
March 23, 2022
@author Roberto Arevalo
@author Ali Bakr
@author David Delacalzada
@author Richard Garcia
@version 1.3
 */
import java.util.*;
import java.util.Objects;
import java.lang.Math;

//Start of main()
public class main
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

//Start of Hand class - David
class Hand
{ 
   //series of variables used
      public final int MAX_CARDS = 75;
      private Card[] myCards;
      private int numCards;
      
      //initializes integer numCards and array myCards
      public Hand()
      {
         numCards = 0;
         myCards = new Card[MAX_CARDS];
      }
      
      //resets numCards and myCards by overwiting with initial values
      public void resetHand()
      {
         numCards = 0;
         myCards = new Card[MAX_CARDS];
      }
      
      //adds a card to the array myCards
      public boolean takeCard(Card card)
      {
         if(numCards >= MAX_CARDS)
         {
            System.out.println("Error: Adding to a full array.");
            return false;
         }
         else
         {
            myCards[numCards] = card;
            numCards++;
            return true;
         }
      }
      
      
      //this method returns last card of array or returns bad card error
      public Card playCard()
      {     
         int counter = MAX_CARDS;
         if(numCards == 0)
         {
            return System.out.println("no more cards");
         }
         else
         {
            return myCards[counter--];
         }
      }
         
      
      //toString method to display hand
      public string toString()
      {
         String userHand = "Hand = ( ";
         for (int i = 0, i < numCards, i++)
         {
            while (i < numCards - 1)
            {
               userHand = userHand + myCards[i];
               userHand =+ ", ";
            }
         
            userHand =+ " )";   
         }
         return userHand;
      }
      
      
      //getter for array
      public Card[] getMyCards()
      {
         return myCards;
      } 
      
      //seeter for array
      public void setMyCards(Card[] myCards)
      {
         this.myCards = myCards;
      } 
           
      //getter for numCards
      public int getNumCards()
      {
         return numCards;
      }   
      
      //setter for numCards
      public void setNumCards(int numCards)
      {
         this.numCards = numCards;
      }
       
      
      //takes card as parameter to check for out of bounds
      //THIS ONE IS NOT DONE needs to return cardError = true when k is out of bounds
      //this one just returns simple print statement
      public Card inspectCard(int k)
      {
           
         if(k < 0 || k > numCards) 
         {
            System.out.println("out of bounds error")
            return card.cardError();
         }
         else
         {
            return myCards[k];
         }
      }
   
    
   
//end of hand class 
}

//Start of Deck class  - Ali/Richard?
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

//// Overloaded sum(). This sum takes two int parameters
//    public int sum(int x, int y)
//    {
//        return (x + y);
//    }
//
//    // Overloaded sum(). This sum takes three int parameters
//    public int sum(int x, int y, int z)
//    {
//        return (x + y + z);
//    }
//
//    // Overloaded sum(). This sum takes two double parameters
//    public double sum(double x, double y)
//    {
//        return (x + y);
//    }

