package com.hjk.project.service;

import com.hjk.project.model.entity.InterfaceInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hjk.project.model.entity.Post;

/**
 *
 * @author hjk
 */
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 参数校验
     * @param interfaceInfo
     * @param add
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

