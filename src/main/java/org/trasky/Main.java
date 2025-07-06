package org.trasky;

import java.util.Arrays;
import java.util.List;

import org.trasky.model.CartItem;
import org.trasky.service.serviceImpl.PromotionEngine;

public class Main {

    public static void main(String[] args) {
        List<CartItem> senrioA = Arrays.asList(new CartItem('A', 1),
                new CartItem('B', 1), new CartItem('C', 1));

        List<CartItem> senrioB = Arrays.asList(new CartItem('A', 5),
                new CartItem('B', 5), new CartItem('C', 1));

        List<CartItem> senrioC = Arrays.asList(new CartItem('A', 3),
                new CartItem('B', 5), new CartItem('C', 1),new CartItem('D',1));

        PromotionEngine engine = new PromotionEngine();
        System.out.println(engine.applyPromotions(senrioA));
        System.out.println(engine.applyPromotions(senrioB));
        System.out.println(engine.applyPromotions(senrioC));
        
    }
}
