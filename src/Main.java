import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {

    public static void main(String [] args) throws Exception{
        SLLexer lexer = new SLLexer(CharStreams.fromFileName("input/input.txt"));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SLParser parser = new SLParser(tokens);
        ParseTree tree = parser.s();

        SLLangVisitor loader = new SLLangVisitor();
        loader.visit(tree);
    }
}
