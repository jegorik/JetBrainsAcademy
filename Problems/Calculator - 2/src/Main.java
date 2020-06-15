// Posted from EduTools plugin
/* Please, do not rename it */
class Problem {

    public static void main(String[] args) {
        String operator = args[0];
        int[] numbers = createArrayOfNumbers(args);

        switch (operator) {
            case ("MAX"):
                System.out.println(numbers[numbers.length - 1]);
                break;
            case ("MIN"):
                System.out.println(numbers[0]);
                break;
            case ("SUM"):
                int sum = 0;
                for (int value : numbers) {
                    sum += value;
                }
                System.out.println(sum);
                break;
        }
    }

    private static int[] createArrayOfNumbers(String[] args) {
        int[] numbers = new int[args.length - 1];
        for (int i = 1; i < args.length; i++) {
            numbers[i - 1] = Integer.parseInt(args[i]);
        }
        java.util.Arrays.sort(numbers);
        return numbers;
    }
}