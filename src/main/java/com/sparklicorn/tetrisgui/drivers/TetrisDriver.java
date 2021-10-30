package com.sparklicorn.tetrisgui.drivers;

import com.sparklicorn.tetris.TetrisGame;
import com.sparklicorn.tetrisgui.components.TetrisFrame;

public class TetrisDriver {
	public static void main(String[] args) {
		new TetrisFrame(600, 800, 40, new TetrisGame(20, 10));
	}
}
