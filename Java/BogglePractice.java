public class BogglePractice {


	static final int SIZE = 26;
	
	static final int N = 3;
	static final int M = 3;
	
	static class TrieNode {
	
		boolean leaf;
		TrieNode[] Child = new TrieNode[SIZE];
		public TrieNode() {
			leaf = false;
			for(int i = 0;i<SIZE;i++) {
				Child[i] = null;			
			}
		}
	}
	
	static void insert(TrieNode root, String Key)
    {
        int n = Key.length();
        TrieNode pChild = root;
      
        for (int i=0; i<n; i++)
        {
            int index = Key.charAt(i) - 'A';
      
            if (pChild.Child[index] == null)
                pChild.Child[index] = new TrieNode();
      
            pChild = pChild.Child[index];
        }
      
        // make last node as leaf node
        pChild.leaf = true;
    }

	static boolean isSafe(int i, int j, boolean[][] visited) {
		return (i >=0 && i < M && j >=0 &&
                j < N && !visited[i][j]);
	}
	
	// A recursive function to print all words present on boggle
    static void searchWord(TrieNode root, char boggle[][], int i,
                    int j, boolean visited[][], String str)
    {
        // if we found word in trie / dictionary
        if (root.leaf == true)
           System.out.println(str);
         
        // If both I and j in  range and we visited
        // that element of matrix first time
        if (isSafe(i, j, visited))
        {
            // make it visited
            visited[i][j] = true;
      
            // traverse all child of current root
            for (int K =0; K < SIZE; K++)
            {
                if (root.Child[K] != null)
                {
                    // current character
                    char ch = (char) (K + 'A') ;
      
                    // Recursively search reaming character of word
                    // in trie for all 8 adjacent cells of 
                    // boggle[i][j]
                    if (isSafe(i+1,j+1,visited) && boggle[i+1][j+1]
                                                           == ch)
                        searchWord(root.Child[K],boggle,i+1,j+1,
                                                   visited,str+ch);
                    if (isSafe(i, j+1,visited)  && boggle[i][j+1]
                                                           == ch)
                        searchWord(root.Child[K],boggle,i, j+1,
                                                  visited,str+ch);
                    if (isSafe(i-1,j+1,visited) && boggle[i-1][j+1] 
                                                           == ch)
                        searchWord(root.Child[K],boggle,i-1, j+1,
                                                  visited,str+ch);
                    if (isSafe(i+1,j, visited)  && boggle[i+1][j] 
                                                          == ch)
                        searchWord(root.Child[K],boggle,i+1, j,
                                                 visited,str+ch);
                    if (isSafe(i+1,j-1,visited) && boggle[i+1][j-1] 
                                                          == ch)
                        searchWord(root.Child[K],boggle,i+1, j-1,
                                                  visited,str+ch);
                    if (isSafe(i, j-1,visited)&& boggle[i][j-1] 
                                                         == ch)
                        searchWord(root.Child[K],boggle,i,j-1,
                                                 visited,str+ch);
                    if (isSafe(i-1,j-1,visited) && boggle[i-1][j-1] 
                                                         == ch)
                        searchWord(root.Child[K],boggle,i-1, j-1,
                                                visited,str+ch);
                    if (isSafe(i-1, j,visited) && boggle[i-1][j] 
                                                        == ch)
                        searchWord(root.Child[K],boggle,i-1, j, 
                                              visited,str+ch);
                }
            }
      
            // make current element unvisited
            visited[i][j] = false;
        }
    }
	
	 static void findWords(char boggle[][], TrieNode root)
    {
        // Mark all characters as not visited
        boolean[][] visited = new boolean[M][N];
        TrieNode pChild = root ;
      
        String str = "";
      
        // traverse all matrix elements
        for (int i = 0 ; i < M; i++)
        {
            for (int j = 0 ; j < N ; j++)
            {
                // we start searching for word in dictionary
                // if we found a character which is Child
                // of Trie root
                if (pChild.Child[(boggle[i][j]) - 'A'] != null)
                {
                    str = str+boggle[i][j];
                    searchWord(pChild.Child[(boggle[i][j]) - 'A'],
                               boggle, i, j, visited, str);
                    str = "";
                }
            }
        }
    }

	public static void main(String[] args) {
		String dictionary[] = {"GEEKS", "FOR", "QUIZ", "GEE"};

		int n = dictionary.length;
		TrieNode root = new TrieNode();
		for(int i = 0;i<n;i++ ) {
			insert(root, dictionary[i]);
		}
		 char boggle[][] = {{'G','I','Z'},
                           {'U','E','K'},
                           {'Q','S','E'}
        };
		findWords(boggle, root);
	}

}
