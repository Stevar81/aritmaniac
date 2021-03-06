/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmaniac.graphics;

import static java.awt.Color.white;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.io.IOException;

/**
 * Graphics for the Menu.
 * @author Tomi
 */
public class MenuGraphics extends MainGraphics {
    
    private String name;
    
    /**
     * Constructor.
     * @throws IOException exception
     * @throws FontFormatException exception
     */
    public MenuGraphics() throws IOException, FontFormatException {
        this.name = "";
    }
    
    @Override
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
        graphics.setColor(white);
        graphics.setFont(f2);
        graphics.drawString("Welcome to Aritmaniac!", 150, 220);
        graphics.drawString(this.name, 290, 330);
        graphics.setFont(new Font("Monospaced", Font.PLAIN, 16));
        graphics.drawString("Type your name and press Space to start!", 50, 450);
        graphics.drawString("[F1] High Scores", 480, 450);
        graphics.drawString("[Esc] Exit", 660, 450);
    }
    
    /**
     * Keylistener calls this to refresh the name-graphics as it's been typed.
     * @param name player's name
     */
    public void refreshName(String name) {
        this.name = name;
    }
    
}

