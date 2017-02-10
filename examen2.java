import java.util.Arrays;

class examen2 {
    public static void main(String[] args) {
        String[] str = {"Maria Hernandez #48367483A", "Maria Fernandez #45678583B",
                        "Pepe Gonzalez #42572930C", "Jose Palos #40244920D"};
        int[] dni = new int[str.length];

        for (int i = 0 ; i < str.length ; i++) {
            dni[i] = Integer.parseInt(str[i].substring(str[i].length()-9, str[i].length()-1));
        }

        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(dni));

        bubbleSort(dni);
        System.out.println(Arrays.toString(dni));

    }

    public static void bubbleSort(int[] array) {
        int temp;
        int n = array.length;

        while (n>1) {
            for (int x = 0 ; x<n-1 ; x++) {
                if (array[x] > array[x+1]) {
                    temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
            n--;
        }
    }

}
