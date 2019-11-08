package com.tobias.behavior.template_method;

/**
 * 定义算法框架，并将一些步骤的实现延迟到子类。 通过模板方法，子类可以重新定义算法的某些步骤，而不用改变算法的结构。
 *
 * 源码例如：AbstractList, AbstractSet, AbstractMap, HttpServlet::doGet(),doPost(),service() 。。。等等
 */
public abstract class AbstractCourse {

  protected String name;

  public AbstractCourse(String name) {
    this.name = name;
  }


  protected void makeCourse() {
    System.out.println(name + " making Course");
    makePPT();
    makeVideo();
    if (articleIsNecessary()) {
      makeArticle();
    }
    packageResource();
  }

  protected final void makePPT() {
    System.out.println("make PPT");
  }

  protected final void makeVideo() {
    System.out.println("make Video");
  }

  private void makeArticle() {
    System.out.println("make Article");
  }

  protected boolean articleIsNecessary() {
    return false;
  }

  protected abstract void packageResource();

}
