/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.Algorithm;
import view.Menu;

/**
 *
 * @author PC
 */
public class CopyFileProgram extends Menu{
    Algorithm ar;
    public CopyFileProgram() {
        super("========== COPY PROGRAM ==========");
        ar = new Algorithm();
    }

    @Override
    public void execute() {
        ar.readFileConfig();
    }
    
}