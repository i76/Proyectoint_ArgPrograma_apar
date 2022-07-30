/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.apar.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Agus16
 */
public class dtoProyecto {
  @NotBlank  
  private String nombreproy;
  @NotBlank
  private String urlproy;
  
  //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreproy, String urlproy) {
        this.nombreproy = nombreproy;
        this.urlproy = urlproy;
    }
  
    //Getters & Setters

    public String getNombreproy() {
        return nombreproy;
    }

    public void setNombreproy(String nombreproy) {
        this.nombreproy = nombreproy;
    }

    public String getUrlproy() {
        return urlproy;
    }

    public void setUrlproy(String urlproy) {
        this.urlproy = urlproy;
    }
    
    
  
}


