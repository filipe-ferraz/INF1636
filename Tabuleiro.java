import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

class Tabuleiro extends JPanel{
	 protected void paintComponent(Graphics g) {
		 super.paintComponent(g);
		 Graphics2D g2d = (Graphics2D) g;
		 int tamanho = (int)getWidth() /20;

		 int i = 0;


	 /*****************************************************
  * 
  * INSERINDO AS BASES
 	* 
  ********************************************************/
		 
		 
		

		 Rectangle2D GrandeQuaVermelho = 
				 new Rectangle2D.Double(0,0,tamanho*6,tamanho*6);
		 g2d.setPaint(Color.red);
		 g2d.fill(GrandeQuaVermelho);
	     g.setColor(Color.BLACK);
	     g2d.draw(GrandeQuaVermelho);
		 
	     

	     
	     Rectangle2D GrandeQuaAzul = 
	    		 new Rectangle2D.Double(0,tamanho*9+1,tamanho*6,tamanho*6);
		 g2d.setPaint(Color.blue);
		 g2d.fill(GrandeQuaAzul);
	     g.setColor(Color.BLACK);
	     g2d.draw(GrandeQuaAzul);
	    
		
	     Rectangle2D GrandeQuaAmarelo = 
	    		 new Rectangle2D.Double(tamanho*9 + 1,tamanho*9+1,tamanho*6,tamanho*6);
		 g2d.setPaint(Color.yellow);
		 g2d.fill(GrandeQuaAmarelo);
	     g.setColor(Color.BLACK);
	     g2d.draw(GrandeQuaAmarelo);
	    

	     
		 Rectangle2D GrandeQuaVerde = 
				 new Rectangle2D.Double(tamanho*9 + 1, 1, tamanho*6, tamanho*6);
		 g2d.setPaint(Color.green);
		 g2d.fill(GrandeQuaVerde);
		 g.setColor(Color.BLACK);
	     g2d.draw(GrandeQuaVerde);
		 
	/****************************************************
	 * 
	 * INSERINDO OS CAMPOS ENTRE BASE VERMELHA E VERDE
	 * 	 
	 ****************************************************/

	     Rectangle2D Casa49 = 
	    		 new Rectangle2D.Double(tamanho*6+1,0,tamanho,tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa49);
	     g.setColor(Color.black);
	     g2d.draw(Casa49);

	     Rectangle2D Casa50 = 
	    		 new Rectangle2D.Double(tamanho*7+1, 0, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa50);
	     g.setColor(Color.black);
	     g2d.draw(Casa50);
	     
	     Rectangle2D Casa51 = 
	    		 new Rectangle2D.Double(tamanho*8+1, 0, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa51);
	     g.setColor(Color.black);
	     g2d.draw(Casa51);
	     

	     
	     
//coluna direita

	     Rectangle2D Casa1 = 
	    		 new Rectangle2D.Double(tamanho*8+1, tamanho*2+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa1);
	     g.setColor(Color.black);
	     g2d.draw(Casa1);
	     
	     Rectangle2D Casa2 = 
	    		 new Rectangle2D.Double(tamanho*8+1, tamanho*3+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa2);
	     g.setColor(Color.black);
	     g2d.draw(Casa2);
	     
	     Rectangle2D Casa3 = 
	    		 new Rectangle2D.Double(tamanho*8+1, tamanho*4+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa3);
	     g.setColor(Color.black);
	     g2d.draw(Casa3);
	     
	     Rectangle2D Casa4 = 
	    		 new Rectangle2D.Double(tamanho*8+1, tamanho*5+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa4);
	     g.setColor(Color.black);
	     g2d.draw(Casa4);
	     
	        
	// coluna esquerda

	 //Casa Preta    
	     Rectangle2D Casa48 = 
	    		 new Rectangle2D.Double(tamanho*6+1, tamanho+1, tamanho, tamanho);
	     g2d.setPaint(Color.black);
	     g2d.fill(Casa48);
	     g.setColor(Color.black);
	     g2d.draw(Casa48);
	// Casas Brancas
	     Rectangle2D Casa47 = 
	    		 new Rectangle2D.Double(tamanho*6+1, tamanho*2+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa47);
	     g.setColor(Color.black);
	     g2d.draw(Casa47);
	     
	     
	     Rectangle2D Casa46 = 
	    		 new Rectangle2D.Double(tamanho*6+1, tamanho*3+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa46);
	     g.setColor(Color.black);
	     g2d.draw(Casa46);
	     
	     Rectangle2D Casa45 = 
	    		 new Rectangle2D.Double(tamanho*6+1, tamanho*4+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa45);
	     g.setColor(Color.black);
	     g2d.draw(Casa45);
	     
	     Rectangle2D Casa44 = 
	    		 new Rectangle2D.Double(tamanho*6+1, tamanho*5+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa44);
	     g.setColor(Color.black);
	     g2d.draw(Casa44);
	     
	// Casas Verdes
	     Rectangle2D Casa0 = 
	    		 new Rectangle2D.Double(tamanho*8+1, tamanho+1,   tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(Casa0);
	     g.setColor(Color.black);
	     g2d.draw(Casa0);
	     
	     Rectangle2D FimVerde1 = 
	    		 new Rectangle2D.Double(tamanho*7+1, tamanho+1  ,   tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(FimVerde1);
	     g.setColor(Color.black);
	     g2d.draw(FimVerde1);
	     
	     Rectangle2D FimVerde2 = 
	    		 new Rectangle2D.Double(tamanho*7+1, tamanho*2+1,  tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(FimVerde2);
	     g.setColor(Color.black);
	     g2d.draw(FimVerde2);
	     
	     Rectangle2D FimVerde3 = 
	    		 new Rectangle2D.Double(tamanho*7+1, tamanho*3+1,   tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(FimVerde3);
	     g.setColor(Color.black);
	     g2d.draw(FimVerde3);
	     
	     Rectangle2D FimVerde4 = 
	    		 new Rectangle2D.Double(tamanho*7+1, tamanho*4+1,   tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(FimVerde4);
	     g.setColor(Color.black);
	     g2d.draw(FimVerde4);
	     
	     Rectangle2D FimVerde5 = 
	    		 new Rectangle2D.Double(tamanho*7+1, tamanho*5+1,   tamanho, tamanho);
	     g2d.setPaint(Color.green);
	     g2d.fill(FimVerde5);
	     g.setColor(Color.black);
	     g2d.draw(FimVerde5);
	     
		 
	/****************************************************
	 * 
	 * INSERINDO OS CAMPOS ENTRE BASE VERDE E AMARELO
	 * 	 
	****************************************************/	
	 
		 Rectangle2D Casa5 = 
	    		 new Rectangle2D.Double(tamanho*9+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa5);
	     g.setColor(Color.black);
	     g2d.draw(Casa5);
	     
	     Rectangle2D Casa6 = 
	    		 new Rectangle2D.Double(tamanho*10+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa6);
	     g.setColor(Color.black);
	     g2d.draw(Casa6);
	     
	     Rectangle2D Casa7 = 
	    		 new Rectangle2D.Double(tamanho*11+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa7);
	     g.setColor(Color.black);
	     g2d.draw(Casa7);
	     
	     Rectangle2D Casa8 = 
	    		 new Rectangle2D.Double(tamanho*12+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa8);
	     g.setColor(Color.black);
	     g2d.draw(Casa8);
	     
	     Rectangle2D Casa9 = 
	    		 new Rectangle2D.Double(tamanho*13+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.black);
	     g2d.fill(Casa9);
	     g.setColor(Color.black);
	     g2d.draw(Casa9);
	     
	     Rectangle2D Casa10 = 
	    		 new Rectangle2D.Double(tamanho*14+1 ,tamanho*6+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa10);
	     g.setColor(Color.black);
	     g2d.draw(Casa10);
	     
	     Rectangle2D Casa11 = 
	    		 new Rectangle2D.Double(tamanho*14+1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa11);
	     g.setColor(Color.black);
	     g2d.draw(Casa11);
	     
	     Rectangle2D Casa12 = 
	    		 new Rectangle2D.Double(tamanho*14+1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa12);
	     g.setColor(Color.black);
	     g2d.draw(Casa12);
	     
	     Rectangle2D Casa13 = 
	    		 new Rectangle2D.Double(tamanho*13+1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(Casa13);
	     g.setColor(Color.black);
	     g2d.draw(Casa13);
	     
	     Rectangle2D Casa14 = 
	    		 new Rectangle2D.Double(tamanho*12+1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa14);
	     g.setColor(Color.black);
	     g2d.draw(Casa14);
	     
	     Rectangle2D Casa15 = 
	    		 new Rectangle2D.Double(tamanho*11+1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa15);
	     g.setColor(Color.black);
	     g2d.draw(Casa15);
	     
	     Rectangle2D Casa16 = 
	    		 new Rectangle2D.Double(tamanho*10+1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa16);
	     g.setColor(Color.black);
	     g2d.draw(Casa16);
	     
	     Rectangle2D Casa17 = 
	    		 new Rectangle2D.Double(tamanho*9 +1 ,tamanho*8+1, tamanho, tamanho);
	     g2d.setPaint(Color.white);
	     g2d.fill(Casa17);
	     g.setColor(Color.black);
	     g2d.draw(Casa17);
	     
	 // casas finais amarela
	     Rectangle2D FimAmarelo1 = 
	    		 new Rectangle2D.Double(tamanho*13 +1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(FimAmarelo1);
	     g.setColor(Color.black);
	     g2d.draw(FimAmarelo1);
	     
	     Rectangle2D FimAmarelo2 = 
	    		 new Rectangle2D.Double(tamanho*12 +1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(FimAmarelo2);
	     g.setColor(Color.black);
	     g2d.draw(FimAmarelo2);
	     
	     Rectangle2D FimAmarelo3 = 
	    		 new Rectangle2D.Double(tamanho*11 +1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(FimAmarelo3);
	     g.setColor(Color.black);
	     g2d.draw(FimAmarelo3);
	     
	     Rectangle2D FimAmarelo4 = 
	    		 new Rectangle2D.Double(tamanho*10 +1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(FimAmarelo4);
	     g.setColor(Color.black);
	     g2d.draw(FimAmarelo4);
	     
	     Rectangle2D FimAmarelo5 = 
	    		 new Rectangle2D.Double(tamanho*9  +1 ,tamanho*7+1, tamanho, tamanho);
	     g2d.setPaint(Color.yellow);
	     g2d.fill(FimAmarelo5);
	     g.setColor(Color.black);
	     g2d.draw(FimAmarelo5);
	     
	/****************************************************
	 * 
	 * INSERINDO OS CAMPOS ENTRE BASE AZUL E AMARELA
	 * 	 
	****************************************************/	

	     
		     Rectangle2D Casa18 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*9+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa18);
		     g.setColor(Color.black);
		     g2d.draw(Casa18);
		     
		     Rectangle2D Casa19 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*10+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa19);
		     g.setColor(Color.black);
		     g2d.draw(Casa19);
		     
		     Rectangle2D Casa20 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*11+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa20);
		     g.setColor(Color.black);
		     g2d.draw(Casa20);
		     
		     Rectangle2D Casa21 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*12+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa21);
		     g.setColor(Color.black);
		     g2d.draw(Casa21);
		     
		     Rectangle2D Casa22 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*13+1 , tamanho, tamanho);
		     g2d.setPaint(Color.black);
		     g2d.fill(Casa22);
		     g.setColor(Color.black);
		     g2d.draw(Casa22);
		     
		     Rectangle2D Casa23 = 
		    		 new Rectangle2D.Double(tamanho*8+1, tamanho*14+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa23);
		     g.setColor(Color.black);
		     g2d.draw(Casa23);
		     
		     Rectangle2D Casa24 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*14+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa24);
		     g.setColor(Color.black);
		     g2d.draw(Casa24);
		     
		     Rectangle2D Casa25 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*14+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa25);
		     g.setColor(Color.black);
		     g2d.draw(Casa25);
		     
		     Rectangle2D Casa26 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*13+1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(Casa26);
		     g.setColor(Color.black);
		     g2d.draw(Casa26);
		     
		     Rectangle2D Casa27 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*12+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa27);
		     g.setColor(Color.black);
		     g2d.draw(Casa27);
		    
		     Rectangle2D Casa28 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*11+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa28);
		     g.setColor(Color.black);
		     g2d.draw(Casa28);
		    
		     Rectangle2D Casa29 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*10+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa29);
		     g.setColor(Color.black);
		     g2d.draw(Casa29);
		    
		     Rectangle2D Casa30 = 
		    		 new Rectangle2D.Double(tamanho*6+1, tamanho*9 +1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa30);
		     g.setColor(Color.black);
		     g2d.draw(Casa30);
		    
	 // Casas finais Azul
		     
		     Rectangle2D FimAzul1 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*13 +1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(FimAzul1);
		     g.setColor(Color.black);
		     g2d.draw(FimAzul1);
		     
		     Rectangle2D FimAzul2 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*12 +1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(FimAzul2);
		     g.setColor(Color.black);
		     g2d.draw(FimAzul2);
		     
		     Rectangle2D FimAzul3 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*11 +1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(FimAzul3);
		     g.setColor(Color.black);
		     g2d.draw(FimAzul3);
		     
		     Rectangle2D FimAzul4 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*10 +1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(FimAzul4);
		     g.setColor(Color.black);
		     g2d.draw(FimAzul4);
		     
		     Rectangle2D FimAzul5 = 
		    		 new Rectangle2D.Double(tamanho*7+1, tamanho*9  +1 , tamanho, tamanho);
		     g2d.setPaint(Color.blue);
		     g2d.fill(FimAzul5);
		     g.setColor(Color.black);
		     g2d.draw(FimAzul5);
   
	     

	 	/****************************************************
	 	 * 
	 	 * INSERINDO OS CAMPOS ENTRE BASE VERMELHA E AZUL
	 	 * 	 
	 	****************************************************/
	     
	   
		     Rectangle2D Casa31 = 
		    		 new Rectangle2D.Double(tamanho*5+1,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa31);
		     g.setColor(Color.black);
		     g2d.draw(Casa31);
		     
		     Rectangle2D Casa32 = 
		    		 new Rectangle2D.Double(tamanho*4+1,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa32);
		     g.setColor(Color.black);
		     g2d.draw(Casa32);
		     
		     Rectangle2D Casa33 = 
		    		 new Rectangle2D.Double(tamanho*3+1,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa33);
		     g.setColor(Color.black);
		     g2d.draw(Casa33);
		     
		     Rectangle2D Casa34 = 
		    		 new Rectangle2D.Double(tamanho*2+1,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa34);
		     g.setColor(Color.black);
		     g2d.draw(Casa34);
		     
		     Rectangle2D Casa35 = 
		    		 new Rectangle2D.Double(tamanho  +1,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.black);
		     g2d.fill(Casa35);
		     g.setColor(Color.black);
		     g2d.draw(Casa35);
		     
		     Rectangle2D Casa36 = 
		    		 new Rectangle2D.Double(0,tamanho*8+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa36);
		     g.setColor(Color.black);
		     g2d.draw(Casa36);
		     
		     Rectangle2D Casa37 = 
		    		 new Rectangle2D.Double(0,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa37);
		     g.setColor(Color.black);
		     g2d.draw(Casa37);
		     
		     Rectangle2D Casa38 = 
		    		 new Rectangle2D.Double(0,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa38);
		     g.setColor(Color.black);
		     g2d.draw(Casa38);
		     
		     Rectangle2D Casa39 = 
		    		 new Rectangle2D.Double(tamanho+1,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(Casa39);
		     g.setColor(Color.black);
		     g2d.draw(Casa39);
		     
		     Rectangle2D Casa40 = 
		    		 new Rectangle2D.Double(tamanho*2+1,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa40);
		     g.setColor(Color.black);
		     g2d.draw(Casa40);
		     
		     Rectangle2D Casa41 = 
		    		 new Rectangle2D.Double(tamanho*3+1,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa41);
		     g.setColor(Color.black);
		     g2d.draw(Casa41);
		     
		     Rectangle2D Casa42 = 
		    		 new Rectangle2D.Double(tamanho*4+1,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa42);
		     g.setColor(Color.black);
		     g2d.draw(Casa42);
		     
		     Rectangle2D Casa43 = 
		    		 new Rectangle2D.Double(tamanho*5+1,tamanho*6+1, tamanho, tamanho);
		     g2d.setPaint(Color.white);
		     g2d.fill(Casa43);
		     g.setColor(Color.black);
		     g2d.draw(Casa43);
	     
	// Casas Finais Vermelho
	     
		     Rectangle2D FimVermelho1 = 
		    		 new Rectangle2D.Double(tamanho+1,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(FimVermelho1);
		     g.setColor(Color.black);
		     g2d.draw(FimVermelho1);
		     
		     Rectangle2D FimVermelho2 = 
		    		 new Rectangle2D.Double(tamanho*2+1,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(FimVermelho2);
		     g.setColor(Color.black);
		     g2d.draw(FimVermelho2);
		     
		     Rectangle2D FimVermelho3 = 
		    		 new Rectangle2D.Double(tamanho*3+1,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(FimVermelho3);
		     g.setColor(Color.black);
		     g2d.draw(FimVermelho3);
		     
		     Rectangle2D FimVermelho4 = 
		    		 new Rectangle2D.Double(tamanho*4+1,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(FimVermelho4);
		     g.setColor(Color.black);
		     g2d.draw(FimVermelho4);
		     
		     Rectangle2D FimVermelho5 = 
		    		 new Rectangle2D.Double(tamanho*5+1,tamanho*7+1, tamanho, tamanho);
		     g2d.setPaint(Color.red);
		     g2d.fill(FimVermelho5);
		     g.setColor(Color.black);
		     g2d.draw(FimVermelho5);
		/***************************************
		 * 
		 * Circulos
		 * 
		***************************************/
			 
	     //Vermelho
			 Ellipse2D Circulo0Red = 
					 new Ellipse2D.Double(tamanho+1, tamanho+1 , tamanho, tamanho);
			 g2d.setPaint(Color.white);
			 g2d.fill(Circulo0Red);
			 g.setColor(Color.black);
		     g2d.draw(Circulo0Red);
		     
		     Ellipse2D Circulo1Red = 
					 new Ellipse2D.Double(tamanho+1, tamanho*4+1, tamanho, tamanho);
			 g2d.setPaint(Color.white);
			 g2d.fill(Circulo1Red);
			 g.setColor(Color.black);
		     g2d.draw(Circulo1Red);
		     
		     Ellipse2D Circulo2Red = 
					 new Ellipse2D.Double(tamanho*4+1, tamanho+1, tamanho, tamanho);
			 g2d.setPaint(Color.white);
			 g2d.fill(Circulo2Red);
			 g.setColor(Color.black);
		     g2d.draw(Circulo2Red);
		     
		     Ellipse2D Circulo3Red = 
					 new Ellipse2D.Double(tamanho*4+1, tamanho*4+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo3Red);
			 g.setColor(Color.black);
		     g2d.draw(Circulo3Red);
			 
		 //Verde
		     Ellipse2D Circulo0Gre = 
					 new Ellipse2D.Double(tamanho*10+1 , tamanho+1   , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo0Gre);
			 g.setColor(Color.black);
		     g2d.draw(Circulo0Gre);
		     
		     Ellipse2D Circulo1Gre = 
					 new Ellipse2D.Double(tamanho*10+1 , tamanho*4+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo1Gre);
			 g.setColor(Color.black);
		     g2d.draw(Circulo1Gre);
		     
		     Ellipse2D Circulo2Gre = 
					 new Ellipse2D.Double(tamanho*13+1 , tamanho+1   , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo2Gre);
			 g.setColor(Color.black);
		     g2d.draw(Circulo2Gre);
		     
		     Ellipse2D Circulo3Gre = 
					 new Ellipse2D.Double(tamanho*13+1 , tamanho*4+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo3Gre);
			 g.setColor(Color.black);
		     g2d.draw(Circulo3Gre);
			 
		 //Azul    
		     Ellipse2D Circulo0BLue = 
					 new Ellipse2D.Double(tamanho+1  , tamanho*10+1  , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo0BLue);
			 g.setColor(Color.black);
		     g2d.draw(Circulo0BLue);
		     
		     Ellipse2D Circulo1BLue = 
					 new Ellipse2D.Double(tamanho+1  , tamanho*13+1  , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo1BLue);
			 g.setColor(Color.black);
		     g2d.draw(Circulo1BLue);
		     
		     Ellipse2D Circulo2BLue = 
					 new Ellipse2D.Double(tamanho*4+1  , tamanho*10+1  , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo2BLue);
			 g.setColor(Color.black);
		     g2d.draw(Circulo2BLue);
		     
		     Ellipse2D Circulo3BLue = 
					 new Ellipse2D.Double(tamanho*4+1, tamanho*13+1  , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo3BLue);
			 g.setColor(Color.black);
		     g2d.draw(Circulo3BLue);
		//Amarelo     
		     Ellipse2D Circulo0Yell = 
					 new Ellipse2D.Double(tamanho*10+1 , tamanho*10+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo0Yell);
			 g.setColor(Color.black);
		     g2d.draw(Circulo0Yell);
		     
		     Ellipse2D Circulo1Yell = 
					 new Ellipse2D.Double(tamanho*10+1 , tamanho*13+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo1Yell);
			 g.setColor(Color.black);
		     g2d.draw(Circulo1Yell);
		    
		     Ellipse2D Circulo2Yell = 
					 new Ellipse2D.Double(tamanho*13+1 , tamanho*10+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo2Yell);
			 g.setColor(Color.black);
		     g2d.draw(Circulo2Yell);
		    
		     Ellipse2D Circulo3Yell = 
					 new Ellipse2D.Double(tamanho*13+1 , tamanho*13+1 , tamanho, tamanho);
		     g2d.setPaint(Color.white);
			 g2d.fill(Circulo3Yell);
			 g.setColor(Color.black);
		     g2d.draw(Circulo3Yell);
		    
		 
		 
		 /*********************************************************
		  * 
		  * Poligonos Centrais
		  * 
		  *********************************************************/
		 
		 
		  Polygon Vermelhocentral = new Polygon();
	         
			  Vermelhocentral.addPoint(tamanho*7+tamanho/2, tamanho*7 + tamanho/2);
			  Vermelhocentral.addPoint(tamanho*6, tamanho*6);
			  Vermelhocentral.addPoint(tamanho*6, tamanho*9);
	         
		      g2d.setColor(Color.RED);
		      g2d.fill(Vermelhocentral);
		        
		      g.setColor(Color.BLACK);
		      g2d.draw(Vermelhocentral);
		
		 Polygon Verdecentral = new Polygon();
			         
			  Verdecentral.addPoint(tamanho*7+tamanho/2, tamanho*7 + tamanho/2);
			  Verdecentral.addPoint(tamanho*6, tamanho*6);
			  Verdecentral.addPoint(tamanho*9, tamanho*6);
			         
			  g2d.setColor(Color.green);
			  g2d.fill(Verdecentral);
			        
			  g.setColor(Color.BLACK);
			  g2d.draw(Verdecentral);
		        
		 Polygon Amarelocentral = new Polygon();
		         
		     Amarelocentral.addPoint(tamanho*7+tamanho/2, tamanho*7 + tamanho/2);
		     Amarelocentral.addPoint(tamanho*9, tamanho*6);
		     Amarelocentral.addPoint(tamanho*9, tamanho*9);
			         
	         g2d.setColor(Color.yellow);
	         g2d.fill(Amarelocentral);
	        
	         g.setColor(Color.BLACK);
	         g2d.draw(Amarelocentral);
			   
		 Polygon Azulcentral = new Polygon();
			         
			 Azulcentral.addPoint(tamanho*7+tamanho/2, tamanho*7 + tamanho/2);
			 Azulcentral.addPoint(tamanho*6, tamanho*9);
			 Azulcentral.addPoint(tamanho*9, tamanho*9);
			         
	         g2d.setColor(Color.blue);
	         g2d.fill(Azulcentral);
	        
	         g.setColor(Color.BLACK);
	         g2d.draw(Azulcentral);
	         
	     /**************************************
	      * 
	      * Poligonos de Casa inicial
	      * 
	      * ************************************/
	         Polygon InicioVermelho = new Polygon();
	         
	         InicioVermelho.addPoint(tamanho+3*tamanho/4, tamanho*6 + tamanho/2);
	         InicioVermelho.addPoint(tamanho + tamanho/8, tamanho*7 - tamanho/6);
	         InicioVermelho.addPoint(tamanho + tamanho/8, tamanho*6 + tamanho/6);
			         
	         g2d.setColor(Color.white);
	         g2d.fill(InicioVermelho);
	         
	         
	         Polygon InicioVerde = new Polygon();
	         
	         InicioVerde.addPoint(tamanho*8 + tamanho/2, tamanho+3*tamanho/4);
	         InicioVerde.addPoint(tamanho*8 + tamanho/6, tamanho + tamanho/8);
	         InicioVerde.addPoint(tamanho*9 - tamanho/6, tamanho + tamanho/8);
			         
	         g2d.setColor(Color.white);
	         g2d.fill(InicioVerde);	
	         
	         Polygon InicioAmarelo = new Polygon();
	         
	         InicioAmarelo.addPoint(tamanho*13 + tamanho/4, tamanho*8 + tamanho/2);
	         InicioAmarelo.addPoint(tamanho*14 - tamanho/8, tamanho*9 - tamanho/6);
	         InicioAmarelo.addPoint(tamanho*14 - tamanho/8, tamanho*8 + tamanho/6);
			         
	         g2d.setColor(Color.white);
	         g2d.fill(InicioAmarelo);
	         
	         Polygon InicioAzul = new Polygon();
	         
	         InicioAzul.addPoint(tamanho*6 + tamanho/2, tamanho*13 + tamanho/4);
	         InicioAzul.addPoint(tamanho*7 - tamanho/6, tamanho*14 - tamanho/8);
	         InicioAzul.addPoint(tamanho*6 + tamanho/6, tamanho*14 - tamanho/8);
			         
	         g2d.setColor(Color.white);
	         g2d.fill(InicioAzul);
	         
	}
}
