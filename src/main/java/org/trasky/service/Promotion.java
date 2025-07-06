package org.trasky.service;

import java.util.Map;

public interface Promotion {
    boolean isApplicable(Map<Character,Integer> items);
    int apply(Map<Character,Integer> items);
}
