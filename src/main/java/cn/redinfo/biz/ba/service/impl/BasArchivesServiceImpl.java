package cn.redinfo.biz.ba.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import cn.redinfo.biz.ba.dao.BasArchivesDao;
import cn.redinfo.biz.ba.oo.po.BasArchives;
import cn.redinfo.biz.ba.service.BasArchivesService;
import cn.redinfo.biz.elder.oo.po.ElderInfo;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
@Service
public class BasArchivesServiceImpl extends ServiceImpl<BasArchivesDao, BasArchives> implements BasArchivesService {

    @Override
    public List<ElderInfo> getElder(Integer id, Integer size) {
        return baseMapper.getElder(id, size);
    }

}
