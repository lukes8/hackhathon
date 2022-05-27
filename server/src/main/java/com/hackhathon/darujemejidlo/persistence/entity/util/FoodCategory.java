package com.hackhathon.darujemejidlo.persistence.entity.util;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FoodCategory {
    HOMEMADE("HOMEMADE"), PURCHASED("PURCHASED");

    private final String value;

    /**
     * Class constructor.
     * @param value Type of EventProcessingHistoryStatusConst.
     */
    FoodCategory(final String value){
        this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
        return value;
    }

    /**
     * Gets reason type from string.
     * @param text String with reason type.
     * @return EventProcessingHistoryStatusConst from string if it exists, null if it doesn't exist.
     */
    @JsonCreator
    public static FoodCategory fromValue(String text) {
        for (FoodCategory val : FoodCategory.values()) {
            if (val.value.equals(text)) {
                return val;
            }
        }
        return null;
    }
}
