package lab3;

public class Problema1{

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; i++) {
            boolean r = array[i] % 2 == 0 ? true : false;
            System.out.print(r + " ");
        }
    }
}

