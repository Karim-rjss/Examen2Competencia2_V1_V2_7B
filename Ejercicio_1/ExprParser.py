# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,39,10,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,0,0,2,0,2,0,0,
        7,0,4,1,0,0,0,2,7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,
        8,5,0,0,1,8,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'class'", "'static'", "'void'", 
                     "'String'", "'int'", "'double'", "'Boolean'", "'Array'", 
                     "'objetos'", "'Scanner'", "'get'", "'set'", "'for'", 
                     "'while'", "'do'", "'if'", "'else'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'+'", "'-'", "'>'", "'<'", "'>='", "'<='", 
                     "'*'", "'/'", "'='", "'{'", "'}'", "'['", "']'", "'('", 
                     "')'", "'.'", "';'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "CLASS", "STATIC", "VOID", 
                      "STRING", "INT", "DOUBLE", "BOOLEAN", "ARRAY", "OBJ", 
                      "SCANNER", "GET", "SET", "FOR", "WHILE", "DO", "IF", 
                      "ELSE", "ID", "NUM", "CADENA", "MAS", "MENOS", "MAYOR", 
                      "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", "POR", "ENTRE", 
                      "IGUAL", "LLAVE_IZQ", "LLAVE_DER", "CORCH_IZQ", "CORCH_DER", 
                      "PAR_IZQ", "PAR_DER", "PUNTO", "PUNTO_COMA", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    CLASS=2
    STATIC=3
    VOID=4
    STRING=5
    INT=6
    DOUBLE=7
    BOOLEAN=8
    ARRAY=9
    OBJ=10
    SCANNER=11
    GET=12
    SET=13
    FOR=14
    WHILE=15
    DO=16
    IF=17
    ELSE=18
    ID=19
    NUM=20
    CADENA=21
    MAS=22
    MENOS=23
    MAYOR=24
    MENOR=25
    MAYOR_IGUAL=26
    MENOR_IGUAL=27
    POR=28
    ENTRE=29
    IGUAL=30
    LLAVE_IZQ=31
    LLAVE_DER=32
    CORCH_IZQ=33
    CORCH_DER=34
    PAR_IZQ=35
    PAR_DER=36
    PUNTO=37
    PUNTO_COMA=38
    WS=39

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





