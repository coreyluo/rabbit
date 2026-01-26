package com.bazinga.rabbit.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RadicalDragonPollDTO implements Comparable<RadicalDragonPollDTO>{
    /**
     *
     *
     * @允许为空   NO
     * @是否索引   YES
     * @唯一索引   PRIMARY
     */
    private Long id;

    /**
     * 股票代码
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockCode;

    /**
     * 股票名称
     *
     * @最大长度   255
     * @允许为空   NO
     * @是否索引   NO
     */
    private String stockName;

    /**
     * 仓位系数
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Double positionRatio;

    /**
     * 0 超级龙头  2  超级打板
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer radical;

    /**
     * 是否扫版 0 不扫板1 扫板
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Integer sweepType;

    /**
     * 交易日期
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date tradeDate;

    /**
     * 买入限制涨幅
     */
    private BigDecimal highRate;

    /**
     * 开盘后时间限制(单位秒)
     */
    private Integer afterOpenSeconds;

    /**
     * 下单笔数 默认1笔
     */
    private Integer orderTimes;
    /**
     * 创建时间
     *
     * @允许为空   NO
     * @是否索引   NO
     */
    private Date createTime;

    /**
     *
     *
     * @允许为空   YES
     * @是否索引   NO
     */
    private Date updateTime;

    private BigDecimal startRate;


    @Override
    public int compareTo(RadicalDragonPollDTO o) {
        if(o.getStartRate()==null){
            return -1;
        }
        if(this.getStartRate()==null){
            return 1;
        }
        return o.getStartRate().compareTo(this.startRate);
    }

}
