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
      
      
      
      
      
      
}
