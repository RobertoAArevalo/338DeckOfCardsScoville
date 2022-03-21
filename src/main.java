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

   }

}

//Start of Card class - Robert
class Card
{
   //String str = "A","2","3","4","5","6","7","8","9","10",
   public enum Suit
   {
      HEARTS, DIAMONDS, CLUBS, SPADES;
   }


   //for values of the cards
   private char value;
   private Suit suit;
   private boolean cardError; // for reporting illegal state

   //private static final int MIN_VALUE = 1;
   //private static final int MAX_VALUE = 13;

   public Card(char value, Suit suit)
   {
      //Card.set()

      this.value = value;
      this.suit = suit;
   }

   public Card();
   {


   }

   //constructor 2
   public Card(Card origCard)
   {
      //origCard = Suit();
      this.value = origCard.value;
      this.suit = origCard.suit;
   }

   public String toString()
   {
      if(cardError == true)
      {
         return "Invalid";
      }
      else
         return "Valid";
   }
   public boolean set(char value, Suit suit)
   {
      if ()
         return true;
      return false;

   }
   public char getValue()
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

   /*public boolean setSuit(Suit suit)//mutators(setters)
   {
      this.suit = suit;
   }*/

   public boolean equals(Card card)
   {

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

}

//Start of Deck class  - Ali/Richard?
   /*class Deck
   {
      public final int MAX_CARDS = 312;
      private static Card[] masterPack = new Card[52];
      private Card[] cards;
      private int topCard;

      Deck(int numPacks)
      {
         if (numPacks == 0)
         {
            numPacks = 1;
         }
      }

      public void init(int numPacks)
      {

      }

      public void shuffle()
      {

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

      }
   }*/

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

