package com.bazinga.rabbit.enums;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * @author yunshan
 * @date 2019/1/29
 */
public enum ButtonConfigEnum {
    BUTTON_369("369_button", "369开关"),
    BUTTON_UPPERS("upperS_button", "涨停S下单开关"),
    RADICAL_POOL_CANCEL("radical_pool_cancel", "激进池是否撤单开关"),
    FIRST_PLANK_AUTO_OPEN("first_plank_auto_open", "首板开关"),
    TWO_PLANK_AUTO_OPEN("two_plank_auto_open", "二板自动开关"),
    POSITION_AUTO_DOWN("position_auto_down", "2点仓位自动降开关"),
    L2_QUOTE_TCP("l2_quote_tcp", "L2行情订阅方式 11TCP 0 UDP"),
    POSITION_CONTROL("position_control", "仓位不足时候自动触发核按钮"),
    MAX100_TWO_PLANK("max100_two_plank", "根据100日最高价格日来确定二板强度按钮"),
    SUB_NEW_PROHIBIT("sub_new_prohibit", "次新添加进禁止下单池"),
    MIDDLE_PLANK_SELECT("middle_plank_select", "中位股择时开关"),
    HIGH_DROP_SELL_BUTTON("high_drop_sell_button", "高点勾头卖出开关"),
    BLOCK_COMPETE_BUTTON("block_compete_button", "排块排名仓位控制开关"),
    BAD_PLANK_SELL_BUTTON("bad_plank_sell_button", "烂板卖出开关"),
    SHOT_HEAD_BUTTON("shot_head_button","涨速防爆头开关"),
    COMMON_BUTTON("common_button", "公共开关"),
    STAGE_BUTTON("stage_sell_button", "阶段开关"),
    HIGH_SELL_NO_PLANK("high_sell_no_plank", "高点补办卖出"),
    PE_PERIOD_TWO_BUTTON("pe_period_two_button", "私募二期"),
    DISABLE_POOL_AUTO("disable_pool_auto", "禁止下单池自动化自动工作"),
    DALAO_RISKV2("dalao_riskv2", "大佬风控2期按钮"),
    RISK_V2_LAOWO("risk_v2_laowo", "风控2期老窝按钮"),
    BLOCK_BATCH_SELL_DALAO("block_batch_sell_dalao", "ai板块买入大佬卖出按钮"),
    UNMATCH_QUANTITY_BUTTON("unmatch_quantity_button", "集合未匹配量下单按钮"),
    USE_ZHANG_TING_S("use_zhang_ting_s", "使用主笔成交涨停s下单"),
    RATE_PROHIBIT_BUTTON("rate_prohibit_button", "根据3510日涨幅来打首板二板"),
    LIMIT_300_WAN_POSITION("limit_300_wan_position", "小池子限制300万单笔"),
    QUOTE_JINQIAO("quote_jinqiao", "金桥行情标识"),
    SWEEP_ONE_MIN("sweep_one_min", "扫板前一分打1"),
    DRAGON_PLANK_BUY_VERSION_ONE("dragon_plank_buy_version_one", "龙年打板1号"),
    RE_PLANK_BUTTON("re_plank_button", "普打回封开关 1开打回封 0 关 打首封"),
    RE_PLANK_AI_BUTTON("re_plank_ai_button", "AI回封开关"),
    AI_HIGH_BUTTON("ai_high_button", "AI高位开关 1打高位 0不打"),
    PLANK_TRADE_BUTTON("plank_trade_button", "普打碰涨停打开关 1开 0关"),
    SAO_BAN_POSITIVE("sao_ban_positive", "扫板激进开关 1开 0关"),
    PERCENT_TOTAL_SELL("percent_total_sell", "总卖比例（比如说20、30等）"),
    FOLLOW_DALAO_TIME("follow_dalao_time", "跟随大佬截止时间）"),
    SAME_MILLION_PERCENT("same_million_percent", "相同秒数比例）"),
    LOW_POSITION_PIT("low_position_pit", "5万一下是否进行核按钮");


    ButtonConfigEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static ButtonConfigEnum getByKey(String key){
        ArrayList<ButtonConfigEnum> cancelStrategyEnums = Lists.newArrayList(ButtonConfigEnum.values());
        for (ButtonConfigEnum strategyEnum:cancelStrategyEnums){
            if(strategyEnum.getCode().equals(key)){
                return strategyEnum;
            }
        }
        return null;
    }

    private String code;

    private String desc;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
