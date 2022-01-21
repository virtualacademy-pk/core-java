import java.io.StreamTokenizer;
import java.io.StringReader;
import java.io.IOException;

public class StreamTokenTest {
	public static void main(String[] args) throws Exception {
		
		String str = "Pakistan, United Arab Emirates, Malysia";
		StringReader sr = new StringReader(str);
		StreamTokenizer st = new StreamTokenizer(sr);
	      st.wordChars(' ', ' ');
		try {
			while (st.nextToken() != StreamTokenizer.TT_EOF) {
				switch (st.ttype) {
				case StreamTokenizer.TT_WORD: /* a word has been read */
					System.out.println("String value: " + st.sval);
					break;
				case StreamTokenizer.TT_NUMBER: /* a number has been read */
					System.out.println("Number value: " + st.nval);
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}