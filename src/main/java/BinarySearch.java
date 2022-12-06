public class BinarySearch {
    public static int searchNum(int[] numArray, int num){
        int beg, last, mid;
        beg = 0;
        last = numArray.length -1;
        //while the beginning index is less than or equal to the last index, continue loop;
        while (beg <= last) {
            //formula to get the mid index
            mid = (beg + last) /2;
            //compare if the mid element value is equal to the given number,
            // then return the mid index
            if(numArray[mid] == num) {
                return mid;
            }
            // compare if the mid element value is less than the given number,
            // then update beginning index to mid + 1
            if(numArray[mid] < num) {
                beg = mid + 1;
            // else, update last index to mid - 1
            } else {
                last = mid - 1;
            }
        }
        // if the given number is not present on the array return -1
        return -1;
    }
}
