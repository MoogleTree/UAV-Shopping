package com.example.session;

import java.util.List;

/**
 * Created by InsZVA on 2017/7/10.
 */

public class Payment {
    public Long paymentId;
    public String paymentNumber;
    public List<ItemPair> paymentItems;
    public Long paymentUserId;
    public Long paymentUavId;
    public double paymentPrice;
    public Long paymentTime;
}
