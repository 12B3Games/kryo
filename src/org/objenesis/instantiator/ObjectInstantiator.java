package org.objenesis.instantiator;

/**
 * Instantiates a new object.
 * 
 * @author Leonardo Mesquita
 */
public interface ObjectInstantiator<T> {

   /**
    * Returns a new instance of an object. The returned object's class is defined by the
    * implementation.
    * 
    * @return A new instance of an object.
    */
   T newInstance();

}