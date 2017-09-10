public class ProceduralDecomposition
{     
   public static void method1(){
      System.out.println("  ______");
      System.out.println(" /      \\ ");
      System.out.println("/        \\ ");
      }
   public static void method2(){
      System.out.println("\\        /");
      System.out.println(" \\______/");
      }   
   public static void method3(){
      System.out.println("+--------+");
      }
   public static void method4() {
      System.out.println("|  STOP  |");
      }
   public static void method5(){
      System.out.println();  
       }
   public static void main (String[] args) {
      method1();
      method2();
      method5();
      method2();
      method3();
      method5();
      method1();
      method4();
      method2();
      method5();
      method1();
      method3();
   } 
}      

