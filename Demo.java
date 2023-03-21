public class Demo {
   public static void main(String []args) {
      String str = "Tutorial";
      System.out.println("String: "+str);
      char[] ch = str.toCharArray();
      System.out.println("Character Array...");
      for (int i = 0; i < ch.length; i++) {
         System.out.print(ch[i]+" ");
      }
   }
}