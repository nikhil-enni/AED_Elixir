/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.utils;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author vaishnaviyadamreddy
 */
public class Validation {
    
    public static boolean validateName(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z]{1,}[\\s]{0,1}[A-Za-z]{0,}$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
    
        public static boolean validateUserName(String name) {
        Pattern pattern;
        Matcher matcher;
        String NAME_PATTERN = "^[A-Za-z\\s]+$";
        pattern = Pattern.compile(NAME_PATTERN);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }
        
        
        public static boolean validateEmail(String email) {
        Pattern pattern;
        Matcher matcher;
        String EMAIL_PATTERN
                = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validatePassword(String passwordValue) {
        Pattern pattern;
        Matcher matcher;
        String PASSWORD_PATTERN
                = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=~|?])(?=\\S+$).{8,}$";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(passwordValue);
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String contact) {
        Pattern pattern;
        Matcher matcher;
        String PHONE_PATTERN = "^[0-9]{10}$";
        pattern = Pattern.compile(PHONE_PATTERN);
        matcher = pattern.matcher(contact);
        return matcher.matches();
    }

    public static void validateString(KeyEvent evt, JTextField field) {
        char c = evt.getKeyChar();
        if (!((c >= 'A') && (c <= 'Z') || (c >= 'a') && (c <= 'z') || (c == evt.VK_SPACE)
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {

            JOptionPane.showMessageDialog(null, "Enter Alphabets only");
            field.setText(field.getText().substring(0, field.getText().length()-1));
        }
    }

    public static void validateInteger(KeyEvent evt, JTextField field) {
        char c = evt.getKeyChar();
        if (!((c >= '0') && (c <= '9')
                || (c == evt.VK_BACK_SPACE)
                || (c == evt.VK_DELETE))) {

            JOptionPane.showMessageDialog(null, "Enter Integers only");
            field.setText("");
            field.setText(field.getText().substring(0, field.getText().length()-1));
        }
    }
    
}
