package com.example.ec.constant;

public enum OrderStatus {

    NEW(1, "新規受付"),
    PAY_WAIT(2, "入金待ち"),
    CANCEL(3, "キャンセル"),
    BACK_ORDER(4, "取り寄せ中"),
    DELIVERED(5, "発送済み"),
    PER_END(6, "入金済み"),
    PENDING(7, "決済処理中");

    private int id;
    private String name;

    OrderStatus(int id, String name) {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
