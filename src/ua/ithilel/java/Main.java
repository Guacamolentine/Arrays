package ua.ithilel.java;

public class Main {

    public static void main(String[] args) {

        int xSize = 3;
        int ySize = 4;

        int[][] score = new int[xSize][ySize];
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = 10 * (i + 1) + j;
            }
        }
        int[] result = new int[score.length];
        for (int i = 0; i < score.length; i++) {
            int sum = 0; // Для строки обьявляем переменную
            for (int j = 0; j < score[i].length; j++) { //Для строчки в этом массиве, калькулируем сумму всех колонок
                sum += score[i][j];
            }
            result[i] = sum; // После выполнения внутреннего цикла, считается сумма и сохраняется в массив "result"

        }
        for (int i : result) {
            System.out.println(i);
        }
    }
}
