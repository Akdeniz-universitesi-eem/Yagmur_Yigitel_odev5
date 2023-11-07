
package squezeer;

import java.util.Scanner;


public class Squezeer {

    public static String squeezer(String yaz1, String yaz2) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < yaz1.length(); i++) {
            char c = yaz1.charAt(i);
            
         if (yaz2.indexOf(c) == -1) {
                result.append(c);
           
         }
        }
        
            return result.toString();
    }

   public static void main(String[] args  {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Metin girin: ");
        String input = scanner.nextLine();
        scanner.close();
         String output = squeezer(input);
        System.out.println(" Metin: " + output);
    }
}
//Bu kod, squeeze adlı metodu kullanarak iki metni alır ve ilk metinde ikinci metinde bulunan karakterleri çıkararak yeni bir metin döndürür. Örneğin, yukarıdaki kodun testi için "Merhaba Dunya!" metninden "aeiou" karakterlerini çıkardığınızda sonuç "Mrhb Dny!" olacaktır. Bu işlev, giriş metinlerini dönüştürmek veya temizlemek için kullanılabilir.













        // TODO code application logic here
    
    

