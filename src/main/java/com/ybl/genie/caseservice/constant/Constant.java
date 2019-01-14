package com.ybl.genie.caseservice.constant;

public class Constant {

    public final static String PRODUCTLIST= "select distinct sm.productName FROM ServiceModule sm";

    public final static String MODULE= "FROM ServiceModule as sm where sm.issueTypeId = ?1 ";

    public final static String MODULELIST= "FROM ServiceModule as sm where sm.productName = ?1 ";

}
