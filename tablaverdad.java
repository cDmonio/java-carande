class tablaverdad {

  public static void main(String[] args) {
    int a=0,b=0,c=0,abcAnd,abcOr;
    System.out.println("\033[4mA\tB\tC\tA&B&C\tA||B||C\033[0m");

    for (int i=0;i<8;i++) {
      if (i<4) {a=0;}else{a=1;}
      if (i<2||i>3&&i<6){b=0;}else{b=1;}
      if (i%2==0){c=0;}else {c=1;}
      if (a==1&&b==1&&c==1){abcAnd=1;}else{abcAnd=0;}
      if (a==1||b==1||c==1){abcOr=1;}else{abcOr=0;}

      System.out.println(a+"\t"+b+"\t"+c+"\t  "+abcAnd+"\t   "+abcOr);
    }


  }
}
