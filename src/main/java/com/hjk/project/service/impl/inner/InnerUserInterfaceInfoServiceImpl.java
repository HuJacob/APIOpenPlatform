package com.hjk.project.service.impl.inner;

import com.hjk.apicommon.service.InnerUserInterfaceInfoService;
import com.hjk.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;
import javax.annotation.Resource;

/**
 * 内部用户接口信息服务实现类
 *
 * @author hjk
 *
 */
@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }
}
