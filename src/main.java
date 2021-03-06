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

public class anotherTest
{
   
   //
   public static void main(String[] args)
   {
      
      Scanner scan = new Scanner(System.in);  //initialize scanner
      int count = 0;
      String deckStr = "";
      Deck deckPack1 = new Deck(2);
      boolean dealt = false;
     
      while(!dealt)//FOR DECK 1
      {
          Card cardT = new Card (deckPack1.dealCard());
          if( cardT.getCardError())
              break;
          deckStr = deckStr + cardT.toString() + " / ";
          count++;
          if (count % 5 == 0)
              deckStr = deckStr + "\n";
      }
      System.out.println("-----Deck 1 Begin-----");
      System.out.println(deckStr + "\n");
     
      deckStr = "";
      count = 0;
      deckPack1.init(2);
      deckPack1.shuffle();
     
      while(!dealt) //FOR DECK 2
      {
          Card cardT = new Card (deckPack1.dealCard());
          if(cardT.getCardError())
              break;
          deckStr = deckStr + cardT.toString() + " / ";
          count++;
          if (count % 5 == 0)
              deckStr = deckStr + "\n";
      }
      System.out.println("-----Deck 2 Begin-----");
      System.out.println(deckStr + "\n");
     
      deckStr = "";
      count = 0;
      //deckPack1.init(2);
      //deckPack1.shuffle();
      Deck deckPack2 = new Deck(2);
     
      while(!dealt) //WHILE LOOP FOR DECK   3
      {
          Card cardT1= new Card (deckPack2.dealCard());
          if( cardT1.getCardError())
              break;
          deckStr = deckStr + cardT1.toString() + " / ";
          count++;
          if (count % 5 == 0)
              deckStr = deckStr + "\n";
      }
      System.out.println("-----Deck 3 Begin-----");
      System.out.println(deckStr + "\n");
     
      deckStr = "";
      count = 0;
      deckPack2.init(1);
      deckPack2.shuffle();
     
      while(!dealt) //WHILE LOOP FOR DECK   4
      {
          Card cardT= new Card (deckPack2.dealCard());
          if( cardT.getCardError() )
              break;
          deckStr = deckStr + cardT.toString() + " / ";
          count++;
          if (count % 5 == 0)
              deckStr = deckStr + "\n";
      }
      System.out.println("-----Deck 4 Begin-----");
      System.out.println(deckStr + "\n");
     
      int numHand = 0;
      int countL = 0;
      int remain = 0;
      int countDiv = 0;
      int countDivL = 0;
      int countPr = 0;
      Boolean notShuf = false;
      Deck deckSing = new Deck();
     
      while(!notShuf)//FOR SHUFFLED DECK
      {
          System.out.println("-----Run #-----");
          System.out.println("How many Hands are there? (between 1 - 10 )");
          numHand = scan.nextInt();
          if (numHand <= 0 || numHand > 10)
          {
              System.out.println("Illegal Input Amount, Try Again");
              continue;
          }
          Hand handss = new Hand();
          Hand objectArr[] = new Hand[numHand];
          remain = 52 % numHand;
          countDiv = 52 - remain;
          countDivL = countDivL / numHand;
         
          //NESTED LOOPS TO FILL HANDS
          for(int i = 0; i < 2; i++)
          {
              for(int j = 0; j < numHand; j++)//hand
              {
                 
                  objectArr[j] = new Hand();
                  
                  if(i == 0)
                  {
                     
                     for(int z = 0; z < 5; z++)
                     {
                        objectArr[j].takeCard(deckSing.dealCard());
                     }
                  }
                  else
                  {
                     
                     for(int z = 0; z < 5; z++)
                     {
                        objectArr[j].takeCard(deckPack1.dealCard());
                     }
                  }              
              }
              //SHUFFLED DECK
              for(int k = 0; k < countDivL; k++)//divisible
              {
                  //System.out.println("check");
                  for(int a = 0; a < numHand; a++)
                  {
                     //System.out.println("check");
                      objectArr[a].takeCard(deckSing.dealCard());
                  }
              }
              //UNSHUFFLED DECK           
              for( int l = 0; l < remain; l++)
              {
                 //System.out.println("check");
                  objectArr[l].takeCard(deckSing.dealCard());
              }
              if(countPr == 1 )
              {
                  System.out.println("Here are our hands, from shuffled "
                        + "deck: \n");
                  
                  for(int p = 0; p < numHand; p++)
                  {
                      System.out.println(objectArr[p].toString() + "\n");
                  }
                  deckSing.init(1);
                  deckSing.shuffle();
                  countPr++;      
              }
              else
              {
                  System.out.println("Here are our hands, from unshuffled "
                        + "deck: \n");
                  
                  for(int p = 0; p < numHand; p++)
                  {
                      System.out.println(objectArr[p].toString() + "\n");
                  }
                  deckPack1.init(1);
                  deckPack1.shuffle();
                  countPr++;      
              }
                            
          }
          countL++;
          if(countL == 10)
              break;
      }
      scan.close();
  }


      
   }

   class Card
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

      public Suit getSuit()
      {
         return this.suit;
      }

      public boolean getCardError()
      {
         return cardError;
      }

      //a method to check 
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
            (value == '5') || (value == '6') || (value == '7') || 
            (value == '8') ||
            (value == '9') || (value == 'T') || (value == 'J') || 
            (value == 'Q') ||
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
   class Hand extends Card
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

      //resets numCards and myCards by overwriting with initial values
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
         Card emptyCard = new Card();
         
         int index = getNumCards() - 1;   
         if (numCards == 0)
         {
            System.out.println("no more cards");
            System.out.println("returning default card:");
            return emptyCard;
         }
      
            holdCard = myCards[index];           
            numCards--;           
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


      //getter for numCards
      public int getNumCards()
      {
         return numCards;
      }


      //takes card as parameter to check for out of bounds

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
   
   
   class Deck //going to contain outputs
   {
      public static final int MAX_CARDS = 312;
      private static Card[] masterPack = new Card[52];


      private Card[] cards;
      private int topCard;

      public Deck(int numPacks)
      {
         cards = new Card[numPacks * 52];
         allocateMasterPack();
         init(numPacks);
      }

      public Deck()
      {
         int numPacks = 1;
         cards = new Card[numPacks * 52];
         init(numPacks);
      }

      public void init(int numPacks)
      {
         topCard = (numPacks * 52) - 1;
         for (int i = 0; i <= topCard; i++)
         {
            cards[i] = masterPack[i % 52];
            System.out.println(cards[i]);
         }
      }

      public void shuffle()
      {
         int i = 0;
         Random pullCard = new Random();
         for (i = cards.length - 1; i > 0; i--)
         {
            int j = pullCard.nextInt(i + 1);
            Card temp = cards[i];
            cards[j] = cards[i];
            cards[i] = temp;
            //Card[] newCards = new Card[i];
         }

      }

      public Card dealCard()
      {
         //int index = cards.length;

         if (topCard == 0)
         {
            return new Card('X', Card.Suit.SPADES);
         }
         else
         {
            Card newCard = new Card(cards[topCard]);
            topCard--;
            return newCard;
         }
      }

   public int getTopCard()
   {
      return topCard;
   }

   //same as the inspecCard class from hand
   //but added the object copy if k is out of bounds
   //returns true and object copy
   public Card inspectCard(int k)
   {
      if(k < 0 || k > topCard)
      {
         System.out.println("out of bounds error");

         return new Card('X', Card.Suit.SPADES);
      }
      else
      {
         return cards[k];
      }
   }

   private static void allocateMasterPack()
   {
      //some variables used in method
      //boolean cutRibbon = true;
      int r = 2; //r for rank
      Card.Suit suit;

      //if cutRibbon is true method exits
      if (masterPack[0] != null)
      {

         return;
      }
      // if masterPack is empty build it

      masterPack = new Card[52];
      // not empty do nothing
      // 2 nested loops to build the deck
      //s is for suit
      //NEED TO SEND CHAR THROUGH
      //THIS ONE IS NOT DONE
      for(int s = 0; s < 4; s++)
      {
         suit = Card.Suit.values()[s];
         r = 2; //use values() to pull enum values

         for(int i = 0; i < 8; i++)
         {
            masterPack[i + 13*s] = new Card((char) (r +48), suit);
            r++;
//System.out.println(masterPack[i]);
         }
         masterPack[8 + 13*s] = new Card('T', suit);
         masterPack[9 + 13*s] = new Card('J', suit);
         masterPack[10 + 13*s] = new Card('Q', suit);
         masterPack[11 + 13*s] = new Card('K', suit);
         masterPack[12 + 13*s] = new Card('A', suit);
      }
      //loop for char value & loop for Suit suit
   }
   //end of deck class
} 
   
   

   

