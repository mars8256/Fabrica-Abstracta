/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uspg.model;

import edu.uspg.inter.IShape;

/**
 *
 * @author morozco
 */
public class RoundedRectangle implements IShape{

    @Override
    public void draw() {
        System.out.println("Inside RoundRectangle::draw() method.");
    }
    
}
