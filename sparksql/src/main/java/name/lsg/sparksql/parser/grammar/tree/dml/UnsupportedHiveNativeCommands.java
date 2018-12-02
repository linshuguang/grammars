package name.lsg.sparksql.parser.grammar.tree.dml;

import name.lsg.sparksql.parser.grammar.context.Context;
import name.lsg.sparksql.parser.grammar.tree.AST;
import name.lsg.sparksql.parser.util.IndentHelper;

/**
 * Created by kenya on 2018/11/30.
 */

public class UnsupportedHiveNativeCommands extends AST {
    String kw1;
    String kw2;
    String kw3;
    String kw4;
    String kw5;
    String kw6;
    AST tableIdentifier;
    AST partitionSpec;
    String wildcard;

    public void setWildcard(String wildcard){
        this.wildcard = wildcard;
    }

    public UnsupportedHiveNativeCommands(String kw1) {
        this.kw1 = kw1;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2) {
        this.kw1 = kw1;
        this.kw2 = kw2;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2, String kw3) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.kw3 = kw3;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, String kw3) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.kw3 = kw3;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, String kw3, String kw4) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.kw3 = kw3;
        this.kw4 = kw4;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, String kw3, String kw4, String kw5) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.kw3 = kw3;
        this.kw4 = kw4;
        this.kw5 = kw5;
    }

    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, String kw3, String kw4, String kw5, String kw6) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.kw3 = kw3;
        this.kw4 = kw4;
        this.kw5 = kw5;
        this.kw6 = kw6;
    }


    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, AST partitionSpec, String kw3) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.kw3 = kw3;
    }


    public UnsupportedHiveNativeCommands(String kw1, String kw2, AST tableIdentifier, AST partitionSpec, String kw3, String kw4) {
        this.kw1 = kw1;
        this.kw2 = kw2;
        this.tableIdentifier = tableIdentifier;
        this.partitionSpec = partitionSpec;
        this.kw3 = kw3;
        this.kw4 = kw4;
    }

    @Override
    public void indent(Context context){
        if(kw1!=null && kw2==null){
            IndentHelper.indentKeyWord(context, kw1);
        }else if(kw1!=null && kw2!=null && kw3==null){
            IndentHelper.indentKeyWord(context, kw1, kw2);
        }else if(kw1!=null && kw2!=null && kw3!=null && kw4==null){
            if(tableIdentifier==null) {
                IndentHelper.indentKeyWord(context, kw1, kw2, kw3);
            }else{
                IndentHelper.indentKeyWord(context, kw1, kw2);
                IndentHelper.indent(context, tableIdentifier);
                IndentHelper.indent(context, partitionSpec);
                IndentHelper.indentKeyWord(context, kw3);
            }
        }else if(kw1!=null && kw2!=null && kw3!=null && kw4!=null && kw5==null) {

            IndentHelper.indentKeyWord(context, kw1, kw2);
            IndentHelper.indent(context, tableIdentifier);
            IndentHelper.indent(context, partitionSpec);
            IndentHelper.indentKeyWord(context, kw3, kw4);
        }else if(kw1!=null && kw2!=null && kw3!=null && kw4!=null && kw5!=null && kw6==null) {
            IndentHelper.indentKeyWord(context, kw1, kw2);
            IndentHelper.indent(context, tableIdentifier);
            IndentHelper.indent(context, partitionSpec);
            IndentHelper.indentKeyWord(context, kw3, kw4, kw5);
        }else if(kw1!=null && kw2!=null && kw3!=null && kw4!=null && kw5!=null && kw6!=null) {
            IndentHelper.indentKeyWord(context, kw1, kw2);
            IndentHelper.indent(context, tableIdentifier);
            IndentHelper.indent(context, partitionSpec);
            IndentHelper.indentKeyWord(context, kw3, kw4, kw5, kw6);
        }
        IndentHelper.indent(context, wildcard);
    }


}