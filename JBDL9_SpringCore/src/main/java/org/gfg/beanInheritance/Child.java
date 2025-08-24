package org.gfg.beanInheritance;

public class Child extends Parent {

    int var2;
    int var3;

    public int getVar2() {
        return var2;
    }

    public void setVar2(int var2) {
        this.var2 = var2;
    }

    public int getVar3() {
        return var3;
    }

    public void setVar3(int var3) {
        this.var3 = var3;
    }

    @Override
    public String toString() {
        return "Child{" +
                "var2=" + var2 +
                ", var3=" + var3 +
                ", var1=" + var1 +
                '}';
    }
}
