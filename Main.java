public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account();
        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50);
        bobsAccount.deposit(51);

        Account bobsAccount = new Account("12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());





    }



}

