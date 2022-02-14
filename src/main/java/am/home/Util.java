package am.home;

/*
 * Created by David Karchikyan on 14.02.2022
 */

public class Util {


    public int[] shiftArray(int[] array, int shift) {
        var temp = 0;
        if (array.length == 1 || array.length == Math.abs(shift)) {
            return array;
        }
        for (int i = 0; i < Math.abs(shift); i++) {
            temp = array[0];
            for (int j = 0; j < array.length - 1; j++) {
                array[j] = array[j + 1];
            }
            array[array.length - 1] = temp;
        }
        return array;
    }
}
