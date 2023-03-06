1) Дана последовательность N целых чисел. Найти сумму простых чисел.
2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
5) * Отвалидировать доску судоку
/*Требования
        Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
        1.	Каждая строка должна содержать цифру 1-9 без повторения
        2.	Каждая колонка должна содержать цифру 1-9 без повторения
        3.	Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
        Ограничения
        •	board.length == 9
        •	board[i].length == 9
        •	board[i][j] значение число или '.'
*/
public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        System.out.println("Validete:" + isValidSudoku(board));
    }


для проверки судоку
//                {'5', '3', '9', '8', '7', '6', '4', '1', '2'},
//                {'7', '2', '8', '3', '4', '1', '9', '6', '5'},
//                {'6', '4', '1', '2', '9', '5', '7', '3', '8'},
//                {'4', '6', '2', '5', '3', '9', '8', '7', '1'},
//                {'3', '8', '5', '7', '2', '1', '6', '4', '9'},
//                {'1', '9', '7', '4', '6', '8', '2', '5', '3'},
//                {'2', '5', '6', '1', '8', '7', '3', '9', '4'},
//                {'9', '1', '3', '6', '4', '2', '5', '8', '7'},
//                {'8', '7', '4', '9', '5', '3', '1', '2', '6'}};


выбрать все простые числа
нужен динамический массив, алгоритм см зеленая тетрадь
//    public static int[] collectAllPrimes1(int[] arr) {
//
//        String primeColl;
//        String dividers = "1 ";
//        int[] divider = new int[] {2, 3, 5, 7};
//
//        for (int i = 2; i <= arr[arr.length]; ) {
//
//            for (int j = 0; j < i; j++) {
//                if(i%divider[j]!=0){ i++; }
//                else{j++; if j == arr[i]{
//                        dividers += Integer.toString(j);
//                    dividers+=  ", ";
//                }
//                }
//
//            }
//        }
//        if (arr[i] == 1){ primeColl += Integer.toString(arr[i]);}
//        int[] divideColl = ;
//        for (int i = 0; i < arr.length - 1; i++) {
//if ()
//        }
//        return primeColl;
//    }

Судоку: зашквар
//        for (int u = 0; u < chboard.length; u++) {
//            for (int i = 0; i < chboard.length; i++) {
//                for (int j = 0; j < chboard.length - 1; j++) {
//                    for (int z = 0; z < chboard.length - 1; z++) {
//                        if (chboard[i][j + i] == chboard[i][z + j] || chboard[i][j] == chboard[z + j][i]) {
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//
//                    }
//
//                }
//
//            }
//        }
//        for (int u = 0; u < 3; u++) {
//            for (int i = 0; i < 3; i ++) {
//                for (int j = u; j < 3 + u; j++) {
//                    for (int k = i; k < 3 + i; k++) {
//                        if (chboard[u][i] == chboard[j][k]) {
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u][i+3]==chboard[j][k+3]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u][i+6]==chboard[j][k+6]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+3][i]==chboard[j+3][k]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+3][i+3]==chboard[j+3][k+3]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+3][i+6]==chboard[j+3][k+6]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+6][i]==chboard[j+6][k]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+6][i+3]==chboard[j+6][k+3]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                        if(chboard[u+6][i+6]==chboard[j+6][k+6]){
//                            System.out.println("Есть повторы, плохой судоку!");
//                            return false;
//                        }
//                    }
//                }
//
//            }
//        }