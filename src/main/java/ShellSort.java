public class ShellSort {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 10, 20, 15, 100, 99, 101, 50, 3};

        for(int gap = 3; gap > 0; gap--){
            for (int i = gap; i < arr.length; i++) {
                for (int j = i; j>gap-1; j-=gap) {
                    if(arr[j] < arr[j-gap]){
                        int temp = arr[j];
                        arr[j] = arr[j-gap];
                        arr[j-gap] = temp;
                    }
                }
            }
        }
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
