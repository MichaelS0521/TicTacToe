package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }


    public Boolean isInFavorOfX() {
        for (int i = 0; i < 3; i++){
            if (matrix[0][i].equals('X') && matrix[1][i].equals('X') && matrix[2][i].equals('X')) {
                return true;
            } else if (matrix[i][0].equals('X') && matrix[i][1].equals('X') && matrix[i][2].equals('X')) {
                return true;
            }
        }if (matrix[0][0].equals('X') && matrix[1][1].equals('X') && matrix[2][2].equals('X')){
            return true;
        } else if (matrix[2][0].equals('X') && matrix[1][1].equals('X') && matrix[0][2].equals('X')) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        for (int i = 0; i < 3; i++){
            if (matrix[0][i].equals('O') && matrix[1][i].equals('O') && matrix[2][i].equals('O')) {
                return true;
            } else if (matrix[i][0].equals('O') && matrix[i][1].equals('O') && matrix[i][2].equals('O')) {
                return true;
            }
        }if (matrix[0][0].equals('O') && matrix[1][1].equals('O') && matrix[2][2].equals('O')){
            return true;
        } else if (matrix[2][0].equals('O') && matrix[1][1].equals('0') && matrix[0][2].equals('O')) {
            return true;
        }

        return false;
    }

    public Boolean isTie() {
        if (isInFavorOfO() != true && isInFavorOfX() != true){
            return true;
        }
        return false;
    }

    public String getWinner() {
        String winnerO = "O";
        String winnerX= "X";
        if (isInFavorOfO() == true) {
            return winnerO;
        }else if (isInFavorOfX() == true) {
            return winnerX;
        }
        return "";
    }

}
