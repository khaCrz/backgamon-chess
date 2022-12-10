package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JFrame;

class BoardLine{
	int STTLine;
	int SL;
	BoardLine(int stt,int sl){
		this.STTLine = stt;
		this.SL = sl;
	}
}

public class GUI extends JFrame implements MouseListener{

	static BoardLine line[] = new BoardLine[25];
	
	public static void main(String[] args) {
		//khoi tao;
		for(int i=0;i<24;i++) {
			if(i!=6 || i!=19)
			{
				if(i==0 || i==7 || i==13 || i==20)
					line[i] = new BoardLine(i,5);
				else if(i==4 || i==17)
					line[i] = new BoardLine(i,3);
				else if(i==12 || i==25)
					line[i] = new BoardLine(i,2);
				else
					line[i] = new BoardLine(i,0);
			}
		}
		new GUI();

	}
	public GUI() {
		this.setDefaultCloseOperation(3);
		this.setVisible(true);
		this.setSize(900,800);
	}
	public void paint(Graphics g) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.setColor(Color.BLACK);
		g.drawRect(100,100 ,650 ,600 );
		for (int i = 1; i <= 13; i++) {
			if(i==6)
			{
				g.fillRect(i*50+100,100,50,600);
			}
			g.drawLine(  i*50+100   ,100 ,i*50+100 ,700 );
			g.drawLine(i*50+100 - 50,100 ,i*50+100 - 50 ,700 );
		} 
		g.drawRect(100,370 ,300 ,60);
		g.setColor(Color.WHITE);
		g.fillRect(100+1,370+1 ,300-1 ,60-1);
		g.setColor(Color.BLACK);
		g.drawRect(50*7+100,370 ,300 ,60);
		g.setColor(Color.WHITE);
		g.fillRect(50*7+100+1,370+1 ,300-1 ,60-1);
		g.setColor(Color.BLACK);
		for (int i = 1; i <= 13; i++) {
			if(i==1)
			{
				for(int j=0;j<5;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*50+50,100+j*50,50,50);
					g.setColor(Color.WHITE);
					g.fillOval(i*50+50+1,100+j*50+1,48,48);
					g.setColor(Color.BLACK);
				}
				
				for(int j=0;j<5;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*100,750-(100+j*50),50,50);
					g.setColor(Color.BLACK);
					g.fillOval(i*100+1,750-(100+j*50)+1,48,48);
					g.setColor(Color.WHITE);
				}				
			}
			if(i==5)
			{
				g.setColor(Color.BLACK);
				for(int j=0;j<3;j++) {
				g.drawOval(i*50+50,100+j*50,50,50);
				g.setColor(Color.BLACK);
				g.fillOval(i*50+50+1,100+j*50+1,48,48);
				g.setColor(Color.WHITE);
			}
			
			for(int j=0;j<3;j++) {
				g.setColor(Color.BLACK);
				g.drawOval(i*50+50,750-(100+j*50),50,50);
				g.setColor(Color.WHITE);
				g.fillOval(i*50+50+1,750-(100+j*50)+1,47,47);
				g.setColor(Color.BLACK);
			}		
			}
			if(i==8)
			{
				for(int j=0;j<5;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*50+50,100+j*50,50,50);
					g.setColor(Color.BLACK);
					g.fillOval(i*50+50+1,100+j*50+1,48,48);
					g.setColor(Color.WHITE);
				}
				
				for(int j=0;j<5;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*50+50,750-(100+j*50),50,50);
					g.setColor(Color.WHITE);
					g.fillOval(i*50+50+1,750-(100+j*50)+1,48,48);
					g.setColor(Color.BLACK);
				}		
			}
			if(i==13)
			{
				for(int j=0;j<2;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*50+50,100+j*50,50,50);
					g.setColor(Color.WHITE);
					g.fillOval(i*50+50+1,100+j*50+1,48,48);
					g.setColor(Color.BLACK);
				}
				
				for(int j=0;j<2;j++) {
					g.setColor(Color.BLACK);
					g.drawOval(i*50+50,750-(100+j*50),50,50);
					g.setColor(Color.BLACK);
					g.fillOval(i*50+50+1,750-(100+j*50)+1,48,48);
					g.setColor(Color.WHITE);
				}		
			}
			
		} 
		
		
	

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}
	

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}



}



