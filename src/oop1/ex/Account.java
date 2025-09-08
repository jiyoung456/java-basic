package oop1.ex;

public class Account {
    int balance;//잔액

    //입금
    void deposit(int amount) {
        balance += amount;
    }

    //출금
    void withdraw(int amount) {
        //잔액부족
        if (amount > balance) {
            System.out.println("잔액부족");
        } else {
            balance -= amount;
        }
    }
}
