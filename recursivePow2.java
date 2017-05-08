class recursivePow2 {
    public static void main(String[] args) {
        System.out.println(cuadrado(100000));
    }

    public static int cuadrado(int n) {
        if (n==0) {
            return 0;
        } else {
            n = (n-1) + 1 + (n-1) + cuadrado(n-1);
            return n;
        }
    }
}
