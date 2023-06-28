import java.util.HashMap;
import java.util.Map;

/**
 * 核心流转携带的上下文
 */
public class Context {

    private Map<String, Object> context = new HashMap<>(16);

    public Object getConfig(String key) {
        return context.get(key);
    }

    public void setConfig(String key, Object value) {
        context.put(key, value);
    }
}
