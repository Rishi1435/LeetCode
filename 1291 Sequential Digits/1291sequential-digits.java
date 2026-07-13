class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        int lowLen = String.valueOf(low).length();
        int highLen = String.valueOf(high).length();

        for (int len = lowLen; len <= highLen; len++) {

            // Generate first sequential number: 12, 123, 1234...
            int cur = 0;
            for (int i = 1; i <= len; i++) {
                cur = cur * 10 + i;
            }

            // Generate increment: 11, 111, 1111...
            int d = 0;
            for (int i = 0; i < len; i++) {
                d = d * 10 + 1;
            }

            // Generate all sequential numbers of this length
            while (cur % 10 != 0) {
                if (cur >= low && cur <= high) {
                    ans.add(cur);
                }

                if (cur > high)
                    break;

                cur += d;
            }
        }

        return ans;
    }
}