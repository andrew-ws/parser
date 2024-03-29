package bpl.nodes;
import bpl.TypeChecker;
import bpl.Token;
import bpl.LocalDecList;
import bpl.exceptions.*;
import java.util.HashMap;
public class Declaration extends DeclarationNode {

    public VariableDeclaration vd;
    public FunctionDeclaration fd;
    public Declaration next;

    private Declaration(int line) {
        this.line = line;
        this.kind = DECLARATION;
    }

    public Declaration(int line, VariableDeclaration vd) {
        this(line);
        this.vd = vd;
    }

    public Declaration(int line, FunctionDeclaration fd) {
        this(line);
        this.fd = fd;
    }

    public void printRec(int depth) {
        printDepth(depth);
        System.out.print("Declaration\n");
        if (vd != null) vd.printRec(depth+1);
        if (fd != null) fd.printRec(depth+1);
        if (next != null) next.printRec(depth);
    }
}
