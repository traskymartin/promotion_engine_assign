package org.trasky.service.serviceImpl;

import java.util.Map;

import org.trasky.service.Promotion;

public class A3Promotion  implements Promotion{

    @Override
    public boolean isApplicable(Map<Character, Integer> items) {
       return items.getOrDefault('A', 0)>=3;
    }

    @Override
    public int apply(Map<Character, Integer> items) {
        int quantity = items.get('A');
        int promoUnits = quantity / 3;
        int remaining = quantity % 3;
        items.put('A',0);
        return  promoUnits * 130 + remaining * 50;
    }
    
}
