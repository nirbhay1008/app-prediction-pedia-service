package com.PredictionWebApp.domain;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class ItemResponse {
    public UUID itemId;
    public String itemName;

    public ItemResponse(UUID itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

}
