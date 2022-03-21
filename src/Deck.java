public class Deck
{
   public final int MAX_CARDS = 312;
   private static final Card[] masterPack = new Card[52];
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
      Card[] cards = new Card[numPacks * 52];
   }

   public void shuffle()
   {

   }

   public main.Card dealCard()
   {

   }

   public int getTopCard()
   {
      return topCard;
   }

   public main.Card inspectCard(int k)
   {

   }

   private static void allocateMasterPack()
   {

   }
}
