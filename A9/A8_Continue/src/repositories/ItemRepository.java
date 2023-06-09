/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.Item;
/**
 *
 * @author Alberto
 */
public class ItemRepository implements BancoDeDados<Item> {

    Map<Integer, Item> repository = new HashMap<>();
    @Override
    public Item salvar(Item t) {
        //System.out.println(t);
        this.repository.put(t.getId(), t);
        return t;
    }

    @Override
    public Item buscarId(Integer id) {
       return this.buscarTodos().stream().filter(item -> item.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Item> buscarTodos() {
        return new ArrayList<> (repository.values());
    }

    @Override
    public void deletarPorId(Integer id) {
        this.repository.remove(id);
    }
}
