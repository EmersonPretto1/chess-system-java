package Aplication;


import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;


public class Program {

	public static void main(String[] args) {
		
		
		
		try {
			Scanner sc = new Scanner(System.in);
			ChessMatch chessMatch = new ChessMatch();
		
			while (true) {
				UI.printBoard(chessMatch.getpieces());
				System.out.println();
				System.out.println("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				boolean[][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getpieces(), possibleMoves);
		
				System.out.println();
				System.out.println("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
		
		
				ChessPiece capturedPiece = chessMatch.performChessmove(source, target);
			}	
		}
		
		catch(ChessException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
			
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			sc.nextLine();
			
			
		}
	}
	
}
