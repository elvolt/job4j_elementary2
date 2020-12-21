package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("user not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User not valid");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Short username");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Pe", true)
        };
        try {
            User user = findUser(users, "Pe");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            System.out.println("User is invalid");
        } catch (UserNotFoundException unf) {
            System.out.println("User not found");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
