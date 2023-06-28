/**
 * 插件
 */
public interface Plugin {

    /**
     * 执行前
     */
    void doBefore();

    /**
     * 执行
     * @param context 上下文
     */
    void doExecute(Context context);

    /**
     * 执行后
     */
    void doAfter();
}
