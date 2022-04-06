//package com.mouritech.onlinefoodorderapplication.mapper;
//
//
//	import org.modelmapper.ModelMapper;
//
//	import org.springframework.beans.factory.annotation.Autowired;
//	import org.springframework.stereotype.Component;
//	import com.mouritech.onlinefoodorderapplication.dto.CustomervarificationDto;
//	import com.mouritech.onlinefoodorderapplication.entity.Customer;
//
//	@Component
//	 public class CustomerMapper 
//	{
//		
//		@Autowired
//		ModelMapper modelMapper;
//		
//		public CustomervarificationDto convertEntityToDto(Customer customer)
//		{
//			return modelMapper.map(customer, CustomervarificationDto.class);
//		}
//		
//		public Customer convertDtoToEntity(CustomervarificationDto restaurantDto)
//		{
//			return modelMapper.map(CustomerDto,Customer.class);
//		}
//
//	}
//
