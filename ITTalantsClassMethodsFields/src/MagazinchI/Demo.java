package MagazinchI;

import Product.InBulk;
import Product.PerUnit;

public class Demo {

	public static void main(String[] args) {
		Shop lidl = new Shop("Lidl", "Studentski grad", 1500, 5);
		InBulk potatos = new InBulk("potatos", 2.0, 10);
		PerUnit bred = new PerUnit("bred", 1.0, 4);
		InBulk beans = new InBulk("beans", 3.0, 6.7);

		lidl.addProductToInventory(beans);
		lidl.addProductToInventory(bred);
		lidl.addProductToInventory(potatos);

		Buyer pesho = new Buyer(lidl, 100, 4);
		pesho.addToCart("potatos", 2.5);
		pesho.addToCart("bred", 1);

		pesho.printCart();

	}

}
