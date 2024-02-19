package aplication;

import java.util.Scanner;

import entity.Category;
import entity.Product;
import entity.StockControl;

public class Program {

	public static void main(String[] args) {

		StockControl StockControl = new StockControl();
		Scanner tlc = new Scanner(System.in);
		boolean continuar = true;

		System.out.println("Bem Vindo ao controle de estoque");

		while (continuar) {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Adicionar produto");
			System.out.println("2. Buscar produto por código interno");
			System.out.println("3. Atualizar preço por marca");
			System.out.println("4. Atualizar preço por categoria");
			System.out.println("5. Obter quantidade de um produto");
			System.out.println("6. Mostrar todos os produtos no estoque");
			System.out.println("7. Sair");

			int op = tlc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Digite o código interno do produto, somente numeros:");
				int cod = tlc.nextInt();
				tlc.nextLine();
				System.out.println("Digite o nome do produto:");
				String name = tlc.nextLine();
				System.out.println("Digite a categoria do produto:");
				String nameCategory = tlc.nextLine();
				System.out.println("Digite a marca do produto:");
				String brand = tlc.nextLine();
				System.out.println("Digite o preço do produto:");
				double price = tlc.nextDouble();
				System.out.println("Digite a quantidade do produto:");
				int quantity = tlc.nextInt();
				Category category = new Category(nameCategory);
				Product Producto1 = new Product(cod, name, category, brand, price, quantity);
				StockControl.addProductToStock(cod, Producto1);
				System.out.println("Produto adicionado com sucesso ao estoque.");
				System.out.println("Pressione Enter para continuar...");
				tlc.nextLine();
				tlc.nextLine();
				break;
			case 2:
				System.out.println("Digite o código interno do produto, somente numeros:");
				tlc.nextLine();
				int codSearch = tlc.nextInt();
				Product produtoEncontrado = StockControl.getProductInfo(codSearch);
				if (produtoEncontrado != null) {
					System.out.println("Produto encontrado:");
					System.out.println("Nome: " + produtoEncontrado.getName());
					System.out.println("Categoria: " + produtoEncontrado.getCategory().getNameCategory());
					System.out.println("Marca: " + produtoEncontrado.getBrand());
					System.out.println("Preço: " + produtoEncontrado.getPrice());
					System.out.println("Quantidade: " + produtoEncontrado.getQuantity());
				} else {
					System.out.println("Produto não encontrado com o código interno " + codSearch);
				}

				System.out.println("Pressione Enter para continuar...");
				tlc.nextLine();
				tlc.nextLine();
				break;
			case 3:
				System.out.println("Digite a marca para a qual deseja atualizar o preço:");
				tlc.nextLine();
				String updateBrand = tlc.nextLine();
				System.out.println("Digite o novo preço:");
				double newPrice = tlc.nextDouble();
				StockControl.updatePriceBrand(updateBrand, newPrice);
				System.out.println("Preços atualizados com sucesso para a marca " + updateBrand);
				System.out.println("Pressione Enter para continuar...");
				tlc.nextLine();
				tlc.nextLine();
				break;
			case 4:
				System.out.println("Digite a categoria para a qual deseja atualizar o preço:");
				tlc.nextLine();
				String updateCategory = tlc.nextLine();
				System.out.println("Digite o novo preço:");
				double newPriceByCategory = tlc.nextDouble();
				StockControl.updatePriceCategory(updateCategory, newPriceByCategory);
				System.out.println("Preços atualizados com sucesso para a categoria " + updateCategory);
				System.out.println("Pressione Enter para continuar...");
				tlc.nextLine();
				tlc.nextLine();
				break;
			case 5:
				System.out.println("Digite o código interno do produto, somente numeros:");
				tlc.nextLine();
				int codProduct = tlc.nextInt();
				int quantityProduct = StockControl.quantityProduct(codProduct);
				if (quantityProduct >= 0) {
					System.out.println("Quantidade do produto com código interno " + codProduct + ": ");
					System.out.println(quantityProduct);
				} else {
					System.out.println("Produto com código interno " + codProduct + " não encontrado no estoque.");
				}
				System.out.println("Pressione Enter para continuar...");
				tlc.nextLine();
				tlc.nextLine();
				break;
			case 6:
				for (Product product : StockControl.allProduct()) {
					System.out.println("Código Interno: " + product.getCod());
					System.out.println("Nome: " + product.getName());
					System.out.println("Categoria: " + product.getCategory().getNameCategory());
					System.out.println("Marca: " + product.getBrand());
					System.out.println("Preço: " + product.getPrice());
					System.out.println("Quantidade: " + product.getQuantity());
					System.out.println("---------------------------------------");
					System.out.println("Pressione Enter para continuar...");
					tlc.nextLine();
					tlc.nextLine();
				}
				break;
			case 7:
				continuar = false;
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
			}

		}

		tlc.close();
	}

}
