package com.hjk.project.service.impl;
import java.util.Date;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjk.project.common.ErrorCode;
import com.hjk.project.exception.BusinessException;
import com.hjk.project.model.entity.InterfaceInfo;
import com.hjk.project.model.entity.InterfaceInfo;
import com.hjk.project.model.enums.PostGenderEnum;
import com.hjk.project.model.enums.PostReviewStatusEnum;
import com.hjk.project.service.InterfaceInfoService;
import com.hjk.project.mapper.InterfaceInfoMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

/**
 *
 * @author hjk
 */
@Service
public class InterfaceInfoServiceImpl extends ServiceImpl<InterfaceInfoMapper, InterfaceInfo>
    implements InterfaceInfoService{

    @Override
    public void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add) {
        if (interfaceInfo == null) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        String name = interfaceInfo.getName();
        String requestHeader = interfaceInfo.getRequestHeader();
        String responseHeader = interfaceInfo.getResponseHeader();
        String method = interfaceInfo.getMethod();
        String url = interfaceInfo.getUrl();
        String description = interfaceInfo.getDescription();

        // 创建时，所有参数必须非空
        if (add) {
            if (StringUtils.isAnyBlank(name, requestHeader, responseHeader, method, url, description) ) {
                throw new BusinessException(ErrorCode.PARAMS_ERROR);
            }
        }
        if (StringUtils.isNotBlank(name) && name.length() > 46) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "名称过长");
        }
    }
}




