public class BubbleSort {
    public static void main(String[] args) {
        int array[] = {3,4,5,1,2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i -1; j++){
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i);
        }  
    }
}
