import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws RecognitionException, IOException {

        boolean thrown = false;

        CharStream input = CharStreams.fromFileName(args[0]);
        YARSpgLexer lexer = new YARSpgLexer(input);
        YARSpgParser parser = new YARSpgParser(new CommonTokenStream(lexer));
        parser.yarspg();


    }
}


