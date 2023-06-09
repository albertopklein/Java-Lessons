/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repositories;

import java.util.List;

/**
 *
 * @author Alberto
 */
public interface BancoDeDados<T > {
    public T salvar(T t);
    
    public T buscarId(Integer id);
    
    public List<T> buscarTodos();
    
    public void deletarPorId(Integer id);
}
