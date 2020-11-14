package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User findUser = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                findUser = user;
            }
        }

        if (findUser == null) {
            throw new UserNotFoundException("User not found");
        }
        return findUser;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User not valid");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("Ivan Ivanov", false)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
//            System.out.println(user.toString());
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            System.out.println("User not valid");

        } catch (UserNotFoundException ef) {
            System.out.println("User not found");
        }
    }
}
