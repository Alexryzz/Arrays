public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 78, -15, 12, 34, 6, 90, 7, 21, -45};

        // Task 1
        System.out.println("Task 1");
        int max = arr[0];
        int min = arr[0];
        for(int element : arr){
            if(element > max){
                max = element;
            }
            if (element < min){
                min = element;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}