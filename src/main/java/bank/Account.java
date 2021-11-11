package bank;

import java.util.Objects;

/**
 * Класс описывает модель банковского счёта.
 * @author Danil Bodrov
 * @version 1.0
 */
public class Account {

    /**
     * Хранение реквизита счёта типа String и баланса на счёте типа double
     */
    private String requisite;
    private double balance;

    /**
     * Конструктор, который инициализирует поля класса requisite и balance
     * @param requisite
     * @param balance
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метода возвращает значение поля requisite
     * @return возвращает поле requisite
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метода присваивает значение полю requisite
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метода возвращает значение поля balance
     * @return возвращает поле balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метода присваивает значение полю balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Account account = (Account) obj;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }

}
