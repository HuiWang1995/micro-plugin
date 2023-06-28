import java.util.HashMap;
import java.util.Map;

/**
 * 插件注册
 */
public class PluginRegister {

    /**
     * 存储加载的插件
     */
    private static final Map<PluginType, Plugin> PLUGIN_MAP = new HashMap<>(16);

    /**
     * 注册插件
     * @param type 类型
     * @param plugin 插件
     */
    public static void registerPlugin(PluginType type, Plugin plugin) {
        System.out.println("PluginRegister Loading Plugin " + type);
        PLUGIN_MAP.put(type, plugin);
    }

    public static Plugin getPlugin(PluginType type) {
        Plugin plugin = PLUGIN_MAP.get(type);
        if (null == plugin) {
            throw new RuntimeException("plugin not exist " + type);
        }
        return plugin;
    }
}
