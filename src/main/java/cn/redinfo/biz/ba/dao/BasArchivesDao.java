package cn.redinfo.biz.ba.dao;

import cn.redinfo.biz.ba.oo.po.BasArchives;
import cn.redinfo.biz.elder.oo.po.ElderInfo;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author liyl
 * @since 2019-12-05
 */
public interface BasArchivesDao extends BaseMapper<BasArchives> {

    List<ElderInfo> getElder(@Param("id") Integer id,@Param("size") Integer size);
    
}
