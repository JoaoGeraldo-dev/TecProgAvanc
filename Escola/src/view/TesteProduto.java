package view;

import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto produto = new Produto("lapis",2,10.00);
		
		System.out.println(produto.toString());

	}

}
