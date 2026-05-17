class Solution {

    int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, target, 0, 0);

        return answer;
    }

    public void dfs(int[] numbers, int target, int depth, int sum) {

        // 모든 숫자를 다 사용한 경우
        if(depth == numbers.length) {

            if(sum == target) {
                answer++;
            }

            return;
        }

        // 더하는 경우
        dfs(numbers, target, depth + 1, sum + numbers[depth]);

        // 빼는 경우
        dfs(numbers, target, depth + 1, sum - numbers[depth]);
    }
}