import java.util.*;

public class OptionalFunctionEx {
// Optional<Customer> optional = findCustomerWithSSN(ssn);
//  
// if (optional.isPresent()) {
//     Customer customer = maybeCustomer.get();
//     ... use customer ...
// }
// else {
//     ... deal with absence case ...
// }


	public static void main(String[] args) {

		Optional< String > fullName = Optional.ofNullable( null );
		System.out.println( "Full Name is set? " + fullName.isPresent() );        
		System.out.println( "Full Name: " + fullName.orElseGet( () -> "[none]" ) ); 
		System.out.println( fullName.map( s -> "Hey " + s + "!" ).orElse( "Hey Stranger!" ) );
	
	}


}
