package br.com.david.desafio.dio.dominio;

import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author David
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + getTitulo() + ", descricao=" + getDescricao() + ", data=" + data + '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
