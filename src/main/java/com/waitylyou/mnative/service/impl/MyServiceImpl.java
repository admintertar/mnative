package com.waitylyou.mnative.service.impl;

import com.waitylyou.mnative.entity.AllocateOperation;
import com.waitylyou.mnative.mapper.AllocateOperationMapper;
import com.waitylyou.mnative.service.MyService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author PING
 * @date 2023/10/27 11:51
 */
@Slf4j
@Service
public class MyServiceImpl implements MyService {

    private final AllocateOperationMapper allocateOperationMapper;

    public MyServiceImpl(AllocateOperationMapper allocateOperationMapper) {
        log.error("{},{}",allocateOperationMapper,allocateOperationMapper==null);
        this.allocateOperationMapper = allocateOperationMapper;
    }

    @Override
    public String getStr() {
        return "STR";
    }

    @Override
    public List<AllocateOperation> selectList() {
        return allocateOperationMapper.selectList();
    }
}
