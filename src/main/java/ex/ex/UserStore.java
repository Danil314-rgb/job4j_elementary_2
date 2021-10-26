package ex.ex;

public class UserStore {
    public static User findUser(User[] users, String logic) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(logic)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("Пользователь не найдет");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.isValid() && user.getUsername().length() > 2) {
            return true;
        }
        throw new UserInvalidException("Пользователь не валидный");
    }

    public static void main(String[] args) {
        User[] users = {new User("Danil", true)};
        try {
            User user = findUser(users, "Danil");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }
    }
}
