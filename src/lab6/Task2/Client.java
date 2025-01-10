package lab6.Task2;

public class Client extends Man implements printInfo {

    private String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public Client(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    public void print() {
        System.out.println("Имя и фамилия клиента: "+getFirstName()+" "+getLastName()+"\nНазвание банка: "+getNameBank());

    }
}
