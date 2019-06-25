package com.tobias.behavior.chain_of_responsibility;


/**
 * 源码：javax.servlet.Filter#doFilter()
 *       java.util.logging.Logger#log()
 */
public abstract class Handle {

  private Handle handle;

  public Handle(Handle handle) {
    this.handle = handle;
  }

  public abstract void handleRequest(Request request);

  public Handle getHandle() {
    return handle;
  }
}
