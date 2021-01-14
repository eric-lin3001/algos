package thinkingInJava.demos.access.protect.protect2;

import thinkingInJava.demos.access.protect.protect1.Cookie;

public class Chocolate extends Cookie {
    public static void main(String[] args) {
        Chocolate c = new Chocolate();
        c.bite();
        c.getKind();
    }
}
