package it.marconicivitavecchia.as2018_19.c5Binf.verifica;


// TODO Inserire il package corretto
// nota: potete usare il suggerimento della lampadina a sinistra (scegliete l'unica opzione sensata). 


import javax.swing.*;

public class Main extends JFrame {
	
	public Main() {
		super("Formula 1 Passion");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// TODO Inserire la size in accordo con il wireframe (valori approssimati)
		super.setSize(100,100);
		
		// TODO Usare StringBuilder per costruire la stringa HTML
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<h1>Color Picker</h1>");
		// TODO Creare la stringa HTML per il wireframe
		sb.append("<div style='display:table'>");
		sb.append("<div style='display:table-row'>");
		sb.append("<div style='display:table-cell'>");
		sb.append("<b>Name</b>");
		sb.append("                  ");
		sb.append("<b>Hex</b>");
		sb.append("                  ");
		sb.append("<b>RGB</b>");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Persian Green     ");
		sb.append("     ");
		sb.append("#00A693");
		sb.append("     ");
		sb.append("0,166,147");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Venice Blue");
		sb.append("     ");
		sb.append("#055989");
		sb.append("     ");
		sb.append("5,89,137");
		sb.append("</div>");
		
		sb.append("<div style='display:table-cell'>");
		sb.append("Pale Blue");
		sb.append("     ");
		sb.append("#73D1E4");
		sb.append("     ");
		sb.append("115,209,228");
		sb.append("</div>");
		
		
		sb.append("</div>");
		
		sb.append("</div>");
		sb.append("</html>");
		
		
		
		
		
		// TODO Convertire lo StringBuilder in String
		String htmlText = sb.toString();
		// TODO Assegnare correttamente la stringa create a JLabel
		super.add(new JLabel(htmlText));
		super.setVisible(true);
		 
		System.out.println("Verifica Swing-GitHub");
		
		
	}
	
	public static void main (String[] args) {
		new Main();
	}
}

