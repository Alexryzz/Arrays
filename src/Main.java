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

        // Task 2
        System.out.println("Task 2");
        System.out.println("Четные:");
        for (int element : arr){
            if (element % 2 == 0){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.println("Нечетные:");
        for (int element : arr){
            if (element % 2 == 1 || element % 2 == -1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }
}