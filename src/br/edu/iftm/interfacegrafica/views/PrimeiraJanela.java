package br.edu.iftm.interfacegrafica.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PrimeiraJanela {
    
    public static void main(String[] args) {
        //Cria uma janela
        JFrame janela = new JFrame("Título da minha primeira Janela");
        
        //Define a possição inicial e o tamanho da janela
        janela.setBounds(100, 100, 500, 500);

        //Fefine o comportamento de encerrar o programa ao clicar em X
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Define o layout para nulo (deverá informar as coordenadas dos compontes)
        janela.setLayout(null);
        
        //Cria um campo de texto (paenas uma linha)
        JTextField campoUsuario = new JTextField();

        //Define a posição e o tamanho do campo de texto
        campoUsuario.setBounds(50, 100, 150, 30);// Y inicial = 100; Y final = 130

        //Adiciona JTextField no painel (JPainel)
        janela.add(campoUsuario);

        //Cria uma label
        JLabel labelUsuario = new JLabel("Usuário: ");
        labelUsuario.setBounds(50,80,50,20);


        JLabel labelSenha = new JLabel("Senha: ");
        labelSenha.setBounds(50, 161, 50, 20);
        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(50, 181, 150, 30);

        JButton botao = new JButton("Entrar");
        botao.setBounds(70, 250, 100, 30);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();
                System.out.printf("Usuario: %s \tSenha: %s \n", usuario, senha);
                //System.out.println("Clickou no botão");
                
            }
        });

        janela.add(labelUsuario);
        janela.add(campoSenha);
        janela.add(labelSenha);
        janela.add(botao);
       
        //Define a janela como visível
        janela.setVisible(true);

        
        
    }
}
