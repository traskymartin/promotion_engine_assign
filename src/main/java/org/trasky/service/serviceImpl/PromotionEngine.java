package org.trasky.service.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.trasky.model.CartItem;
import org.trasky.service.Promotion;

public class PromotionEngine {
    private List<Promotion> Promotions = new ArrayList<>();
    
    public PromotionEngine(){
        Promotions.add(new A3Promotion());
        Promotions.add(new B2Promotion());
        Promotions.add(new CDPromotion());
    }

    public int applyPromotions(List<CartItem> cartItems){
        Map<Character,Integer> items = new HashMap<>();
        for(CartItem item:cartItems){
            items.put(item.getSku(), items.getOrDefault(item.getSku(),0)+ item.getQuantity());
        }

        int total = 0;

        for(Promotion promo: Promotions){
            while(promo.isApplicable(items)){
                total+=promo.apply(items);
            }
        }
        total += items.getOrDefault('A', 0) * 50;
        total +=items.getOrDefault('B', 0)*30;
        total += items.getOrDefault('C', 0)*20;
        total +=items.getOrDefault('D', 0)*15;

        return total;
    }
}
