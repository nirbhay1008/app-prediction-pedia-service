package com.PredictionWebApp.controller;

import com.PredictionWebApp.domain.ItemResponse;
import com.PredictionWebApp.model.Item;
import com.PredictionWebApp.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ItemController {
    @Autowired
    ItemRepo repo;

    @PostMapping("/addItem")
    public String addItems(@RequestBody Item item) {
        try {
            repo.save(item);
            return "Data Posted Succesfully for itemId: " + item.getItemId() + " and item name: " + item.getItemName();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/getItem")
    public List<ItemResponse> getItems() {
        List<Item> itemList = repo.findAll();
        List<ItemResponse> itemResponseList = itemList.stream().map(item -> new ItemResponse(item.getItemId(), item.getItemName())).collect(Collectors.toList());
        return itemResponseList;
    }

    @GetMapping("/test")
    public String testEndpoint() {
        return "Controller is working!";
    }

}
