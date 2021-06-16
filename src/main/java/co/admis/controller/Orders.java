/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.admis.controller;

/**
 *
 * @author workspace
 */
public class Orders {

    private String LatestShipDate;
    private String OrderType;
    private String PurchaseDate;
    private String EasyShipShipmentStatus;
    private String BuyerEmail;
    private String AmazonOrderId;
    private String LastUpdateDate;
    private String IsReplacementOrder;
    private String NumberOfItemsShipped;
    private String ShipServiceLevel;
    private String OrderStatus;
    private String SalesChannel;
    private String ShippedByAmazonTFM;
    private String IsBusinessOrder;
    private String NumberOfItemsUnshipped;
    private String LatestDeliveryDate;
    private String PaymentMethodDetails;
    private String IsGlobalExpressEnabled;
    private String IsSoldByAB;
    private String EarliestDeliveryDate;
    private String IsPremiumOrder;

    public Orders(String LatestShipDate, String OrderType, String PurchaseDate, String EasyShipShipmentStatus, String BuyerEmail, String AmazonOrderId, String LastUpdateDate, String IsReplacementOrder, String NumberOfItemsShipped, String ShipServiceLevel, String OrderStatus, String SalesChannel, String ShippedByAmazonTFM, String IsBusinessOrder, String NumberOfItemsUnshipped, String LatestDeliveryDate, String PaymentMethodDetails, String IsGlobalExpressEnabled, String IsSoldByAB, String EarliestDeliveryDate, String IsPremiumOrder) {
        this.LatestShipDate = LatestShipDate;
        this.OrderType = OrderType;
        this.PurchaseDate = PurchaseDate;
        this.EasyShipShipmentStatus = EasyShipShipmentStatus;
        this.BuyerEmail = BuyerEmail;
        this.AmazonOrderId = AmazonOrderId;
        this.LastUpdateDate = LastUpdateDate;
        this.IsReplacementOrder = IsReplacementOrder;
        this.NumberOfItemsShipped = NumberOfItemsShipped;
        this.ShipServiceLevel = ShipServiceLevel;
        this.OrderStatus = OrderStatus;
        this.SalesChannel = SalesChannel;
        this.ShippedByAmazonTFM = ShippedByAmazonTFM;
        this.IsBusinessOrder = IsBusinessOrder;
        this.NumberOfItemsUnshipped = NumberOfItemsUnshipped;
        this.LatestDeliveryDate = LatestDeliveryDate;
        this.PaymentMethodDetails = PaymentMethodDetails;
        this.IsGlobalExpressEnabled = IsGlobalExpressEnabled;
        this.IsSoldByAB = IsSoldByAB;
        this.EarliestDeliveryDate = EarliestDeliveryDate;
        this.IsPremiumOrder = IsPremiumOrder;
    }

    public String getLatestShipDate() {
        return LatestShipDate;
    }

    public void setLatestShipDate(String LatestShipDate) {
        this.LatestShipDate = LatestShipDate;
    }

    public String getOrderType() {
        return OrderType;
    }

    public void setOrderType(String OrderType) {
        this.OrderType = OrderType;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    public String getEasyShipShipmentStatus() {
        return EasyShipShipmentStatus;
    }

    public void setEasyShipShipmentStatus(String EasyShipShipmentStatus) {
        this.EasyShipShipmentStatus = EasyShipShipmentStatus;
    }

    public String getBuyerEmail() {
        return BuyerEmail;
    }

    public void setBuyerEmail(String BuyerEmail) {
        this.BuyerEmail = BuyerEmail;
    }

    public String getAmazonOrderId() {
        return AmazonOrderId;
    }

    public void setAmazonOrderId(String AmazonOrderId) {
        this.AmazonOrderId = AmazonOrderId;
    }

    public String getLastUpdateDate() {
        return LastUpdateDate;
    }

    public void setLastUpdateDate(String LastUpdateDate) {
        this.LastUpdateDate = LastUpdateDate;
    }

    public String getIsReplacementOrder() {
        return IsReplacementOrder;
    }

    public void setIsReplacementOrder(String IsReplacementOrder) {
        this.IsReplacementOrder = IsReplacementOrder;
    }

    public String getNumberOfItemsShipped() {
        return NumberOfItemsShipped;
    }

    public void setNumberOfItemsShipped(String NumberOfItemsShipped) {
        this.NumberOfItemsShipped = NumberOfItemsShipped;
    }

    public String getShipServiceLevel() {
        return ShipServiceLevel;
    }

    public void setShipServiceLevel(String ShipServiceLevel) {
        this.ShipServiceLevel = ShipServiceLevel;
    }

    public String getOrderStatus() {
        return OrderStatus;
    }

    public void setOrderStatus(String OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    public String getSalesChannel() {
        return SalesChannel;
    }

    public void setSalesChannel(String SalesChannel) {
        this.SalesChannel = SalesChannel;
    }

    public String getShippedByAmazonTFM() {
        return ShippedByAmazonTFM;
    }

    public void setShippedByAmazonTFM(String ShippedByAmazonTFM) {
        this.ShippedByAmazonTFM = ShippedByAmazonTFM;
    }

    public String getIsBusinessOrder() {
        return IsBusinessOrder;
    }

    public void setIsBusinessOrder(String IsBusinessOrder) {
        this.IsBusinessOrder = IsBusinessOrder;
    }

    public String getNumberOfItemsUnshipped() {
        return NumberOfItemsUnshipped;
    }

    public void setNumberOfItemsUnshipped(String NumberOfItemsUnshipped) {
        this.NumberOfItemsUnshipped = NumberOfItemsUnshipped;
    }

    public String getLatestDeliveryDate() {
        return LatestDeliveryDate;
    }

    public void setLatestDeliveryDate(String LatestDeliveryDate) {
        this.LatestDeliveryDate = LatestDeliveryDate;
    }

    public String getPaymentMethodDetails() {
        return PaymentMethodDetails;
    }

    public void setPaymentMethodDetails(String PaymentMethodDetails) {
        this.PaymentMethodDetails = PaymentMethodDetails;
    }

    public String getIsGlobalExpressEnabled() {
        return IsGlobalExpressEnabled;
    }

    public void setIsGlobalExpressEnabled(String IsGlobalExpressEnabled) {
        this.IsGlobalExpressEnabled = IsGlobalExpressEnabled;
    }

    public String getIsSoldByAB() {
        return IsSoldByAB;
    }

    public void setIsSoldByAB(String IsSoldByAB) {
        this.IsSoldByAB = IsSoldByAB;
    }

    public String getEarliestDeliveryDate() {
        return EarliestDeliveryDate;
    }

    public void setEarliestDeliveryDate(String EarliestDeliveryDate) {
        this.EarliestDeliveryDate = EarliestDeliveryDate;
    }

    public String getIsPremiumOrder() {
        return IsPremiumOrder;
    }

    public void setIsPremiumOrder(String IsPremiumOrder) {
        this.IsPremiumOrder = IsPremiumOrder;
    }

    @Override
    public java.lang.String toString() {
        return "Orders{" + "LatestShipDate=" + LatestShipDate + ", OrderType=" + OrderType + ", PurchaseDate=" + PurchaseDate + ", EasyShipShipmentStatus=" + EasyShipShipmentStatus + ", BuyerEmail=" + BuyerEmail + ", AmazonOrderId=" + AmazonOrderId + ", LastUpdateDate=" + LastUpdateDate + ", IsReplacementOrder=" + IsReplacementOrder + ", NumberOfItemsShipped=" + NumberOfItemsShipped + ", ShipServiceLevel=" + ShipServiceLevel + ", OrderStatus=" + OrderStatus + ", SalesChannel=" + SalesChannel + ", ShippedByAmazonTFM=" + ShippedByAmazonTFM + ", IsBusinessOrder=" + IsBusinessOrder + ", NumberOfItemsUnshipped=" + NumberOfItemsUnshipped + ", LatestDeliveryDate=" + LatestDeliveryDate + ", PaymentMethodDetails=" + PaymentMethodDetails + ", IsGlobalExpressEnabled=" + IsGlobalExpressEnabled + ", IsSoldByAB=" + IsSoldByAB + ", EarliestDeliveryDate=" + EarliestDeliveryDate + ", IsPremiumOrder=" + IsPremiumOrder + '}';
    }
  
    
    
}
