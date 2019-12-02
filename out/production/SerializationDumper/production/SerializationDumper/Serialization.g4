grammar Serialization;


// Literals (extracted from original Java's language)
BYTE : '\u0000'..'\u00FF';
SHORT: BYTE BYTE;
DOUBLE: BYTE BYTE BYTE BYTE;



// Constants
STREAM_MAGIC: '\u00AC' '\u00ED';
STREAM_VERSION: '\u0000' '\u0005';
TC_RESET: '\u0079';
TC_NULL: '\u0070';
TC_REFERENCE: '\u0071';
TC_CLASSDESC: '\u0072';
TC_OBJECT: '\u0073';
TC_STRING: '\u0074';
TC_ARRAY: '\u0075';
TC_CLASS: '\u0076';
TC_BLOCKDATA: '\u0077';
TC_ENDBLOCKDATA: '\u0078';
TC_BLOCKDATALONG: '\u007A';
TC_EXCEPTION: '\u007B';
TC_LONGSTRING: '\u007C';
TC_PROXYCLASSDESC: '\u007D';
TC_ENUM: '\u007E';
baseWireHandle:   '\u0000' '\u007E' '\u0000' '\u0000';

stream:
  magic version contents;

contents:
  | content
  | contents content;

 content:
  | object
  | blockdata;

 object:
  | newObject
  | newClass
  | newArray
  | newString
  | newEnum
  | newClassDesc
  | prevObject
  | nullReference
  | exception
  | TC_RESET;

 newClass:
  TC_CLASS classDesc newHandle;

 classDesc:
  | newClassDesc
  | nullReference
  | (ClassDesc)prevObject;      // an object required to be of type
                             // ClassDesc

 superClassDesc:
  classDesc;

 newClassDesc:
  | TC_CLASSDESC className serialVersionUID newHandle classDescInfo
  | TC_PROXYCLASSDESC newHandle proxyClassDescInfo;
 classDescInfo:
  classDescFlags fields classAnnotation superClassDesc;

 className:
  STRING_LITERAL;

 serialVersionUID:
  DECIMAL_LITERAL;
//
// classDescFlags:
//  (byte)                  // Defined in Terminal Symbols and
//                            // Constants
//
// proxyClassDescInfo:
//  (int)<count> proxyInterfaceName[count] classAnnotation
//      superClassDesc;
// proxyInterfaceName:
//   (utf);
// fields:
//  (short)<count>  fieldDesc[count];
//
// fieldDesc:
//  primitiveDesc
//  objectDesc
//
// primitiveDesc:
//  prim_typecode fieldName;
//
// objectDesc:
//  obj_typecode fieldName className1;
//
// fieldName:
//  (utf);
//
// className1:
//  (String)object;             // String containing the field's type,
//                             // in field descriptor format
// classAnnotation:
//  endBlockData
//  contents endBlockData;      // contents written by annotateClass
//
// prim_typecode:
//  'B'       // byte
//  | 'C'       // char
//  | 'D'       // double
//  | 'F'       // float
//  | 'I'       // integer
//  | 'J'       // long
//  | 'S'       // short
//  | 'Z';       // boolean
//
// obj_typecode:
//  '['   // array
//  'L';       // object
//
// newArray:
//  TC_ARRAY classDesc newHandle (int)<size> values[size]
//
// newObject:
//  TC_OBJECT classDesc newHandle classdata[]  // data for each class
//
// classdata:
//  nowrclass                 // SC_SERIALIZABLE & classDescFlag &&
//                            // !(SC_WRITE_METHOD & classDescFlags)
//  wrclass objectAnnotation  // SC_SERIALIZABLE & classDescFlag &&
//                            // SC_WRITE_METHOD & classDescFlags
//  externalContents          // SC_EXTERNALIZABLE & classDescFlag &&
//                            // !(SC_BLOCKDATA  & classDescFlags
//  objectAnnotation          // SC_EXTERNALIZABLE & classDescFlag&&
//                            // SC_BLOCKDATA & classDescFlags
//
// nowrclass:
//  values                    // fields in order of class descriptor
//
// wrclass:
//  nowrclass
//
// objectAnnotation:
//  endBlockData
//  contents endBlockData     // contents written by writeObject
//                            // or writeExternal PROTOCOL_VERSION_2.
//
// blockdata:
//  blockdatashort
//  blockdatalong
//
// blockdatashort:
//  TC_BLOCKDATA (unsigned byte)<size> (byte)[size]
//
// blockdatalong:
//  TC_BLOCKDATALONG (int)<size> (byte)[size]
//
// endBlockData   :
//  TC_ENDBLOCKDATA
//
// externalContent:          // Only parseable by readExternal
//  ( bytes)                // primitive data
//    object
//
// externalContents:         // externalContent written by
//  externalContent         // writeExternal in PROTOCOL_VERSION_1.
//  externalContents externalContent
//
// newString:
//  TC_STRING newHandle (utf)
//  TC_LONGSTRING newHandle (long-utf)
//
// newEnum:
//  TC_ENUM classDesc newHandle enumConstantName
// enumConstantName:
//  (String)object
// prevObject
//  TC_REFERENCE (int)handle
//
// nullReference
//  TC_NULL
//
// exception:
//  TC_EXCEPTION reset (Throwable)object         reset
//
magic:
  STREAM_MAGIC;

 version:
  STREAM_VERSION;
//
//
// values:          // The size and types are described by the
//                 // classDesc for the current object
//
// newHandle:       // The next number in sequence is assigned
//                 // to the object being serialized or deserialized
//
// reset:           // The set of known objects is discarded
//                 // so the objects of the exception do not
//                 // overlap with the previously sent objects
//                 // or with objects that may be sent after
//                 // the exception
//
//// TESTE OF GRAMMAR
//
////file : ip+ (MARKER ip)* ;
////
////ip : BYTE BYTE BYTE BYTE ;
////
////MARKER : '\u00CA' '\u00FE' ;
////BYTE : '\u0000'..'\u00FF' ;
//
