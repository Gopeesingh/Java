 class ArraysExample {
    void searchInArray() {
        int []arr = {10, 5, 3, 6, 2, 8, 4};
        int x = 2;
        int ans = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x) {
                ans=i;
            }
        }
        System.out.println("found " +x+ " at index "+ans);
    }


        public static void main(String[] args)  {
            ArraysExample obj = new ArraysExample();
            obj.searchInArray();
    }
}

// class ArraysExample{
//     void sumOfArray(){
//         int [] arr = {1,4,5,6,1};
//         int sum = 0; 
//         for(int i=0; i<arr.length; i++) {
//             sum = sum + arr[i];
//         }
//         System.out.println(sum);
//     }
//      public static void main(String[] args)  {
//          ArraysExample obj = new ArraysExample();
//              obj.sumOfArray();
// }
// }