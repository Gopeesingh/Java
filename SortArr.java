// public class SortArr {
//     static void display(int[] num) {
//         for(int val : num) {
//             System.out.println(val);
//         }
//         System.out.println();
//     }
// static void sortArr(int[] num) {
//     int n = num.length;
//     int x = -1, y = -1;
//     // process all the adjecent element
//     for(int i=1; i<n; i++) {
//         if(num[i-1] > num[i]) {
//             if(x == -1) {  // first conflict
//                 x = i-1;
//                 y = i;
//             }
//             else{   // 2nd conflict
//                 y = i;
//             }
//         }
//     }
// // swap x,y in num
// int temp = num[x];
// num[x] = num[y];
// num[y] = temp;
// }
//     public static void main(String[] args) {
//         int [] num = {10,5,6,7,8,9,3};
//         sortArr(num);
//         display(num);
//     }
// }

public class SortArr{
    static void sortArr(int [] arr) {
    int n = arr.length;
    
    for(int i=0; i<n-1; i++) {
        for(int j=0; j<n-i-1; j++) {
            if(arr[j] > 0 && arr[j+1] < 0) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
            }
            }
        }
        }
        public static void main(String[] args) {
            int [] arr = {19, -20, 7, -4, -13, 11, -5, 3};
sortArr(arr);
for(int val : arr) {
    System.out.println(val + " ");
}
    }
}
