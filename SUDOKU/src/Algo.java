/*
 * This Code was Developed By Amir Ali
 */
import java.util.Arrays;

public class Algo {

  static int N = 5;

  /*
   * To Check that Number is between 1 to 5
   */
  public static boolean isinRange(int[][] board) {
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        if (board[i][j] <= 0 || board[i][j] > 5) {
          return false;
        }
      }
    }
    return true;
  }

  /*
   * To Check that Array is Valid or Not
   * for Sudoku
   */
  static boolean isValidSudoku(int board[][]) {
    if (isinRange(board) == false) {
      return false;
    }

    boolean[] unique = new boolean[N + 1];

    /*
     * To Check that Number is Repeated in Row or Not
     */
    for (int i = 0; i < N; i++) {
      Arrays.fill(unique, false);

      for (int j = 0; j < N; j++) {
        int Z = board[i][j];

        if (unique[Z]) {
          return false;
        }
        unique[Z] = true;
      }
    }
    /*
     * To Check that Number is Repeated in Colum or Not
     */
    for (int i = 0; i < N; i++) {
      Arrays.fill(unique, false);
      for (int j = 0; j < N; j++) {
        int Z = board[j][i];

        if (unique[Z]) {
          return false;
        }
        unique[Z] = true;
      }
    }
    return true;
  }
}
