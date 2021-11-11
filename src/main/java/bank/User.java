package bank;

import java.util.Objects;

/**
 * Класс описывает модель пользователя банка.
 * @author Danil Bodrov
 * @version 1.0
 */
public class User {

    /**
     * Хранение паспортных данных passport типа String и ФИО пользователя username типа String
     */
    private String passport;
    private String username;

    /**
     * Конструктор, который инициализирует поля класса passport и balance
     * @param passport
     * @param username
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        return Objects.equals(passport, user.passport);
    }
}
