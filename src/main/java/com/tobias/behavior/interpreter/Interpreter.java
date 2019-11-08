package com.tobias.behavior.interpreter;

/**
 * 为语言创建解释器，通常由语言的语法和语法分析来定义。 源码：如。JDK的java.util.regex.Pattern正则表达式解释器，spring 中的el表达式解释器
 * ElExpressionInterpreter
 */
public interface Interpreter {

  int interpreter();

}
