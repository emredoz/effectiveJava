package com.efectivejava.equealshashcodes;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IdentityCard {

    public static void main(String[] args) {
        IdentityCard card1 = new IdentityCard(123l, 456);
        IdentityCard card2 = new IdentityCard(123l, 456);

        Map<IdentityCard, String> map = new HashMap<>();
        map.put(card1, "emre");
        String result = map.get(card2);
        System.out.println(result);
        System.out.println(card1.hashCode());
        System.out.println(card2.hashCode());

    }

    public IdentityCard(Long identityNo, Integer no) {
        this.identityNo = identityNo;
        this.no = no;
    }

    private Long identityNo;
    private Integer no;

    public Long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(Long identityNo) {
        this.identityNo = identityNo;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IdentityCard)) return false;
        IdentityCard that = (IdentityCard) o;
        return Objects.equals(identityNo, that.identityNo) &&
                Objects.equals(no, that.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identityNo, no);
    }


}
