/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.MacOSButton;
import Checkbox.Checkbox;
import Checkbox.MacOSCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class MacOSFactory implements GUIFactory {
    
    @Override
    public Button createButton(){
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
    
}
