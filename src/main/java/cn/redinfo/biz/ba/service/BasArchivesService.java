package cn.redinfo.biz.ba.service;

import cn.redinfo.biz.ba.oo.po.BasArchives;
import cn.redinfo.biz.elder.oo.po.ElderInfo;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
public interface BasArchivesService extends IService<BasArchives> {

    List<ElderInfo> getElder(Integer id, Integer size);
    
}
