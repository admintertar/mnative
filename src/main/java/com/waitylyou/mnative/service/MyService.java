package com.waitylyou.mnative.service;

import com.waitylyou.mnative.entity.AllocateOperation;

import java.util.List;

/**
 * @author PING
 * @date 2023/10/27 11:51
 */
public interface MyService {

    String getStr();

    List<AllocateOperation> selectList();

}
