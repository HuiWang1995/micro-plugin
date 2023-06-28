public class CoreStarter {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("core starting");

        System.out.println("core do other businesses");

        System.out.println("core deal plugin config");
        String pluginType = args[0];
        String pluginVersion = args[1];
        String className = args[2];
        // Class.forName(className) 会触发static{}代码块
        Class clazz = Class.forName(className);
        PluginType type = new PluginType(pluginType, pluginVersion, clazz);
        System.out.println("core get plugin type" + type);
        Plugin plugin = PluginRegister.getPlugin(type);
        System.out.println("core load plugin " + plugin.getClass().toString());
        Context context = new Context();
        plugin.doBefore();
        plugin.doExecute(context);
        plugin.doAfter();
        System.out.println("core do other businesses");
    }
}
