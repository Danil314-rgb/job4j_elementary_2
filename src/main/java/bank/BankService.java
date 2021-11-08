package bank;

import java.util.*;

public class BankService {

    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void addAccount(String passport, Account account) {
        User userSearch = findByPassport(passport);
        if (userSearch != null) {
            List<Account> userAccounts = users.get(userSearch);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User entry : users.keySet()) {
            if (entry.getPassport().equals(passport)) {
                return entry;
            }
        }
        return null;
    }

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