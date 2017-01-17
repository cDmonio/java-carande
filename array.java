import java.util.Scanner;

class array {

  public static void main(String[] args) {
    contarPar(fillArray(introducir()));

  }

  public static int introducir() { // introducir longitud array y lo devuelve
    Scanner scanner = new Scanner(System.in);

    try { // controla InputMismatchException con un try, catch
      System.out.print("Introduce longitud array: ");
      return scanner.nextInt();
    } catch (java.util.InputMismatchException e) { return introducir(); }

  }

  public static int[] fillArray(int n) { // rellena el array con numeros aleatorios
   int[] a = new int[n]; // declara el array con longitud n
   System.out.print("\nArray --> ");

   for (int i = 0 ; i < n ; i++) {
     a[i] = (int) (Math.random() * 101);
     System.out.print(a[i] + " ");
   }

   return a;

  }

  public static void contarPar(int[] a) { //cuenta los numeros pares e impares del array
    int par = 0, impar = 0;
    String parS = "", imparS = "";

    for (int i = 0 ; i < a.length ; i++) {
      if (a[i]%2==0) {
        par++;
        parS += a[i] + " ";
      } else {
        impar++;
        imparS += a[i] + " ";
      }
    }
    // muestra los resultados
    System.out.println("\n\nPares: " + par + " --> " + (float) par/a.length * 100 + "%" + " --> "+ parS);
    System.out.println("Impares: " + impar + " --> " + (float) impar/a.length * 100 + "%" + " --> " + imparS + "\n");


  }
}
