package com.biosimilarity.reflection.lib.ddl.tbldecl; // Java Package generated by the BNF Converter.

public class TblColCtorMDecl extends TableMthdDecl {
  public final String ident_1, string_2;
  public final TableColumnGTCtor tablecolumngtctor_;
  public final ListTableColumnOption listtablecolumnoption_;

  public TblColCtorMDecl(String p1, TableColumnGTCtor p2, String p3, ListTableColumnOption p4) { ident_1 = p1; tablecolumngtctor_ = p2; string_2 = p3; listtablecolumnoption_ = p4; }

  public <R,A> R accept(com.biosimilarity.reflection.lib.ddl.tbldecl.TableMthdDecl.Visitor<R,A> v, A arg) { return v.visit(this, arg); }

  public boolean equals(Object o) {
    if (this == o) return true;
    if (o instanceof com.biosimilarity.reflection.lib.ddl.tbldecl.TblColCtorMDecl) {
      com.biosimilarity.reflection.lib.ddl.tbldecl.TblColCtorMDecl x = (com.biosimilarity.reflection.lib.ddl.tbldecl.TblColCtorMDecl)o;
      return this.ident_1.equals(x.ident_1) && this.tablecolumngtctor_.equals(x.tablecolumngtctor_) && this.string_2.equals(x.string_2) && this.listtablecolumnoption_.equals(x.listtablecolumnoption_);
    }
    return false;
  }

  public int hashCode() {
    return 37*(37*(37*(this.ident_1.hashCode())+this.tablecolumngtctor_.hashCode())+this.string_2.hashCode())+this.listtablecolumnoption_.hashCode();
  }


}