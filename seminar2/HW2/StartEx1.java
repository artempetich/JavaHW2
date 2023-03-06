package org.example.seminar2.HW2;

public class StartEx1 {
    public static void main(String[] args) {

        int[] our_array = MyLib.getSubsequence();
        int sum = 0;
        MyLib.printArray(our_array);

        for (int j : our_array) {
            if (PrimeNum.primeInt(j)) {
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println(PrimeNum.primeInt(j));
        }
        System.out.println(String.format("Сумма простых чисел массива = %d", sum));
    }
}
