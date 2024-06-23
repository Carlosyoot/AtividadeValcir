package org.services.interaction;

//IMPORTAÇÃO DOS PACOTES E FUNÇÕES E CLASSES

import org.itemsclass.Item;
import org.itemsclass.Shoes;
import org.services.service;
import org.services.serviceshoes;

import java.util.List;
import java.util.Scanner;

public class userInteraction {
    private service itemService;
    private serviceshoes tenisService;
    private Scanner scanner;

    public userInteraction() {
        this.itemService = new service();
        this.tenisService = new serviceshoes();
        this.scanner = new Scanner(System.in);
    }

    //Interação do usuario

    public void iniciar() {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar Item");
            System.out.println("2. Listar Itens");
            System.out.println("3. Adicionar Tênis");
            System.out.println("4. Listar Tênis");
            System.out.println("5. Procurar Tênis por Marca");
            System.out.println("6. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (escolha) {
                case 1:
                    adicionarItem();
                    break;
                case 2:
                    listarItens();
                    break;
                case 3:
                    adicionarTenis();
                    break;
                case 4:
                    listarTenis();
                    break;
                case 5:
                    procurarTenisPorMarca();
                    break;
                case 6:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Escolha inválida!");
            }
        }
    }

    private void adicionarItem() {
        System.out.println("Nome do Item:");
        String nome = scanner.nextLine();
        System.out.println("ID do Item:");
        int id = scanner.nextInt();
        System.out.println("Valor do Item:");
        float valor = scanner.nextFloat();
        System.out.println("Numeração do Item:");
        short numeracao = scanner.nextShort();
        scanner.nextLine(); // Consumir nova linha

        Item item = new Item(nome, id, valor, numeracao);
        itemService.addItem(item);
        System.out.println("Item adicionado com sucesso!");
    }

    private void listarItens() {
        List<Item> itens = itemService.listItens();
        if (itens.isEmpty()) {
            System.out.println("Nenhum item encontrado.");
        } else {
            itens.forEach(System.out::println);
        }
    }

    private void adicionarTenis() {
        System.out.println("Nome do Tênis:");
        String nome = scanner.nextLine();
        System.out.println("ID do Tênis:");
        int id = scanner.nextInt();
        System.out.println("Valor do Tênis:");
        float valor = scanner.nextFloat();
        System.out.println("Numeração do Tênis:");
        short numeracao = scanner.nextShort();
        scanner.nextLine(); // Consumir nova linha
        System.out.println("Marca do Tênis:");
        String marca = scanner.nextLine();
        System.out.println("Tipo do Tênis:");
        String tipo = scanner.nextLine();

        Shoes tenis = new Shoes(nome, id, valor, numeracao, marca, tipo);
        tenisService.addShoes(tenis);
        System.out.println("Tênis adicionado com sucesso!");
    }

    private void listarTenis() {
        List<Shoes> tenisList = tenisService.ListShoes();
        if (tenisList.isEmpty()) {
            System.out.println("Nenhum tênis encontrado.");
        } else {
            tenisList.forEach(System.out::println);
        }
    }

    private void procurarTenisPorMarca() {
        System.out.println("Marca do Tênis:");
        String marca = scanner.nextLine();
        List<Shoes> tenisList = tenisService.searchBrand(marca);
        if (tenisList.isEmpty()) {
            System.out.println("Nenhum tênis encontrado para a marca " + marca);
        } else {
            tenisList.forEach(System.out::println);
        }
    }
}
