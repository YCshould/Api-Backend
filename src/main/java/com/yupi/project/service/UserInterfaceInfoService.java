package com.yupi.project.service;

import com.baomidou.mybatisplus.extension.service.IService;

import com.yupi.project.model.entity.UserInterfaceInfo;


/**
* @author WuXHa
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2024-12-14 20:13:00
*/
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {
    /**
     * 请求是否合法
     * @param interfaceInfo
     * @param add
     */
    void validUserInterfaceInfo(UserInterfaceInfo interfaceInfo, boolean add);

    /**
     * 统计调用次数
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokecount(long interfaceInfoId,long userId );
}
