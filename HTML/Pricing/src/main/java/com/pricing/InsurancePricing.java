package com.pricing;
import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.pricing.model.Consumer;

public class InsurancePricing {
	
	public static void main(String[] args) {
		InsurancePricing insuredPricing = new InsurancePricing();
		String filename = "Consumers.json";
		List<Consumer> list = insuredPricing.readFile(filename);
		Iterator<Consumer> iter = list.iterator();
		while(iter.hasNext()) {
			Consumer consumer = iter.next();
			BigDecimal price = insuredPricing.getInsurancePrice(consumer);
			System.out.println("Debug:final " + price.setScale(2, RoundingMode.DOWN));
			
			if(price.setScale(2, RoundingMode.DOWN).intValue() > 0) {
				System.out.printf(consumer.getName().toString() + " - $"+ price.setScale(2, RoundingMode.DOWN) + "\n");
			} else {
				System.out.println("$0.00 (if the price is $0.00 insurance is currently unavailable due to age restrictions.)");
			} 		
		}
		
	}	
	
	public BigDecimal getInsurancePrice(Consumer consumer) {
		Insurance insurance = null;
		BigDecimal price = new BigDecimal(0.00);
		if(consumer.getAge() >= 18) {
			insurance = new Insurance(new BasePricing());
			price = insurance.executeStrategy(consumer, price);
			System.out.println("Debug:required " + price.setScale(2, RoundingMode.DOWN));
			if(consumer.getIllness() != null) {
				insurance = new Insurance(new HealthPricing());
				price = insurance.executeStrategy(consumer, price);
				System.out.println("Debug: health" + price.setScale(2, RoundingMode.DOWN));
			}
			if(consumer.getSex().toLowerCase().equals("female") || consumer.getSex().toLowerCase().startsWith("f")) {
				insurance = new Insurance(new DiscountPricing());
				price = insurance.executeStrategy(consumer, price);
				System.out.println("Debug:discount " + price.setScale(2, RoundingMode.DOWN));
			}	
		} 
			
		return price.setScale(2, RoundingMode.CEILING);
	}
	
	public List<Consumer> readFile(String filename) {
		List<Consumer> list = new ArrayList<Consumer>();
		JSONParser parser = new JSONParser();
		int count = 0;
 
        try {
            Object obj = parser.parse(new FileReader(
                   filename));

           JSONObject jsonObject = (JSONObject) obj;
           JSONArray array = (JSONArray) jsonObject.get("people");
//            System.out.println("Debug: " + array.size());
			if(array != null) {
				while (count < array.size()) {
					Consumer consumer = new Consumer();
					JSONObject people = (JSONObject) array.get(count);
					consumer.setName((String) people.get("name"));
					Long age = (Long) people.get("age");
					consumer.setAge(Integer.valueOf(age.intValue()));
					consumer.setSex((String) people.get("sex"));
					consumer.setIllness((String) people.get("illness"));
					list.add(consumer);
					count++;
				}
			}
 
        } catch (Exception e) {
            e.printStackTrace();
        }
		return list;
    }
	
}
