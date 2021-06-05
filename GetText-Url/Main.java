package q6;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		
		String letra = ObtemTxtURL.getTxt("http://www.thealmightyguru.com/Music/Lyrics/Metallica/Nothing%20Else%20Matters.txt");
//		System.out.println(letra);
		StringTokenizer s = new StringTokenizer(letra);
//		System.out.println(s);
		
		
		Map<String,Integer> lyrics = new HashMap<String,Integer>();
		String palavra = "";
		while(s.hasMoreTokens()) {      //Loop enquanto houver token (palavra)
			palavra = s.nextToken();
			if(lyrics.containsKey(palavra)) {
				int n = (lyrics.get(palavra));
				lyrics.put(palavra, n+1);
			}
			else	lyrics.put(palavra, 1);
		}
		
		System.out.println(lyrics.entrySet());  //Mostra o conjunto mapeado de chaves e valores.

	}

}
