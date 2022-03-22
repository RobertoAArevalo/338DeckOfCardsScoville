/*
import java.util.*;
import java.lang.Math;
import java.util.*;
import java.lang.Math;

public class Deck
{
   public final int MAX_CARDS = 312;
   Card[] masterPack = new Card[52];
   private Card[] cards;
   private int topCard;

   Deck(int numPacks)
   {
      cards = new Card[Card.getSuits().length *
         (Card.getMaxRank() - Card.getMinRank() + 1)];
      masterPack = masterPack[52 * numPacks];
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
      Random pullcard = new Random();
      int i = 0;

      for (i = cards.length - 1; i > 0; i--)
      {
         int j = pullcard.nextInt(i + 1);
         Card temp = cards[j];
         cards[j] = cards[i];
         cards[i] = temp;
         //Card[] newCards = new Card[i];
      }

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
*/