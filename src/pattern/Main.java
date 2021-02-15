package pattern;

import pattern.creational.abs.factory.OperationFactory;
import pattern.creational.factory.method.OperationFactoryMethod;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("********** AbstractFactory **********");
		OperationFactory of = new OperationFactory();
		of.createOperation(Input.createBonifico());
		of.createOperation(Input.createOnboarding());
		
		System.out.println("********** Factory method *********");
		OperationFactoryMethod.createOperation(Input.createBonifico());
		OperationFactoryMethod.createOperation(Input.createOnboarding());
	}

}
