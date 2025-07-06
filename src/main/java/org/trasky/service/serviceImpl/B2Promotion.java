package org.trasky.service.serviceImpl;

import java.util.Map;

import org.trasky.service.Promotion;

public class B2Promotion implements Promotion {

    @Override
    public boolean isApplicable(Map<Character, Integer> items) {
        return items.getOrDefault('B', 0)>=2;
    }

    @Override
    public int apply(Map<Character, Integer> items) {
        int quantity = items.get('B');
        int promoUnits = quantity/2;
        int remaining = quantity % 2;
        items.put('B', 0);
        return  promoUnits * 45 + remaining * 30;
    }
    
}
