package com.tobias.structure.composite;


/**
 * 将对象组合成树形结构来表示“整体/部分”层次关系，允许用户以相同的方式处理单独对象和组合对象。
 * 源码如：jdk中的HashMap::putAll(Map)方法 ||| ArrayList::addAll(Collection)
 */
public interface CatalogComponent {

  default void add(CatalogComponent catalogComponent) {
    throw new UnsupportedOperationException("UnsupportedOperation for add");
  }
  default void remove(CatalogComponent catalogComponent) {
    throw new UnsupportedOperationException("UnsupportedOperation for remove");
  }
  default String getName() {
    throw new UnsupportedOperationException("UnsupportedOperation for getName");
  }
  default Integer getPrice() {
    throw new UnsupportedOperationException("UnsupportedOperation for getPrice");
  }
  default void print() {
    throw new UnsupportedOperationException("UnsupportedOperation for print");
  }
  default Integer getLevel() {
    throw new UnsupportedOperationException("UnsupportedOperation for print");
  }
}
