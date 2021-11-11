package bank;

import java.util.*;

/**
 * Класс описывает модель банковской системы. Взаимодействие пользоватлея банка User и
 * банковского счёта Account
 * @author Danil Bodrov
 * @version 1.0
 */
public class BankService {

    /**
     * Хранение осуществляется в коллекции типа HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод по добавлению нового пользователя в систему
     * @param user входные данные для проверки на наличие пользователя
     */
    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    /**
     * Метод по добавлению нового счёта к пользователю, если такой пользователь существует
     * @param passport входные данные для проверки на наличие пользователя
     * @param account входные данные для проверки на наличие счёта
     */
    public void addAccount(String passport, Account account) {
        User userSearch = findByPassport(passport);
        if (userSearch != null) {
            List<Account> userAccounts = users.get(userSearch);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    /**
     * Метод для поиска пользователя по пастортным данным
     * @param passport входные данные для проверки на наличие пользователя
     * @return возвращает найденного польщователя если он есть, если нет то возвращает null
     */
    public User findByPassport(String passport) {
        for (User entry : users.keySet()) {
            if (entry.getPassport().equals(passport)) {
                return entry;
            }
        }
        return null;
    }

    /**
     * Метод для поиска пользователя по реквезитам
     * @param passport входные данные для проверки на наличие пользователя
     * @param requisite входные данные для проверки на наличие счёта
     * @return возвращает найденный счёт пользователя если он есть, если нет то возвращает null
     */
    public Account findByRequisite(String passport, String requisite) {
        User userSearch = findByPassport(passport);
        if (userSearch != null) {
            List<Account> userAccounts = users.get(userSearch);
            for (Account item : userAccounts) {
                if (item.getRequisite().equals(requisite)) {
                    return item;
                }
            }
        }
        return null;
    }

    /**
     * Метода для перечисления денег между счетами пользователя
     * @param srcPassport входные данные паспорта пользователя, с которого будут списаны деньги
     * @param srcRequisite входные данные реквезитов, с которых будут списаны деньги
     * @param destPassport входные данные паспорта пользователя, на который будут добавлены деньги
     * @param destRequisite входные данные реквезитов, на которые будут добавлены деньги
     * @param amount входные данные, сумма перевода
     * @return возращает значение true при успешном переводе денег с счёта на счёт,
     * либо false если перевод не был выполнен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if (srcAccount.getBalance() >= amount) {
                destAccount.setBalance(destAccount.getBalance() + amount);
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                return true;
            }
        }
        return false;
    }
}
