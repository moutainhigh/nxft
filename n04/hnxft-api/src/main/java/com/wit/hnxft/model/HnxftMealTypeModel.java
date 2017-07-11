package com.wit.hnxft.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.BuilderCall;

/**
 * 餐别类型模型
 * @author lyb
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@BuilderCall
public class HnxftMealTypeModel {

    /** 1. [不可空] 餐别类型id */
    private String id;

    /** 2. [不可空] 餐别类型名称 */
    private String mealTypeName;

    /** 3. [不可空] 就餐时间  24YYMM */
    private String mealTime;

    /** 4. [不可空] 下单提前小时数 */
    private Integer orderBefore;

    /** 5. [可空] 规则描述  例如  晚上8：00前，可点次日早餐 */
    private String orderRuleDesc;

    /** 6. [不可空] 是否可用？ */
    private Boolean available;

    /** 7. [可空] 备注 */
    private String mealTypeDesc;
}
