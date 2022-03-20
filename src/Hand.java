public class Hand {
  
      public final int MAX_CARDS = 75;
      private Card[] myCards;
      private int numCards;
      
      public Hand()
      {
         numCards = 0;
         myCards = new Card[MAX_CARDS];
      }
      
      public void resetHand()
      {
         numCards = 0;
         myCards = new Card[MAX_CARDS];
      }
      
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
}
