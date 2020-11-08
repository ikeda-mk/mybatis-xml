package com.example.ec.constant;

import java.util.HashMap;
import java.util.Map;

public enum OrderStatus {

    NEW(1, "新規受付"),
    PAY_WAIT(2, "入金待ち"),
    CANCEL(3, "キャンセル"),
    BACK_ORDER(4, "取り寄せ中"),
    DELIVERED(5, "発送済み"),
    PER_END(6, "入金済み"),
    PENDING(7, "決済処理中");

    private static final Map<Integer, OrderStatus> idMap = new HashMap<>() {
        {
            put(1, OrderStatus.NEW);
            put(2, OrderStatus.PAY_WAIT);
            put(3, OrderStatus.CANCEL);
            put(4, OrderStatus.BACK_ORDER);
            put(5, OrderStatus.DELIVERED);
            put(6, OrderStatus.PER_END);
            put(7, OrderStatus.PENDING);
        }
    };

    private final int id;
    private final String name;

    OrderStatus(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static OrderStatus getOrderStatus(int id) {
        return idMap.get(id);
    }

}
