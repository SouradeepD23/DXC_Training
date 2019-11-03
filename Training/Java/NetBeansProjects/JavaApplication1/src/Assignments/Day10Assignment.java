/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignments;

/**
 *
 * @author sdas301
 */
interface PhoneNumber {

    boolean numberFormat(String number);
}

abstract class Country implements PhoneNumber {

    boolean isNumber(String data) {
        char ch;
        for (int i = 0; i < data.length(); i++) {
            ch = data.charAt(i);
            if (!(ch >= 48 && ch <= 57)) {
                return false;
            }
        }
        return true;
    }
}

class Qatar extends Country {

    @Override
    public boolean numberFormat(String number) {
        if (number.length() != 14) {
            return false;
        }
        if ((number.charAt(0) != '+') || (number.charAt(3) != '-') || !isNumber(number.substring(1, 3)) || !isNumber(number.substring(4))) {
            return false;
        } else {
            return true;
        }
    }
}

class India extends Country {

    @Override
    public boolean numberFormat(String number) {
        if (number.length() != 14) {
            return false;
        }
        if ((number.charAt(0) != '+') || (number.charAt(3) != '-') || number.charAt(1) != '9' || number.charAt(2) != '1' || !isNumber(number.substring(4))) {
            return false;
        } else {
            return true;
        }
    }
}

class Brazil extends Country {

    @Override
    public boolean numberFormat(String number) {
        if (number.length() != 17) {
            return false;
        }
        if ((number.charAt(0) != '+') || (number.charAt(3) != ' ') || (number.charAt(6) != ' ') || number.charAt(1) != '5'
                || number.charAt(2) != '5' || number.charAt(4) != '1' || number.charAt(5) != '5' || (number.charAt(12) != '-') || !isNumber(number.substring(7, 12)) || !isNumber(number.substring(13))) {
            return false;
        } else {
            return true;
        }
    }
}

class Norway extends Country {

    @Override
    public boolean numberFormat(String number) {
        if (number.length() != 14) {
            return false;
        }
        if ((number.charAt(0) != '+') || (number.charAt(3) != '-') || !isNumber(number.substring(1, 3)) || !isNumber(number.substring(4))) {
            return false;
        } else {
            return true;
        }
    }
}

class Turkey extends Country {

    @Override
    public boolean numberFormat(String number) {
        if (number.length() != 14) {
            return false;
        }
        if ((number.charAt(0) != '+') || (number.charAt(3) != '-') || !isNumber(number.substring(1, 3)) || !isNumber(number.substring(4))) {
            return false;
        } else {
            return true;
        }
    }
}

public class Day10Assignment {

    public static void main(String[] args) {
        India ind = new India();
        System.out.println(ind.numberFormat("+91-1234567890"));
        
        Brazil br = new Brazil();
        System.out.println(br.numberFormat("+55 15 99999-9999"));
    }
}
