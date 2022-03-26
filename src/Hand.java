

  public class BarcodeImage 
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
      int lowerLeft = MAX_WIDTH - strData.length; //may also be strData.length - MAX_HEIGHT
      for (int i = 0; i < strData.length; i++)
      {
  
         for (int z = 0; z < strData[i].length();z++)
         {
            if ( strData[row].charAt(col) == ' ')
            {
               imageData[lowerLeft + row][col] = false;
               col++;
            }
            else if ( strData[row].charAt(col) == '*')
            {
               imageData[lowerLeft + row][col] = true;
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
      return 
   }
   
   public Object clone() throws CloneNotSupportedException
   {
      return (Object)super.clone();
   }
   
   
//end of program   
//last curly
}
