/*
    Cyril Iseli, Marco RODRIGUES
    
    Janvier 2017

    Fichier flex qui va envoyer au fichier cup
    les symboles terminaux
*/

import java_cup.runtime.*;
import java.util.Vector;


%%
%class Lexer
%line
%column
%cup

%{

    public int getLine(){
        return yyline+1;
    }

    public void yyerror() {
          System.out.println("error line " +yyline + " column " +yycolumn
          + " " +yytext());
    }

    //Modifie un chaine de caractère pour retourner seulement les lettres
    public String getName(String text){
        return text.replaceAll("[^A-Z]","");
    }

%}

%%

//Envoie au cup
programme  	{ /*System.out.println("sym.PROGRAMME");*/ return new Symbol(sym.PROGRAMME) ; }
debutprg  	{ /*System.out.println("sym.DEBUT_PRG");*/ return new Symbol(sym.DEBUT_PRG) ; }
finprg  	{ /*System.out.println("sym.FIN_PRG");*/ return new Symbol(sym.FIN_PRG) ; }
;       	{ /*System.out.println("sym.POINT_VIRGULE");*/ return new Symbol(sym.POINT_VIRGULE) ; }
,         	{ /*System.out.println("sym.VIRGULE");*/ return new Symbol(sym.VIRGULE) ; }
=         	{ /*System.out.println("sym.EGAL");*/ return new Symbol(sym.EGAL) ; }
constante  	{ /*System.out.println("sym.CONSTANTE");*/ return new Symbol(sym.CONSTANTE) ; }
\(         	{ /*System.out.println("sym.PARENTHESE_OUVRANTE");*/ return new Symbol(sym.PARENTHESE_OUVRANTE) ; }
\)         	{ /*System.out.println("sym.PARENTHESE_FERMANTE");*/ return new Symbol(sym.PARENTHESE_FERMANTE) ; }
debutfonc  	{ /*System.out.println("sym.DEBUT_FONC");*/ return new Symbol(sym.DEBUT_FONC) ; }
finfonc  	{ /*System.out.println("sym.FIN_FONC");*/ return new Symbol(sym.FIN_FONC) ; }
entier      { /*System.out.println("sym.ENTIER");*/ return new Symbol(sym.ENTIER) ; }
booleen    	{ /*System.out.println("sym.BOOLEEN");*/ return new Symbol(sym.BOOLEEN) ; }
\[         	{ /*System.out.println("sym.CROCHET_OUVRANT");*/ return new Symbol(sym.CROCHET_OUVRANT) ; }
\]         	{ /*System.out.println("sym.CROCHET_FERMANT");*/ return new Symbol(sym.CROCHET_FERMANT) ; }
\.\.         	{ /*System.out.println("sym.POINT_POINT");*/ return new Symbol(sym.POINT_POINT) ; }
lire      	{ /*System.out.println("sym.LIRE");*/ return new Symbol(sym.LIRE) ; }
ecrire  	{ /*System.out.println("sym.ECRIRE");*/ return new Symbol(sym.ECRIRE) ; }
retourne  	{ /*System.out.println("sym.RETOURNE");*/ return new Symbol(sym.RETOURNE) ; }
si       	{ /*System.out.println("sym.SI");*/ return new Symbol(sym.SI) ; }
alors       { /*System.out.println("sym.ALORS");*/ return new Symbol(sym.ALORS) ; }
sinon       { /*System.out.println("sym.SINON");*/ return new Symbol(sym.SINON) ; }
finsi  	    { /*System.out.println("sym.FIN_SI");*/ return new Symbol(sym.FIN_SI) ; }
tantque    	{ /*System.out.println("sym.TANT_QUE");*/ return new Symbol(sym.TANT_QUE) ; }
faire       { /*System.out.println("sym.FAIRE");*/ return new Symbol(sym.FAIRE) ; }
fintantque  { /*System.out.println("sym.FIN_TANT_QUE");*/ return new Symbol(sym.FIN_TANT_QUE) ; }
pour        { /*System.out.println("sym.POUR");*/ return new Symbol(sym.POUR) ; }
allantde  	{ /*System.out.println("sym.ALLANT_DE");*/ return new Symbol(sym.ALLANT_DE) ; }
a    	    { /*System.out.println("sym.A");*/ return new Symbol(sym.A) ; }
finpour     { /*System.out.println("sym.FIN_POUR");*/ return new Symbol(sym.FIN_POUR) ; }
vrai        { /*System.out.println("sym.VRAI");*/ return new Symbol(sym.VRAI) ; }
faux        { /*System.out.println("sym.FAUX");*/ return new Symbol(sym.FAUX) ; }
\+  	        { /*System.out.println("sym.PLUS");*/ return new Symbol(sym.PLUS) ; }
-    	    { /*System.out.println("sym.MOINS");*/ return new Symbol(sym.MOINS) ; }
\*           { /*System.out.println("sym.FOIS");*/ return new Symbol(sym.FOIS) ; }
\/           { /*System.out.println("sym.DIVISER");*/ return new Symbol(sym.DIVISER) ; }
==          { /*System.out.println("sym.EGAL_EGAL");*/ return new Symbol(sym.EGAL_EGAL) ; }
\<\>  	    { /*System.out.println("sym.DIFFERENT");*/ return new Symbol(sym.DIFFERENT) ; }
\<   	    { /*System.out.println("sym.PLUS_PETIT");*/ return new Symbol(sym.PLUS_PETIT) ; }
\>           { /*System.out.println("sym.PLUS_GRAND");*/ return new Symbol(sym.PLUS_GRAND) ; }
\<=          { /*System.out.println("sym.PLUS_PETIT_OU_EGAL");*/ return new Symbol(sym.PLUS_PETIT_OU_EGAL) ; }
\>=          { /*System.out.println("sym.PLUS_GRAND_OU_EGAL");*/ return new Symbol(sym.PLUS_GRAND_OU_EGAL) ; }
et  	    { /*System.out.println("sym.ET");*/ return new Symbol(sym.ET) ; }
ou   	    { /*System.out.println("sym.OU");*/ return new Symbol(sym.OU) ; }
\~  	        { /*System.out.println("sym.TILDE");*/ return new Symbol(sym.TILDE) ; }
non   	    { /*System.out.println("sym.NON");*/ return new Symbol(sym.NON) ; }
[a-zA-Z][a-zA-Z0-9]* { /*System.out.println("sym.IDENT " + yytext());*/ return new Symbol(sym.IDENT, yytext()) ; }
[0-9]+ { /*System.out.println("sym.CONSTANTE_ENT " + yytext());*/ return new Symbol(sym.CONSTANTE_ENT, Integer.valueOf(yytext())) ; }
\".*\" { /*System.out.println("sym.CONSTANTE_CHAINE " + yytext());*/ return new Symbol(sym.CONSTANTE_CHAINE, yytext()) ; }

/* -------------------------------------------------
	Caracteres non pris en compte
   ------------------------------------------------- */

[\ |\t|\n|\r|\r\n]                  {}
