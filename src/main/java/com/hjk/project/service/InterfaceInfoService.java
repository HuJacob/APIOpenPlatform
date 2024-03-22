package com.hjk.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjk.apicommon.model.entity.InterfaceInfo;

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

