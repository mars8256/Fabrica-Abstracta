/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.factory;

import edu.uspg.inter.IShape;

/**
 *
 * @author morozco
 */
public abstract class AbstractFactory {
    public abstract IShape getShape(String shapeType);
}
