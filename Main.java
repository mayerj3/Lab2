class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    //total M&Ms
    int mm = 55;
    int bag, total;
     bag = 9;
     total = mm * bag;
     System.out.println("Total M&M's is: " + total);

    // Percent of M&Ms for each color
    double blue = total * .24;
    System.out.println("Number of blue's is: " + blue);
    double brown = total * .13;
    System.out.println("Num of brown's is: " + brown);
    double green = total * .16;
    System.out.println("Num of green's is: " + green);
    double orange = total * .20;
    System.out.println("Num of orange's is: " + orange);
    double red = total * .13;
    System.out.println("Num of red's is: " + red);
    double yellow = total * .14;
    System.out.println("Num of yellow's is: " + yellow);
  }
}