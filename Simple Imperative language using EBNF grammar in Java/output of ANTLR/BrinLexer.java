// $ANTLR 3.5.1 D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g 2017-02-22 21:45:13

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class BrinLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public BrinLexer() {} 
	public BrinLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public BrinLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g"; }

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:2:7: ( '(' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:2:9: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:3:7: ( ')' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:3:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__12"

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:4:7: ( '*' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:4:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:5:7: ( '+' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:5:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:6:7: ( ',' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:6:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:7:7: ( '-' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:7:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:8:7: ( '/' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:8:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:9:7: ( '=' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:9:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:10:7: ( 'END' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:10:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:11:7: ( 'INPUT' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:11:9: 'INPUT'
			{
			match("INPUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:12:7: ( 'INTEGER' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:12:9: 'INTEGER'
			{
			match("INTEGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:13:7: ( 'LET' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:13:9: 'LET'
			{
			match("LET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:14:7: ( 'PRINT' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:14:9: 'PRINT'
			{
			match("PRINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:15:7: ( 'PRINTLN' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:15:9: 'PRINTLN'
			{
			match("PRINTLN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__24"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:103:4: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '!' )* )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:103:6: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '!' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:103:26: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '!' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0=='!'||(LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:
					{
					if ( input.LA(1)=='!'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:105:6: ( ( '0' .. '9' )+ )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:105:10: ( '0' .. '9' )+
			{
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:105:10: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:107:9: ( ( '\\r' )? '\\n' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:107:11: ( '\\r' )? '\\n'
			{
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:107:11: ( '\\r' )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='\r') ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:107:11: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:109:7: ( ( ' ' | '\\t' )+ )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:109:11: ( ' ' | '\\t' )+
			{
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:109:11: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LITERAL"
	public final void mLITERAL() throws RecognitionException {
		try {
			int _type = LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:111:9: ( '\"' ( AVOID |~ ( '\\\\' | '\"' ) )* '\"' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:111:11: '\"' ( AVOID |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:111:14: ( AVOID |~ ( '\\\\' | '\"' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\\') ) {
					alt5=1;
				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '[')||(LA5_0 >= ']' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:111:15: AVOID
					{
					mAVOID(); 

					}
					break;
				case 2 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:111:23: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LITERAL"

	// $ANTLR start "AVOID"
	public final void mAVOID() throws RecognitionException {
		try {
			int _type = AVOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:113:7: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:113:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVOID"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:119:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:119:12: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:119:17: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:119:31: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:119:31: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	@Override
	public void mTokens() throws RecognitionException {
		// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | INT | NEWLINE | WS | LITERAL | AVOID | COMMENT )
		int alt8=21;
		switch ( input.LA(1) ) {
		case '(':
			{
			alt8=1;
			}
			break;
		case ')':
			{
			alt8=2;
			}
			break;
		case '*':
			{
			alt8=3;
			}
			break;
		case '+':
			{
			alt8=4;
			}
			break;
		case ',':
			{
			alt8=5;
			}
			break;
		case '-':
			{
			alt8=6;
			}
			break;
		case '/':
			{
			int LA8_7 = input.LA(2);
			if ( (LA8_7=='/') ) {
				alt8=21;
			}

			else {
				alt8=7;
			}

			}
			break;
		case '=':
			{
			alt8=8;
			}
			break;
		case 'E':
			{
			int LA8_9 = input.LA(2);
			if ( (LA8_9=='N') ) {
				int LA8_21 = input.LA(3);
				if ( (LA8_21=='D') ) {
					int LA8_25 = input.LA(4);
					if ( (LA8_25=='!'||(LA8_25 >= '0' && LA8_25 <= '9')||(LA8_25 >= 'A' && LA8_25 <= 'Z')||LA8_25=='_'||(LA8_25 >= 'a' && LA8_25 <= 'z')) ) {
						alt8=15;
					}

					else {
						alt8=9;
					}

				}

				else {
					alt8=15;
				}

			}

			else {
				alt8=15;
			}

			}
			break;
		case 'I':
			{
			int LA8_10 = input.LA(2);
			if ( (LA8_10=='N') ) {
				switch ( input.LA(3) ) {
				case 'P':
					{
					int LA8_26 = input.LA(4);
					if ( (LA8_26=='U') ) {
						int LA8_31 = input.LA(5);
						if ( (LA8_31=='T') ) {
							int LA8_35 = input.LA(6);
							if ( (LA8_35=='!'||(LA8_35 >= '0' && LA8_35 <= '9')||(LA8_35 >= 'A' && LA8_35 <= 'Z')||LA8_35=='_'||(LA8_35 >= 'a' && LA8_35 <= 'z')) ) {
								alt8=15;
							}

							else {
								alt8=10;
							}

						}

						else {
							alt8=15;
						}

					}

					else {
						alt8=15;
					}

					}
					break;
				case 'T':
					{
					int LA8_27 = input.LA(4);
					if ( (LA8_27=='E') ) {
						int LA8_32 = input.LA(5);
						if ( (LA8_32=='G') ) {
							int LA8_36 = input.LA(6);
							if ( (LA8_36=='E') ) {
								int LA8_39 = input.LA(7);
								if ( (LA8_39=='R') ) {
									int LA8_42 = input.LA(8);
									if ( (LA8_42=='!'||(LA8_42 >= '0' && LA8_42 <= '9')||(LA8_42 >= 'A' && LA8_42 <= 'Z')||LA8_42=='_'||(LA8_42 >= 'a' && LA8_42 <= 'z')) ) {
										alt8=15;
									}

									else {
										alt8=11;
									}

								}

								else {
									alt8=15;
								}

							}

							else {
								alt8=15;
							}

						}

						else {
							alt8=15;
						}

					}

					else {
						alt8=15;
					}

					}
					break;
				default:
					alt8=15;
				}
			}

			else {
				alt8=15;
			}

			}
			break;
		case 'L':
			{
			int LA8_11 = input.LA(2);
			if ( (LA8_11=='E') ) {
				int LA8_23 = input.LA(3);
				if ( (LA8_23=='T') ) {
					int LA8_28 = input.LA(4);
					if ( (LA8_28=='!'||(LA8_28 >= '0' && LA8_28 <= '9')||(LA8_28 >= 'A' && LA8_28 <= 'Z')||LA8_28=='_'||(LA8_28 >= 'a' && LA8_28 <= 'z')) ) {
						alt8=15;
					}

					else {
						alt8=12;
					}

				}

				else {
					alt8=15;
				}

			}

			else {
				alt8=15;
			}

			}
			break;
		case 'P':
			{
			int LA8_12 = input.LA(2);
			if ( (LA8_12=='R') ) {
				int LA8_24 = input.LA(3);
				if ( (LA8_24=='I') ) {
					int LA8_29 = input.LA(4);
					if ( (LA8_29=='N') ) {
						int LA8_34 = input.LA(5);
						if ( (LA8_34=='T') ) {
							switch ( input.LA(6) ) {
							case 'L':
								{
								int LA8_40 = input.LA(7);
								if ( (LA8_40=='N') ) {
									int LA8_43 = input.LA(8);
									if ( (LA8_43=='!'||(LA8_43 >= '0' && LA8_43 <= '9')||(LA8_43 >= 'A' && LA8_43 <= 'Z')||LA8_43=='_'||(LA8_43 >= 'a' && LA8_43 <= 'z')) ) {
										alt8=15;
									}

									else {
										alt8=14;
									}

								}

								else {
									alt8=15;
								}

								}
								break;
							case '!':
							case '0':
							case '1':
							case '2':
							case '3':
							case '4':
							case '5':
							case '6':
							case '7':
							case '8':
							case '9':
							case 'A':
							case 'B':
							case 'C':
							case 'D':
							case 'E':
							case 'F':
							case 'G':
							case 'H':
							case 'I':
							case 'J':
							case 'K':
							case 'M':
							case 'N':
							case 'O':
							case 'P':
							case 'Q':
							case 'R':
							case 'S':
							case 'T':
							case 'U':
							case 'V':
							case 'W':
							case 'X':
							case 'Y':
							case 'Z':
							case '_':
							case 'a':
							case 'b':
							case 'c':
							case 'd':
							case 'e':
							case 'f':
							case 'g':
							case 'h':
							case 'i':
							case 'j':
							case 'k':
							case 'l':
							case 'm':
							case 'n':
							case 'o':
							case 'p':
							case 'q':
							case 'r':
							case 's':
							case 't':
							case 'u':
							case 'v':
							case 'w':
							case 'x':
							case 'y':
							case 'z':
								{
								alt8=15;
								}
								break;
							default:
								alt8=13;
							}
						}

						else {
							alt8=15;
						}

					}

					else {
						alt8=15;
					}

				}

				else {
					alt8=15;
				}

			}

			else {
				alt8=15;
			}

			}
			break;
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'F':
		case 'G':
		case 'H':
		case 'J':
		case 'K':
		case 'M':
		case 'N':
		case 'O':
		case 'Q':
		case 'R':
		case 'S':
		case 'T':
		case 'U':
		case 'V':
		case 'W':
		case 'X':
		case 'Y':
		case 'Z':
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
		case 'f':
		case 'g':
		case 'h':
		case 'i':
		case 'j':
		case 'k':
		case 'l':
		case 'm':
		case 'n':
		case 'o':
		case 'p':
		case 'q':
		case 'r':
		case 's':
		case 't':
		case 'u':
		case 'v':
		case 'w':
		case 'x':
		case 'y':
		case 'z':
			{
			alt8=15;
			}
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			{
			alt8=16;
			}
			break;
		case '\n':
		case '\r':
			{
			alt8=17;
			}
			break;
		case '\t':
		case ' ':
			{
			alt8=18;
			}
			break;
		case '\"':
			{
			alt8=19;
			}
			break;
		case '\\':
			{
			alt8=20;
			}
			break;
		default:
			NoViableAltException nvae =
				new NoViableAltException("", 8, 0, input);
			throw nvae;
		}
		switch (alt8) {
			case 1 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:10: T__11
				{
				mT__11(); 

				}
				break;
			case 2 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:16: T__12
				{
				mT__12(); 

				}
				break;
			case 3 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:22: T__13
				{
				mT__13(); 

				}
				break;
			case 4 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:28: T__14
				{
				mT__14(); 

				}
				break;
			case 5 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:34: T__15
				{
				mT__15(); 

				}
				break;
			case 6 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:40: T__16
				{
				mT__16(); 

				}
				break;
			case 7 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:46: T__17
				{
				mT__17(); 

				}
				break;
			case 8 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:52: T__18
				{
				mT__18(); 

				}
				break;
			case 9 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:58: T__19
				{
				mT__19(); 

				}
				break;
			case 10 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:64: T__20
				{
				mT__20(); 

				}
				break;
			case 11 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:70: T__21
				{
				mT__21(); 

				}
				break;
			case 12 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:76: T__22
				{
				mT__22(); 

				}
				break;
			case 13 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:82: T__23
				{
				mT__23(); 

				}
				break;
			case 14 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:88: T__24
				{
				mT__24(); 

				}
				break;
			case 15 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:94: ID
				{
				mID(); 

				}
				break;
			case 16 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:97: INT
				{
				mINT(); 

				}
				break;
			case 17 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:101: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 18 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:109: WS
				{
				mWS(); 

				}
				break;
			case 19 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:112: LITERAL
				{
				mLITERAL(); 

				}
				break;
			case 20 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:120: AVOID
				{
				mAVOID(); 

				}
				break;
			case 21 :
				// D:\\CSU LONG BEACH\\Spring 2017\\APL\\Assignment\\Assignment 2\\Brin.g:1:126: COMMENT
				{
				mCOMMENT(); 

				}
				break;

		}
	}



}
