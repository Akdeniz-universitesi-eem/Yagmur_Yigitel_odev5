
package harf_durum_değiştirme;

import java.util.Scanner;
public class Harf_durum_değiştirme {

   public static String harf_durum_değiştirme(String input)  {
         StringBuilder sonuc = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (Character.isLowerCase(c)) {
                sonuc.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sonuc.append(Character.toLowerCase(c));
            } else {
                sonuc.append(c); // Diğer karakterler değiştirilmeden eklenir.
            }
        }
        
        return sonuc.toString();}
    
 public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Metin girin: ");
        String input = scanner.nextLine();
        scanner.close();
         String output = harf_durum_değiştirme(input);
        System.out.println("Değiştirilmiş Metin: " + output);
        /* Scanner scanner = new Scanner(System.in); kodu, kullanıcıdan girdi almak için bir Scanner nesnesi oluşturur. System.in girdisi, kullanıcının klavyeden veri girmesini sağlar.

System.out.print; kodu bir metin girmesi gerektiğini belirten bir mesajı ekrana yazdırır. Kullanıcı bu mesajı görür ve metin girmesi istenir.

String input = scanner.nextLine() kodu, kullanıcının girdiğini okur ve bu girdiyi bir String değişkeni olan
        input içine kaydeder. Kullanıcı Enter tuşuna bastığında giriş işlemi sona erer ve kullanıcının girdiği metin input değişkeninde saklanır.

scanner.close(); kodu, Scanner nesnesini kapatır. Bu, kaynakları serbest bırakır ve artık kullanıcıdan giriş almak için kullanılan Scanner nesnesinin kullanılmayacağını belirtir.
    
*/



}
}
}
}