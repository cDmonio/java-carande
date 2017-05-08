class fibinnacci {

    public static void main(String[] args) {
        System.out.println(fib(1));

    }

    public static int fib(int n) {
        if (n==0) {
            return 0;
        } else if (n>2) {
            n = fib(n-1) + fib(n-2);
            return n;
        } else {
            return 1;
        }
    }
}
