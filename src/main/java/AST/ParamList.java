/*
    José Vitor Novaes Santos                RA: 743556
    Marcus Vinicius Natrielli Garcia        RA: 743578
    Victor Fernandes de Oliveira Brayner    RA: 743600
*/

package AST;

import java.io.*;
import java.util.*;

public class ParamList {

    ArrayList<Param> v;

    public ParamList() {
        v = new ArrayList<Param>();
    }

    public void addElement(Param parameter) {
        v.add(parameter);
    }

    public int getSize() {
        return v.size();
    }

    public Enumeration elements() {
        Enumeration e = Collections.enumeration(v);
        return e;
    }

    public ArrayList<Param> getParamList() {
        return v;
    }

    public void genC(PW pw) {
        // Parameter p;
        // Iterator e = v.iterator();
        // int size = v.size();
        // while(e.hasNext()){
        // p = (Parameter) e.next();
        // pw.out.print(p.getType().getCname() + " " + p.getName());

        // if(--size > 0)
        // pw.out.print(", ");
        // }
    }

}