/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factories;

/**
 *
 * @author FATEC ZONA LESTE
 */

import Buttons.Button;
import Checkbox.Checkbox;


public interface GUIFactory {
    
    Button createButton();
    Checkbox createCheckbox();
       
}
