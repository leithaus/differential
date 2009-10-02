package com.biosimilarity.reflection.lib.ddl.tbldecl; // Java Package generated by the BNF Converter.

public abstract class TableDecl implements java.io.Serializable {
  public abstract <R,A> R accept(TableDecl.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.AnnotatedTblDecl p, A arg);
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.TblDecl p, A arg);

  }

}
