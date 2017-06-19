/*
    Cyril Iseli, Marco RODRIGUES
    
    Janvier 2017

    Fichier flex qui va envoyer au fichier cup
    les symboles terminaux
*/

import java.util.Vector;


%%
%class Lexer
%line
%column
%standalone

%{

public void yyerror() {
      System.out.println("error line " +yyline + " column " +yycolumn
      + " " +yytext());
}

//Modifie un chaine de caractère pour retrouner seulement les lettres
public String getName(String text){
	return text.replaceAll("[^A-Z]","");
}


%}

%%

//Envoie au cup
programme  	{ System.out.println("sym.PROGRAMME"); }
debutprg  	{ System.out.println("sym.DEBUT_PRG"); }
finprg  	{ System.out.println("sym.FIN_PRG"); }
;       	{ System.out.println("sym.POINT_VIRGULE"); }
,         	{ System.out.println("sym.VIRGULE"); }
=         	{ System.out.println("sym.EGAL"); }
constante  	{ System.out.println("sym.CONSTANTE"); }
\(         	{ System.out.println("sym.PARENTHESE_OUVRANTE"); }
\)         	{ System.out.println("sym.PARENTHESE_FERMANTE"); }
debutfonc  	{ System.out.println("sym.DEBUT_FONC"); }
finfonc  	{ System.out.println("sym.FIN_FONC"); }
entier      { System.out.println("sym.ENTIER"); }
boolean    	{ System.out.println("sym.BOOLEEN"); }
\[         	{ System.out.println("sym.CROCHET_OUVRANT"); }
\]         	{ System.out.println("sym.CROCHET_FERMANT"); }
\.\.         	{ System.out.println("sym.POINT_POINT"); }
lire      	{ System.out.println("sym.LIRE"); }
ecrire  	{ System.out.println("sym.ECRIRE"); }
retourne  	{ System.out.println("sym.RETOURNE"); }
si       	{ System.out.println("sym.SI"); }
alors       { System.out.println("sym.ALORS"); }
sinon       { System.out.println("sym.SINON"); }
finsi  	    { System.out.println("sym.FIN_SI"); }
tantque    	{ System.out.println("sym.TANT_QUE"); }
faire       { System.out.println("sym.FAIRE"); }
fintantque  { System.out.println("sym.FIN_TANT_QUE"); }
pour        { System.out.println("sym.POUR"); }
allantde  	{ System.out.println("sym.ALLANT_DE"); }
a    	    { System.out.println("sym.A"); }
finpour     { System.out.println("sym.FIN_POUR"); }
vrai        { System.out.println("sym.VRAI"); }
faux        { System.out.println("sym.FAUX"); }
\+  	        { System.out.println("sym.PLUS"); }
-    	    { System.out.println("sym.MOINS"); }
\*           { System.out.println("sym.FOIS"); }
\/           { System.out.println("sym.DIVISER"); }
==          { System.out.println("sym.EGAL_EGAL"); }
\<\>  	    { System.out.println("sym.DIFFERENT"); }
\<   	    { System.out.println("sym.PLUS_PETIT"); }
\>           { System.out.println("sym.PLUS_GRAND"); }
\<=          { System.out.println("sym.PLUS_PETIT_OU_EGAL"); }
\>=          { System.out.println("sym.PLUS_GRAND_OU_EGAL"); }
et  	    { System.out.println("sym.ET"); }
ou   	    { System.out.println("sym.OU"); }
\~  	        { System.out.println("sym.TILDE"); }
non   	    { System.out.println("sym.NON"); }
[a-zA-Z][a-zA-Z0-9]* { System.out.println("sym.IDENT," + yytext()); }
[0-9]+ { System.out.println("sym.CONSTANTE_ENT" + yytext()); }
\".*\" { System.out.println("sym.CONSTANTE_CHAINE" + yytext()); }

/* -------------------------------------------------
	Caracteres non pris en compte
   ------------------------------------------------- */

[\ |\t|\n|\r|\r\n]                  {}
