/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg;

import edu.uspg.factory.AbstractFactory;
import edu.uspg.factory.FactoryProducer;
import edu.uspg.inter.IShape;

/**
 *
 * @author morozco
 */
public class FabricaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Obtenemos shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        AbstractFactory shapeFactoryRounded = FactoryProducer.getFactory(true);
        
        System.out.println("Ejemplo fabrica abstracta");
        
        IShape cuadrado = shapeFactory.getShape("SQUARE");
        IShape rectangulo = shapeFactory.getShape("RECTANGLE");
        
        cuadrado.draw();
        rectangulo.draw();
        
        IShape cuadradoRedondeado = shapeFactoryRounded.getShape("SQUARE");
        IShape rectanguloRedondeado = shapeFactoryRounded.getShape("RECTANGLE");
        
        cuadradoRedondeado.draw();
        rectanguloRedondeado.draw();
        
        
    }
    
}
