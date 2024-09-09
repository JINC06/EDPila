/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.julionava.edpila;

import javax.swing.JOptionPane;

/**
 *
 * @author julio.nava
 */
public class EDPila {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        /*Pila pila = new Pila();
        pila.push("3");
        pila.push("5");
        pila.push("7");
        pila.push("5");
        pila.push("2");
        
        pila.displayStack();
        
        System.out.println("Cantidad de elementos: " + pila.size());
        System.out.println("El elemento que se saco es : " + pila.pop());
        
        pila.displayStack();*/
        
        showMenu();
        
    }
    
    public static void showMenu(){
        int option = 0;
        Pila stack = new Pila();
        
        do {
            try {
                option = Integer.parseInt( JOptionPane.showInputDialog(null, ""
                                + "1.- Push(element)\n2.- Pop()\n"
                                + "3.- Is Empty?\n4.- top()\n"
                                + "5.- size()\n"
                                + "6.- displayStack()\n"
                                + "7.- Exit\n"
                                + "Input one option:\n") );
                switch (option) {
                    case 1:
                        String data = JOptionPane.showInputDialog(null, "Input the data:");
                        stack.push(data);
                        break;
                    case 2:
                        if(!stack.isEmpty()){
                            String elementRemove = stack.pop();
                            JOptionPane.showMessageDialog(null, "Element removed from the stack: " + elementRemove);
                        }else{
                            JOptionPane.showMessageDialog(null, "The stack is empty");
                        }
                        break;
                    case 3:
                        if(stack.isEmpty()){
                            JOptionPane.showMessageDialog(null, "The stack IS EMPTY");
                        }else{
                            JOptionPane.showMessageDialog(null, "The stack IS NOT EMPTY");
                        }
                        break;
                    case 4:
                        if(!stack.isEmpty()){
                            String elementTop = stack.top();
                            JOptionPane.showMessageDialog(null, "The top element is: " + elementTop);
                        }else{
                            JOptionPane.showMessageDialog(null, "The stack is empty");
                        }
                        break;
                    case 5:
                        int total = stack.size();
                        JOptionPane.showMessageDialog(null, "The total items in the stack is: " + total);
                        break;
                    case 6:
                        stack.displayStack();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "Program finished.");
                        break;
                }
            }catch(Exception e){
                System.out.println("Error. Ingrese un entero: " + e.getMessage());
            }
        }while(option != 7);
        
    }
    
}
