package src.home_work;

public class rectangle {

    public static void main(String[] args) {
        rectangleOfStars(10,10);
    }
    public static void rectangleOfStars (int wid, int len) {
        for (int a=1; a<=wid; a++) {
            if (a==1) System.out.print(" -");
            else if (a==wid) System.out.println("-");
            else System.out.print("-");
        }
        for (int i =1; i<=len; i++) {
            for (int j=1; j<=wid;j++) {
                if (j==1)
                System.out.print("|*");
                else if (j==wid) {
                    System.out.println("*|");
                }
                else System.out.print("*");
            }
            if (i==len)
                for (int a=1; a<=wid; a++) {
                if (a==1) System.out.print(" -");
                else if (a==wid) System.out.println("-");
                else System.out.print("-");
            }
        }

    }
}
