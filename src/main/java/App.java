
public class App {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        int numToSearch = 50;
        System.out.println(String.format("The index of the given number is %s", BinarySearch.searchNum(arr, numToSearch)));
    }
}
