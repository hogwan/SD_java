package chapter04;

import javax.swing.JOptionPane;

public class TwoDimension_10 {

	public static void main(String[] args) {
		
		int javaScore[][] = new int[2][3];
		
		for(int i=0;i<javaScore.length;i++) {
			for(int j=0;j<javaScore[i].length;j++) {
				int jumsu=Integer.parseInt(JOptionPane.showInputDialog("JAVA 점수"));
				javaScore[i][j]=jumsu;
				System.out.println("JavaScore["+i+"]["+j+"]:" + javaScore[i][j]);
			}
			System.out.println();
		}
		

	}

}
