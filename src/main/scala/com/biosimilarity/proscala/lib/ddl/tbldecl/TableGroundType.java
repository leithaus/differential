package com.biosimilarity.reflection.lib.ddl.tbldecl; // Java Package generated by the BNF Converter.

public abstract class TableGroundType implements java.io.Serializable {
  public abstract <R,A> R accept(TableGroundType.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.TblGrndTypeBool p, A arg);
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.TblGrndTypeInt p, A arg);
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.TblGrndTypeFloat p, A arg);
    public R visit(com.biosimilarity.reflection.lib.ddl.tbldecl.TblGrndTypeStr p, A arg);

  }

}
