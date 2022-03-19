/*
Write a Java program: Deck of Cards
March 23, 2022
Roberto Arevalo
Ali Bakr
David Delacalzada
Richard Garcia

 */

//Start of main()
public class main
{
   public static void main(String[] args)
   {

   }

   //Start of Card class
   class Card
   {

      enum Suit
      {
         HEARTS, DIAMONDS, CLUBS, SPADES, private char value;
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

   //Start of Hand class
   class Hand
   {


   }

   //Start of Deck class
   class Deck
   {

   }

}