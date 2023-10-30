package com.waitylyou.mnative.mapper;

import com.waitylyou.mnative.entity.AllocateOperation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author PING
 * @date 2023/10/27 16:58
 */
@Mapper
public interface AllocateOperationMapper {


    List<AllocateOperation> selectList();

}
