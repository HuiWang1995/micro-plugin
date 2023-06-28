
public class Plugin1 implements Plugin {

    @Override
    public void doBefore() {
        System.out.println("loading plugin1");
    }

    @Override
    public void doExecute(Context context) {
        System.out.println("executing plugin1");
    }

    @Override
    public void doAfter() {
        System.out.println("finish plugin1");

    }

    static {
        PluginType type = new PluginType("plugin1", "0.0.1", Plugin1.class);
        PluginRegister.registerPlugin(type, new Plugin1());
    }
}
