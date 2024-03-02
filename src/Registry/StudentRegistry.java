package Registry;
import java.util.HashMap;
import java.util.Map;
public class StudentRegistry {
    private final Map<String, Student> map=new HashMap<>();
    public void register(String key,Student val){
        map.put(key, val);
    }
    public Student get(String key){
        return map.get(key);
    }
}
