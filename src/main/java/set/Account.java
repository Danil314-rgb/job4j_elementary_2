package set;

import java.util.Objects;

public class Account {

    private String password;
    private String username;
    private String deposit;

    public Account(String password, String username, String deposit) {
        this.password = password;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(password);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(password, account.password);
    }

    @Override
    public String toString() {
        return "Account{" + "passport='" + password + '\'' + ", username='" + username + '\'' + ", deposit='" + deposit + '\'' + '}';
    }
}
