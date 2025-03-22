/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

import Buttons.Button;
import Buttons.WindowsButton;
import Checkbox.Checkbox;
import Checkbox.WindowsCheckbox;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class WindowsFactory implements GUIFactory {
    
    @Override
    public Button createButton(){
        return new WindowsButton();
    }
    
    @Override
    public Checkbox createCheckbox(){
        return new WindowsCheckbox();
    }
    
}
