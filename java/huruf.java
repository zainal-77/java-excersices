public class segi3pascal 
 {
    public static void main(String[] args) 
 {           
            String kata = "ABCDEFGHIJKLMOPQRSTUVWXYZ";                
         // tentukan baris
            for (int i = 0; i < kata.length(); i++) 
   {                    
                // tentukan Spasi
                for (int j = i; j <= kata.length(); j++) 
    {
                System.out.print(" ");
                }
                // perulangan karakter
                for (int k = 0; k <= i; k++) 
    {
                System.out.print(" "+kata.charAt(k)); 
    }
                // perulangan untuk enter pada setiap baris
                System.out.println();
            }              
    }
    }