package com.tobias.structure.decorate;

import java.io.IOException;
import java.io.Reader;

public class LineReaderDecorate extends Reader {

  private Reader reader;

  public LineReaderDecorate(Reader reader) {
    super(reader);
    this.reader = reader;
  }

  @Override
  public int read(char[] cbuf, int off, int len) throws IOException {
    int read = reader.read();
    return 0;
  }

  @Override
  public void close() throws IOException {

  }
}
