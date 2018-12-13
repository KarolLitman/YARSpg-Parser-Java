
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


        CharStream input = CharStreams.fromFileName(args[0]);
        YARSpgLexer lexer = new YARSpgLexer(input);
        YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
        parser.yarspg();
        
    }
}


