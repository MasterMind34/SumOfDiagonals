public class SumOfDiagonals
{
   public static void main(String[] args)
   {

      String[][] s1 = {{"2", "3", "4"},
                       {"5", "6", "7"},
                       {"8", "9", "10"}};

      String[][] s2 = {{"1", "2", "3"},
                       {"5", "6", "7"},
                       {"9", "10", "11"},
                       {"13", "14", "15"}};
                       
      String[][] s3 = {{"1", "2", "3", "4"},
                       {"5", "6", "7", "8"},
                       {"9", "10", "11", "12"},
                       {"13", "14", "15", "pp"}};
                       
      String[][] s4 = {{"1", "2", "3", "4"},
                       {"5", "6", "7", "8"},
                       {"9", "10", "11", "12"},
                       {"13", "14", "15", "16"}};
      //TODO Complete this method
      sumOfDiagonals(s1);
      sumOfDiagonals(s2);
      sumOfDiagonals(s3);
      sumOfDiagonals(s4);
      

   }
   public static void sumOfDiagonals(String[][] x)
   {
      //TODO Complete this method
      int sum = 0;
       
       
         if(x.length == x[0].length)
         {
            //throw new IndexOutOfBoundsException();
            for(int i = 0; i < x.length; i++)
            {
               for(int j = 0; j<x[i].length; j++)
               {
                  if(i==j)
                  {
                     try
                     {
                     sum+= Integer.parseInt(x[i][j]);
                     //throw new NumberFormatException();
                  }
                  catch(NumberFormatException ex)
                  {
                  System.out.println("Not a valid integer");
                  }
               
               }
            
            }
               //System.out.println(sum);
         }
            System.out.println(sum);
       
       }
       
         else
         {
            System.out.println("Array not square");
         }
               
       }      
             
                                
            }
        
        //sopl(); 
         
         
         
              
      
   
