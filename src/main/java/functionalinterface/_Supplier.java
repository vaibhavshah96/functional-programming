package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

	public static void main(String[] args) {
		System.out.println("Regular Function: "+getDBConnectionUrl());
		
		System.out.println("From Supplier:  "+ getDBSupplier.get());
		System.out.println("From Supplier List:  "+ getDBSupplierList.get());


	}
	
	static Supplier<String> getDBSupplier = () -> "A JDBC Connection";
	
	static Supplier<List<String>> getDBSupplierList = () -> List.of("JDBC Connection 1","JDBC Connection 2");

	
	static String getDBConnectionUrl() {
		return "A JDBC Connection";
	}

}
