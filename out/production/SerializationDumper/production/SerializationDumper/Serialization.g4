grammar Serialization;




STREAM_MAGIC: '\u00AC' '\u00ED';
STREAM_VERSION: '\u0000' '\u0005';


stream:
  magic version contents;

contents:
  .*;

magic:
  STREAM_MAGIC;

 version:
  STREAM_VERSION;

// TESTE OF GRAMMAR

//file : ip+ (MARKER ip)* ;
//
//ip : BYTE BYTE BYTE BYTE ;
//
//MARKER : '\u00CA' '\u00FE' ;
//BYTE : '\u0000'..'\u00FF' ;

//final static short STREAM_MAGIC = (short)0xaced;
//    final static short STREAM_VERSION = 5;
//    final static byte TC_NULL = (byte)0x70;
//    final static byte TC_REFERENCE = (byte)0x71;
//    final static byte TC_CLASSDESC = (byte)0x72;
//    final static byte TC_OBJECT = (byte)0x73;
//    final static byte TC_STRING = (byte)0x74;
//    final static byte TC_ARRAY = (byte)0x75;
//    final static byte TC_CLASS = (byte)0x76;
//    final static byte TC_BLOCKDATA = (byte)0x77;
//    final static byte TC_ENDBLOCKDATA = (byte)0x78;
//    final static byte TC_RESET = (byte)0x79;
//    final static byte TC_BLOCKDATALONG = (byte)0x7A;
//    final static byte TC_EXCEPTION = (byte)0x7B;
//    final static byte TC_LONGSTRING = (byte) 0x7C;
//    final static byte TC_PROXYCLASSDESC = (byte) 0x7D;
//    final static byte TC_ENUM = (byte) 0x7E;
//    final static  int   baseWireHandle = 0x7E0000;