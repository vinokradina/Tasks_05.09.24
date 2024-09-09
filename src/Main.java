import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args)
    {
        // Задача 1
//        try {
//            System.out.println(maxNumber(10, 3));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 2
//        try {
//            System.out.println(division(100, 32));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 3
//        try {
//            System.out.println(convert("34"));
//        } catch (NumberFormatException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 4
//        try {
//            System.out.println(age(144));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 5
//        try {
//            System.out.println(root(100));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 6
//        try {
//            System.out.println(factorial(5));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 7
//        int[] test = {1, 2, 0, 5, 2, 14};
//
//        try {
//            System.out.println(checkZero(test));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 8
//        try {
//            System.out.println(degree(5, 3));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 9
//        String line = "Я люблю Java!";
//        int x = 9;
//
//        try {
//            System.out.println(croppingLine(line, x));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 10
//        int[] array = {1, 5, 8, 3, 9};
//        int el = 2;
//
//        try {
//            System.out.println(searchElement(array, el));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 11
//        int x = -1;
//
//        try {
//            System.out.println(convertToBinary(x));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 12
//        int x = 6;
//        int y = 0;
//
//        try {
//            System.out.println(divisibilityChecking(x, y));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 13
//        List<Integer> list =  new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(5);
//
//        int index = 5;
//
//        try {
//            System.out.println(getElement(list, index));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 14
//        try {
//            System.out.println(isPasswordStrong("qwerty"));
//        } catch (WeakPasswordException e) {
//            System.out.println((e.getMessage()));
//        }

        // Задача 15
//        String date = "231.02.2024";
//
//        try {
//            System.out.println(isDateValid(date));
//        } catch (DateTimeException e)
//        {
//            System.out.println(e.getMessage());
//        }

        // Задача 16
//        String line1 = null;
//        String line2 = " мир";
//
//        try {
//            System.out.println(concatenate(line1, line2));
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 17
//        try {
//            System.out.println(remainder(12, 5));
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 18
//        try {
//            System.out.println(square(-21));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 19
//        try {
//            System.out.println(tempConvert(23));
//        } catch (IllegalArgumentException e) {
//            System.out.println(e.getMessage());
//        }

        // Задача 20
        String line = "";
        try {
            System.out.println(isNullOrEmptyString(line));
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
        }

    }

//    Задача 1
//    public static int maxNumber (int x, int y)
//    {
//        if (x == y)
//        {
//            throw new IllegalArgumentException("Числа равны!");
//        }
//        return Math.max(x, y);
//    }

//    Задача 2
//    public static double division (double x, double y)
//    {
//        if (y == 0)
//        {
//            throw new ArithmeticException("Делить на 0 нельзя!");
//        }
//        return x / y;
//    }

//    Задача 3
//    public static int convert (String line)
//    {
//        try
//        {
//            return  Integer.parseInt(line);
//        }
//        catch (NumberFormatException e)
//        {
//            throw new NumberFormatException("Невозможно конвертировать строку в число!");
//        }
//    }

//    Задача 4
//    public static int age (int x)
//    {
//        if (x < 0 || x > 150)
//        {
//            throw new IllegalArgumentException("Возраст выходит за допустимые рамки!");
//        }
//        return x;
//    }

//    Задача 5
//    public static double root (double x)
//    {
//        if (x < 0)
//        {
//            throw new IllegalArgumentException("Число отрицательное");
//        }
//        return Math.sqrt(x);
//    }

//    Задача 6
//    public static double factorial (int x)
//    {
//        if (x < 0)
//        {
//            throw new IllegalArgumentException("Число отрицательное");
//        }
//        double res = 1;
//        for (int i = 1; i <= x; i++) {
//            res *= i;
//        }
//        return res;
//    }

//    Задача 7
//    public static boolean checkZero (int[] array)
//    {
//        for (int num : array)
//        {
//            if (num == 0)
//            {
//                throw new IllegalArgumentException("В массиве содержится 0");
//            }
//        }
//        return true;
//    }

//    Задача 8
//    public static double degree (double x, double y)
//    {
//        double res = 0;
//        res = Math.pow(x, y);
//        if (res < 0)
//        {
//            throw new IllegalArgumentException("Степень отрицательная");
//        }
//        return res;
//    }

//    Задача 9
//    public static String croppingLine(String line, int x)
//    {
//        if (x > line.length())
//        {
//            throw new IllegalArgumentException("Число символов больше длины строки");
//        }
//        return line.substring(0, x);
//    }

//    Задача 10
//    public static int searchElement(int[] array, int x)
//    {
//        for (int i = 0; i < array.length; i++)
//        {
//            if (array[i] == x)
//            {
//                return i;
//            }
//        }
//        throw new IllegalArgumentException("Элемент не найден");
//    }

//    Задача 11
//    public static String convertToBinary(int x)
//    {
//        if (x < 0)
//        {
//            throw new IllegalArgumentException("Число не может быть отрицательным");
//        }
//        return Integer.toBinaryString(x);
//    }

//    Задача 12
//    public static boolean divisibilityChecking(int x, int y)
//    {
//        if (y == 0)
//        {
//            throw new ArithmeticException("Делить на 0 нельзя");
//        }
//        return x % y == 0;
//    }

//    Задача 13
//    public static <T> T getElement(List<T> list, int index)
//    {
//        if (index < 0 || index >= list.size())
//        {
//            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка");
//        }
//        return list.get(index);
//    }

//    Задача 14
//   public static boolean isPasswordStrong(String password) throws WeakPasswordException
//   {
//       if (password.length() < 8)
//       {
//           throw new WeakPasswordException("Пароль содержит менее 8 символов");
//       }
//       return true;
//   }

//    Задача 15
//    public static boolean isDateValid(String date)
//    {
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        try {
//            LocalDate.parse(date, formatter);
//            return true;
//        } catch (DateTimeException e) {
//            throw e;
//        }
//    }

//    Задача 16
//    public static String concatenate(String line1, String line2)
//    {
//        if (line1 == null || line2 == null)
//        {
//            throw new NullPointerException("Одна из строк равна null");
//        }
//        return line1 + line2;
//    }

//    Задача 17
//    public static int remainder(int x, int y)
//    {
//        if (y == 0)
//        {
//            throw new ArithmeticException("На 0 делить нельзя");
//        }
//        return x % y;
//    }

//    Задача 18
//    public static double square(double x)
//    {
//        if (x < 0)
//        {
//            throw new IllegalArgumentException("Число не может быть отрицательным");
//        }
//        return Math.sqrt(x);
//    }

//    Задача 19
//    public static double tempConvert(double c)
//    {
//        if (c < -273.16)
//        {
//            throw new IllegalArgumentException("Температура ниже абсолютного нуля.");
//        }
//        return (c * 9/5) + 32;
//    }

//    Задача 20
    public static boolean isNullOrEmptyString(String line)
    {
        if (line == null || line.isEmpty())
        {
            throw new IllegalArgumentException("Строка пустая или равна null");
        }
        return false;
    }
}

