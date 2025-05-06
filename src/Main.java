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

        // Task 3
        System.out.println("Task 3");
        int short_num = arr[0];
        int long_num = arr[0];
        for( int element : arr){
            int l = long_num;
            int elem = element;
            do{
                l = l / 10;
                elem = elem / 10;
            }
            while (l != 0 && elem != 0);
            if (l == 0 && elem !=0){
                long_num = element;
            }
        }
        for( int element : arr){
            int s = short_num;
            int elem = element;
            do{
                s = s / 10;
                elem = elem / 10;
            }
            while (s != 0 && elem != 0);
            if (s != 0 && elem ==0){
                short_num = element;
            }
        }
        System.out.print("Самые длинные числа: ");
        for( int element : arr){
            int l = long_num;
            int elem = element;
            do{
                l = l / 10;
                elem = elem / 10;
            }
            while (l != 0 && elem != 0);
            if (l == 0 && elem ==0){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        System.out.print("Самые короткие числа: ");
        for( int element : arr){
            int s = short_num;
            int elem = element;
            do{
                s = s / 10;
                elem = elem / 10;
            }
            while (s != 0 && elem != 0);
            if (s == 0 && elem ==0){
                System.out.print(element + " ");
            }
        }
        System.out.println();

        // Task 4
        System.out.println("Task 4: ");
        System.out.println("Числа в порядке возрастания: ");
        boolean flag = false;
        int j = 0;
        for(int i = 1; i < arr.length - 1; i++){
            if(arr[i] > arr[j] && flag == false){
                System.out.print(arr[j] + " ");
                System.out.print(arr[i] + " ");
                flag = true;
                j = i;
            }
            if(arr[i] > arr[j] && flag == true){
                System.out.print(arr[i] + " ");
                j = i;
            }
        }
    }
}