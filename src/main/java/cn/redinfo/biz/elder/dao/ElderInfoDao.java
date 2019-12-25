package cn.redinfo.biz.elder.dao;

import cn.redinfo.biz.elder.oo.po.ElderInfo;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
public interface ElderInfoDao extends BaseMapper<ElderInfo> {

    void insertElderInfo(List<ElderInfo> list);
   
    void insertElderInfoServ(List<ElderInfo> list);

    void insertElderInfoMember(List<ElderInfo> list);
    
    void createElderInsertSub(List<ElderInfo> list);
    
}
