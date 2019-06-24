package com.tobias.creation.factory.abstract_factory;


/**
 * 抽象工厂针对的是产品族
 *
 *
 */
public interface CourseFactory {

  Vedio getVedio();
  Note getNote();

}
