/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package repository;

import java.util.List;

/**
 *
 * @author Alberto
 */
public interface BancoDeDados<T>{
    public T inserir(T t);
    public List<T> buscarTodos();
    public T buscarPorID(int id);
    public void excluir(int id);
    
}
