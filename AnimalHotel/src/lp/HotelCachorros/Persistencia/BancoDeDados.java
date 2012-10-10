/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lp.HotelCachorros.Persistencia;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lp.HotelCachorros.*;

public class BancoDeDados {

    private Set<Acomodacao> acomodacoes;
    private Set<Animal> animais;
    private Set<Diaria> diarias;
    private Set<Pessoa> pessoas;
    private Set<Especie> especies;
    private Set<Estadia> estadias;
    private Set<PorteFaixa> portesFaixas;
    private static BancoDeDados instance;

    private BancoDeDados() {
        acomodacoes = new HashSet<Acomodacao>();
        animais = new HashSet<Animal>();
        diarias = new HashSet<Diaria>();
        pessoas = new HashSet<Pessoa>();
        especies = new HashSet<Especie>();
        estadias = new HashSet<Estadia>();
        portesFaixas = new HashSet<PorteFaixa>();
    }

    public static BancoDeDados getInstance() {
        if (instance == null) {
            instance = new BancoDeDados();
        }
        return instance;
    }

    public Set<Acomodacao> getAcomodacoes() {
        return acomodacoes;
    }

    public Set<Animal> getAnimais() {
        return animais;
    }

    public Set<Diaria> getDiarias() {
        return diarias;
    }

    public Set<Pessoa> getPessoas() {
        return pessoas;
    }

    public Set<Especie> getEspecies() {
        return especies;
    }

    public Set<Estadia> getEstadias() {
        return estadias;
    }

    public Set<PorteFaixa> getPortesFaixas() {
        return portesFaixas;
    }
    
    public Estadia getEstadia(Animal animal){
         Iterator i = BancoDeDados.getInstance().getEstadias().iterator();
        while (i.hasNext()) {
            Estadia estadia = (Estadia) i.next();
            if (estadia.getAnimal().equals(animal)) {
                return estadia;
            }
        }
        return null;
        
    }
    
    public Animal getAnimal(String nome) {
        Iterator i = BancoDeDados.getInstance().getAnimais().iterator();
        while (i.hasNext()) {
            Animal animal = (Animal) i.next();
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }

    
}