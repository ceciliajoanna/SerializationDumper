import com.sun.xml.internal.xsom.XSUnionSimpleType;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * @author jds5109 - jds5109 -at-rit.edu
 */
public class WriteBinaryFile {
    public static final byte[] bytes = {
            (byte)172, 0, 0, 1, (byte)0xCA, (byte)0xFE,
            (byte)10, 10, 10, 1, (byte)0xCA, (byte)0xFE,
            (byte)10, 10, 10, 99
    };

    public static void main(String[] args) throws IOException {
        String filename = "/Users/jds5109/Desktop/transfer/ToyAppSimple/malicious_obj_vulnerable.txt";//"ips.txt";
//        Files.write(new File(filename).toPath(), bytes);

        CharStream bytesAsChar = CharStreams.fromFileName(filename, StandardCharsets.ISO_8859_1);
        SerializationLexer lexer = new SerializationLexer(bytesAsChar);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SerializationParser parser = new SerializationParser(tokens);
        ParseTree tree = parser.stream();
        SerializationBaseListener listener = new SerializationBaseListener(){
            @Override public void exitStream(SerializationParser.StreamContext ctx) {
                System.out.println("exitStream");
                System.out.println();
            }
            @Override public void exitMagic(SerializationParser.MagicContext ctx) {

                System.out.println("exitMagic");

                for(byte b: ctx.STREAM_MAGIC().getText().getBytes(StandardCharsets.ISO_8859_1))
                System.out.print(String.format("%02x ", b).toUpperCase());
                System.out.println();
            }

            @Override public void exitVersion(SerializationParser.VersionContext ctx) {
                System.out.println("exitVersion");
                for(byte b: ctx.STREAM_VERSION().getText().getBytes())
                    System.out.print(String.format("%02x ", b).toUpperCase());
                System.out.println();
            }
        };
        ParseTreeWalker.DEFAULT.walk(listener, tree);


    }
}