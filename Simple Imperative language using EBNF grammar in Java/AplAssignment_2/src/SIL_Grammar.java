
	
	import java.io.IOException;
	import org.antlr.runtime.ANTLRFileStream;
	import org.antlr.runtime.CommonTokenStream;
	import org.antlr.runtime.RecognitionException;

	
public class SIL_Grammar
{	
	    public static void main(String[] args) throws IOException, RecognitionException
	    {
	    	
	    BrinLexer lexer = new BrinLexer(new ANTLRFileStream("D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\output.s"));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
	        
		BrinParser parser = new BrinParser(tokens);
	        
	        parser.prog();
	    }
	}



