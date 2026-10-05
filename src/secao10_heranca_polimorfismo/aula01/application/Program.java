package secao10_heranca_polimorfismo.aula01.application;

import secao10_heranca_polimorfismo.aula01.entities.Account;
import secao10_heranca_polimorfismo.aula01.entities.BusinessAccount;
import secao10_heranca_polimorfismo.aula01.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    static void main() {

        Locale.setDefault(Locale.US);

//        Account acc = new Account(1001, "Alex", 0.0);
//        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
//
//        // Upcasting
//        Account acc1 = bacc;
//        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
//        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
//
//        // Downcasting
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//        acc4.loan(100.0);
//
//        // BusinessAccount acc5 = (BusinessAccount) acc3; // Uma subclasse não pode ser convertida para outra subclasse
//        if (acc3 instanceof BusinessAccount) {
//            BusinessAccount acc5 = (BusinessAccount) acc3;
//            acc5.loan(200.0);
//            System.out.println("Loan!");
//        }
//
//        if (acc3 instanceof SavingsAccount) {
//            SavingsAccount acc5 = (SavingsAccount) acc3;
//            acc5.updateBalance();
//            System.out.println("Update!");

//        Account acc1 = new Account(1001, "Alex", 1000.0);
//        acc1.withdraw(200);
//        System.out.println(acc1.getBalance());
//
//        Account acc2 = new SavingsAccount(1002, "Marina", 1000.0, 0.01);
//        acc2.withdraw(200.0);
//        System.out.println(acc2.getBalance());
//
//        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
//        acc3.withdraw(200.0);
//        System.out.println(acc3.getBalance());

//        Account x = new Account(1020, "Alex", 1000.0);
//        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
//
//        x.withdraw(50.0);
//        y.withdraw(50.0);
//
//        System.out.println(x.getBalance());
//        System.out.println(y.getBalance());

        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        accountList.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        accountList.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
        accountList.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));

        double sum = 0.0;
        for (Account ac : accountList) {
            sum += ac.getBalance();
        }

        System.out.println("Total balance: $ " + sum);

        for (Account acc : accountList) {
            acc.deposit(10.0);
        }

        for (Account acc : accountList) {
            System.out.println("Updated balance for account " + acc.getNumber() + ": " + acc.getBalance());
        }

    }
}
