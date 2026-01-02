public class squareroot{

    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int low = 1;
        int high = x / 2;
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (mid <= x / mid) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(mySqrt(x)); // Output: 2
    }
}


// class Solution {
//     public int mySqrt(int x) {
//         if (x < 2) return x;

//         int low = 1, high = x / 2, ans = 0;

//         while (low <= high) {
//             int mid = low + (high - low) / 2;

//             if (mid <= x / mid) {
//                 ans = mid;
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }
//         return ans;
//     }
// }
