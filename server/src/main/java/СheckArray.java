public class СheckArray {

    public int[] nextFour(int[] arr) {
        int indexOf = -1;
        int newArr[];

        if (arr.length == 0) {
            return null;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) indexOf = i;
        }

        if (indexOf != -1) {
            int j = 0;
            newArr = new int[arr.length - indexOf - 1];
            for (int i = indexOf + 1; i < arr.length; i++) {
                newArr[j] = arr[i];
                j++;
            }
        } else
            throw new RuntimeException("В массиве отсутствует четверка!");

        return newArr;

    }

    public boolean oneFour(int[] arr) {
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) one = true;
            if (arr[i] == 4) four = true;
        }
        return (!one | !four);
    }

}
