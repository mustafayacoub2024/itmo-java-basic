package lab6.Task1;

public class BankEmployee extends Man {

    private String nameBank;

    public String getNameBank() {
        return nameBank;
    }

    public BankEmployee(String firstName, String lastName,String nameBank ) {
        super(firstName, lastName);
        this.nameBank = nameBank;
    }

    @Override
    void printInfo() {
        System.out.println("Имя и фамилия работника банка: "+getFirstName()+" "+getLastName()+"\nНазвание банка: "+getNameBank());
    }
}
