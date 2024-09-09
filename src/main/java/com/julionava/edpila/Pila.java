/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.julionava.edpila;

/**
 * Stack structure
 * @author julio.nava
 */
public class Pila {
    
    /*
    First element on the stack
    */
    private Nodo inicio;
    /*
    Last element on the stack
    */
    private Nodo fin;
    
    /*
    Empty constructor
    */
    public Pila() {
        this.inicio = null;
        this.fin = null;
    }
    
    /*
    The stack is empty return true or false
    */
    public boolean isEmpty () {
        return this.inicio == null;
    }
    
    /*
    Show the real structure of the current stack
    */
    public void displayStack() {
        System.out.println("____________");
         Nodo aux = this.inicio;
        while(aux != null){
            System.out.println("|  "+ aux.valor +"  |");
            aux = aux.siguiente;
        }
        System.out.println("-------");
    }
    
    /*
    Add a element on the stack in the beginning
    */
    public void push(String val) {
        if(isEmpty()){
            inicio = new Nodo(val, inicio);
            fin = inicio;
        }else{
            inicio = new Nodo(val, inicio);
        }
    }
    
    /*
    Remove an element on the stack the first one
    */
    public String pop() {
        String eliminado = inicio.valor;
        int contador = size();
        if(contador == 1){
            inicio = null;
            fin = inicio;
        }else{
            inicio = inicio.siguiente; //inicio.siguiente Accedemos al siguiente del nodo del cual apunta inicio.
        }
        return eliminado;
    } 
    
    /*
    Return how many elements are on the stack
    */
    public int size() {
        Nodo aux = this.inicio;
        int contador = 0;
        while(aux != null){
            contador++;
            aux = aux.siguiente;
        }
        return contador;
    }
    
    /*
    Display the first element on the stack
    */
    public String top() {
        if(inicio != null) {
            return inicio.valor;
        }else{
            return null;
        }
    }
    
}
