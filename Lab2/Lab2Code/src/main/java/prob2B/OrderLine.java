package prob2B;

public class OrderLine {
    Integer orderLineNum;
    Double price;
    Double quantity;
    Order order;

    //    Setting access to package so that only Order Class can create Object for this
    OrderLine(Order order, Integer orderLineNum, Double price, Double quantity) {
        this.orderLineNum = orderLineNum;
        this.price = price;
        this.quantity = quantity;
        this.order = order;
    }

    public Integer getOrderLineNum() {
        return orderLineNum;
    }

    public void setOrderLineNum(Integer orderLineNum) {
        this.orderLineNum = orderLineNum;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "orderLineNum=" + orderLineNum +
                ", price=" + price +
                ", quantity=" + quantity +
                ", order=" + order.getOrderDate() +
                '}';
    }
}
