package com.xoro.Service;

import org.springframework.ui.Model;

public class Game {
    String a1 = "  ";
    String a2 = "  ";
    String a3 = "  ";
    String b1 = "  ";
    String b2 = "  ";
    String b3 = "  ";
    String c1 = "  ";
    String c2 = "  ";
    String c3 = "  ";

    public Game(String a1, String a2, String a3,
                String b1, String b2, String b3,
                String c1, String c2, String c3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
        this.b1 = b1;
        this.b2 = b2;
        this.b3 = b3;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getC1() {
        return c1;
    }

    public void setC1(String c1) {
        this.c1 = c1;
    }

    public String getC2() {
        return c2;
    }

    public void setC2(String c2) {
        this.c2 = c2;
    }

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public void getAllValues(Model model, Game game) {
        model.addAttribute("a1", game.getA1());
        model.addAttribute("a2", game.getA2());
        model.addAttribute("a3", game.getA3());
        model.addAttribute("b1", game.getB1());
        model.addAttribute("b2", game.getB2());
        model.addAttribute("b3", game.getB3());
        model.addAttribute("c1", game.getC1());
        model.addAttribute("c2", game.getC2());
        model.addAttribute("c3", game.getC3());
    }

    public boolean isSomeCellsEmpty(Game game) {
        return (game.getA1().contains("  ")) || (game.getA2().contains("  "))
        || ((game.getA3().contains("  ")) || (game.getB1().contains("  "))
        || (game.getB2().contains("  ")) || (game.getB3().contains("  "))
        || (game.getC1().contains("  ")) || (game.getC2().contains("  "))
        || (game.getC3().contains("  ")));
    }
}
