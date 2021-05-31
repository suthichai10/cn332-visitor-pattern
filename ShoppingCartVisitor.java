public interface ShoppingCartVisitor {
    int visit(Books book);
	int visit(Fruits fruit);
}
