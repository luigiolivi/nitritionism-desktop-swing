package atividade.pkg2;

import telas.Home;


public class Atividade2 {
    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
        
    }
}
