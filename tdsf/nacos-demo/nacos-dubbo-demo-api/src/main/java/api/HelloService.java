package api;

/**
 * @author wangshixiong
 * @date 2020-12-15 1:51 下午
 */
public interface HelloService {
    /**
     * api
     * @param msg
     * @return
     */
    String sayHello(String msg);

    /**
     * api
     * @param msg
     * @param interval
     * @return
     */
    String slowCall(String msg, Long interval);
}
