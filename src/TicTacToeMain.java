import javax.swing.JFrame;

public class TicTacToeMain {

	public static void main(String[] args) {
		JFrame TicTacToeFrame = new TicTacToeFrame();
		TicTacToeFrame.setTitle("This is my Tic Tac Toe Game");
		TicTacToeFrame.setSize(600, 600);
		TicTacToeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TicTacToeFrame.setLocationRelativeTo(null);
		TicTacToeFrame.setVisible(true);
	}

}
