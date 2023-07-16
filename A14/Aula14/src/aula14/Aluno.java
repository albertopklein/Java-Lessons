/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Alberto
 */
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@EqualsAndHashCode  

@Data // equal to all above
@AllArgsConstructor
public class Aluno {
    private String nome;
    
    private Integer matricula;
    
    private String email;
    
    private int faltas;
}
