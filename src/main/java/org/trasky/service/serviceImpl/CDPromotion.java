package org.trasky.service.serviceImpl;

import java.util.Map;

import org.trasky.service.Promotion;

public class CDPromotion implements Promotion{

    @Override
    public boolean isApplicable(Map<Character, Integer> items) {
        return items.getOrDefault('C', 0) > 0 && items.getOrDefault('D', 0) > 0;
    }

    @Override
    public int apply(Map<Character, Integer> items) {
       int countC = items.get('C');
        int countD = items.get('D');
        int combo = Math.min(countC, countD);
        int remainingC = countC - combo;
        int remainingD = countD - combo;
        items.put('C', remainingC);
        items.put('D', remainingD);
        return combo * 30 + remainingC * 20 + remainingD * 15;
    }
    
}
