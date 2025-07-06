package org.trasky;

import java.io.FileWriter;
import java.io.IOException;
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
         try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Promotion Engine Test Results\n");
            writer.write("==========================\n\n");
            writer.write("Scenario A (1A, 1B, 1C): " + engine.applyPromotions(senrioA) + "\n");
            writer.write("Scenario B (5A, 5B, 1C): " + engine.applyPromotions(senrioB) + "\n");
            writer.write("Scenario C (3A, 5B, 1C, 1D): " + engine.applyPromotions(senrioB) + "\n");
        } catch (IOException e) {
            System.err.println("Error writing output: " + e.getMessage());
        }
        
    }
}
