package src.lections.other.lections;

public class TypeOfMatrix {
    public static void main(String[] args) {
        int[][] squareMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] rectangularMatrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] singleElementMatrix = {{10}};

        System.out.println("Matrix is: " + typer(squareMatrix));
        System.out.println("Matrix is: " + typer(rectangularMatrix));
        System.out.println("Matrix is: " + typer(singleElementMatrix));
    }

    public static String typer(int[][] matrix) {
            if (matrix.length==1 && matrix[0].length==1){
                return "Single";
            }
            else if (matrix.length==matrix[0].length){
                return "Square";
        }
            else return "Rectangular";
    }
}
