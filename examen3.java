class examen3 {
    public static void main(String[] args) {
        String[] alum = {"CCCC", "DDDD", "AAAAA", "BBBBB"};
        float[] notas = {5, 9, 8, 3};
        int i = 3;

        for (int j = 0 ; j <= i ; j++ ) {
            System.out.println(alum[j]+"\t"+notas[j]);
        }

        System.out.println();
        ordena(alum, notas, i);

        for (int j = 0 ; j <= i ; j++ ) {
            System.out.println(alum[j]+"\t"+notas[j]);
        }
    }

    public static void ordena(String[] alum, float[] notas, int i) {
        String tempS;
        float tempF;

        while (i>1) {
            for (int x = 0 ; x < i ; x++ ) {
                if (alum[x].compareTo(alum[x+1]) > 0) {
                    tempS = alum[x];
                    tempF = notas[x];
                    alum[x] = alum[x+1];
                    notas[x] = notas[x+1];
                    alum[x+1] = tempS;
                    notas[x+1] = tempF;
                }
            }
            i--;
        }
    }
}
