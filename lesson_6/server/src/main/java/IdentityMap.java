import java.util.HashMap;
import java.util.Map;

public class IdentityMap {
    private Map<Long, User> userMap = new HashMap<>();

    public void addUser (User user) {
        userMap.put(user.getId(), user);
    }

    public User getUserById(Long id){
        return userMap.get(id);
    }
}
