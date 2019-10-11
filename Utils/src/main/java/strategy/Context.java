package strategy;

/**
 * @auther gxnualbert
 * @create 2019-09-23-11:56
 */
public class Context {
    /**
     * 策略对象
     */
    private Strategy strategy;

    /**
     * @param strategy 具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * @description 执行策略方法
     * @date 2018年1月14日 下午8:43:31
     */
    public void contextInterface() {
        strategy.strategyInterface();
    }
}
