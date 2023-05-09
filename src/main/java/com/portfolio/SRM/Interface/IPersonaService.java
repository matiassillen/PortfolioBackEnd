/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.SRM.Interface;

import com.portfolio.SRM.Entity.Persona;
import java.util.List;


/**
 *
 * @author Matías Sillen
 */
public interface IPersonaService {
    //Traer una persona
    public List<Persona> getpersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(long id);
    
    //Buscar una persona por ID
    public Persona findPersona(Long id);
    
}
