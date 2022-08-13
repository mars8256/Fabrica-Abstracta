/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.factory;

import edu.uspg.inter.IShape;
import edu.uspg.model.RoundedRectangle;
import edu.uspg.model.RoundedSquare;

/**
 *
 * @author morozco
 */
public class RoundedShapeFactory extends AbstractFactory {

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedSquare();
        }
        return null;
    }
    
}
