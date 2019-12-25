package cn.redinfo.biz.elder.service;

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
public interface ElderInfoService extends IService<ElderInfo> {

    void insertElder(List<ElderInfo> elder);
    
}
