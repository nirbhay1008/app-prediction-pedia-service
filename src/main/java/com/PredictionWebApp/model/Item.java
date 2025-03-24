package com.PredictionWebApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@Entity(name = "public")
@Table(name = "inventory")
public class Item {
    @Id
    @Column(name = "item_id")
    private UUID itemId;
    @Column(name = "item_name")
    private String itemName;
}
