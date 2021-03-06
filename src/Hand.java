

interface BarcodeIO
{
   public boolean scan(BarcodeImage bc);
   public boolean readText(String text);
   public boolean generateImageFromText();
   public boolean translateImageToText();
   public void displayTextToConsole();
   public void displayImageToConsole();
   }


public class BarcodeImage //implements BarcodeIO
{
   //final variables for dimensions of array
   public static final int MAX_HEIGHT = 30;
   public static final int MAX_WIDTH = 65;
   
   private boolean[][] imageData;
   
   public BarcodeImage()
   {
      imageData = new boolean[MAX_HEIGHT][MAX_WIDTH];
      
      //nested for loop to instansiates 2d array with false
      for(int r = 0; r < MAX_HEIGHT; r++)
      {
         for(int c = 0; c < MAX_WIDTH; c++)
         {
            imageData[r][c] = false;
         }
      }
   }
   
   //takes in 1d string array and converts to 2d array boolean
   public BarcodeImage(String[] strData) 
   {
      int row = 0;
      int col = 0;
      
      //bottom right of 2d array is MAX_HEIGHT - strData.length
      //most left position in 2d array is [0][col]
      //my guess for lower left is below
      int lowerLeft = 0; 
      for (int i = 0; i < strData.length; i++)
      {
  
         for (int z = 0; z < strData[i].length();z++)
         {
            if ( strData[row].charAt(col) == ' ')
            {
               imageData[lowerLeft + (MAX_HEIGHT - strData.length)][col] = false;
               col++;
            }
            else if ( strData[row].charAt(col) == '*')
            {
               imageData[lowerLeft + (MAX_HEIGHT - strData.length)][col] = true;
               col++;
            }
         }
         row++;
         col=0;
      }
      //end of BarcodeImage(String[] strData) 
   }
   
   boolean getPixel(int row, int col)
   {
     boolean sendPixel = false;
      
      if(row <MAX_HEIGHT && col < MAX_WIDTH) //ADDING IF STATEMENT TO CHECK IF ROW AND COL ARE GOOD
      {    
               sendPixel = imageData[row][col];        
      }
      
     return sendPixel;
      
     return sendPixel;
   }
   
   void setPixel(int row, int col, boolean value)
   {       
     this.imageData[row][col] = value;
   }
   
   
   public Object clone() throws CloneNotSupportedException
   {
      return (Object)super.clone();
   }
   
   
//end of program   
//last curly
}
