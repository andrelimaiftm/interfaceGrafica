package br.edu.iftm.interfacegrafica.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;

public class ExemploBorderLayout {
    
    public static void main(String[] args) {

        JFrame janela = new JFrame("Exemplo BorderLayout");
        janela.setBounds(50, 50, 500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Cria o layout da tela
        //BorderLayout layout = new BorderLayout();
        //janela.setLayout(layout);

        JButton botao1 = new JButton("Botão 1 (PAGINA TOPO)");
        JButton botao2 = new JButton("Botão 2 (CENTRO)");
        JButton botao3 = new JButton("Botão 3 (INICIO LINHA)");
        JButton botao4 = new JButton("Botão 4 (FIM LINHA)");
        JButton botao5 = new JButton("Botão 5 (PAGINA FIM)");

        janela.add(botao1, BorderLayout.PAGE_START);
        janela.add(botao2, BorderLayout.CENTER);
        janela.add(botao3, BorderLayout.LINE_START);
        janela.add(botao4, BorderLayout.LINE_END);
        janela.add(botao5, BorderLayout.PAGE_END);

        janela.setVisible(true);
        
    }
}
