package br.com.templatedmethodpattern.usecabeca.jframe;

import java.awt.Graphics;

import javax.swing.JFrame;

/**
 * Estamos criando uma extensao do JFrame, que contem
 * um metodo update para controloar o algoritmo que
 * atualiza a tela. Podemos nos conectar a esse
 * algoritmo substituindo o metodo-gancho paint.
 * 
 * O algoritmo de atualizacao da tela de JFrame chama
 * paint() nao faz nada... e apenas um gancho. Estamos
 * substituindo paint() e determinando ao JFrame que 
 * desenhe uma mensagem na tela.
 * */
public class MyFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MyFrame(final String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	@Override
	public void paint(final Graphics g) {
		super.paint(g);
		final String msg = "I rule!!";
		g.drawString(msg, 100, 100);
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		final MyFrame myFrame = new MyFrame("Head Firts Design Patterns");
	}
	
}
