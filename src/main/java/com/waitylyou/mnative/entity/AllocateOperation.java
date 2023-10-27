package com.waitylyou.mnative.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


/**
 * 调拨单操作日志
 *
 * @author jiangdongping@tcl.com 2021-09-30 06:33:07
 */
@Data
public class AllocateOperation implements Serializable {

    public static final String FIELD_ID = "id";
    public static final String FIELD_OPERATOR = "operator";
    public static final String FIELD_OPERATION_NODE = "operationNode";
    public static final String FIELD_OPERATION_TIME = "operationTime";
    public static final String FIELD_ORDER_ID = "orderId";
    public static final String FIELD_ORDER_CODE = "orderCode";
    public static final String FIELD_REMARK = "remark";
    public static final String FIELD_ENT_ID = "entId";
    public static final String FIELD_ENT_NAME = "entName";

    //
    // 业务方法(按public protected private顺序排列)
    // ------------------------------------------------------------------------------

    public interface Insert {
    }

    public interface Update {
    }

    //
    // 数据库字段
    // ------------------------------------------------------------------------------

    private Long id;

    private String operator;

    private String operationNode;

    private String operationStatus;

    private Date operationTime;

    private Long orderId;

    private String orderCode;

    private String remark;

    private Long entId;

    private String entName;

    private Long tenantId;

    //
    // 非数据库字段
    // ------------------------------------------------------------------------------

}
