package br.com.templatedmethodpattern.usecabeca.applets;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * Applet e um pequeno programa que e executado
 * numa webpage. Qualquer applet deve utilizar
 * uma subclasse Applet, e essa classe fornece
 * diversos ganhos.
 * */
public class MyApplet extends Applet {

	private static final long serialVersionUID = 1L;
	
	/**
	 * O Gancho init permite fazer qualquer coisa para
	 * inicializar o applet da primeira vez.
	 * 
	 * repaint() e um metodo concreto da classe Applet
	 * que permite que os componentes de nivel mais alto
	 * saibam que o applet precisa ser redesenhado.
	 * */
	@Override
	public void init() {
		@SuppressWarnings("unused")
		final String message = "Hello World, I'm alive";
		repaint();
	}
	
	/**
	 * O gancho start() permite que o applet faca algo
	 * quando esta prestes a ser exibido na pagina web.
	 * */
	@Override
	public void start() {
		@SuppressWarnings("unused")
		final String message = "Now I'm starting up...";
		repaint();
	}
	
	/**
	 * Quando o usuario segue para outra pagina, gancho stop
	 * e utilizado e o applet pode fazer tudo o que quiser
	 * para encerrar as suas acoes.
	 * */
	@Override
	public void stop() {
		@SuppressWarnings("unused")
		final String message = "Oh, now I'm being stopped...";
		repaint();
	}
	
	/**
	 * E o gancho destroy e usado quando o applet esta prestes
	 * a ser destruido - por exemplo, quando a janela do browser
	 * e fechada.
	 * */
	@Override
	public void destroy() {
	}
	
	@Override
	public void paint(final Graphics g) {
		g.drawString("", 5, 15);
	}

}
