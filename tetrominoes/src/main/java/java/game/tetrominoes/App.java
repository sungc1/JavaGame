package java.game.tetrominoes;

import java.game.tetrominoes.ui.Tetris;

/**
 * 程序入口。
 */
public class App {
    public static void main(final String[] args) {
	final Tetris myTetris = new Tetris();

	// 启动程序
	myTetris.startup();
    }
}
