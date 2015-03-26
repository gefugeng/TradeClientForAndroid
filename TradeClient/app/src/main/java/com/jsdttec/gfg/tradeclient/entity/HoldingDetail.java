package com.jsdttec.gfg.tradeclient.entity;

/**
 * Created by gfg on 3/26 0026.
 */
public class HoldingDetail {
    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHoldingId() {
        return holdingId;
    }

    public void setHoldingId(long holdingId) {
        this.holdingId = holdingId;
    }

    public short getTradeMarkCode() {
        return tradeMarkCode;
    }

    public void setTradeMarkCode(short tradeMarkCode) {
        this.tradeMarkCode = tradeMarkCode;
    }

    public String getTradeMarkName() {
        return tradeMarkName;
    }

    public void setTradeMarkName(String tradeMarkName) {
        this.tradeMarkName = tradeMarkName;
    }

    public int getOpenQuantity() {
        return openQuantity;
    }

    public void setOpenQuantity(int openQuantity) {
        this.openQuantity = openQuantity;
    }

    public long getHoldQuantity() {
        return holdQuantity;
    }

    public void setHoldQuantity(long holdQuantity) {
        this.holdQuantity = holdQuantity;
    }

    public double getStopLoss() {
        return stopLoss;
    }

    public void setStopLoss(double stopLoss) {
        this.stopLoss = stopLoss;
    }

    public double getStopProfit() {
        return stopProfit;
    }

    public void setStopProfit(double stopProfit) {
        this.stopProfit = stopProfit;
    }

    public double getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(double openPrice) {
        this.openPrice = openPrice;
    }

    public double getHoldPrice() {
        return holdPrice;
    }

    public void setHoldPrice(double holdPrice) {
        this.holdPrice = holdPrice;
    }

    public double getClosePrice() {
        return closePrice;
    }

    public void setClosePrice(double closePrice) {
        this.closePrice = closePrice;
    }

    public double getTodayProfit() {
        return todayProfit;
    }

    public void setTodayProfit(double todayProfit) {
        this.todayProfit = todayProfit;
    }

    public double getUsedMargin() {
        return usedMargin;
    }

    public void setUsedMargin(double usedMargin) {
        this.usedMargin = usedMargin;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getTelephoneTraders() {
        return telephoneTraders;
    }

    public void setTelephoneTraders(String telephoneTraders) {
        this.telephoneTraders = telephoneTraders;
    }

    /// <summary>
    /// ��Ʒ����
    /// </summary>
    private String commodityId;

    /// <summary>
    /// ��Ʒ����
    /// </summary>
    private String name;

    /// <summary>
    /// �ֲֵ���
    /// </summary>
    private long holdingId;

    /// <summary>
    /// ��������Code
    /// </summary>
    private short tradeMarkCode;

    /// <summary>
    /// ��������Name
    /// </summary>
    private String tradeMarkName;

    /// <summary>
    /// ������
    /// </summary>
    private int openQuantity;

    /// <summary>
    /// �ֲ���
    /// </summary>
    private long holdQuantity;

    /// <summary>
    /// ֹ���
    /// </summary>
    private double stopLoss;

    /// <summary>
    /// ֹӯ��
    /// </summary>
    private double stopProfit;

    /// <summary>
    /// ���ּ�
    /// </summary>
    private double openPrice;

    /// <summary>
    /// �ֲּ�
    /// </summary>
    private double holdPrice;

    /// <summary>
    /// ƽ�ּ�
    /// </summary>
    private double closePrice;

    /// <summary>
    /// ���ո���ӯ��
    /// </summary>
    private double todayProfit;

    /// <summary>
    /// ռ�ñ�֤��
    /// </summary>
    private double usedMargin;

    /// <summary>
    /// ����ʱ�� yyyy-MM-dd HH:mm:ss
    /// </summary>
    private String openTime;

    /// <summary>
    /// �绰����Ա
    /// </summary>
    private String telephoneTraders;
}
