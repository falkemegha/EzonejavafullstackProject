package com.demo.springboot.model;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    Electronics(0),
   Fashion(1),   
    Appliances(2),
    TOYSandGAMES(3);
    

    private int value;
    private static Map map = new HashMap<>();

    private Category(int value) {
        this.value = value;
    }

    static {
        for (Category category : Category.values()) {
            map.put(category.value, category);
        }
    }

    public static Category valueOf(int category) {
        return (Category) map.get(category);
    }

    public int getValue() {
        return value;
    }
}
