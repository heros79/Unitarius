package am.home;

/*
 * Created by David Karchikyan on 14.02.2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class UtilTest {

    @Test
    public void shiftArrTest() {
        int[] inputArray = {1, 2, 3, 4, 5, 6};
        int[] shiftArrayOneElement = {2, 3, 4, 5, 6, 1};
        int[] shiftArrayTwoElement = {3, 4, 5, 6, 1, 2};
        int[] shiftArrayThreeElement = {4, 5, 6, 1, 2, 3};
        int[] shiftArrayFourElement = {5, 6, 1, 2, 3, 4};
        int[] shiftArrayFiveElement = {6, 1, 2, 3, 4, 5};
        var util = new Util();
        var tmpArray = inputArray.clone();
        assertArrayEquals(shiftArrayOneElement, util.shiftArray(tmpArray, 1));
        tmpArray = inputArray.clone();
        assertArrayEquals(shiftArrayTwoElement, util.shiftArray(tmpArray, 2));
        tmpArray = inputArray.clone();
        assertArrayEquals(shiftArrayThreeElement, util.shiftArray(tmpArray, 3));
        tmpArray = inputArray.clone();
        assertArrayEquals(shiftArrayFourElement, util.shiftArray(tmpArray, 4));
        tmpArray = inputArray.clone();
        assertArrayEquals(shiftArrayFiveElement, util.shiftArray(tmpArray, 5));
        tmpArray = inputArray.clone();
        assertArrayEquals(inputArray, util.shiftArray(tmpArray, 6));
    }
}
