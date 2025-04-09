package com.yupi.project.model.dto.interfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 测试接口信息调用请求对象
 *
 * @TableName product
 */
@Data
public class InterfaceInfoInvokeRequest implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 请求参数（前端给后台的请求参数）
     */
    private String userRequestparams
            ;

    private static final long serialVersionUID = 1L;
}