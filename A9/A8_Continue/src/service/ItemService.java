/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Item;
import repositories.ItemRepository;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alberto
 */
public class ItemService {

    private static ItemService service;

    private ItemRepository repository;

    private static Scanner sc;

    private ItemService(){
        this.repository = new ItemRepository();
        this.criarItens();
    }

    public static ItemService getInstance(Scanner sc){
        if(service == null){
            service = new ItemService();
            ItemService.sc = sc;
        }

        return service;
    }

    private void criarItens(){
        this.repository.salvar( new Item("Hamburguer", 25.0));
        this.repository.salvar(new Item("Pizza", 50.0));
        this.repository.salvar(new Item("Refrigerante", 10.0));
        this.repository.salvar(new Item("Cachorro Quente", 15.0));
        this.repository.salvar(new Item("Suco Natural", 20.0));
        this.repository.salvar(new Item("Empada", 10.0));

    }

    public void mostrarTodosItens(){
        List<Item> itens = this.repository.buscarTodos();
        itens.forEach(item -> System.out.println(item));
    }

    public Item escolheItem(Integer id){
        return this.repository.buscarId(id);
    }
}
