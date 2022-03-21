public class Hand {
      
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
      
      
      //this method returns last card of array or returns bad card error
      public Card playCard()
      {     
         if(numCards == 0)
         {
            return System.out.println(""Bad Card" error");
         }
         else
         {
            return myCards[MAX_CARDS--];
         }
      }
      
      
      //takes card as parameter to check for out of bounds
      //THIS ONE IS NOT DONE needs to return cardError = true when k is out of bounds
      //this one just returns simple print statement
      public Card inspectCard(int k)
      {
            
         if(k < 0 || k > numCards) 
         {
            return System.out.println("out of bounds error")
         }
         else
         {
            return myCards[k];
         }
      }
      
}
