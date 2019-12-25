/**
 * @auther: L
 * @date: 2019年8月3日 下午7:44:20
 * @Description: TODO
 */
package cn.redinfo.common.db;

/**
 * @auther: L
 * @date: 2019年8月3日 下午7:44:20
 * @Description: TODO
 */
public enum DBTypeEnum {
    db1("db1"), 
    db2("db2")
    ;
    
    private String value;
    
    private DBTypeEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
