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
        

        //Criar uma janela
        JFrame janela = new JFrame("Título da minha primeira Janela");
        janela.setBounds(100, 100, 500, 500);
        janela.setLayout(null);

        //cria label -> que apresenta informações para usuário
        JLabel labelUsuario = new JLabel("Usuário: ");
        JLabel labelSenha = new JLabel("Senha: ");

        //cria um cmapo de texto (apenas uma linha)
        JTextField campoUsuario = new JTextField();
        JPasswordField camposSenha = new JPasswordField();

        //criar um botão
        JButton botao = new JButton("Entrar");

        //adicionando a posição e o tamanho do campo na tela
        labelUsuario.setBounds(50, 80, 50, 20);
        campoUsuario.setBounds(50, 100, 150, 30);
        labelSenha.setBounds(50, 160, 50, 20);
        camposSenha.setBounds(50, 181, 150, 30);
        botao.setBounds(50, 250, 100, 30);

        //Adicionar o Jlabel e o JTextFild na janela
        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(labelSenha);
        janela.add(camposSenha);
        janela.add(botao);

        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {                
                String usuario = campoUsuario.getText();
                String senha = camposSenha.getText();
                System.out.printf("Usuário: %s \tSenha: %s\n",usuario,senha);
                //System.out.println("Clickou no botão");
            }
        });


        //Define  comportamento ao encerrar programa ao clicar em X
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Define a janela como visível
        janela.setVisible(true);
    }
    
}
