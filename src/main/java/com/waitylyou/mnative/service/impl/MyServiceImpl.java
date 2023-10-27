package com.waitylyou.mnative.service.impl;

import com.waitylyou.mnative.entity.AllocateOperation;
import com.waitylyou.mnative.mapper.AllocateOperationMapper;
import com.waitylyou.mnative.service.MyService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PING
 * @date 2023/10/27 11:51
 */
@Service
public class MyServiceImpl implements MyService {

    @Resource
    private AllocateOperationMapper allocateOperationMapper;

    @Override
    public String getStr() {
        return "STR";
    }

    @Override
    public List<AllocateOperation> selectList() {
        return allocateOperationMapper.selectList();
    }
}
