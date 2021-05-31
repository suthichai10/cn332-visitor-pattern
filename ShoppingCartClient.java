public class ShoppingCartClient {
    public static void main(String[] args) throws Exception {
        ItemElements[] items = new ItemElements[]{new Books(20, "1234"),new Books(100, "5678"),
				new Fruits(10, 2, "Banana"), new Fruits(5, 5, "Apple")};
		
		int total = calculatePrice(items);
		System.out.println("Total Cost = "+total);
	}

	private static int calculatePrice(ItemElements[] items) {
		ShoppingCartVisitor visitor = new ShoppingCart();
		int sum=0;
		for(ItemElements item : items){
			sum = sum + item.accept(visitor);
		}
		return sum;
	}
}

