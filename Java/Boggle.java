import java.lang.Character;


class Boggle {

	static final int SIZE = 26;
	
	static final int N = 4;
	static final int M = 4;
	
	static class TrieNode {

		TrieNode[] child = new TrieNode[SIZE];
		boolean leaf;
		public TrieNode() {
			leaf = false;
			for(int i= 0;i<SIZE;i++) {
				child[i] = null;
			}
		}
	};
	
	static boolean isSafe(int i, int j, boolean[][] visited) {
		return ( i >= 0 && i < M && j >= 0 && j < N && !visited[i][j]);
	}
	
	static void searchWord(TrieNode root, char[][] boggle, int i, int j, boolean[][] visited, String str) {
		if(root.leaf == true)
			System.out.println("Found " + str);

		if(isSafe(i, j, visited)) {
			visited[i][j] = true;
			for(int K = 0;K<SIZE;K++) {
				if(root.child[K] != null) {
					char ch = (char)(K + 'A');
				
					if(isSafe(i+1,j+1,visited) && boggle[i+1][j+1] == ch) 
						searchWord(root.child[K], boggle, i+1, j+1, visited, str+ch);
					if(isSafe(i,j+1,visited) && boggle[i][j+1] == ch) 
						searchWord(root.child[K], boggle, i, j+1, visited, str+ch);
					if(isSafe(i-1,j+1,visited) && boggle[i-1][j+1] == ch) 
						searchWord(root.child[K], boggle,i-1,j+1, visited, str+ch);
					if(isSafe(i+1,j,visited) && boggle[i+1][j] == ch) 
						searchWord(root.child[K], boggle, i+1,j, visited, str+ch);
					if(isSafe(i+1,j-1,visited) && boggle[i+1][j-1] == ch) 
						searchWord(root.child[K], boggle, i+1,j-1, visited, str+ch);
					if(isSafe(i,j-1,visited) && boggle[i][j-1] == ch) 
						searchWord(root.child[K], boggle,i,j-1, visited, str+ch);
					if(isSafe(i-1,j-1,visited) && boggle[i-1][j-1] == ch) 
						searchWord(root.child[K], boggle, i-1, j-1, visited, str+ch);
					if(isSafe(i-1,j,visited) && boggle[i-1][j] == ch) 
						searchWord(root.child[K], boggle, i-1,j, visited, str+ch);
				}
			}
			visited[i][j] = false;
		}
	}
	
	static void isWord(char[][] board, TrieNode root) {
		boolean[][] visited = new boolean[M][N];
		String str = "";
		TrieNode nodeNewCreator = root;
		for(int i = 0;i<M;i++) {
			for(int j = 0;j<N;j++) {
				if(nodeNewCreator.child[(board[i][j]) - 'A'] != null) {
					str = str + board[i][j];
					searchWord(nodeNewCreator.child[(board[i][j]) - 'A'],board, i, j, visited, str);
					str = "";
				}
			}
		}
	}
	
	static void createTrie(String key, TrieNode root) {
		TrieNode nodeNewCreator = root;
		int n = key.length();
		for(int j = 0;j<n;j++) {

			int index = key.charAt(j) - 'A';
			
			if(nodeNewCreator.child[index] == null) {
				nodeNewCreator.child[index] = new TrieNode();
			}
			nodeNewCreator = nodeNewCreator.child[index];
		}
		nodeNewCreator.leaf = true;
	}

	public static void main(String[] args) {
		String[] words = {"FACEBOOK", "LIME", "MARKER", "GEEK", "TOCK"};
		String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GEE"};

		TrieNode root = new TrieNode();
		
		for(int i = 0; i< words.length;i++) {
			createTrie(words[i], root);
		}
		char boggle[][] = {{'H','E','F', 'T'},
						{'E', 'A', 'C', 'O'}, 
						{'C','B','E','C'},
						{'G','O','O','K'}};
		
		char boggle1[][] = {{'G','I','Z'},
                           {'U','E','K'},
                           {'Q','S','E'}
        };
		isWord(boggle, root);	
	}
	

}

