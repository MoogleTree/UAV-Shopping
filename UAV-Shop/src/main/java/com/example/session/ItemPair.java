package com.example.session;

/**
 * Created by InsZVA on 2017/7/10.
 */

public class ItemPair {
    public Long itemId;
    public Long itemNum;

    public ItemPair(Long itemId, Long itemNum){
        this.itemId=itemId;
        this.itemNum=itemNum;
    }

    public ItemPair(){
        this.itemId = 0L;
        this.itemNum= 0L;
    }
}
