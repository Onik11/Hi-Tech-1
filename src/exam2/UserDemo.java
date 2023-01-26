package exam2;

public class UserDemo {
    public static void main(String[] args) {
        User user = new User(23,"Mark");
        User user1 = new User(21,"Onik");
        User user2 = new User(13,"Aram");
        User user3 = new User(56 , "Karen");
        User user4 = new User(37,"Vzgo");

        User[] users = {user, user1, user2, user3, user4};

        System.out.println(findByName(users).getName());
    }

    public static User findByName(User[] users) {
        User user = new User();

        for (int i = 0; i < users.length; i++) {

            if (users[i].getName().equals("Mark")) {
                return user = users[i];
            } else {
                user.setName("there is not Mark");
            }


        }return user;

    }
}
