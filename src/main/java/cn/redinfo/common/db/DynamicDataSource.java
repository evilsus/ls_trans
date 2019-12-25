/**
 * @auther: liyl
 * @date: 2019年12月5日 上午10:42:28
 * @Description: TODO
 */
package cn.redinfo.common.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @auther: L
 * @date: 2019年12月5日 上午10:42:28
 * @Description: TODO
 */
public class DynamicDataSource extends AbstractRoutingDataSource{

    @Override
    protected Object determineCurrentLookupKey() {
        return  DbContextHolder.getDbType();
    }

}
