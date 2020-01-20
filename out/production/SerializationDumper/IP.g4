grammar IP;

file: ip+ (MARKER ip)* ;
ip: BYTE BYTE BYTE BYTE ;
MARKER : '\u00CA' '\u00FE' ;
BYTE : '\u0000'..'\u00FF' ;

