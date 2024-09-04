package prob2B;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    LocalDate orderDate;
    List<OrderLine> orderLines;

    //    Order has ownership for orderLine
    public Order(LocalDate orderDate) {
        this.orderDate = orderDate;
        this.orderLines = new ArrayList<>();
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    public void setOrderLine(Integer orderLineNum, Double price, Double quantity) {
        this.orderLines.add(new OrderLine(this, orderLineNum, price, quantity));
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("Order{" +
                "orderDate=" + orderDate + ",");
        for (OrderLine orderLine : orderLines) {
            res.append(" OrderLine{orderLineNum=").append(orderLine.getOrderLineNum()).append(", price=").append(orderLine.getPrice()).append(", quantity=").append(orderLine.getQuantity()).append(", Order=").append(orderLine.getOrder().getOrderDate()).append("}");
        }
        res.append('}');
        return res.toString();
    }
}
