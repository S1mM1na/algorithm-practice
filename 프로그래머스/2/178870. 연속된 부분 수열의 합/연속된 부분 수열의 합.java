class Solution {
    public int[] solution(int[] sequence, int k) {

        int left = 0;
        int sum = 0;

        int bestStart = 0;
        int bestEnd = sequence.length - 1;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < sequence.length; right++) {

            sum += sequence[right];

            // 합이 k보다 크면 왼쪽 포인터 이동
            while (sum > k) {
                sum -= sequence[left];
                left++;
            }

            // 합이 k이면 정답 후보 검사
            if (sum == k) {
                int length = right - left;

                if (length < minLength) {
                    minLength = length;
                    bestStart = left;
                    bestEnd = right;
                }
            }
        }

        return new int[]{bestStart, bestEnd};
    }
}