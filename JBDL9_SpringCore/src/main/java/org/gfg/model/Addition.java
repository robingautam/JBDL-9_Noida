package org.gfg.model;

public class Addition {

    int num1;
    int num2;

    Addition(int n1, int n2){
        System.out.println("type int int");
      this.num1 = n1;
      this.num2 = n2;
    }


    Addition(String n1, String n2){
        System.out.println("type String String");
        this.num1 = Integer.parseInt(n1);
        this.num2 = Integer.parseInt(n2);
    }
}
