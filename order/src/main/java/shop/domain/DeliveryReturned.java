package shop.domain;

import java.util.*;
import lombok.*;
import shop.domain.*;
import shop.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private String orderid;
    private String customerid;
    private String productid;
    private Integer qty;
    private String customerAddress;
    private Date deliveryDate;
    private String deliveryType;
    private String status;
}
