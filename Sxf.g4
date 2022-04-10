grammar Sxf;

file: block;

block: BLOCK_START block_elements? BLOCK_END;
variable: named_basicvar | unnamed_object;
named_basicvar: (IDENTIFIER | string_literal) ((SET variable_types) | (SET_LONG block));


unnamed_object: (block | struct);

block_elements: variable (',' variable)*;
variable_types: string_literal
                | number
                | bool
                | struct
                | block
                | var_null;

number: var_integer | var_double;
struct: SP_START (variable_types (',' variable_types)*)? SP_END;
var_integer: INTEGER;
var_double: INTEGER '.' INTEGER;
var_false: 'false' | 'FALSE';
var_true: 'true' | 'TRUE';
var_null: 'null';
bool: var_true | var_false;
INTEGER: [0-9]+;


SET: ':';
SET_LONG: '=>';
BLOCK_START: '{';
BLOCK_END: '}';
SEPARATOR: ',';
SP_START: '[';
SP_END: ']';
IDENTIFIER: [A-Za-z0-9_]+;
string_literal: StringLiteral;
StringLiteral
  : UnterminatedStringLiteral '"'
  ;
WS
    : [ \t\u000C\r\n]+ -> skip
    ;
UnterminatedStringLiteral
  : '"' (~["\\\r\n] | '\\' (. | EOF))*
  ;

  fragment A : [aA]; // match either an 'a' or 'A'
  fragment B : [bB];
  fragment C : [cC];
  fragment D : [dD];
  fragment E : [eE];
  fragment F : [fF];
  fragment G : [gG];
  fragment H : [hH];
  fragment I : [iI];
  fragment J : [jJ];
  fragment K : [kK];
  fragment L : [lL];
  fragment M : [mM];
  fragment N : [nN];
  fragment O : [oO];
  fragment P : [pP];
  fragment Q : [qQ];
  fragment R : [rR];
  fragment S : [sS];
  fragment T : [tT];
  fragment U : [uU];
  fragment V : [vV];
  fragment W : [wW];
  fragment X : [xX];
  fragment Y : [yY];
  fragment Z : [zZ];
  BlockComment
      : '$;' .*? ';$' -> skip
      ;