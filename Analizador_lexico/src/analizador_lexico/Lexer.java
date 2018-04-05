/* The following code was generated by JFlex 1.6.1 */

package analizador_lexico;

import static analizador_lexico.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>D:/Stuff/Docs/Analizador-lexico/Analizador_lexico/src/analizador_lexico/Lexer.flex</tt>
 */
class Lexer {

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
    "\12\0\1\72\1\73\1\73\1\73\23\0\1\54\1\67\1\0\1\71"+
    "\1\0\1\61\1\65\1\66\1\66\1\57\1\56\1\0\1\56\1\64"+
    "\1\60\1\63\1\63\6\63\2\63\1\0\1\0\1\53\1\55\1\54"+
    "\1\75\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\7\1\7\1\12\1\13\1\14\1\15\1\16\1\7\1\17"+
    "\1\20\1\21\1\22\1\7\1\7\1\7\1\7\1\7\1\0\1\66"+
    "\1\0\1\0\1\23\1\0\1\25\1\37\1\30\1\42\1\35\1\44"+
    "\1\51\1\24\1\34\1\7\1\7\1\26\1\32\1\41\1\31\1\33"+
    "\1\52\1\36\1\40\1\27\1\45\1\47\1\46\1\50\1\43\1\7"+
    "\1\0\1\62\1\0\1\0\6\70\1\74\172\70\u1f28\0\1\73\1\73"+
    "\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\6\1\1\2\3\1\1\2\4\1\2\2\2\1"+
    "\1\2\3\1\1\2\17\1\6\3\1\0\2\3\1\4"+
    "\34\3\1\5\10\0\1\6\1\0\1\7\1\10\3\0"+
    "\1\11\1\0\1\12\5\3\10\0\36\3\10\0\1\13"+
    "\5\3\11\0\27\3\6\0\1\7\3\3\1\14\10\0"+
    "\22\3\1\15\5\0\1\3\7\0\7\3\1\4\1\3"+
    "\2\0\1\14\1\16\1\17\4\0\6\3\5\0\1\3"+
    "\1\16\16\0\1\16\1\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[284];
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
    "\0\0\0\76\0\174\0\272\0\370\0\u0136\0\u0174\0\174"+
    "\0\u01b2\0\u01f0\0\u022e\0\u026c\0\u02aa\0\u02e8\0\u0326\0\u0364"+
    "\0\u03a2\0\u03e0\0\u041e\0\u045c\0\u049a\0\u04d8\0\u0516\0\u0554"+
    "\0\u0592\0\u05d0\0\u060e\0\u064c\0\u068a\0\u06c8\0\u0706\0\u0744"+
    "\0\u0782\0\u07c0\0\u07fe\0\u083c\0\u087a\0\u08b8\0\u08f6\0\u0934"+
    "\0\174\0\u0972\0\u09b0\0\u09ee\0\u0a2c\0\u0a6a\0\u0aa8\0\u0ae6"+
    "\0\u0b24\0\174\0\u0b62\0\u0ba0\0\u0bde\0\u0c1c\0\u0c5a\0\u0c98"+
    "\0\u0cd6\0\u0d14\0\u0d52\0\u0d90\0\u0dce\0\u0e0c\0\u0e4a\0\u0e88"+
    "\0\u0ec6\0\u0f04\0\u0f42\0\u0f80\0\u0fbe\0\u0ffc\0\u103a\0\u1078"+
    "\0\u10b6\0\u10f4\0\u1132\0\u1170\0\u0326\0\u11ae\0\76\0\u11ec"+
    "\0\u122a\0\u1268\0\u12a6\0\u12e4\0\u1322\0\u083c\0\u087a\0\76"+
    "\0\u1360\0\u139e\0\76\0\u13dc\0\u141a\0\u08b8\0\76\0\u08f6"+
    "\0\u1458\0\u1496\0\u14d4\0\u1512\0\u1550\0\u158e\0\u15cc\0\u160a"+
    "\0\u1648\0\u1686\0\u16c4\0\u1702\0\u1740\0\u177e\0\u17bc\0\u17fa"+
    "\0\u1838\0\u1876\0\u18b4\0\u18f2\0\u1930\0\u196e\0\u19ac\0\u19ea"+
    "\0\u1a28\0\u1a66\0\u1aa4\0\u1ae2\0\u1b20\0\u1b5e\0\u1b9c\0\u1bda"+
    "\0\u1c18\0\u1c56\0\u1c94\0\u1cd2\0\u1d10\0\u1d4e\0\u1d8c\0\u1dca"+
    "\0\u1e08\0\u1e46\0\u1e84\0\u1ec2\0\u1f00\0\u1f3e\0\u1f7c\0\u1fba"+
    "\0\u1ff8\0\u2036\0\u2074\0\u20b2\0\u20b2\0\u20f0\0\u212e\0\u216c"+
    "\0\u21aa\0\u21e8\0\u2226\0\u2264\0\u22a2\0\u22e0\0\u231e\0\u235c"+
    "\0\u239a\0\u23d8\0\u2416\0\u2454\0\u2492\0\u24d0\0\u250e\0\u254c"+
    "\0\u258a\0\u25c8\0\u2606\0\u2644\0\u2682\0\u26c0\0\u26fe\0\u273c"+
    "\0\u277a\0\u27b8\0\u0592\0\u27f6\0\u2834\0\u2872\0\u28b0\0\u28ee"+
    "\0\u292c\0\u296a\0\u29a8\0\u29e6\0\u2a24\0\u2a62\0\u2aa0\0\u2ade"+
    "\0\u1360\0\u2b1c\0\370\0\u2b5a\0\174\0\u2b98\0\u2bd6\0\u2c14"+
    "\0\u2c52\0\u2c90\0\u2cce\0\u2d0c\0\u2d4a\0\u2d88\0\u2dc6\0\u2e04"+
    "\0\u2e42\0\u2e80\0\u2ebe\0\u2efc\0\u2f3a\0\u2f78\0\u2fb6\0\u2ff4"+
    "\0\u3032\0\u3070\0\u30ae\0\u30ec\0\u312a\0\u3168\0\u31a6\0\76"+
    "\0\u31e4\0\u3222\0\u3260\0\u329e\0\u32dc\0\u331a\0\u3358\0\u3396"+
    "\0\u33d4\0\u3412\0\u3450\0\u348e\0\u34cc\0\u350a\0\u3548\0\u3586"+
    "\0\u35c4\0\u3602\0\u3640\0\u367e\0\u36bc\0\u36fa\0\u3738\0\u3776"+
    "\0\76\0\u37b4\0\76\0\u37f2\0\u3830\0\u386e\0\u38ac\0\u38ea"+
    "\0\u3928\0\u3966\0\u39a4\0\u39e2\0\u3a20\0\u3a5e\0\u3a9c\0\u3ada"+
    "\0\u3b18\0\u3b56\0\u3b94\0\u3bd2\0\u3c10\0\u3c4e\0\u3c8c\0\u3cca"+
    "\0\u3d08\0\u3d46\0\u3d84\0\u3dc2\0\u3e00\0\u3e3e\0\u3e7c\0\u3eba"+
    "\0\u3ef8\0\u3f36\0\u3f74\0\76";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[284];
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
    "\1\2\1\3\1\4\1\3\1\5\3\3\1\6\1\7"+
    "\2\3\1\10\1\11\5\3\1\12\1\3\1\13\1\14"+
    "\1\15\1\16\1\17\1\3\1\20\1\21\1\22\1\23"+
    "\1\3\1\24\1\25\1\26\1\3\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\3\1\35\2\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\2\1\47"+
    "\1\2\1\50\3\0\1\2\77\0\52\51\10\0\1\51"+
    "\13\0\33\51\1\52\16\51\10\0\1\51\13\0\34\51"+
    "\1\53\15\51\10\0\1\51\13\0\34\51\1\54\15\51"+
    "\10\0\1\51\13\0\40\51\1\55\11\51\10\0\1\51"+
    "\13\0\27\51\1\56\22\51\10\0\1\51\13\0\22\51"+
    "\1\57\27\51\24\0\35\51\1\60\1\61\1\62\1\63"+
    "\11\51\10\0\1\51\13\0\33\51\1\64\16\51\10\0"+
    "\1\51\13\0\23\51\1\65\11\51\1\66\14\51\10\0"+
    "\1\51\13\0\24\51\1\67\1\70\2\51\1\71\21\51"+
    "\10\0\1\51\13\0\35\51\1\62\14\51\10\0\1\51"+
    "\13\0\35\51\1\72\6\51\1\73\5\51\10\0\1\51"+
    "\13\0\31\51\1\74\5\51\1\75\1\76\11\51\10\0"+
    "\1\51\13\0\27\51\1\77\1\51\1\100\6\51\1\101"+
    "\5\51\1\102\1\103\2\51\10\0\1\51\13\0\34\51"+
    "\1\104\15\51\10\0\1\51\13\0\26\51\1\105\23\51"+
    "\10\0\1\51\13\0\24\51\1\106\7\51\1\107\15\51"+
    "\10\0\1\51\13\0\30\51\1\62\2\51\1\110\1\111"+
    "\15\51\10\0\1\51\13\0\33\51\1\112\10\51\1\113"+
    "\5\51\10\0\1\51\13\0\37\51\1\110\1\75\11\51"+
    "\10\0\1\51\13\0\23\51\1\114\26\51\10\0\1\51"+
    "\13\0\24\51\1\115\25\51\10\0\1\51\13\0\30\51"+
    "\1\115\21\51\10\0\1\51\13\0\25\51\1\116\24\51"+
    "\10\0\1\51\67\0\1\117\17\0\1\120\55\0\1\117"+
    "\22\0\1\121\1\0\1\122\3\0\1\123\1\124\3\0"+
    "\1\125\45\0\1\126\1\127\70\0\1\130\75\0\1\131"+
    "\1\132\76\0\1\133\76\0\1\133\20\0\1\134\27\0"+
    "\1\134\25\0\1\126\1\135\74\0\1\135\12\0\65\136"+
    "\1\137\1\0\3\136\1\0\3\136\66\140\1\0\1\137"+
    "\2\140\1\0\3\140\1\0\52\141\15\0\1\141\3\0"+
    "\1\141\2\0\40\51\1\142\11\51\10\0\1\51\13\0"+
    "\27\51\1\143\22\51\10\0\1\51\13\0\47\51\1\144"+
    "\2\51\10\0\1\51\13\0\26\51\1\145\23\51\10\0"+
    "\1\51\13\0\26\51\1\146\23\51\10\0\1\51\15\0"+
    "\1\147\1\150\1\0\1\151\3\0\1\152\1\153\1\154"+
    "\4\0\1\155\2\0\1\156\52\0\35\51\1\157\14\51"+
    "\10\0\1\51\13\0\37\51\1\160\12\51\10\0\1\51"+
    "\13\0\41\51\1\62\10\51\10\0\1\51\13\0\37\51"+
    "\1\161\12\51\10\0\1\51\13\0\35\51\1\162\14\51"+
    "\10\0\1\51\13\0\24\51\1\163\15\51\1\62\7\51"+
    "\10\0\1\51\13\0\25\51\1\164\1\165\23\51\10\0"+
    "\1\51\13\0\24\51\1\166\3\51\1\167\21\51\10\0"+
    "\1\51\13\0\40\51\1\64\11\51\10\0\1\51\13\0"+
    "\30\51\1\170\2\51\1\171\16\51\10\0\1\51\13\0"+
    "\36\51\1\172\13\51\10\0\1\51\13\0\32\51\1\173"+
    "\17\51\10\0\1\51\13\0\37\51\1\174\12\51\10\0"+
    "\1\51\13\0\26\51\1\175\10\51\1\176\12\51\10\0"+
    "\1\51\13\0\23\51\1\177\26\51\10\0\1\51\13\0"+
    "\32\51\1\200\17\51\10\0\1\51\13\0\41\51\1\201"+
    "\10\51\10\0\1\51\13\0\24\51\1\202\25\51\10\0"+
    "\1\51\13\0\26\51\1\203\4\51\1\161\16\51\10\0"+
    "\1\51\13\0\26\51\1\204\22\51\1\205\10\0\1\51"+
    "\13\0\24\51\1\206\25\51\10\0\1\51\13\0\31\51"+
    "\1\207\20\51\10\0\1\51\13\0\45\51\1\62\4\51"+
    "\10\0\1\51\13\0\34\51\1\62\15\51\10\0\1\51"+
    "\13\0\27\51\1\210\13\51\1\211\6\51\10\0\1\51"+
    "\13\0\40\51\1\102\11\51\10\0\1\51\13\0\40\51"+
    "\1\212\11\51\10\0\1\51\13\0\33\51\1\213\16\51"+
    "\10\0\1\51\13\0\30\51\1\214\21\51\10\0\1\51"+
    "\45\0\1\215\76\0\1\216\76\0\1\217\75\0\1\220"+
    "\101\0\1\221\64\0\1\222\45\0\57\131\1\223\13\131"+
    "\2\0\1\131\72\132\3\0\1\132\56\0\1\224\4\0"+
    "\1\225\17\0\1\134\27\0\1\134\25\0\1\135\13\0"+
    "\52\141\10\0\1\141\4\0\1\141\3\0\1\141\2\0"+
    "\24\51\1\226\25\51\10\0\1\51\13\0\33\51\1\227"+
    "\16\51\10\0\1\51\13\0\24\51\1\230\25\51\10\0"+
    "\1\51\13\0\34\51\1\231\15\51\10\0\1\51\13\0"+
    "\24\51\1\232\25\51\10\0\1\51\24\0\1\233\74\0"+
    "\1\234\75\0\1\235\10\0\1\236\64\0\1\237\71\0"+
    "\1\240\71\0\1\241\113\0\1\242\103\0\1\243\51\0"+
    "\24\51\1\244\25\51\10\0\1\51\13\0\26\51\1\245"+
    "\23\51\10\0\1\51\13\0\26\51\1\62\23\51\10\0"+
    "\1\51\13\0\30\51\1\107\21\51\10\0\1\51\13\0"+
    "\33\51\1\161\16\51\10\0\1\51\13\0\25\51\1\246"+
    "\24\51\10\0\1\51\13\0\27\51\1\247\22\51\10\0"+
    "\1\51\13\0\37\51\1\250\12\51\10\0\1\51\13\0"+
    "\40\51\1\110\11\51\10\0\1\51\13\0\26\51\1\251"+
    "\23\51\10\0\1\51\13\0\40\51\1\161\5\51\1\252"+
    "\3\51\10\0\1\51\13\0\25\51\1\253\24\51\10\0"+
    "\1\51\13\0\25\51\1\254\24\51\10\0\1\51\13\0"+
    "\34\51\1\161\15\51\10\0\1\51\13\0\34\51\1\255"+
    "\15\51\10\0\1\51\13\0\26\51\1\256\23\51\10\0"+
    "\1\51\13\0\30\51\1\62\21\51\10\0\1\51\13\0"+
    "\26\51\1\244\23\51\10\0\1\51\13\0\33\51\1\257"+
    "\3\51\1\260\1\51\1\261\1\51\1\262\1\51\1\263"+
    "\4\51\10\0\1\51\13\0\25\51\1\62\24\51\10\0"+
    "\1\51\13\0\34\51\1\264\15\51\10\0\1\51\13\0"+
    "\44\51\1\265\5\51\10\0\1\51\13\0\44\51\1\266"+
    "\5\51\10\0\1\51\13\0\26\51\1\253\23\51\10\0"+
    "\1\51\13\0\34\51\1\267\15\51\10\0\1\51\13\0"+
    "\25\51\1\270\24\51\10\0\1\51\13\0\24\51\1\271"+
    "\25\51\10\0\1\51\13\0\27\51\1\272\22\51\10\0"+
    "\1\51\13\0\25\51\1\110\24\51\10\0\1\51\13\0"+
    "\36\51\1\102\13\51\10\0\1\51\36\0\1\273\112\0"+
    "\1\274\64\0\1\275\115\0\1\276\54\0\1\277\75\0"+
    "\1\300\46\0\57\131\1\223\1\301\12\131\2\0\1\131"+
    "\63\0\1\225\13\0\35\51\1\302\14\51\10\0\1\51"+
    "\13\0\31\51\1\146\20\51\10\0\1\51\13\0\41\51"+
    "\1\303\10\51\10\0\1\51\13\0\50\51\1\304\1\51"+
    "\10\0\1\51\13\0\25\51\1\305\24\51\10\0\1\51"+
    "\13\0\1\306\113\0\1\307\70\0\1\310\77\0\1\311"+
    "\75\0\1\310\102\0\1\312\67\0\1\313\63\0\1\314"+
    "\122\0\1\315\50\0\42\51\1\62\7\51\10\0\1\51"+
    "\13\0\35\51\1\316\14\51\10\0\1\51\13\0\24\51"+
    "\1\317\25\51\10\0\1\51\13\0\23\51\1\62\26\51"+
    "\10\0\1\51\13\0\37\51\1\62\12\51\10\0\1\51"+
    "\13\0\34\51\1\320\15\51\10\0\1\51\13\0\24\51"+
    "\1\321\25\51\10\0\1\51\13\0\33\51\1\322\16\51"+
    "\10\0\1\51\13\0\34\51\1\323\15\51\10\0\1\51"+
    "\13\0\35\51\1\324\14\51\10\0\1\51\13\0\24\51"+
    "\1\325\7\51\1\326\15\51\10\0\1\51\13\0\43\51"+
    "\1\62\6\51\10\0\1\51\13\0\45\51\1\327\4\51"+
    "\10\0\1\51\13\0\34\51\1\330\15\51\10\0\1\51"+
    "\13\0\30\51\1\331\21\51\10\0\1\51\13\0\40\51"+
    "\1\332\11\51\10\0\1\51\13\0\35\51\1\333\14\51"+
    "\10\0\1\51\13\0\33\51\1\334\16\51\10\0\1\51"+
    "\13\0\37\51\1\335\12\51\10\0\1\51\13\0\24\51"+
    "\1\334\25\51\10\0\1\51\13\0\44\51\1\336\5\51"+
    "\10\0\1\51\13\0\26\51\1\337\23\51\10\0\1\51"+
    "\45\0\1\340\67\0\1\341\104\0\1\342\66\0\1\343"+
    "\105\0\1\344\65\0\1\345\51\0\42\51\1\305\7\51"+
    "\10\0\1\51\13\0\34\51\1\346\15\51\10\0\1\51"+
    "\32\0\1\347\100\0\1\350\57\0\1\307\73\0\1\351"+
    "\102\0\1\352\72\0\1\353\101\0\1\354\113\0\1\355"+
    "\47\0\24\51\1\356\25\51\10\0\1\51\13\0\36\51"+
    "\1\213\13\51\10\0\1\51\13\0\27\51\1\357\22\51"+
    "\10\0\1\51\13\0\26\51\1\110\23\51\10\0\1\51"+
    "\13\0\27\51\1\62\22\51\10\0\1\51\13\0\31\51"+
    "\1\360\20\51\10\0\1\51\13\0\43\51\1\361\6\51"+
    "\10\0\1\51\13\0\40\51\1\362\11\51\10\0\1\51"+
    "\13\0\24\51\1\363\25\51\10\0\1\51\13\0\33\51"+
    "\1\364\16\51\10\0\1\51\13\0\27\51\1\210\22\51"+
    "\10\0\1\51\13\0\35\51\1\365\14\51\10\0\1\51"+
    "\13\0\41\51\1\250\10\51\10\0\1\51\13\0\40\51"+
    "\1\62\11\51\10\0\1\51\13\0\35\51\1\110\14\51"+
    "\10\0\1\51\13\0\32\51\1\361\17\51\10\0\1\51"+
    "\13\0\25\51\1\161\24\51\10\0\1\51\13\0\33\51"+
    "\1\366\16\51\10\0\1\51\50\0\1\367\71\0\1\300"+
    "\105\0\1\122\104\0\1\370\52\0\1\371\50\0\35\51"+
    "\1\372\14\51\10\0\1\51\32\0\1\307\100\0\1\373"+
    "\73\0\1\374\71\0\1\375\100\0\1\376\76\0\1\307"+
    "\77\0\1\377\53\0\27\51\1\161\22\51\10\0\1\51"+
    "\13\0\26\51\1\u0100\23\51\10\0\1\51\13\0\34\51"+
    "\1\u0101\15\51\10\0\1\51\13\0\24\51\1\u0102\25\51"+
    "\10\0\1\51\13\0\27\51\1\u0103\22\51\10\0\1\51"+
    "\13\0\41\51\1\u0104\10\51\10\0\1\51\13\0\26\51"+
    "\1\165\23\51\10\0\1\51\13\0\34\51\1\u0105\15\51"+
    "\10\0\1\51\13\0\30\51\1\333\21\51\10\0\1\51"+
    "\55\0\1\371\67\0\1\u0106\41\0\37\51\1\372\12\51"+
    "\10\0\1\51\1\u0107\22\0\1\u0108\70\0\1\307\107\0"+
    "\1\u0109\107\0\1\u010a\46\0\34\51\1\63\15\51\10\0"+
    "\1\51\13\0\40\51\1\u010b\11\51\10\0\1\51\13\0"+
    "\27\51\1\110\22\51\10\0\1\51\13\0\34\51\1\u0104"+
    "\15\51\10\0\1\51\13\0\30\51\1\257\21\51\10\0"+
    "\1\51\13\0\24\51\1\165\25\51\10\0\1\51\50\0"+
    "\1\u010c\50\0\1\u010d\101\0\1\u010e\61\0\1\u010f\125\0"+
    "\1\u0110\45\0\26\51\1\250\23\51\10\0\1\51\52\0"+
    "\1\u010c\23\0\1\u0107\52\0\1\u0111\50\0\1\307\64\0"+
    "\1\310\124\0\1\u0112\72\0\1\u0113\101\0\1\u0114\77\0"+
    "\1\u0115\74\0\1\u0116\112\0\1\u0117\52\0\1\u0118\104\0"+
    "\1\u0119\75\0\1\u011a\76\0\1\u011b\75\0\1\u011c\77\0"+
    "\1\u011b\35\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[16306];
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
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\54\1\1\0\37\1\1\11\10\0\1\11"+
    "\1\0\1\1\1\11\3\0\1\11\1\0\6\1\10\0"+
    "\36\1\10\0\6\1\11\0\27\1\6\0\5\1\10\0"+
    "\22\1\1\11\5\0\1\1\7\0\11\1\2\0\1\11"+
    "\1\1\1\11\4\0\6\1\5\0\2\1\16\0\1\1"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[284];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String lexeme;
    public int LineCount = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 234) {
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { lexeme = yytext();return ERROR;
            }
          case 16: break;
          case 2: 
            { LineCount++; lexeme=yytext(); return NEWLINE;
            }
          case 17: break;
          case 3: 
            { lexeme=yytext(); return IDENTIFIER;
            }
          case 18: break;
          case 4: 
            { lexeme=yytext(); return RESERVED_WORD;
            }
          case 19: break;
          case 5: 
            { lexeme=yytext(); return COMPARISON_OPERATOR;
            }
          case 20: break;
          case 6: 
            { lexeme=yytext(); return ARITHMETIC_OPERATOR;
            }
          case 21: break;
          case 7: 
            { lexeme=yytext(); return COMMENT;
            }
          case 22: break;
          case 8: 
            { lexeme=yytext(); return LOGICAL_OPERATOR;
            }
          case 23: break;
          case 9: 
            { lexeme=yytext(); return STRING;
            }
          case 24: break;
          case 10: 
            { lexeme=yytext(); return VARIABLE_ID;
            }
          case 25: break;
          case 11: 
            { lexeme=yytext(); return FLOATING_POINT_NUM;
            }
          case 26: break;
          case 12: 
            { lexeme=yytext(); return INTEGER;
            }
          case 27: break;
          case 13: 
            { lexeme=yytext(); return PHP;
            }
          case 28: break;
          case 14: 
            { lexeme=yytext(); return DOUBLE;
            }
          case 29: break;
          case 15: 
            { lexeme=yytext(); return CONSTANT;
            }
          case 30: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
