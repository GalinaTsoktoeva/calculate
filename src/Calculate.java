import java.io.IOException;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) throws IOException{
        int a, b, res;
        res = 0;
        String[] arrayExp = new String[3];
        Scanner in = new Scanner(System.in);

        System.out.println("Привет! Я умный калькулятор");
        System.out.print("Введите выражение: ");
        String expression = in.nextLine().trim();

        arrayExp = expression.split(" ");

        if (arrayExp.length != 3) {
            throw new IOException("Некорректно введено выражение!");
        }

        String r = arrayExp[1];
        a = Integer.parseInt(arrayExp[0]);
        b = Integer.parseInt(arrayExp[2]);
        if ((a <= 10) && (a > 0) && (b <= 10) && (b > 0) ) {

            switch (r) {
                case "-":
                    res = a - b;
                    break;
                case "+":
                    res = a + b;
                    break;
                case "/":
                    res = a / b;
                    break;
                case "*":
                    res = a * b;
                    break;
                default:
                    throw new IOException("Введен некорректный математический оператор!");
            }
        } else {
            throw new IOException("Числа должны быть в диапазоне 1-9");
        }

        System.out.print(res);

        in.close();
        }
    }
