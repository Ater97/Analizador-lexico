/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

/**
 *
 * @author sebas
 */
/*public enum Token {
    PHP, ERROR, RESERVED_WORD, COMPARISON_OPERATOR, ARITHMETIC_OPERATOR, LOGICAL_OPERATOR,INTEGER, DOUBLE, STRING,
    FLOATING_POINT_NUM, VARIABLE_ID, RESERVED_VARIABLE, CONTROL_STRUCTURE, SEMICOLON, COMMA, CONSTANT, IDENTIFIER, PARENTHESIS,
    BRACE, BRACKET, COMMENT, NEWLINE, POINT, WHITESPACE, OTHERRESERVED_VARIABLE;
}*/
public enum Token {
    RESERVED_WORD, IDENTIFIER, WHITESPACE, COMMENT, CONSTANT, CONSTANTCOMPARISON_OPERATOR, ARITHMETIC_OPERATOR, LOGICAL_OPERATOR, PUNCTUATION, ERROR,
    BRACKET, COMPARISON_OPERATOR, POINT, INTEGER, NEWLINE, SEMICOLON, COMMA, PARENTHESIS, BRACE, CONTROL_STRUCTURE, DOUBLE, STRING, VARIABLE_ID, FLOATING_POINT_NUM, RESERVED_VARIABLE,
    OTHERRESERVED_VARIABLE, COMMENT_ERROR;
}