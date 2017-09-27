// $ANTLR 3.5.1 D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g 2017-02-22 21:45:13

   import java.util.*;



import org.antlr.runtime.*;
import org.antlr.runtime.BitSet;

import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BrinParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AVOID", "COMMENT", "ID", "INT", 
		"LITERAL", "NEWLINE", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", 
		"'/'", "'='", "'END'", "'INPUT'", "'INTEGER'", "'LET'", "'PRINT'", "'PRINTLN'"
	};
	public static final int EOF=-1;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int AVOID=4;
	public static final int COMMENT=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int LITERAL=8;
	public static final int NEWLINE=9;
	public static final int WS=10;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public BrinParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public BrinParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return BrinParser.tokenNames; }
	@Override public String getGrammarFileName() { return "D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g"; }


	 /** Map variable name to Integer object holding value */
	HashMap memory = new HashMap();
	Scanner scanner= new Scanner(System.in);


	    private boolean variableDefined(String name)
	    {
	        return memory.containsKey(name);
	    }

	   



	// $ANTLR start "prog"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:25:1: prog : ( statment )+ ;
	public final void prog() throws RecognitionException {
		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:25:5: ( ( statment )+ )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:25:9: ( statment )+
			{
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:25:9: ( statment )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= COMMENT && LA1_0 <= INT)||LA1_0==11||(LA1_0 >= 19 && LA1_0 <= 24)) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:25:9: statment
					{
					pushFollow(FOLLOW_statment_in_prog26);
					statment();
					state._fsp--;

					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "prog"



	// $ANTLR start "statment"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:27:1: statment : ( expression NEWLINE | 'LET' ID '=' expression NEWLINE | 'PRINT' LITERAL NEWLINE | 'PRINT' expression NEWLINE | 'INTEGER' var ( ',' var )* NEWLINE | 'INPUT' input_ID ( ',' input_ID )* NEWLINE | 'PRINTLN' LITERAL NEWLINE | 'PRINTLN' expression NEWLINE | COMMENT | 'END' );
	public final void statment() throws RecognitionException {
		Token ID2=null;
		Token LITERAL4=null;
		Token LITERAL6=null;
		int expression1 =0;
		int expression3 =0;
		int expression5 =0;
		int expression7 =0;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:28:2: ( expression NEWLINE | 'LET' ID '=' expression NEWLINE | 'PRINT' LITERAL NEWLINE | 'PRINT' expression NEWLINE | 'INTEGER' var ( ',' var )* NEWLINE | 'INPUT' input_ID ( ',' input_ID )* NEWLINE | 'PRINTLN' LITERAL NEWLINE | 'PRINTLN' expression NEWLINE | COMMENT | 'END' )
			int alt4=10;
			switch ( input.LA(1) ) {
			case ID:
			case INT:
			case 11:
				{
				alt4=1;
				}
				break;
			case 22:
				{
				alt4=2;
				}
				break;
			case 23:
				{
				int LA4_3 = input.LA(2);
				if ( (LA4_3==LITERAL) ) {
					alt4=3;
				}
				else if ( ((LA4_3 >= ID && LA4_3 <= INT)||LA4_3==11) ) {
					alt4=4;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 21:
				{
				alt4=5;
				}
				break;
			case 20:
				{
				alt4=6;
				}
				break;
			case 24:
				{
				int LA4_6 = input.LA(2);
				if ( (LA4_6==LITERAL) ) {
					alt4=7;
				}
				else if ( ((LA4_6 >= ID && LA4_6 <= INT)||LA4_6==11) ) {
					alt4=8;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case COMMENT:
				{
				alt4=9;
				}
				break;
			case 19:
				{
				alt4=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:28:6: expression NEWLINE
					{
					pushFollow(FOLLOW_expression_in_statment55);
					expression1=expression();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment57); 
					System.out.println(expression1);
					}
					break;
				case 2 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:29:10: 'LET' ID '=' expression NEWLINE
					{
					match(input,22,FOLLOW_22_in_statment70); 
					ID2=(Token)match(input,ID,FOLLOW_ID_in_statment72); 
					match(input,18,FOLLOW_18_in_statment74); 
					pushFollow(FOLLOW_expression_in_statment76);
					expression3=expression();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment78); 
					memory.put((ID2!=null?ID2.getText():null), new Integer(expression3));
					}
					break;
				case 3 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:31:9: 'PRINT' LITERAL NEWLINE
					{
					match(input,23,FOLLOW_23_in_statment98); 
					LITERAL4=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_statment100); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment102); 
					 String s = (LITERAL4!=null?LITERAL4.getText():null); System.out.print(s.substring(1,s.length()-1));
					}
					break;
				case 4 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:33:9: 'PRINT' expression NEWLINE
					{
					match(input,23,FOLLOW_23_in_statment121); 
					pushFollow(FOLLOW_expression_in_statment123);
					expression5=expression();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment125); 
					System.out.print(expression5);
					}
					break;
				case 5 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:34:10: 'INTEGER' var ( ',' var )* NEWLINE
					{
					match(input,21,FOLLOW_21_in_statment141); 
					pushFollow(FOLLOW_var_in_statment143);
					var();
					state._fsp--;

					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:34:23: ( ',' var )*
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( (LA2_0==15) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:34:24: ',' var
							{
							match(input,15,FOLLOW_15_in_statment145); 
							pushFollow(FOLLOW_var_in_statment147);
							var();
							state._fsp--;

							}
							break;

						default :
							break loop2;
						}
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment152); 
					}
					break;
				case 6 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:35:9: 'INPUT' input_ID ( ',' input_ID )* NEWLINE
					{
					match(input,20,FOLLOW_20_in_statment162); 
					pushFollow(FOLLOW_input_ID_in_statment164);
					input_ID();
					state._fsp--;

					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:35:25: ( ',' input_ID )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==15) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:35:26: ',' input_ID
							{
							match(input,15,FOLLOW_15_in_statment166); 
							pushFollow(FOLLOW_input_ID_in_statment168);
							input_ID();
							state._fsp--;

							}
							break;

						default :
							break loop3;
						}
					}

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment172); 
					}
					break;
				case 7 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:36:9: 'PRINTLN' LITERAL NEWLINE
					{
					match(input,24,FOLLOW_24_in_statment182); 
					LITERAL6=(Token)match(input,LITERAL,FOLLOW_LITERAL_in_statment184); 
					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment186); 
					 String s = (LITERAL6!=null?LITERAL6.getText():null); System.out.println(s.substring(1,s.length()-1));
					}
					break;
				case 8 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:38:4: 'PRINTLN' expression NEWLINE
					{
					match(input,24,FOLLOW_24_in_statment202); 
					pushFollow(FOLLOW_expression_in_statment204);
					expression7=expression();
					state._fsp--;

					match(input,NEWLINE,FOLLOW_NEWLINE_in_statment206); 
					System.out.println(expression7);
					}
					break;
				case 9 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:39:5: COMMENT
					{
					match(input,COMMENT,FOLLOW_COMMENT_in_statment214); 
					}
					break;
				case 10 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:40:9: 'END'
					{
					match(input,19,FOLLOW_19_in_statment224); 
					 System.exit(0);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "statment"



	// $ANTLR start "expression"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:45:1: expression returns [int value] : e= multExpression ( '+' e= multExpression | '-' e= multExpression )* ;
	public final int expression() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:46:6: (e= multExpression ( '+' e= multExpression | '-' e= multExpression )* )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:46:10: e= multExpression ( '+' e= multExpression | '-' e= multExpression )*
			{
			pushFollow(FOLLOW_multExpression_in_expression273);
			e=multExpression();
			state._fsp--;

			value = e;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:47:11: ( '+' e= multExpression | '-' e= multExpression )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==14) ) {
					alt5=1;
				}
				else if ( (LA5_0==16) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:47:15: '+' e= multExpression
					{
					match(input,14,FOLLOW_14_in_expression291); 
					pushFollow(FOLLOW_multExpression_in_expression297);
					e=multExpression();
					state._fsp--;

					value += e;
					}
					break;
				case 2 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:48:15: '-' e= multExpression
					{
					match(input,16,FOLLOW_16_in_expression316); 
					pushFollow(FOLLOW_multExpression_in_expression322);
					e=multExpression();
					state._fsp--;

					value -= e;
					}
					break;

				default :
					break loop5;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "expression"



	// $ANTLR start "multExpression"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:52:1: multExpression returns [int value] : e= atom ( '/' e= atom | '*' e= atom )* ;
	public final int multExpression() throws RecognitionException {
		int value = 0;


		int e =0;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:53:6: (e= atom ( '/' e= atom | '*' e= atom )* )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:53:13: e= atom ( '/' e= atom | '*' e= atom )*
			{
			pushFollow(FOLLOW_atom_in_multExpression367);
			e=atom();
			state._fsp--;

			value = e;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:54:8: ( '/' e= atom | '*' e= atom )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0==17) ) {
					alt6=1;
				}
				else if ( (LA6_0==13) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:54:11: '/' e= atom
					{
					match(input,17,FOLLOW_17_in_multExpression381); 
					pushFollow(FOLLOW_atom_in_multExpression386);
					e=atom();
					state._fsp--;

					value /= e;   
					}
					break;
				case 2 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:55:14: '*' e= atom
					{
					match(input,13,FOLLOW_13_in_multExpression403); 
					pushFollow(FOLLOW_atom_in_multExpression407);
					e=atom();
					state._fsp--;

					value *= e;
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "multExpression"



	// $ANTLR start "atom"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:59:1: atom returns [int value] : ( INT | ID | '(' expression ')' );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT8=null;
		Token ID9=null;
		int expression10 =0;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:60:6: ( INT | ID | '(' expression ')' )
			int alt7=3;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt7=1;
				}
				break;
			case ID:
				{
				alt7=2;
				}
				break;
			case 11:
				{
				alt7=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}
			switch (alt7) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:60:10: INT
					{
					INT8=(Token)match(input,INT,FOLLOW_INT_in_atom448); 
					value = Integer.parseInt((INT8!=null?INT8.getText():null));
					}
					break;
				case 2 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:61:12: ID
					{
					ID9=(Token)match(input,ID,FOLLOW_ID_in_atom463); 

					       			 Integer v = (Integer)memory.get((ID9!=null?ID9.getText():null));
					       			 if ( v!=null ) value = v.intValue();
					       			 else System.err.println("undefined variable "+(ID9!=null?ID9.getText():null));
					       		 
					}
					break;
				case 3 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:67:12: '(' expression ')'
					{
					match(input,11,FOLLOW_11_in_atom487); 
					pushFollow(FOLLOW_expression_in_atom489);
					expression10=expression();
					state._fsp--;

					match(input,12,FOLLOW_12_in_atom491); 
					value = expression10;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return value;
	}
	// $ANTLR end "atom"



	// $ANTLR start "input_ID"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:70:1: input_ID : ID ;
	public final void input_ID() throws RecognitionException {
		Token ID11=null;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:71:2: ( ID )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:71:4: ID
			{
			ID11=(Token)match(input,ID,FOLLOW_ID_in_input_ID512); 

			 		if(variableDefined((ID11!=null?ID11.getText():null)))
			 		{
			 		System.out.println("Value "+(ID11!=null?ID11.getText():null));
			 		Integer value=scanner.nextInt();
			 		memory.put((ID11!=null?ID11.getText():null), new Integer(value));
			 		}
			 		
			 		else
			 		{
			 		
			 		System.err.println("Undefined Global Variable:"+(ID11!=null?ID11.getText():null));
			     	 
			 		}
			 	
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "input_ID"



	// $ANTLR start "var"
	// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:88:1: var : ID ;
	public final void var() throws RecognitionException {
		Token ID12=null;

		try {
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:89:5: ( ID )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:89:7: ID
			{
			ID12=(Token)match(input,ID,FOLLOW_ID_in_var537); 

			    	  if(!variableDefined((ID12!=null?ID12.getText():null))) 
			     		 memory.put((ID12!=null?ID12.getText():null), new Integer(0));
			    	  else
			     	 	 System.err.println("Variable already exists:"+(ID12!=null?ID12.getText():null));
			     	 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "var"

	// Delegated rules



	public static final BitSet FOLLOW_statment_in_prog26 = new BitSet(new long[]{0x0000000001F808E2L});
	public static final BitSet FOLLOW_expression_in_statment55 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment57 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_statment70 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_statment72 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_statment74 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_expression_in_statment76 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment78 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_statment98 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_in_statment100 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_statment121 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_expression_in_statment123 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_statment141 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_var_in_statment143 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_15_in_statment145 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_var_in_statment147 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment152 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_statment162 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_ID_in_statment164 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_15_in_statment166 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_input_ID_in_statment168 = new BitSet(new long[]{0x0000000000008200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_statment182 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_LITERAL_in_statment184 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_statment202 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_expression_in_statment204 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_NEWLINE_in_statment206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_in_statment214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_statment224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpression_in_expression273 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_14_in_expression291 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_multExpression_in_expression297 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_16_in_expression316 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_multExpression_in_expression322 = new BitSet(new long[]{0x0000000000014002L});
	public static final BitSet FOLLOW_atom_in_multExpression367 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_17_in_multExpression381 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_atom_in_multExpression386 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_13_in_multExpression403 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_atom_in_multExpression407 = new BitSet(new long[]{0x0000000000022002L});
	public static final BitSet FOLLOW_INT_in_atom448 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_11_in_atom487 = new BitSet(new long[]{0x00000000000008C0L});
	public static final BitSet FOLLOW_expression_in_atom489 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_atom491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_input_ID512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_var537 = new BitSet(new long[]{0x0000000000000002L});
}
