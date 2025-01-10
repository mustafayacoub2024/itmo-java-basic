package lab6.Task2;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Иван","Иванов","Сбербанк");
        client.print();
        BankEmployee bankEmployee = new BankEmployee("Пётр","Петров","Альфабанк");
        bankEmployee.print();
    }
}
