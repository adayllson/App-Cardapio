package com.example.cardapio.controller;

//import org.hibernate.mapping.List;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cardapio.food.FoodRepository;
import com.example.cardapio.food.FoodResponseDTO;


@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;
    
    //Notação que retorna os itens do endpoint "food"
    @GetMapping
    public List<FoodResponseDTO> getAll(){
        
        List<FoodResponseDTO> foodList = (List<FoodResponseDTO>) repository.findAll().stream().map(FoodResponseDTO::new);
        return foodList;
        
    }
}
