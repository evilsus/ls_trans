package cn.redinfo.common.config;

import java.util.ArrayList;
import java.util.List;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.FileOutConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @auther: L
 * @date: 2019年7月24日 上午9:51:50
 * @Description: mybatisplus代码生成器
 */
public class MpGeneration {
	
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        String projectPath = System.getProperty("user.dir"); 
//        String projectPath = "E:\\bean"; 
        
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(projectPath+"\\src\\main\\java")
        .setAuthor("liyl")
        .setFileOverride(false)//文件覆盖
        .setActiveRecord(false)// 不需要ActiveRecord特性的请改为false
        .setIdType(IdType.AUTO)//主键策略
        .setEnableCache(false)// XML 二级缓存
        .setBaseResultMap(true)// XML ResultMap
        .setBaseColumnList(true)// XML columList
            // 自定义文件命名，注意 %s 会自动填充表实体属性！
        .setServiceName("%sService")
        .setServiceImplName("%sServiceImpl")
        .setMapperName("%sDao")
        .setXmlName("%sMapper");
        
       
 

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL)
	      .setDriverName("com.mysql.cj.jdbc.Driver")
	      .setUsername("root")
	      .setUrl("jdbc:mysql://127.0.0.1:3306/lsdb_18?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&serverTimezone=Asia/Shanghai");
       
 

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setCapitalMode(true)//全局大写命名
        .setDbColumnUnderline(true)//表列名是否使用了下划线
        .setNaming(NamingStrategy.underline_to_camel)//下划线转驼峰
        .setRestControllerStyle(true)
        .entityTableFieldAnnotationEnable(false)
        //.setTablePrefix(new String[] { "" })// 此处可以修改为您的表前缀
        .setInclude(new String[] {"bas_archives"}); // 需要生成的表
        
        
       
 

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("cn.redinfo.biz.ba")
        .setController("controller")
        .setService("service")
        .setServiceImpl("service.impl")
        .setMapper("dao")
        .setEntity("oo.po");
        //.setXml("xml.user");
        
        
        // 自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };

        // 如果模板引擎是 freemarker
        //String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
         String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/src/main/resources/mybatis/mapper/ba/" + tableInfo.getEntityName() + "Mapper" + ".xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        // 配置模板
        TemplateConfig templateConfig = new TemplateConfig();
        // 配置自定义输出模板
        //指定自定义模板路径，注意不要带上.ftl/.vm, 会根据使用的模板引擎自动识别
        // templateConfig.setEntity("templates/entity2.java");
        // templateConfig.setService();
        // templateConfig.setController();
        templateConfig.setXml(null);
        mpg.setTemplate(templateConfig);
        
    	
        mpg.setGlobalConfig(gc)
        .setDataSource(dsc)
        .setStrategy(strategy)
        .setPackageInfo(pc);
        // 执行生成
        mpg.execute();
    }
}
