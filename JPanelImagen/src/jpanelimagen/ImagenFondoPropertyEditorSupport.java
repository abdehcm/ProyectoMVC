/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author abdelhachim
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport{

    private ImagenFondoPanel imagenFondoPanel = new ImagenFondoPanel();
    
    @Override
    public boolean supportsCustomEditor() {
        return true; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Component getCustomEditor() {
        return imagenFondoPanel; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getJavaInitializationString() {
        return super.getJavaInitializationString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
