package pricing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.pricing.BasePricing;
import com.pricing.DiscountPricing;
import com.pricing.Insurance;
import com.pricing.InsurancePricing;
import com.pricing.model.Consumer;

public class ConsumerPricingTest {
	
	private static Insurance mockBaseClass;
	private static Insurance mockDiscountClass;
	private static Insurance mockHealthClass;
	private static Consumer mockNullPerson;
	private static Consumer mockPerson1;
	private static Consumer mockPerson2;
	private static Consumer mockPerson3;
	private static List<Consumer> mockPeople;
	private static InsurancePricing dpclass;
	
	@BeforeClass
	public static void setUp() {
		dpclass = new InsurancePricing();
		mockPeople = new ArrayList<Consumer>();
		mockBaseClass = new Insurance(new BasePricing());
		mockDiscountClass = new Insurance(new DiscountPricing());
		mockHealthClass = new Insurance(new BasePricing());
		mockNullPerson = new Consumer();
		mockPerson1 = new Consumer(50, "Allergies", "Kelly", "female");
		mockPerson2 = new Consumer(40, "Sleep Apnea", "Josh", "male");
		mockPerson3 = new Consumer(20, "Heart Disease", "Brad", "male");
	}
	
	@Test
	public void readFileTest() {
		String filename = "Consumers.json";
		List<Consumer> allPeople = dpclass.readFile(filename);
		mockPeople.add(mockPerson1);
		mockPeople.add(mockPerson2);
		mockPeople.add(mockPerson3);
		assertEquals(mockPeople.size(), allPeople.size());
		assertTrue(allPeople.get(0).getName().equals("Kelly"));
	}
	
	@Test 
	public void baseInsuranceZeroPriceTest() {
		BigDecimal mockPrice = new BigDecimal(0);
		assertTrue(mockPrice.equals(mockBaseClass.executeStrategy(mockNullPerson, new BigDecimal(0))));	
	}
	
	@Test
	public void baseInsurancePriceTest() {
		BigDecimal mockPrice = new BigDecimal(220.00);
		assertEquals(mockPrice.setScale(2, RoundingMode.DOWN), mockBaseClass.executeStrategy(mockPerson1, new BigDecimal(0)));
	}
		
	@Test
	public void discountInsurancePriceTest() {
		BigDecimal mockPrice = new BigDecimal(-12);
		assertEquals(mockPrice.setScale(2, RoundingMode.DOWN), mockDiscountClass.executeStrategy(mockPerson1, new BigDecimal(0)));
	}
	
	@Test
	public void healthInsurancePriceTest() {
		BigDecimal mockPrice = new BigDecimal(220);
		assertEquals(mockPrice.setScale(2, RoundingMode.DOWN), mockHealthClass.executeStrategy(mockPerson1, new BigDecimal(0)));
	}
	
	@Test 
	public void getInsuranceTest() {
		BigDecimal mockPrice = new BigDecimal(210.20);
		assertEquals(mockPrice.setScale(2, RoundingMode.CEILING), dpclass.getInsurancePrice(mockPerson1));
	}
	
	@AfterClass
	public static void teardown() {	
		mockPerson1 = null;
		mockPerson2 = null;
		mockPerson3 = null;
		
	}
}
	