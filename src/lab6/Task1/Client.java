package lab6.Task1;

public class Client extends Man {

    private String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public Client(String firstName, String lastName, String nameBank) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    void printInfo() {
        System.out.println("Имя и фамилия клиента: "+getFirstName()+" "+getLastName()+"\nНазвание банка: "+getNameBank());
    }
}
