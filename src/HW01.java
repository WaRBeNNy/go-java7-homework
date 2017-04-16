/* Сергей Гусельников
Создать консольное приложение, которое запрашивает имя пользователя. После ввода имени выводит строку: Hello, <введённое имя>
Пример:

Enter Your name:
Eugene

Hello, Eugene
 */

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name:");
        name = sc.nextLine();
        System.out.println("Hello, "+name);
    }
}
