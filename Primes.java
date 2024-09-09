public class Primes {

    public static void main(String[] args) {
        // Перебираем числа от 2 до 100 включительно
        for (int i = 2; i < 100; i++) {
            // Проверка является ли текущее число простым
            if (isPrime(i)) {
                // Если число простое выведем его на экран
                System.out.println(i);
            }
        }
    }

    // Проверка является ли переданное число простым
    public static boolean isPrime(int n) {
        // Проверяем делители от 2 до (n-1)
        for (int i = 2; i < n; i++) {
            // Если число делится на i без остатка, оно не является простым
            if (n % i == 0) {
                return false;
            }
        }
        // Если не нашли делителей,число простое
        return true;
    }
}
