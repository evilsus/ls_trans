package cn.redinfo.biz.elder.service.impl;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.redinfo.biz.ba.dao.BasArchivesDao;
import cn.redinfo.biz.elder.dao.ElderInfoDao;
import cn.redinfo.biz.elder.oo.po.ElderInfo;
import cn.redinfo.biz.elder.service.ElderInfoService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
@Service
public class ElderInfoServiceImpl extends ServiceImpl<ElderInfoDao, ElderInfo> implements ElderInfoService {

    @Autowired
    BasArchivesDao baDao;
    
    @Override
    @Transactional
    public void insertElder(List<ElderInfo> elder) {
        
       baseMapper.insertElderInfo(elder);
       baseMapper.insertElderInfoServ(elder);
       baseMapper.createElderInsertSub(elder);
       
       Iterator<ElderInfo> it = elder.iterator();
       while(it.hasNext()) {
           ElderInfo ei = it.next();
           if(CollectionUtils.isEmpty(ei.getMemList())) {
               it.remove();
           }
       }

       if(!CollectionUtils.isEmpty(elder))
           baseMapper.insertElderInfoMember(elder);
       
    }
    
}
