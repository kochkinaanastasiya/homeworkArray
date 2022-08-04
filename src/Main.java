public class Main {
    public static void main(String[] args) {
        // Задача 1-2
        // Массив 1
        // Этот вариант выводит правильно, но если поменять в массиве "1" на другое число,
        // то уже ломается и в консоли не то. Подскажите, в чем тут ошибка?
        int[] arrInt = new int[]{1, 2, 3};

        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] < arrInt.length) {
                System.out.print(arrInt[i] + ",");
            } else {
                System.out.println(arrInt[i]);
            }
        }
        // Массив 2
        float[] arrFloat = {1.57f, 7.654f, 9.986f};

        for (int i = 0; i < arrFloat.length; i++) {
            if (i == arrFloat.length - 1) {
                System.out.println(arrFloat[i]);
            } else {
                System.out.print(arrFloat[i] + ", ");
            }
        }
        // Массив 3
        short[] arrShort = new short[5];

        for (int i = 0; i < arrShort.length; i++) {
            if (i == arrShort.length - 1) {
                System.out.println(arrShort[i]);
            } else {
                System.out.print(arrShort[i] + ", ");
            }
        }
        // Задача 3
        for (int i = arrInt.length - 1; i >= 0; i--) {
            if (i == arrInt.length) {
                System.out.println(arrInt[i]);
            } else {
                System.out.print(arrInt[i] + ", ");
            }
        }

        int counter = arrFloat.length - 1; // Не понимаю почему -1 ставим, объясните, пожалуйста
        while(counter>0) {
            System.out.print(arrFloat[counter]+", ");
            counter--;
        }
        System.out.println(arrFloat[0]);

        int counter2 = arrShort.length - 1;
        while(counter2>0) {
            System.out.print(arrShort[counter2]+", ");
            counter2--;
        }
        System.out.println(arrShort[0]);

        // Задача 4
        for (int i = 0; i < arrInt.length ; i++) {
            if(arrInt[i] % 2 != 0) arrInt[i]++;
            System.out.print(arrInt[i] + " ");
            }
        }
    }