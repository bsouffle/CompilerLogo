grammar Logo; 

@header {
  package logoparsing;
}

INT : '0'|('-')?'0'[.][0-9]+|('-')?[1-9][0-9]*|('-')?[1-9][0-9]*[.][0-9]+;
COLOR : [0-7] ;
WS : [ \t\r\n]+ -> skip ;
VARIABLE_AFF :'"'[a-zA-Z][a-zA-Z0-9]*;
VARIABLE_VAL :':'[a-zA-Z][a-zA-Z0-9]*;

programme : 
	(bloc)+
;

alternative :
	('[' (bloc)+ ']')?
;

bloc :
	liste_instructions #instr
	| 'REPETE' expression '[' (bloc)+ ']' #REPETEFOR
	| 'SI' bool '[' (bloc)+ ']' alternative  #if
	| 'TANTQUE' bool '[' (bloc)+ ']' #tantque
;


liste_instructions :
  (instruction)+    
;

instruction :
  'DONNE' VARIABLE_AFF expression #affectNum
  | 'DONNE' VARIABLE_AFF bool #affectBool  
  | instruction_unaire #instrUnaire
  | ('bc'|'BC'|'BAISSECRAYON'|'baissecrayon') # bc
  | ('lc'|'LC'|'LEVECRAYON'|'levecrayon') # lc
  | ('ve'|'VE'|'NETTOIE'|'nettoie') # ve
  | ('fpos'|'FPOS') '[' expression expression ']' # fpos
;

instruction_unaire:
      ('av'|'AV' |'avance'|'AVANCE') expression # av
    | ('td'|'TD'|'DR'|'dr'|'DROITE'|'droite') expression # td
    | ('tg'|'TG'|'GA'|'ga'|'GAUCHE'|'gauche') expression # tg
    | ('re'|'RE'|'REC'|'rec'|'RECULE'|'recule') expression # re
	| ('fcc'|'FCC'|'COULEUR'|'couleur') expression # fcc
    | ('fcap'|'FCAP'|'FIXECAP'|'fixecap') expression # fcap
;

bool :
	bool '&' bool #andBool
  | bool '|' bool #orBool
  | '!' bool #notBool
  | expression '=' expression #expsEqual
  | expression '!=' expression #expsDiff
  | expression '<=' expression #expsLoEq
  | expression '<' expression #expsLo
  | expression '>=' expression #expsHiEq
  | expression '>' expression #expsHi
  | VARIABLE_VAL # varBool
  | expression #expsBool
  | 'true' # true
  | 'false' # false
  | '('bool')' #parBool
  ;
  
expression :
	'LOOP' #Iteration
	| 'CAP' # cap
	| ('hasard'|'HASARD') expression #hasard
	| expression'*'expression # mult
	| expression'/'expression # div
	| expression'+'expression # add 
	| expression'-'expression # sous
	| ('SOMME'|'somme') expression expression #somme
	| ('DIFF'|'diff') expression expression #diff
	| ('PROD'|'prod'|'produit'|'PRODUIT') expression expression #prod
	| ('QUOT'|'quot'|'quotient'|'QUOTIENT') expression expression #quot
	| ('RESTE'|'reste') expression expression #reste
	| ('RC'|'rc'|'RAC'|'rac'|'sqrt'|'SQRT') expression #racine
	| ('ENT'|'ent'|'FLOOR'|'floor') expression #partieEntiere
	| ('sin'|'SIN') expression #sinus
	| ('cos'|'COS') expression #cosinus
	| ('tan'|'TAN') expression #tangeante
	| INT # int
	| VARIABLE_VAL # varExp
	| '('expression')' # par
;
