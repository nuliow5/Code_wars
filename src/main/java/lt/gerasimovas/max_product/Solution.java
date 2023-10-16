package lt.gerasimovas.max_product;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {2, 3, -2, 4};

        System.out.println(maxProduct(numbers));
    }
    //bad?
    public static int maxProduct(int[] numbers) {
        int max = numbers[0];
        int min = numbers[0];
        int answer = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(numbers[i], max * numbers[i]);
            min = Math.min(numbers[i], min * numbers[i]);

            answer = Math.max(answer, max);
        }

        return answer;
    }
}
