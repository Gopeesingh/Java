// public class Search {
//     static boolean search(int[]a, int n, int target, int idx) {
//         // base case
//         if(idx >= n) return false;
//         // self case
//         if(a[idx] == target) return true;
//         // recursive work
//         return search(a, n, target, idx+1);
//     }
//     public static void main(String[] args) {
//         int []a = {1,2,4,6};
//         int target = 4;
//         if(search(a,a.length, target, 0)) {
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }

//  Input: arr = {1,2,3,2,2,5}, x=2
//  Output: 1 3 5

public class Search {
    static void findAllIndices(int[]a,int n,int target,int idx) { //1,2,3,2,2,5
        //base case
        if(idx>=n) {
            return;
        }
        // self case
        if(a[idx]==target) {
            System.out.println(idx);
        }
        // recursive case
        findAllIndices(a,n,target,idx+1); //1,3,4
    }
    public static void main(String[] args) {
    int[]a = {1,2,3,2,2,5,6};
    int target = 2;
    int n = a.length;
    findAllIndices(a, n, target, 0);
    }
}
