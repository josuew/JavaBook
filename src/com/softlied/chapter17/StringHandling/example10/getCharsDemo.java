package com.softlied.chapter17.StringHandling.example10;

/*
    El primer parametro de getChars hace un substring en el array, en
    este caso es de la posicion 10 hasta la posicion 14, el siguientre
    argumento es el destino donde se van a insetar los caracteres,
    en este caso se insertan en el array buf y despues se pone desde que
    posicion del arreglo insertado va a llenar los chars, por ello se le
    puso 0 para que se llene buf desde la posicion 0, si le ponemos 1,
    empezaria desde buf[1]

 */
public class getCharsDemo {
    public static void main(String[] args) {
        String s = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char buf[] = new char[end - start];
        s.getChars(start, end, buf, 0);
        System.out.println(buf);
    }
}
