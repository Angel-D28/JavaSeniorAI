public class matriz {
    public static void main(String[] args) throws Exception {
        int[][] matrix = new int[3][3];
        int[][] matrix2 = {
            {12,52,33},
            {24,15,96},
            {57,78,89}
        };
        System.out.println(matrix2);
        recorrerMatriz(matrix2);
    }

    public static void recorrerMatriz(int[][]matriiiz){
        for (int i = 0; i < matriiiz.length; i++) {
            for (int j = 0; j < matriiiz[i].length; j++) {
                System.out.println("Numero " + matriiiz[i][j] + "  posicion (" + i + " , " + j + ")");
            }
        }
    }
}
