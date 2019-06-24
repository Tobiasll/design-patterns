package com.tobias.creation.factory.factory_method;


/**
 * jdk源码参考 Collection -> AnimalFactory :: iterator() -> getInstance()
 *             ArrayList -> DogFactory :: iterator() -> getInstance()
 *             Iterator -> Animal
 *             ArrayList#Itr -> Dog
 *             工厂方法针对的是产品等级结构
 */
@FunctionalInterface
public interface AnimalFactory {

  Animal getInstance();

}
