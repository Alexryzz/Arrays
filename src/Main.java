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

        // Task 5
        System.out.println("Task 5: ");
        for (int i = 0; i < arr.length - 1; i++) {
            j = i + 1;
            for (; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.print(arr[i] + " ");
                    System.out.println(arr[j]);
                }
                int temp1 = arr[i];
                int temp2 = arr[j];
                int t2 = arr[j];
                int n = 0;
                while (t2 != 0){
                    t2 /= 10;
                    n++;
                }
                flag = true;
                while (flag){
                    if(temp1 % 10 == (int) (temp2 / Math.pow(10, n-1))){
                        temp1 /= 10;
                        temp2 = temp2 - (int) Math.pow(10, n-1) * (temp2 / (int) Math.pow(10, n-1));
                        if(temp1 == 0 && temp2 == 0){
                            break;
                        }
                        n--;
                    }
                    else {flag = false;}
                }
                if(flag) {
                    System.out.print(arr[i] + " ");
                    System.out.println(arr[j]);
                }


            }
        }
    }
}