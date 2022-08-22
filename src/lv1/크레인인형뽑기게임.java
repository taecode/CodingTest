package lv1;

//import java.util.Stack;

public class 크레인인형뽑기게임 {

	public static void main(String[] args) {

		int[][] board = { { 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 3 }, { 0, 2, 5, 0, 1 }, { 4, 2, 4, 4, 2 },
				{ 3, 5, 1, 3, 1 } };
		int moves[] = { 1, 5, 3, 5, 1, 2, 1, 4 };

		System.out.println(solution(board, moves));
	}

	public static int solution(int[][] board, int[] moves) {
		int answer = 0;
		int moveslen = moves.length;
		int boardlen = board.length;
		int count = 0;
		int[] basket = new int[900];

		for (int i = 0; i < moveslen; i++) {
			for (int j = 0; j < boardlen; j++) {
				if (board[j][moves[i] - 1] > 0) {
					basket[count] = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
					if (count > 0 && basket[count - 1] == basket[count]) {
						answer += 2;
						basket[count - 1] = 0;
						basket[count] = 0;
						count--;
						break;
					} else
						count++;
					break;
				}

			}
		}

		return answer;
	}
	
	/*
				int answer = 0;
				    Stack<Integer> stack = new Stack<>();
				    for (int move : moves) {
				        for (int j = 0; j < board.length; j++) {
				            if (board[j][move - 1] != 0) {
				                if (stack.isEmpty()) {
				                    stack.push(board[j][move - 1]);
				                    board[j][move - 1] = 0;
				                    break;
				                }
				                if (board[j][move - 1] == stack.peek()) {
				                    stack.pop();
				                    answer += 2;
				                } else
				                    stack.push(board[j][move - 1]);
				                board[j][move - 1] = 0;
				                break;
				            }
				        }
				    }
				    return answer;
				   
				}
	*/

}
