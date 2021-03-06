public class CardTest
{
   public static void main (String[]args)
      {
         Card card1 = new Card('J', spades);
         Card jacks = new Card();
         System.out.println(card1);
         System.out.println(jacks);

      }



   static class Card
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
         set(value, suit);
      }

      public Card()//default constructor
      {
         set('A', Suit.SPADES);
      }

      public Card(Card origCard)
      {
         set(origCard.value, origCard.suit);
      }

      public String toString()
      {
         if (cardError == true)
         {
            return "** illegal **";
         }
         else
            return value + " of " + suit;//

      }

      public boolean set(char value, Suit suit)//mutator
      {
         if (isValid(value, suit) == true)
         {
            this.value = value;
            this.suit = suit;
            cardError = false;
            return true;
         }
         cardError = true;
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

      public boolean getCardError()
      {
         return cardError;
      }
    /*public boolean setSuit(Suit suit)//mutators(setters)
    {
       this.suit = suit;
    }*/

      public boolean equals(Card otherCard)
      {
         if (suit == otherCard.getSuit() && value == otherCard.getValue() &&
                cardError == otherCard.getCardError())
            return true;
         return false;
      }

      private boolean isValid(char value, Suit suit)
      {
         if ((value == '2') || (value == '3') || (value == '4') || (value == '5') || (value == '6') || (value == '7') ||
                (value == '8') || (value == '9') || (value == 'T') ||
                (value == 'J') || (value == 'Q') || (value == 'K') ||
                (value == 'A'))
         {
            return true;
         }
         else
         {
            return false;
         }

      }

   }
}