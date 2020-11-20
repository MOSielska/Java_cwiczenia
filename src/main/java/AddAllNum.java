import java.util.Scanner;

public class AddAllNum {

    public static int addAllNum(int[] nums) {

        int sum = 0;
        for (int i : nums) sum += i;

        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ile liczb ma być w tablicy?");
            int size = scanner.nextInt();
            int[] nums = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.println("Podaj liczbę");
                nums[i] = scanner.nextInt();
            }

            System.out.println("Suma liczb w Twojej tablicy: " + addAllNum(nums));
        } catch (Exception e) {
            System.out.println("Niepoprawne dane");
        }
    }
}
