package com.pricing;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.pricing.model.Consumer;

public class DiscountPricing implements PricingStrategy {

	public BigDecimal getInsurancePrice(Consumer consumer, BigDecimal price) {
		BigDecimal discountPrice = price.subtract(new BigDecimal(12.00));
		System.out.println("DEBUG DISCOUNT: " + discountPrice + " " + price);
		return discountPrice.setScale(2, RoundingMode.DOWN);
	}



}
	