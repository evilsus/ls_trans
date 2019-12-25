package cn.redinfo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;

import cn.redinfo.biz.ba.service.BasArchivesService;
import cn.redinfo.biz.elder.oo.po.ElderInfo;
import cn.redinfo.biz.elder.service.ElderInfoService;

@SpringBootTest
class LsTransApplicationTests {

    @Autowired
    ElderInfoService service;
    
    @Autowired
    BasArchivesService baService;
    
    public static int size = 5000;
    
    
	@Test
	void contextLoads(){
	    biz(147766);
	}
	
	
	public int biz(int id) {
	    System.out.println("id---"+id);
	    List<ElderInfo> list = baService.getElder(id, size);
	    
	    if(!CollectionUtils.isEmpty(list)) {
	        int lastId = list.get(list.size() - 1).getId().intValue();
	        System.out.println(list.size() + "----" + lastId);
	        service.insertElder(list);
	        return biz(lastId);
	    }
	    return 0;
	}
	
	@Test
	void sizeTest(){
	    List<ElderInfo> list = baService.getElder(21740, size);
	    System.out.println(list.size());
	}
	

}
