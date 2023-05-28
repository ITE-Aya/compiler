lexer grammar dartLexer;


//kewywords for dart  && operations && pracets

INITSTATE:
'initState';

TITLE:
'title'
;
THEME:
'theme'
;
DEBUGSHOWMODE:
'debugShowCheckedModeBanner';
ThemeData:
'ThemeData';
PrimarySwatch:
'primarySwatch'
;
BIGER:'<';

SMALLER:'>';


OPERATION: BIGER|SMALLER|'+'|'-'|'*'|'%'|'/'|'<='|'>='|'++'|'--'|'$';

SCAFFOLD:'Scaffold';

Q_MARK:'?';

STATE:'State';

CREATSTATE:'createState';


KEY:'key';

FULL:'StatefulWidget ';

LESS :'StatelessWidget';

FOREACH:'forEach';

FOR    :    'for'    ;

TEXT:'Text';

CHIS:'children';

OPEN_PR:'[';

CLOSE_PR:']';

COLUMN:'Column';

ROW:'Row';

FIT:
'fit:';
BOXFIT:'BoxFit';
FILL:
'fill';

WS    : (' '|'\t'|'\r' | '\n')->skip;

ASSET:'asset';

IMAGE:'Image''.';

APPBAR2:'appBar';

APPBAR:'AppBar';

BACK:'backgroundColor';

MAIN:'main';

BODY:'body';

RUNAPP:'runApp';

LIST:'List';

BUILD:'build';

OVERRIDE:'@override';

SETSTATE:'setState';

ONTAP:'onTap';

GestureDetector:'GestureDetector';

WIDGET:'Widget';

BUILDCONTEXT:'BuildContext';

PADDING:'Padding';

PADDING1:'padding:';

EDGE:'EdgeInsets.';

ALL:'all';


VOID  :    'void';

TYPE
    : 'int'
    | 'String'
    | 'bool'
    ;


HEIGHT:'height';

WIDTH:'width';

BOOL_VAL:'true'|'false';

SIZEDBOX :'SizedBox';

CONTAINER:'Container';

CHILD:'child';

COLORS:'Colors' ;

COL:'red'|'blue'|'black'|'white'|'amber'|'transperant'|'teal'|'green';

COLOR:'color' ;

D_DOT:':';

DOT:'.';

BORDER2:'BorderRadius';

EXPANDED:'Expanded';

CIRCULAR:'circular';

BORDERRADIUS:'borderRadius';

DECORATION:'decoration' ;

BD:'BoxDecoration';

LISTVIEW:'ListView';

SEPARATED:'separated';

ItemBuilder:'itemBuilder';

SeparatorBuilder:'separatorBuilder';

ItemCount:'itemCount';

Return:'=>';
MAINAXIS:
'mainAxisAlignment:'
;
MAINAXIS1:'MainAxisAlignment';

CENTER:
'center';

CONTEXT:'context';

INDEX:'index';

EQUAL: '='    ;

NUM_VAL: [0-9]+    | [0-9]* '.' [0-9]+    ;

SIMICOLON    : ';';

COLON: ','   ;

OPEN_HEAD:'(';

CLOSE_HEAD:')' ;

OPEN_BODY:'{';

CLOSE_BODY:'}';

FINAL:'final'   ;

CONST:    'const';

VAR:    'var' ;


ASYNC:    'async'    ;

THIS:    'this';

ABSTRACT:    'abstract';

AS:    'as';

SYNC:    'sync';

CLASS:    'class'    ;

WITH:    'with'    ;

STATIC:    'static'    ;

DYNAMIC:    'dynamic'    ;

EXTERNAL:    'external'    ;

GET:    'get';

SET:    'set';

OPERATOR:    'operator';

SUPER:    'super';

FACTORY:    'factory';

EXTENDS:    'extends';

IMPLEMENTS:    'implements';

ENUM:    'enum';

NULL:    'null';

THROW:    'throw';

NEW:    'new';

AWAIT:    'await';

DEFERRED:    'deferred';

EXPORT:    'export';

IMPORT:    'import';

LIBRARY:    'library'    ;

PART:    'part';

TYPEDEF:    'typedef';

IS:    'is';

IF:    'if';

ELSE:    'else';

WHILE:    'while';

IN:    'in';

DO:    'do';

SWITCH:    'switch';

CASE:    'case';

DEFAULT:    'default';

RETHROW:    'rethrow';

TRY:    'try';

ON:    'on';

CATCH:    'catch';

FINALLY:    'finally';

RETURN:    'return';

BREAK:    'break';

CONTINUE:    'continue';

YIELD:    'yield';

SHOW:    'show';

HIDE:    'hide';

OF:    'of'    ;

ASSERT:    'assert';

MATERIALAPP:'MaterialApp';

GMA:'GetMaterialApp';

GET1:'Get';

TO:'to';

OFF:'off';

HOME: 'home';

VAR_NAME: [a-zA-Z_] [a-zA-Z_0-9]*;

STRING_OPEN
    : '\'' -> pushMode(STRING)
    ;

mode STRING;
STRING_VAL
    :.*? ~ [']*
    ;

STRING_CLOSE
    : '\'' -> popMode
    ;

PRACET:
'{'->pushMode(PR);
mode PR;
CLOSE_PRACET:
'}'->popMode;



fragment
LETTER
    :    'a' .. 'z'
+    |    'A' .. 'Z'
+    ;

fragment
DIGIT
    :    '0' .. '9'+    ;

fragment
EXPONENT
    :    ('e' | 'E') ('+' | '-')? DIGIT+
    ;

fragment
HEX_DIGIT
    :    ('a' | 'b' | 'c' | 'd' | 'e' | 'f')
+    |    ('A' | 'B' | 'C' | 'D' | 'E' | 'F')
+    |    DIGIT
+    ;






NUMBER
    :    DIGIT+ ('.' DIGIT+)? EXPONENT?
    |    '.' DIGIT+ EXPONENT?
    ;

HEX_NUMBER
    :    '0x' HEX_DIGIT+
    |    '0X' HEX_DIGIT+
    ;


/* unused?
+ESCAPE_SEQUENCE
+    :    '$\backslash$ n'
+    |    '$\backslash$ r'
+    |    '$\backslash$ f'
+    |    '$\backslash$ b'
+    |    '$\backslash$ t'
+    |    '$\backslash$ v'
+    |    '$\backslash$ x' HEX_DIGIT HEX_DIGIT
+    |    '$\backslash$ u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
+    |    '$\backslash$ u{' HEX_DIGIT_SEQUENCE '}'
+    ;
+
+HEX_DIGIT_SEQUENCE
+    :    HEX_DIGIT HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT? HEX_DIGIT?
+    ;
+*/

fragment
StringContentDQ
    :    ~('\\' | '"' | '$' | '\r' | '\n')
+    |    '\\' ~('\r' | '\n')
+    |    StringInterpolation
+    ;

fragment
StringContentSQ
    :    ~('\\' | '\'' | '$' |  '\r' | '\n')
+    |    '\\' ~( '\r' | '\n')
+    |    StringInterpolation
+    ;

/*
+StringContentTDQ
+    :    ~('\\' | '\"\"\"' | '$')
+    |    StringInterpolation
+    ;
+
+StringContentTSQ
+    :    ~('\\' | '\'\'\'' | '$')
+    |    StringInterpolation
+    ;
+*/

fragment
StringInterpolation
    :    '$' IDENTIFIER_NO_DOLLAR/*
+    |    '$' '{' expression '}' TODO*/
+    ;

SingleLineString
    :    '"' StringContentDQ* '"'
+    |    '\'' StringContentSQ* '\''
+    |    'r' '\'' (~('\'' | '\r' | '\n'))* '\''
+    |    'r' '"' (~('"' | '\r' | '\n'))* '"'
+    ;

MultilineString
    :    '"""' /*stringContentTDQ* TODO*/ '"""'
+    |    '\'\'\'' /*stringContentTSQ* TODO*/ '\'\'\''
+    |    'r' '"""' /*(~'\"\"\"')* TODO*/ '"""'
+    |    'r' '\'\'\'' /*(~'\'\'\'')* TODO*/ '\'\'\''
+    ;

fragment
IDENTIFIER_START_NO_DOLLAR
    :    LETTER
+    |    '_'
+    ;

fragment
IDENTIFIER_PART_NO_DOLLAR
    :    IDENTIFIER_START_NO_DOLLAR
+    |    DIGIT
+    ;

IDENTIFIER_NO_DOLLAR
    :    IDENTIFIER_START_NO_DOLLAR IDENTIFIER_PART_NO_DOLLAR*
    ;

fragment
IDENTIFIER_START
    :    IDENTIFIER_START_NO_DOLLAR
+    |    '$'
+    ;

fragment
IDENTIFIER_PART
    :    IDENTIFIER_START
+    |    DIGIT
+    ;

IDENTIFIER
    :    IDENTIFIER_START IDENTIFIER_PART*
    ;

