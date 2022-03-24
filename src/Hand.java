/ public static void main(String[] args)
   {
      Card card1 = new Card();
      Card card2 = new Card('7', Card.Suit.CLUBS);
    
      System.out.println(card1);
      
      Hand uHand = new Hand();
      
      for(int i = 0; i < 8 ; i++)
      {
         uHand.takeCard(card1);
         uHand.takeCard(card2);
      
      }
      
      System.out.println(uHand.toString());
      
      for(int i = 0; i < 3; i++)
      {
      System.out.println(uHand.playCard());
      }
      
      
   }

   static class Card
   {
      
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
         return this.value;
      }
       /*public char setValue(char value)//mutators(setters)
       {
          this.value = value;
       }*/

      public Suit getSuit()
      {
         return this.suit;
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
         if ((value == '2') || (value == '3') || (value == '4') ||
            (value == '5') || (value == '6') || (value == '7') || (value == '8') ||
            (value == '9') || (value == 'T') || (value == 'J') || (value == 'Q') ||
            (value == 'K') || (value == 'A'))
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
   static class Hand extends Card
   {
      //series of variables used
      public final int MAX_CARDS = 75;  //range is from 50 - 100
      private Card[] myCards;
      private int numCards;

      //initializes integer numCards and array myCards
      public Hand()
      {
         this.myCards = new Card[MAX_CARDS];
         this.numCards = 0;
        
      }

      //resets numCards and myCards by overwiting with initial values
      public void resetHand()
      {
         this.myCards = new Card[MAX_CARDS];
         this.numCards = 0;
         
      }

      //adds a card to the array myCards
      public boolean takeCard(Card card)
      {
         if (numCards >= MAX_CARDS)
         {
            System.out.println("Error: Adding to a full array.");
            return false;
         }
         else
         {
            Card copy = new Card(card);
            myCards[numCards] = copy;
            numCards++;
            return true;
         }
      }

      //this method returns last card of array or returns bad card error
      public Card playCard()
      {
         Card holdCard = new Card();
         int index = 0;
         index++;
         if (numCards == 0)
         {
            System.out.println("no more cards");
         }
      
            holdCard = myCards[index++];
           
          
        
            return holdCard;
            
         
      }

      //toString method to display hand
      public String toString()
      {
         String userHand = "Hand = ( ";
         for (int i = 0; i < numCards; i++)
         {
            
               userHand = userHand + myCards[i];
               userHand += ", ";

          
         }
         userHand += " )";
         return userHand;
      }

      //getter for array
      public Card[] getMyCards()
      {
         return myCards;
      }

      //seeter for array
      /*public void setMyCards(Card[] myCards)
      {
         this.myCards = myCards;
      }*/

      //getter for numCards
      public int getNumCards()
      {
         return numCards;
      }

      //setter for numCards
      /*public void setNumCards(int numCards)
      {
         this.numCards = numCards;
      }*/

      //takes card as parameter to check for out of bounds
      //THIS ONE IS NOT DONE needs to return cardError = true when k is out of bounds
      //this one just returns simple print statement
      public Card inspectCard(int k)
      {
         Card invalidCard = new Card ('H', Card.Suit.CLUBS);
         if(k > 312 || k < 0)
         {
            System.out.println("**illegal**");
            return invalidCard;
         }
         if(myCards[k] == null)
            return invalidCard;
         if(myCards[k].getCardError())
            return invalidCard;
         else
            invalidCard.set('3',Card.Suit.HEARTS);
         return invalidCard;
      }

}
