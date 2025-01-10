package lab6.Task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван","Иванов","Сбербанк");
        client.printInfo();
        BankEmployee bankEmployee = new BankEmployee("Пётр","Петров","Альфабанк");
        bankEmployee.printInfo();
    }
}
