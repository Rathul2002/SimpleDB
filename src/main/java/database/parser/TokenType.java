package database.parser;

enum TokenType {
    // Keywords
    SELECT, FROM, WHERE, INSERT, INTO, VALUES, UPDATE, SET, DELETE,

    // Operators
    EQUALS, GREATER_THAN, LESS_THAN, NOT_EQUALS, AND, OR,

    // Symbols
    STAR, COMMA, SEMICOLON, DOT, LPAREN, RPAREN,

    // Literals & Identifiers
    IDENTIFIER, STRING_LITERAL, NUMERIC_LITERAL,

    // End of input
    EOF,

    // Unknown/invalid
    INVALID
}

