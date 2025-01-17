package lab8.Task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<User, Integer> map = new HashMap<>();
        map.put(new User("Маша"), 150);
        map.put(new User("Даша"), 350);
        map.put(new User("Саша"), 230);
        map.put(new User("Паша"), 820);

        User user = User.findUser();

        Integer score = map.get(user);
        System.out.println(score);

    }
}