
public class Plugin2 implements Plugin {

    @Override
    public void doBefore() {
        System.out.println("loading plugin2");
    }

    @Override
    public void doExecute(Context context) {
        System.out.println("executing plugin2");
    }

    @Override
    public void doAfter() {
        System.out.println("finish plugin2");

    }

    static {
        PluginType type = new PluginType("plugin2", "1.0.1", Plugin2.class);
        PluginRegister.registerPlugin(type, new Plugin2());
    }
}
