parser grammar dartParser;

options { tokenVocab=dartLexer; }
prog : (file_syntax | function  )+ EOF;

file_syntax:  declear_var ;

declear_var:  TYPE?  VAR_NAME  (EQUAL  val )?( COLON  VAR_NAME  (EQUAL  val )?)*SIMICOLON;

string_val:  STRING_OPEN STRING_VAL? STRING_CLOSE ;

val: string_val |NUM_VAL |BOOL_VAL|VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR;

ifdart:
VAR_NAME EQUAL EQUAL string_val Q_MARK widget D_DOT widget;

arguments: OPEN_HEAD OPEN_BODY  argument (COLON argument)* CLOSE_BODY CLOSE_HEAD SIMICOLON;
argument: REQUIRED? TYPE?  VAR_NAME  ;
block:OPEN_BODY  declear_var*  CLOSE_BODY;

constructor: VAR_NAME arguments ;

function:(TYPE|VOID)  VAR_NAME   arguments*   block;

for:
FOR OPEN_HEAD TYPE VAR_NAME EQUAL val SIMICOLON
VAR_NAME OPERATION  val SIMICOLON VAR_NAME OPERATION CLOSE_HEAD
OPEN_BODY declear_var? CLOSE_BODY;

//FLUTTER BUILDER PROJECT//
flutter : imporT* main  list* class+ ;

//import//
imporT:IMPORT  string_val SIMICOLON;
/////////////////////////////
class:class_less|class_full;
// MAIN FUNCTION //
main:VOID MAIN OPEN_HEAD CLOSE_HEAD OPEN_BODY runapp CLOSE_BODY ;

runapp:RUNAPP OPEN_HEAD VAR_NAME OPEN_HEAD CLOSE_HEAD CLOSE_HEAD SIMICOLON;
///////////////////////////

// CLASSES //


class_less:CLASS  VAR_NAME  EXTENDS  LESS OPEN_BODY declear_var* constructor? OVERRIDE build CLOSE_BODY;
class_full:class_full1 class_full2 ;
class_full1:CLASS VAR_NAME  EXTENDS  FULL OPEN_BODY const? OVERRIDE state CLOSE_BODY ;

const:CONST VAR_NAME OPEN_HEAD OPEN_BODY KEY Q_MARK KEY CLOSE_BODY CLOSE_HEAD
      D_DOT SUPER OPEN_HEAD KEY D_DOT KEY CLOSE_HEAD SIMICOLON;

state:STATE  BIGER VAR_NAME SMALLER CREATSTATE OPEN_HEAD CLOSE_HEAD Return VAR_NAME OPEN_HEAD CLOSE_HEAD SIMICOLON
;

class_full2:CLASS  VAR_NAME  EXTENDS STATE  BIGER VAR_NAME SMALLER OPEN_BODY declear_var* constructor?
 OVERRIDE initstate OVERRIDE build CLOSE_BODY;

initstate:
VOID INITSTATE OPEN_HEAD CLOSE_HEAD OPEN_BODY SUPER DOT INITSTATE OPEN_HEAD CLOSE_HEAD SIMICOLON CLOSE_BODY ;

build:WIDGET BUILD  OPEN_HEAD BUILDCONTEXT CONTEXT CLOSE_HEAD OPEN_BODY RETURN widget SIMICOLON CLOSE_BODY;
//////////////////////////////////////////////////////////////////////////

// WIDGETS//

widget: text|image|column|row|scaffold|materialapp|container|listview|expanded|gestureDetector|padding|sizedbox;


child:CHILD D_DOT widget;

//MaterialApp Declerationa and components//
materialapp:GMA OPEN_HEAD (title COLON)? (theme COLON)? (debugshowmode COLON)? home CLOSE_HEAD;
//get.to(name())
navigate_screen:GET1 DOT (TO|OFF) OPEN_HEAD VAR_NAME OPEN_HEAD (VAR_NAME D_DOT (val) (COLON VAR_NAME D_DOT (val))*)? CLOSE_HEAD CLOSE_HEAD SIMICOLON  ;
home:HOME D_DOT VAR_NAME OPEN_HEAD CLOSE_HEAD ;
title:TITLE D_DOT string_val;
theme:THEME D_DOT ThemeData OPEN_HEAD PrimarySwatch D_DOT colors COLON  CLOSE_HEAD ;
debugshowmode:DEBUGSHOWMODE D_DOT BOOL_VAL ;
////////////////////////////////////////////

column:COLUMN  OPEN_HEAD (MAINAXIS MAINAXIS1 DOT CENTER COLON)? children  CLOSE_HEAD;
row:ROW OPEN_HEAD children CLOSE_HEAD;
children:CHIS D_DOT  OPEN_PR ((ifdart(COLON widget COLON ifdart)*)?|( widget  (COLON widget)*)?)CLOSE_PR;

text:TEXT OPEN_HEAD
(
string_val|
VAR_NAME |
VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR
)  CLOSE_HEAD ;
//image:IMAGE ASSET   OPEN_HEAD  ( string_val|( OPEN_HEAD VAR_NAME CLOSE_HEAD |
//VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR|VAR_NAME) ) (COLON FIT BOXFIT DOT FILL)? CLOSE_HEAD ;

image : IMAGE ASSET   OPEN_HEAD  ( string_val| VAR_NAME |
VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR)  (COLON FIT BOXFIT DOT FILL)? CLOSE_HEAD ;
////////////////////////////////////////////////////////////
//SCAFFOLD//
scaffold:SCAFFOLD OPEN_HEAD (appbar  COLON) ?  body  CLOSE_HEAD;
appbar:APPBAR2 D_DOT APPBAR OPEN_HEAD (BACK  D_DOT colors)? CLOSE_HEAD;
body:BODY D_DOT widget ;
/////////////////////////////////
padding1:
PADDING1 EDGE ALL OPEN_HEAD NUM_VAL CLOSE_HEAD;
padding:PADDING OPEN_HEAD  padding1  (COLON child)? CLOSE_HEAD;
expanded:EXPANDED OPEN_HEAD child  CLOSE_HEAD;
//sizedbox: SIZEDBOX OPEN_HEAD ( (hieght COLON)? (width?)) |((width COLON)? (hieght?))  CLOSE_HEAD ;
sizedbox: SIZEDBOX OPEN_HEAD (hieght|width) (COLON (hieght|width))? CLOSE_HEAD ;
hieght: HEIGHT D_DOT NUM_VAL;
width: WIDTH D_DOT NUM_VAL;


//LISTVIEW DECLERATION AND COMPONENET//
listview:LISTVIEW DOT SEPARATED OPEN_HEAD
(itb widget COLON sb  widget COLON ic )
CLOSE_HEAD ;

itb:ItemBuilder D_DOT OPEN_HEAD CONTEXT COLON INDEX CLOSE_HEAD Return;
sb:SeparatorBuilder D_DOT OPEN_HEAD CONTEXT COLON INDEX CLOSE_HEAD Return;
ic:ItemCount D_DOT NUM_VAL|ItemCount D_DOT VAR_NAME DOT VAR_NAME;


//CONTAINAR DECLERATION AND COMPONENT//

container:
CONTAINER OPEN_HEAD (padding1 COLON )? child? COLON decoration? CLOSE_HEAD;
//container:
//CONTAINER OPEN_HEAD (padding1 COLON )? (  (child) ?| hieght ?|width? |decoration?
//(child COLON hieght COLON width COLON decoration )?|
//(child COLON  decoration )?
//| (child COLON hieght COLON width  )?
//|(hieght COLON width COLON decoration )?|
//(  hieght COLON decoration )?|
//( width COLON decoration )?|
//(  hieght COLON width )?|
//(   width  COLON hieght  )|
//child?
//) CLOSE_HEAD;


bord_rad:BORDERRADIUS D_DOT BORDER2 DOT CIRCULAR OPEN_HEAD NUM_VAL CLOSE_HEAD
;

///////////////////////////////////////////////////////////////////////

color :COLOR D_DOT colors;
colors:COLORS DOT COL;
decoration: DECORATION D_DOT BD OPEN_HEAD WS*  (color| (color  COLON bord_rad)|bord_rad ) ?WS* CLOSE_HEAD;
//LIST//
list:LIST VAR_NAME EQUAL OPEN_PR object ( COLON object)* CLOSE_PR;
object:OPEN_BODY varible (COLON varible)* CLOSE_BODY;
varible:string_val D_DOT string_val;

//ON_TAP//
gestureDetector:GestureDetector OPEN_HEAD ontap COLON child    CLOSE_HEAD   ;

ontap:ONTAP D_DOT OPEN_HEAD CLOSE_HEAD OPEN_BODY navigate_screen? (setstate)? (function)* CLOSE_BODY   ;

setstate:SETSTATE OPEN_HEAD OPEN_HEAD CLOSE_HEAD OPEN_BODY  setstate1* CLOSE_BODY CLOSE_HEAD SIMICOLON ;

setstate1:
VAR_NAME EQUAL (VAR_NAME OPEN_PR INDEX CLOSE_PR OPEN_PR string_val CLOSE_PR SIMICOLON|VAR_NAME SIMICOLON);


