class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    //total M&Ms
    int mm = 55;
    int bag, total;
     bag = 9;
     total = mm * bag;
     System.out.println("Total M&M's is: " + total);

    // Number of M&M where total * Percent of M&Ms for each color
    double blue = total * .24;
    System.out.println("blue: " + blue);
    double brown = total * .13;
    System.out.println("brown: " + brown);
    double green = total * .16;
    System.out.println("green: " + green);
    double orange = total * .20;
    System.out.println("orange: " + orange);
    double red = total * .13;
    System.out.println("red: " + red);
    double yellow = total * .14;
    System.out.println("yellow: " + yellow);
    // sum of all M&Ms
    double sum = blue + brown + green + orange + red + yellow;
    System.out.println("Sum: " + sum);
    //if statements 
    if ( blue > brown & green > red)
     System.out.println
     ("Blue over Brown and Green over Red");
    if ( brown <= orange)
     System.out.println("Brown is less than or equal to Orange");
    if ( sum == total)
    System.out.println("Numbers match");
    //numbers match did not print because of a small difference in decimal
  }
}