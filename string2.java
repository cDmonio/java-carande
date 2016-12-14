import java.util.Scanner;

class string2 {

  public static void main(String[] args) {

    StringBuffer sBuffer = new StringBuffer("hola");

    sBuffer.insert(1, "ooo");
    sBuffer.delete(0,1);
    sBuffer.replace(0, 3, " ");



    System.out.println(sBuffer);

  }
}
