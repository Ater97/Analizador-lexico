/* The following code was generated by JFlex 1.4.3 on 10/10/18 10:57 AM */


package analizador_lexico;

import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/10/18 10:57 AM from the specification file
 * <tt>D:/GitHub/Analizador-lexico/Analizador_lexico/src/analizador_lexico/Lexer.flex</tt>
 */
class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\51\1\43\1\0\1\51\1\101\22\0\1\50\1\3\1\44"+
    "\2\0\1\10\1\0\1\42\1\35\1\34\1\6\1\5\1\33\1\5"+
    "\1\30\1\7\1\22\1\27\6\25\2\21\1\0\1\32\1\1\1\2"+
    "\1\1\2\0\1\71\1\26\2\24\1\31\1\24\1\77\1\46\1\74"+
    "\2\46\1\75\1\76\1\70\1\46\1\67\1\46\1\73\1\100\4\46"+
    "\1\23\2\46\1\37\1\0\1\36\1\0\1\45\1\0\1\16\1\57"+
    "\1\61\1\55\1\14\1\15\1\60\1\65\1\53\1\46\1\66\1\17"+
    "\1\63\1\54\1\56\1\47\1\46\1\12\1\20\1\11\1\13\1\52"+
    "\1\64\1\62\1\72\1\46\1\41\1\4\1\40\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\1\3\5\6\6"+
    "\2\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\4\1\15\6\1\1\1\2\2\7\1\0"+
    "\1\21\1\1\10\6\1\0\1\22\2\0\1\7\4\0"+
    "\1\23\1\0\1\23\1\0\1\6\1\24\16\6\1\0"+
    "\1\7\3\1\1\21\6\6\1\25\1\6\1\0\1\22"+
    "\1\0\2\7\1\6\1\26\10\6\1\27\4\6\3\0"+
    "\1\1\1\21\1\0\1\30\1\31\1\6\1\32\2\6"+
    "\1\33\2\6\1\34\2\6\1\35\10\6\2\0\6\6"+
    "\1\36\1\37\1\40\1\41\6\6\1\42\1\6\1\43"+
    "\2\6\1\44\3\6\1\45\2\6\1\46\5\6\1\47"+
    "\1\50\2\6\1\51\1\6\1\52\1\53\2\6\1\54"+
    "\1\6\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\102\0\204\0\204\0\204\0\306\0\u0108\0\102"+
    "\0\u014a\0\u018c\0\u01ce\0\u0210\0\u0252\0\u0294\0\u02d6\0\u0318"+
    "\0\u035a\0\u039c\0\102\0\102\0\102\0\102\0\102\0\u03de"+
    "\0\102\0\u0420\0\u0462\0\u04a4\0\u04e6\0\u0528\0\u056a\0\u05ac"+
    "\0\u05ee\0\u0630\0\u0672\0\u06b4\0\u06f6\0\u0738\0\u077a\0\u07bc"+
    "\0\u07fe\0\u0840\0\u0882\0\u08c4\0\102\0\u0906\0\u0948\0\u039c"+
    "\0\u098a\0\u09cc\0\u0a0e\0\u0a50\0\u0a92\0\u0ad4\0\u0b16\0\u0b58"+
    "\0\u0b9a\0\u0bdc\0\u0c1e\0\u0c60\0\u0ca2\0\u0ce4\0\u0d26\0\u0d68"+
    "\0\u0daa\0\u0dec\0\u0462\0\u0462\0\u04e6\0\u04e6\0\u0528\0\u0e2e"+
    "\0\u0210\0\u0e70\0\u0eb2\0\u0ef4\0\u0f36\0\u0f78\0\u0fba\0\u0ffc"+
    "\0\u103e\0\u1080\0\u10c2\0\u1104\0\u1146\0\u1188\0\u11ca\0\u120c"+
    "\0\u124e\0\u1290\0\u12d2\0\u1314\0\u1356\0\u1398\0\u13da\0\u141c"+
    "\0\u145e\0\u14a0\0\u14e2\0\u0210\0\u1524\0\u1566\0\u1566\0\u15a8"+
    "\0\u0d68\0\u0daa\0\u15ea\0\u162c\0\u166e\0\u16b0\0\u16f2\0\u1734"+
    "\0\u1776\0\u17b8\0\u17fa\0\u183c\0\u187e\0\u18c0\0\u1902\0\u1944"+
    "\0\u1986\0\u1290\0\u12d2\0\u19c8\0\u1a0a\0\u1314\0\u1a4c\0\u0210"+
    "\0\u0210\0\u1a8e\0\u0210\0\u1ad0\0\u1b12\0\u0210\0\u1b54\0\u1b96"+
    "\0\u0210\0\u1bd8\0\u1c1a\0\u0210\0\u1c5c\0\u1c9e\0\u1ce0\0\u1d22"+
    "\0\u1d64\0\u1da6\0\u1de8\0\u1e2a\0\u1a0a\0\u1e6c\0\u1eae\0\u1ef0"+
    "\0\u1f32\0\u1f74\0\u1fb6\0\u1ff8\0\u0210\0\u0210\0\u0210\0\u0210"+
    "\0\u203a\0\u207c\0\u20be\0\u2100\0\u2142\0\u2184\0\u0210\0\u21c6"+
    "\0\u0210\0\u2208\0\u224a\0\u0210\0\u228c\0\u22ce\0\u2310\0\u0210"+
    "\0\u2352\0\u2394\0\u0210\0\u23d6\0\u2418\0\u245a\0\u249c\0\u24de"+
    "\0\u0210\0\u0210\0\u2520\0\u2562\0\u0210\0\u25a4\0\u0210\0\u0210"+
    "\0\u25e6\0\u2628\0\u0210\0\u266a\0\u0210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\10\1\12\1\13\1\14\1\15\1\16\2\14\1\17"+
    "\1\20\1\21\2\14\1\20\1\14\1\20\1\22\1\14"+
    "\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\2\14\2\2\1\37\1\40"+
    "\1\41\1\42\1\14\1\43\1\14\1\44\2\14\1\45"+
    "\2\14\1\46\1\47\2\14\1\50\2\14\1\51\1\52"+
    "\1\53\1\54\104\0\1\55\103\0\1\55\116\0\1\56"+
    "\1\57\2\0\1\56\1\0\1\56\1\60\57\0\1\61"+
    "\1\62\103\0\1\14\1\63\15\14\1\0\1\14\13\0"+
    "\3\14\2\0\13\14\1\64\13\14\12\0\3\14\1\65"+
    "\13\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\6\14\1\66\10\14\1\0\1\14\13\0\3\14\2\0"+
    "\10\14\1\67\16\14\12\0\5\14\1\70\11\14\1\0"+
    "\1\14\13\0\3\14\2\0\4\14\1\71\22\14\12\0"+
    "\1\72\16\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\15\0\1\73\4\0\2\20\2\0\1\20\1\0\1\20"+
    "\1\74\1\73\15\0\1\75\46\0\1\73\4\0\1\76"+
    "\1\77\1\100\1\0\1\77\1\101\1\77\1\74\1\73"+
    "\15\0\1\75\7\0\1\101\2\0\1\100\40\0\2\102"+
    "\2\0\1\102\1\0\1\102\110\0\1\2\103\0\1\2"+
    "\41\0\42\103\1\104\1\0\36\103\20\0\1\34\22\0"+
    "\1\34\4\0\3\34\26\0\1\34\43\105\1\0\1\106"+
    "\35\105\11\0\10\14\2\0\2\14\1\0\1\14\2\0"+
    "\1\14\13\0\1\107\2\14\2\0\27\14\12\0\17\14"+
    "\1\0\1\14\13\0\3\14\2\0\4\14\1\110\22\14"+
    "\12\0\4\14\1\111\12\14\1\0\1\14\13\0\3\14"+
    "\2\0\2\14\1\112\6\14\1\113\15\14\12\0\2\14"+
    "\1\114\14\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\4\14"+
    "\1\115\22\14\12\0\1\14\1\116\15\14\1\0\1\14"+
    "\13\0\3\14\2\0\4\14\1\117\22\14\12\0\6\14"+
    "\1\120\10\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\13\14"+
    "\1\121\13\14\12\0\1\14\1\122\15\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\3\14\1\123\13\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\3\14"+
    "\1\124\13\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\5\14\1\125\11\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\3\14\1\126\13\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\3\14\1\127\13\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\44\0\1\54"+
    "\35\0\1\54\14\0\1\73\4\0\2\56\2\0\1\56"+
    "\1\0\1\56\1\74\1\73\64\0\1\73\4\0\1\130"+
    "\1\131\1\100\1\0\1\131\1\101\1\131\1\74\1\73"+
    "\25\0\1\101\2\0\1\100\17\0\6\132\1\133\11\132"+
    "\1\134\22\132\1\135\5\132\2\134\26\132\1\134\43\62"+
    "\1\0\36\62\11\0\2\14\1\136\14\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\17\14\1\0\1\14"+
    "\13\0\3\14\2\0\1\14\1\137\25\14\12\0\1\140"+
    "\16\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\7\14\1\141\7\14\1\0\1\14\13\0\3\14\2\0"+
    "\27\14\12\0\1\142\16\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\6\14\1\143\10\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\1\14\1\144\15\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\1\14"+
    "\1\145\15\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\6\0\1\146\13\0\2\147\2\0\1\147\1\0\1\147"+
    "\66\0\1\73\4\0\2\74\2\0\1\74\1\0\1\74"+
    "\1\150\1\73\61\0\1\2\104\0\1\73\4\0\2\76"+
    "\2\0\1\76\1\0\1\76\1\102\1\73\15\0\1\75"+
    "\46\0\1\73\4\0\1\76\1\77\2\0\1\77\1\0"+
    "\1\77\1\102\1\73\15\0\1\75\46\0\3\151\2\0"+
    "\2\151\1\0\4\151\1\0\1\151\23\0\1\151\1\0"+
    "\1\151\1\0\1\151\7\0\1\151\32\0\1\152\4\0"+
    "\1\152\66\0\1\73\4\0\2\102\2\0\1\102\1\0"+
    "\1\102\1\150\1\73\61\0\17\14\1\0\1\14\13\0"+
    "\3\14\2\0\1\14\1\153\25\14\12\0\1\154\16\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\17\14"+
    "\1\0\1\14\13\0\2\14\1\155\2\0\27\14\12\0"+
    "\6\14\1\156\10\14\1\0\1\14\13\0\3\14\2\0"+
    "\27\14\12\0\2\14\1\157\14\14\1\0\1\14\13\0"+
    "\3\14\2\0\27\14\12\0\3\14\1\160\13\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\17\14\1\0"+
    "\1\14\13\0\3\14\2\0\4\14\1\161\22\14\12\0"+
    "\5\14\1\162\11\14\1\0\1\14\13\0\3\14\2\0"+
    "\27\14\12\0\17\14\1\0\1\14\13\0\3\14\2\0"+
    "\1\14\1\163\25\14\12\0\17\14\1\0\1\14\13\0"+
    "\3\14\2\0\1\14\1\164\25\14\12\0\17\14\1\0"+
    "\1\14\13\0\3\14\2\0\12\14\1\165\14\14\12\0"+
    "\5\14\1\166\11\14\1\0\1\14\13\0\3\14\2\0"+
    "\27\14\12\0\6\14\1\167\10\14\1\0\1\14\13\0"+
    "\3\14\2\0\27\14\12\0\1\170\16\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\1\171\16\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\15\0\1\73\4\0"+
    "\2\130\2\0\1\130\1\0\1\130\1\102\1\73\64\0"+
    "\1\73\4\0\1\130\1\131\2\0\1\131\1\0\1\131"+
    "\1\102\1\73\50\0\6\172\1\173\34\172\1\174\44\172"+
    "\1\173\1\175\33\172\1\174\44\172\1\173\11\172\1\176"+
    "\22\172\1\135\5\172\2\176\26\172\1\176\6\174\1\177"+
    "\11\174\1\135\22\174\1\135\5\174\2\135\26\174\1\135"+
    "\11\0\3\14\1\200\13\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\7\14\1\201\7\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\2\14\1\202\14\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\3\14"+
    "\1\203\13\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\3\14\1\204\13\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\7\14\1\136\7\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\17\14\1\0\1\14"+
    "\13\0\3\14\2\0\1\14\1\205\25\14\22\0\2\147"+
    "\2\0\1\147\1\0\1\147\66\0\1\73\14\0\1\73"+
    "\61\0\17\14\1\0\1\14\13\0\3\14\2\0\3\14"+
    "\1\206\23\14\12\0\3\14\1\207\13\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\6\14\1\210\10\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\6\14"+
    "\1\211\10\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\5\14"+
    "\1\212\21\14\12\0\5\14\1\213\11\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\6\14\1\214\10\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\7\14"+
    "\1\215\7\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\6\14\1\216\10\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\17\14\1\0\1\14\13\0\3\14"+
    "\2\0\2\14\1\217\24\14\12\0\17\14\1\0\1\14"+
    "\13\0\3\14\2\0\17\14\1\220\7\14\12\0\17\14"+
    "\1\0\1\14\13\0\3\14\2\0\3\14\1\221\23\14"+
    "\12\0\6\14\1\222\10\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\15\14\1\223\1\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\15\14\1\224\1\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\1\0\6\174"+
    "\1\177\73\174\6\225\1\226\34\225\1\0\36\225\6\174"+
    "\1\177\1\2\72\174\11\0\1\14\1\227\15\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\17\14\1\0"+
    "\1\14\13\0\3\14\2\0\2\14\1\230\24\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\2\14\1\231"+
    "\24\14\12\0\1\14\1\232\15\14\1\0\1\14\13\0"+
    "\3\14\2\0\27\14\12\0\3\14\1\233\13\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\6\14\1\234"+
    "\10\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\14\14\1\235"+
    "\12\14\12\0\7\14\1\236\7\14\1\0\1\14\13\0"+
    "\3\14\2\0\27\14\12\0\3\14\1\237\13\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\1\240\16\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\1\14"+
    "\1\241\15\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\22\14"+
    "\1\242\1\243\3\14\12\0\17\14\1\0\1\14\13\0"+
    "\3\14\2\0\4\14\1\244\22\14\12\0\17\14\1\0"+
    "\1\14\13\0\3\14\2\0\20\14\1\245\6\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\20\14\1\246"+
    "\6\14\1\0\6\225\1\226\1\175\33\225\1\0\36\225"+
    "\11\0\17\14\1\0\1\14\13\0\3\14\2\0\2\14"+
    "\1\247\24\14\12\0\17\14\1\0\1\14\13\0\3\14"+
    "\2\0\3\14\1\250\23\14\12\0\17\14\1\0\1\14"+
    "\13\0\3\14\2\0\6\14\1\251\20\14\12\0\4\14"+
    "\1\252\12\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\11\14"+
    "\1\253\15\14\12\0\3\14\1\254\13\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\1\14\1\255\15\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\17\14"+
    "\1\0\1\14\13\0\3\14\2\0\2\14\1\256\24\14"+
    "\12\0\17\14\1\0\1\14\13\0\3\14\2\0\1\14"+
    "\1\257\25\14\12\0\17\14\1\0\1\14\13\0\3\14"+
    "\2\0\7\14\1\260\17\14\12\0\1\261\16\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\1\262\16\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\7\14"+
    "\1\263\7\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\5\14\1\264\11\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\3\14\1\265\13\14\1\0\1\14"+
    "\13\0\3\14\2\0\27\14\12\0\5\14\1\266\11\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\1\267"+
    "\16\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\2\14\1\270"+
    "\24\14\12\0\3\14\1\271\13\14\1\0\1\14\13\0"+
    "\3\14\2\0\27\14\12\0\3\14\1\272\13\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\17\14\1\0"+
    "\1\14\13\0\3\14\2\0\7\14\1\273\17\14\12\0"+
    "\17\14\1\0\1\14\13\0\3\14\2\0\2\14\1\274"+
    "\24\14\12\0\17\14\1\0\1\14\13\0\3\14\2\0"+
    "\20\14\1\275\6\14\12\0\3\14\1\276\13\14\1\0"+
    "\1\14\13\0\3\14\2\0\27\14\12\0\3\14\1\277"+
    "\13\14\1\0\1\14\13\0\3\14\2\0\27\14\12\0"+
    "\3\14\1\300\13\14\1\0\1\14\13\0\3\14\2\0"+
    "\27\14\12\0\1\301\16\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\12\0\17\14\1\0\1\14\13\0\3\14"+
    "\2\0\6\14\1\302\20\14\12\0\7\14\1\303\7\14"+
    "\1\0\1\14\13\0\3\14\2\0\27\14\12\0\3\14"+
    "\1\304\13\14\1\0\1\14\13\0\3\14\2\0\27\14"+
    "\12\0\1\14\1\305\15\14\1\0\1\14\13\0\3\14"+
    "\2\0\27\14\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9900];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\5\1\1\11\12\1\5\11\1\1\1\11"+
    "\23\1\1\11\2\1\1\0\12\1\1\0\1\1\2\0"+
    "\1\1\4\0\1\1\1\0\1\1\1\0\20\1\1\0"+
    "\15\1\1\0\1\1\1\0\21\1\3\0\2\1\1\0"+
    "\25\1\2\0\57\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[197];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yycolumn, yytext());
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yycolumn, value);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 176) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 35: 
          { return new Symbol(sym.STRING, yyline, yycolumn, yytext());
          }
        case 46: break;
        case 6: 
          { return new Symbol(sym.ident, yyline, yycolumn, yytext());
          }
        case 47: break;
        case 19: 
          { return new Symbol(sym.STRINGCONSTANT, yyline, yycolumn, yytext());
          }
        case 48: break;
        case 39: 
          { return new Symbol(sym.GETBYTE, yyline, yycolumn, yytext());
          }
        case 49: break;
        case 38: 
          { return new Symbol(sym.EXTENDS, yyline, yycolumn, yytext());
          }
        case 50: break;
        case 24: 
          { return new Symbol(sym.BOOLCONSTANT, yyline, yycolumn, yytext());
          }
        case 51: break;
        case 2: 
          { return new Symbol(sym.Comparison_op, yyline, yycolumn, yytext());
          }
        case 52: break;
        case 28: 
          { return new Symbol(sym.NULL, yyline, yycolumn, yytext());
          }
        case 53: break;
        case 34: 
          { return new Symbol(sym.RETURN, yyline, yycolumn, yytext());
          }
        case 54: break;
        case 33: 
          { return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
          }
        case 55: break;
        case 36: 
          { return new Symbol(sym.DOUBLE, yyline, yycolumn, yytext());
          }
        case 56: break;
        case 25: 
          { return new Symbol(sym.THIS, yyline, yycolumn, yytext());
          }
        case 57: break;
        case 41: 
          { return new Symbol(sym.NEWARRAY, yyline, yycolumn, yytext());
          }
        case 58: break;
        case 26: 
          { return new Symbol(sym.ELSE, yyline, yycolumn, yytext());
          }
        case 59: break;
        case 42: 
          { return new Symbol(sym.READLINE, yyline, yycolumn, yytext());
          }
        case 60: break;
        case 29: 
          { return new Symbol(sym.BOOL, yyline, yycolumn, yytext());
          }
        case 61: break;
        case 43: 
          { return new Symbol(sym.INTERFACE, yyline, yycolumn, yytext());
          }
        case 62: break;
        case 23: 
          { return new Symbol(sym.NEW, yyline, yycolumn, yytext());
          }
        case 63: break;
        case 8: 
          { return new Symbol(sym.Point, yyline, yycolumn, yytext());
          }
        case 64: break;
        case 45: 
          { return new Symbol(sym.READINTEGER, yyline, yycolumn, yytext());
          }
        case 65: break;
        case 9: 
          { return new Symbol(sym.Semicolon, yyline, yycolumn, yytext());
          }
        case 66: break;
        case 14: 
          { return new Symbol(sym.LeftBrace, yyline, yycolumn, yytext());
          }
        case 67: break;
        case 11: 
          { return new Symbol(sym.RightParenthesis, yyline, yycolumn, yytext());
          }
        case 68: break;
        case 7: 
          { return new Symbol(sym.INTCONSTANT, yyline, yycolumn, yytext());
          }
        case 69: break;
        case 21: 
          { return new Symbol(sym.FOR, yyline, yycolumn, yytext());
          }
        case 70: break;
        case 12: 
          { return new Symbol(sym.LeftParenthesis, yyline, yycolumn, yytext());
          }
        case 71: break;
        case 17: 
          { /*return new Symbol(sym.Errors);*/
          }
        case 72: break;
        case 13: 
          { return new Symbol(sym.RightBrace, yyline, yycolumn, yytext());
          }
        case 73: break;
        case 40: 
          { return new Symbol(sym.SETBYTE, yyline, yycolumn, yytext());
          }
        case 74: break;
        case 37: 
          { return new Symbol(sym.MALLOC, yyline, yycolumn, yytext());
          }
        case 75: break;
        case 22: 
          { return new Symbol(sym.INT, yyline, yycolumn, yytext());
          }
        case 76: break;
        case 5: 
          { return new Symbol(sym.Arithmetic_Op, yyline, yycolumn, yytext());
          }
        case 77: break;
        case 10: 
          { return new Symbol(sym.Comma, yyline, yycolumn, yytext());
          }
        case 78: break;
        case 16: 
          { return new Symbol(sym.LeftBracket, yyline, yycolumn, yytext());
          }
        case 79: break;
        case 4: 
          { return new Symbol(sym.Negation, yyline, yycolumn, yytext());
          }
        case 80: break;
        case 20: 
          { return new Symbol(sym.IF, yyline, yycolumn, yytext());
          }
        case 81: break;
        case 44: 
          { return new Symbol(sym.IMPLEMENTS, yyline, yycolumn, yytext());
          }
        case 82: break;
        case 31: 
          { return new Symbol(sym.CLASS, yyline, yycolumn, yytext());
          }
        case 83: break;
        case 3: 
          { return new Symbol(sym.Equal, yyline, yycolumn, yytext());
          }
        case 84: break;
        case 30: 
          { return new Symbol(sym.BREAK, yyline, yycolumn, yytext());
          }
        case 85: break;
        case 15: 
          { return new Symbol(sym.RightBracket, yyline, yycolumn, yytext());
          }
        case 86: break;
        case 27: 
          { return new Symbol(sym.VOID, yyline, yycolumn, yytext());
          }
        case 87: break;
        case 18: 
          { return new Symbol(sym.DOUBLECONSTANT, yyline, yycolumn, yytext());
          }
        case 88: break;
        case 32: 
          { return new Symbol(sym.WHILE, yyline, yycolumn, yytext());
          }
        case 89: break;
        case 1: 
          { 
          }
        case 90: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
