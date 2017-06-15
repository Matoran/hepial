/* classe 'principale' */
import java.util.Vector;
import java.io.FileReader;
public class test {
	public static void main (String[] arg){
		try { 
			FileReader myFile = new FileReader(arg[0]);
			Lexer myLex = new Lexer(myFile);
			parser myP = new parser(myLex);
			try {myP.parse();}
 			catch (Exception e) {
				e.printStackTrace();
 				System.out.println("parse error");
 			}
		}
		catch (Exception e){
 			System.out.println("invalid file");
		}

	}
}
