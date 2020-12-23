package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return this.amount;
    }
    public void Depositka(double sum){
        this.amount += sum;

        System.out.println(" Твое Золото: " + getAmount() );
    }

    public void withDraw(int sum) throws LimitException {
        if ( sum > this.amount){
            throw new LimitException("ЛОХ денег не хватаетXD: ", this.amount);

        }
        this.amount = this.amount - sum;
        System.out.println("Тебя обокрали на: " + this.amount + "Золота");
    }
}
