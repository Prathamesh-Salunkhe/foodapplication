package com.mouritech.onlinefoodorderapplication.service;

import java.util.List;

import com.mouritech.onlinefoodorderapplication.entity.FoodCart;
import com.mouritech.onlinefoodorderapplication.exception.ResourceNotFoundException;

public interface FoodCartService {
	
	FoodCart insertCart(FoodCart newCart);
	List<FoodCart> showAllCarts();
	FoodCart updateCartById(Long cartId, FoodCart cart) throws ResourceNotFoundException ;
FoodCart showCartById(Long cartId) throws ResourceNotFoundException;

void deleteCartById(long cartId) throws ResourceNotFoundException;
public FoodCart createCart(String customerName, String restaurantName, String itemName);
FoodCart addItemsInCart(Long cartId, String restaurantName, String itemName) throws ResourceNotFoundException;
FoodCart showCartByCustomerId(Long customerId) throws ResourceNotFoundException;

}
