import java.lang.Integer;

public class MinimumWordBreak {

	static final int SIZE = 26;
	static final int limit = Integer.MAX_VALUE;
	
	static class TrieNode {
		boolean leaf;
		TrieNode[] child = new TrieNode[SIZE];
		public TrieNode() {
			leaf = false;
			for(int i = 0;i<SIZE;i++) {
				child[i] = null;
			}
		}
	}

	static void insert(TrieNode root, String key) {
		TrieNode NChild = root;
		int n = key.length();
		for(int i = 0;i<n;i++) {
			int index = key.charAt(i) - 'A';
			if(NChild.child[index] == null) {
				NChild.child[index] = new TrieNode();
			}	
			NChild = NChild.child[index];
		}
		NChild.leaf = true;
	}
	
	static int countOfNeededBreaks(TrieNode root, String key, int index, int breaks, int minBreaks) {
		
	}


	public static void main(String[] args) {
		TrieNode root = new TrieNode();
		String[] breaks = {"Cat", "Mat", "tM", "Ca", "at", "atM"};
		int n = breaks.length;
		for(int i = 0;i<n;i++) {
			insert(root, breaks[i]);
		}
		String primary = "CatMat";
		System.out.println(countOfNeededBreaks(root, primary, n, 0));
	}


}
