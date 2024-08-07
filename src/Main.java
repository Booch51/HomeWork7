//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        System.out.println("Задача 1");

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача 2");

        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a);
        }
        System.out.println();
        int b = 11;
        while (b > 1) {
            b = b - 1;
            System.out.print(" " + b);
        }
        System.out.println();

        System.out.println("Задача 3");

        int Y = 12_000_000;
        int year = 0;
        while (year < 10) {
            Y = Y + (Y / 1000 * 17) - (Y / 1000 * 8);
            year = year + 1;
            System.out.println("Год "+ year + ", численность населения составляет " + Y);
        }

        System.out.println("Задача 4");

        int deposit = 15000;
        int month = 0;
        while (deposit < 12_000_000) {
            deposit *= 1.07;
            month = month +1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + deposit + " рублей.");
        }

        System.out.println("Задача 5");

        int contribution = 15000;
        int period = 0;
        while (contribution < 12_000_000) {
            contribution *= 1.07;
            period = period +1;
            if (period % 6 == 0) {
                System.out.println("Месяц " + period + ", сумма накоплений равна " + contribution + " рублей.");
            }
        }

        System.out.println("Задача 6");

        int money = 15000;
        int totalMonth = 0;
        while (totalMonth <= 108) {
            money *= 1.07;
            totalMonth = totalMonth + 1;
            if (totalMonth % 6 == 0) {
                System.out.println("Месяц " + totalMonth + ", сумма накоплений равна " + money + " рублей.");
            }
        }

        System.out.println("Задача 7");

        int friday = 5;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }

        System.out.println("Задача 8");

        int realYear = 2024;
        int startYear = realYear - 200;
        int finishYear = realYear + 100;
        for (int d = startYear; d <= finishYear; d++) {
            if (d % 79 ==0) {
                System.out.println(d);
            }
        }




    }
}