import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.LogManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class lab10 {
    static Logger Logger;
    static {
        try (FileInputStream ins = new FileInputStream("/Users/artyomartyushin/IdeaProjects/lab10/logs.config")){
            LogManager.getLogManager().readConfiguration(ins);
            Logger = Logger.getLogger(lab10.class.getName());
        } catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        try {
            Logger.log(Level.INFO, "Запуск программы");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите максимальное число N: ");
            String s = reader.readLine();
            System.out.println();
            int s1 = Integer.parseInt(s);
            if (s1 < 1) {
                System.out.println("Число N должно быть натуральным!");
                Logger.log(Level.WARNING, "Введено не натуральное число N = " + s1);
                Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
                System.exit(0);
            }
            Logger.log(Level.INFO, "Число N = " + s1);
            int randomNum = getRandomNumber(s1);
            Logger.log(Level.INFO, "Загаданное случайное число randomNum = " + randomNum);
            System.out.print("Введите количество попыток: ");
            String k = reader.readLine();
            int k1 = Integer.parseInt(k);
            if (k1 < 1) {
                System.out.println("Число k должно быть натуральным!");
                Logger.log(Level.WARNING, "Введено не натуральное число k = " + k1);
                Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
                System.exit(0);
            }
            Logger.log(Level.INFO, "Число k = " + k1);
            System.out.println();
            for (int i = 0; i < k1; i++) {
                Logger.log(Level.INFO, "Попытка " + (i+1));
                System.out.print("Как думаешь, какое число загадано? Введи его: ");
                String l = reader.readLine();
                int tr = Integer.parseInt(l);
                if (tr < 1) {
                    System.out.println("Отгадываемое число должно быть натуральным!");
                    Logger.log(Level.WARNING, "Введено не натуральное отгадываемое число = " + tr);
                    Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
                    System.exit(0);
                }
                Logger.log(Level.INFO, "Введено попытка отгадать число. Введено число: " + tr);
                System.out.println();
                if (tr == randomNum) {
                    System.out.println("Вы угадали!");
                    Logger.log(Level.INFO, "Число отгадано, это число: " + tr);
                    Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
                    System.exit(0);
                } else if (tr > randomNum) {
                    System.out.println("Загаданное число меньше!");
                    Logger.log(Level.INFO, "Введеное число не угадано, загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше!");
                    Logger.log(Level.INFO, "Введеное число не угадано, загаданное число больше.");
                }
            }
            System.out.println("Попытки закончились");
            Logger.log(Level.INFO, "Попытки закончились");
            Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
        }
        catch (NumberFormatException e) {
            System.out.println("Ошибка! Ожидалось целое число!");
            Logger.log(Level.WARNING, "Ошибка! Ожидалось целое число!", e);
            Logger.log(Level.INFO, "----------------------ЗАВЕРШЕНИЕ ПРОГРАММЫ----------------------");
        }
    }
    public static int getRandomNumber(int s1)
    {
        return (int) (Math.random() * s1) + 1;
    }
}
