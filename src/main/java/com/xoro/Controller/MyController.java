package com.xoro.Controller;

import com.xoro.Service.Game;
import com.xoro.Service.Player;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

//  Додати статистику

@Controller
public class MyController {

    Game game = new Game("  ", "  ", "  ",
            "  ", "  ", "  ",
            "  ", "  ", "  ");

    String var;
    String p1Name;
    String p2Name;
    String winner;
    boolean win = false;
    boolean svitch = true;

    public void switching() {
        svitch = !svitch;
    }

    public String varik(boolean svitch) {
        if (svitch) {
            var = "X";
        } else {
            var = "O";
        }
        return var;
    }

    public void checkToWin() {
        if ((((game.getA1().equals(game.getA3())) && (!game.getA1().equals("  "))) && (game.getA1().equals(game.getA2()))) ||
                (((game.getA1().equals(game.getB1())) && (!game.getA1().equals("  "))) && (game.getA1().equals(game.getC1()))) ||
                (((game.getA2().equals(game.getB2())) && (!game.getA2().equals("  "))) && (game.getA2().equals(game.getC2()))) ||
                (((game.getA3().equals(game.getB3())) && (!game.getA3().equals("  "))) && (game.getA3().equals(game.getC3()))) ||
                (((game.getB1().equals(game.getB2())) && (!game.getB1().equals("  "))) && (game.getB1().equals(game.getB3()))) ||
                (((game.getC1().equals(game.getC2())) && (!game.getC1().equals("  "))) && (game.getC1().equals(game.getC3()))) ||
                (((game.getA1().equals(game.getB2())) && (!game.getA1().equals("  "))) && (game.getC3().equals(game.getA1()))) ||
                (((game.getA3().equals(game.getB2())) && (!game.getA3().equals("  "))) && (game.getA3().equals(game.getC1())))) {
            System.out.println("Player " + var + " - WIN!!!");
            win = true;
        }
    }

    public void whoIsWinner(Model model) {
        if (var.equals("X")) {
            winner = p1Name;
            model.addAttribute("winner", winner);
        } else {
            winner = p2Name;
            model.addAttribute("winner", winner);
        }
    }
    private String getString(Model model) {
        game.getAllValues(model, game);

        switching();
        checkToWin();
        whoIsWinner(model);

        if (win) {
            return "playerWin";
        } else if (!game.isSomeCellsEmpty(game)) {
            return "draw";
        }
        return "mainPage";
    }
    private void cellsClear(Model model) {
        game.setA1("  ");
        game.setA2("  ");
        game.setA3("  ");
        game.setB1("  ");
        game.setB2("  ");
        game.setB3("  ");
        game.setC1("  ");
        game.setC2("  ");
        game.setC3("  ");
        game.getAllValues(model, game);
    }




    @RequestMapping("/")
    public String menu() {
        return "menu";
    }
    @RequestMapping("/nameP1")
    public String nameP1(Model model) {

            Player player = new Player();
            model.addAttribute("player", player);

        return "player1";
    }

    @RequestMapping("/saveP1")
    public String saveP1(@ModelAttribute("player") Player player, Model model) {
        p1Name = player.getName();
        model.addAttribute("p1Name", p1Name);

        return "saveP1";
    }

    @RequestMapping("/nameP2")
    public String nameP2(Model model) {

        Player player2 = new Player();
        model.addAttribute("player2", player2);

            return "player2";
    }

    @RequestMapping("/saveP2")
    public String saveP2(@ModelAttribute("player") Player player2, Model model) {

        p2Name = player2.getName();
        model.addAttribute("p2Name", p2Name);
        return "saveP2";
    }

    @RequestMapping("/mainPage")
    public String mainPage(Model model) {

        win = false; /////
        cellsClear(model);
        return "mainPage";
    }

    @RequestMapping("/A1")
    public String changeA1(Model model) {

        game.setA1(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/A2")
    public String changeA2(Model model) {

        game.setA2(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/A3")
    public String changeA3(Model model) {

        game.setA3(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/B1")
    public String changeB1(Model model) {

        game.setB1(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/B2")
    public String changeB2(Model model) {

        game.setB2(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/B3")
    public String changeB3(Model model) {

        game.setB3(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/C1")
    public String changeC1(Model model) {

        game.setC1(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/C2")
    public String changeC2(Model model) {

        game.setC2(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/C3")
    public String changeC3(Model model) {

        game.setC3(varik(svitch));
        return getString(model);
    }

    @RequestMapping("/congratulations")
    public String congratulations() {

        return "playerWin";
    }

    @RequestMapping("/newGame")
    public String newGame(Model model) {
        cellsClear(model);

        win = false;

        return "mainPage";
    }

    @RequestMapping("/showPlayers")
    public String showPlayers(Model model) {

        model.addAttribute("p1Name", p1Name);
        model.addAttribute("p2Name", p2Name);
        return "showPlayers";
    }
}
