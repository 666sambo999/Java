import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.stream.IntStream;


public class DZ {
    // Календарь
    public static final Calendar findHolyDay(int year) {
        if (year <= 1582) {
            throw new IllegalArgumentException("Algorithm invalid before April 1583");
        }
        int golden, century, x, z, d, epact, n;

        golden = (year % 19) + 1; /* E1: metonic cycle */
        century = (year / 100) + 1; /* E2: e.g. 1984 was in 20th C */
        x = (3 * century / 4) - 12; /* E3: leap year correction */
        z = ((8 * century + 5) / 25) - 5; /* E3: sync with moon's orbit */
        d = (5 * year / 4) - x - 10;
        epact = (11 * golden + 20 + z - x) % 30; /* E5: epact */
        if ((epact == 25 && golden > 11) || epact == 24)
            epact++;
        n = 44 - epact;
        n += 30 * (n < 21 ? 1 : 0); /* E6: */
        n += 7 - ((d + n) % 7);
        if (n > 31) /* E7: */
            return new GregorianCalendar(year, 4 - 1, n - 31); /* April */
        else
            return new GregorianCalendar(year, 3 - 1, n); /* March */
    }

    public static void main(String[] argv) {
        int year = 2013;
        System.out.println(findHolyDay(year).getTime());

    }
// Палиндром
    public class Palindrome {
        public static void main(String args) {
            int rem, rev = 0, temp;
            int n = 121;
            temp = n;
            while (n != 0) {
                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            if (temp == rev) {
                System.out.println(temp + " is a palindrome.");
            } else {
                System.out.println(temp + " is not a palindrome.");
            }
        }
    }

    // Фибанничи
    public class FibonacciIterative {
        public static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите количество терминов: ");
            int n = scanner.nextInt();
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Ряд Фибоначчи до " + n + " терминов:");
            for (int i = 1; i <= n; i++) {
                System.out.print(firstTerm + ", ");
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
            scanner.close();
        }
    }
    // Простые числа
    public static boolean isPrime(final int number) {
        return IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }

    // Совершенные числа
    class CompProject1 {
        public static void main() {
            int num, sum = 0;
            for (num = 1; num < 100; num++) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        sum += j;
                    }
                }
                if (sum == num) {
                    System.out.println(sum);
                }
            }
        }
    }

}
