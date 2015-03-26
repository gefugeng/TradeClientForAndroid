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
    /// 商品代码
    /// </summary>
    private String commodityId;

    /// <summary>
    /// 商品名称
    /// </summary>
    private String name;

    /// <summary>
    /// 持仓单号
    /// </summary>
    private long holdingId;

    /// <summary>
    /// 买卖方向Code
    /// </summary>
    private short tradeMarkCode;

    /// <summary>
    /// 买卖方向Name
    /// </summary>
    private String tradeMarkName;

    /// <summary>
    /// 建仓量
    /// </summary>
    private int openQuantity;

    /// <summary>
    /// 持仓量
    /// </summary>
    private long holdQuantity;

    /// <summary>
    /// 止损价
    /// </summary>
    private double stopLoss;

    /// <summary>
    /// 止盈价
    /// </summary>
    private double stopProfit;

    /// <summary>
    /// 建仓价
    /// </summary>
    private double openPrice;

    /// <summary>
    /// 持仓价
    /// </summary>
    private double holdPrice;

    /// <summary>
    /// 平仓价
    /// </summary>
    private double closePrice;

    /// <summary>
    /// 当日浮动盈亏
    /// </summary>
    private double todayProfit;

    /// <summary>
    /// 占用保证金
    /// </summary>
    private double usedMargin;

    /// <summary>
    /// 建仓时间 yyyy-MM-dd HH:mm:ss
    /// </summary>
    private String openTime;

    /// <summary>
    /// 电话交易员
    /// </summary>
    private String telephoneTraders;
}
