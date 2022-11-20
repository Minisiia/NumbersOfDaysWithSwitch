import java.util.Scanner;

public class NumbersOfDaysWithSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть номер місяця");
        int numberOfMonth = scanner.nextInt();
        switch (numberOfMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: {
                System.out.println("31 день");
                break;
            }
            case 2: {
                System.out.println("28 днів");
                break;
            }
            case 4:
            case 6:
            case 9:
            case 11: {
                System.out.println("30 днів");
                break;
            }
            default: {
                System.out.println("Місяця за таким номером не існує");
                break;
            }
        }
    }
}
