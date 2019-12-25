/**
 * @auther: liyl
 * @date: 2019年12月5日 上午10:43:36
 * @Description: TODO
 */
package cn.redinfo.common.db;

/**
 * @auther: L
 * @date: 2019年12月5日 上午10:43:36
 * @Description: TODO
 */
public class DbContextHolder {
    private static final ThreadLocal contextHolder = new ThreadLocal<>();
    /**
     * 设置数据源
     * @param dbTypeEnum
     */
    public static void setDbType(DBTypeEnum dbTypeEnum) {
        contextHolder.set(dbTypeEnum.getValue());
    }

    /**
     * 取得当前数据源
     * @return
     */
    public static String getDbType() {
        return (String) contextHolder.get();
    }

    /**
     * 清除上下文数据
     */
    public static void clearDbType() {
        contextHolder.remove();
    }
}
