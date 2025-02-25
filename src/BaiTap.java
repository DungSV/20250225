public class App {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của mảng 2 chiều
        System.out.print("Nhập số hàng của mảng: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        // Nhập các phần tử của mảng
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Hiển thị mảng trước khi sắp xếp
        System.out.println("\nMảng trước khi sắp xếp:");
        printMatrix(matrix);

        // Sắp xếp tăng dần theo hàng
        for (int i = 0; i < rows; i++) {
            Arrays.sort(matrix[i]);
        }

        // Sắp xếp giảm dần theo cột
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                for (int k = i + 1; k < rows; k++) {
                    if (matrix[i][j] < matrix[k][j]) {
                        int temp = matrix[i][j];
                        matrix[i][j] = matrix[k][j];
                        matrix[k][j] = temp;
                    }
                }
            }
        }

        // Hiển thị mảng sau khi sắp xếp
        System.out.println("\nMảng sau khi sắp xếp:");
        printMatrix(matrix);

        scanner.close();
    }

    // Hàm in mảng 2 chiều
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}
