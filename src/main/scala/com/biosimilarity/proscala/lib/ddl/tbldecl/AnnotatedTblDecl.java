package com.biosimilarity.reflection.lib.ddl.tbldecl; // Java Package generated by the BNF Converter.

public class AnnotatedTblDecl extends TableDecl {
  public final TableClassName tableclassname_;
  public final TableTypeDecls tabletypedecls_;
  public final TableStoreName tablestorename_;
  public final TableBody tablebody_;

  public AnnotatedTblDecl(TableClassName p1, TableTypeDecls p2, TableStoreName p3, TableBody p4) { tableclassname_ = p1; tabletypedecls_ = p2; tablestorename_ = p3; tablebody_ = p4; }

  public <R,A> R accept(com.biosimilarity.reflection.lib.ddl.tbldecl.TableDecl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.reflection.lib.ddl.tbldecl.AnnotatedTblDecl) {
      com.biosimilarity.reflection.lib.ddl.tbldecl.AnnotatedTblDecl x = (com.biosimilarity.reflection.lib.ddl.tbldecl.AnnotatedTblDecl)o;
      return this.tableclassname_.equals(x.tableclassname_) && this.tabletypedecls_.equals(x.tabletypedecls_) && this.tablestorename_.equals(x.tablestorename_) && this.tablebody_.equals(x.tablebody_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.tableclassname_.hashCode())+this.tabletypedecls_.hashCode())+this.tablestorename_.hashCode())+this.tablebody_.hashCode();
  }


}
