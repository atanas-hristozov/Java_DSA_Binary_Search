public class Main {
    public static void main(String[] args) {
        int[] list = {2, 4, 5, 7, 9, 13, 14, 15, 19, 22, 23, 27};
        System.out.println(binarySearch(list, 5));
    }

    private static boolean binarySearch(int[] list, int target) {
        return binarySearchRec(list, target, 0, list.length-1);
    }

    private static boolean binarySearchRec(int[] list, int target, int start, int end){
        if (start > end){
            return false;
        }
        int middle = (start + end) / 2;
        if(list[middle] == target) {
            return true;
        }
        if (target < list[middle]){
            return binarySearchRec(list, target, start, middle-1);
        }
        return binarySearchRec(list, target, middle+1, end);
    }
}
