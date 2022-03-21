/*
Write a Java program: Deck of Cards
March 23, 2022
@author Roberto Arevalo
@author Ali Bakr
@author David Delacalzada
@author Richard Garcia
@version 1.3
 */

 */

//Start of main()
public class main
{
   public static void main(String[] args)
   {

   }

   //Start of Card class - Robert
   public class Card
   {

      public enum Suit
      {
         HEARTS, DIAMONDS, CLUBS, SPADES
      };
         private char value;
         private Suit suit;
         private boolean cardError;

         public Card(char value, Suit suit)
         {
            this.value = value;
            this.suit = suit;

         }

         public Card()
         {
            value = Card.SPADES;
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

}
