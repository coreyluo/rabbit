package com.bazinga.rabbit.util;

import com.bazinga.dragon.constant.DateConstant;
import com.bazinga.dragon.constant.SymbolConstants;
import com.bazinga.dragon.dto.DetailOrderDTO;
import com.bazinga.dragon.enums.StockTypeEnum;

import java.math.BigDecimal;

import static com.bazinga.dragon.constant.CommonConstant.HALF_ONE_MILLION;
import static com.bazinga.dragon.constant.CommonConstant.ONE_MILLION;

public class CommonUtil {

    public static String getStockCodeDay(String stockCode){
        return stockCode+ SymbolConstants.UNDERLINE+ DateConstant.TODAY_STRING;
    }

    public static boolean isOrderOver50w(DetailOrderDTO detailOrderDTO, BigDecimal upperPrice) {
        return detailOrderDTO.getOrderQuantity() * upperPrice.floatValue() >= HALF_ONE_MILLION;
    }

    public static boolean isBigOrder(DetailOrderDTO detailOrderDTO) {
        return detailOrderDTO.getOrderQuantity() * detailOrderDTO.getOrderPrice().floatValue() >= ONE_MILLION;
    }
    /*public static BigDecimal getComparePriceBySweepTpe(){
        BigDecimal comparePrice ;
        if(SweepTypeEnum.MUST_DEAL1.getCode().equals(radicalDragonPool.getSweepType())){
            comparePrice = upperPrice;
        }else if(SweepTypeEnum.MUST_DEAL2.equals(radicalDragonPool.getSweepType())){
            comparePrice = upperPrice.subtract(new BigDecimal("0.01"));
        }
    }*/

    public static int getStockType(Long circulateZ) {
        if (circulateZ < 50 * ONE_MILLION) {
            return StockTypeEnum.POINT_FIVE.getCode();
        } else if (circulateZ >= 50 * ONE_MILLION && circulateZ < 100 * ONE_MILLION) {
            return StockTypeEnum.POINT_FIVE_TO_ONE.getCode();
        } else if (circulateZ >= 100 * ONE_MILLION && circulateZ < 200 * ONE_MILLION) {
            return StockTypeEnum.ONE_TO_TWO.getCode();
        } else if (circulateZ >= 200 * ONE_MILLION && circulateZ < 300 * ONE_MILLION) {
            return StockTypeEnum.TWO_TO_THREE.getCode();
        } else if (circulateZ >= 300 * ONE_MILLION && circulateZ < 550 * ONE_MILLION) {
            return StockTypeEnum.THREE_TO_FIVE_POINT_FIVE.getCode();
        } else if (circulateZ >= 550 * ONE_MILLION && circulateZ < 800 * ONE_MILLION) {
            return StockTypeEnum.FIVE_POINT_FIVE_TO_EIGHT.getCode();
        } else if (circulateZ >= 800 * ONE_MILLION && circulateZ < 1100 * ONE_MILLION) {
            return StockTypeEnum.EIGHT_TO_ELEVEN.getCode();
        } else {
            return StockTypeEnum.OVER_ELEVEN.getCode();
        }
    }

    public static boolean getPassingGoal(Long circulateZ,Long sealing){
        if(sealing==null||circulateZ==null){
            return false;
        }
        BigDecimal percent = new BigDecimal(sealing).divide(new BigDecimal(circulateZ),2,BigDecimal.ROUND_HALF_UP);
        if(percent.compareTo(new BigDecimal(0.18))==1){
            return true;
        }
        return false;
    }
}


