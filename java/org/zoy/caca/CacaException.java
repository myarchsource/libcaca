/**
 *  libcaca       Java bindings for libcaca
 *  Copyright (c) 2009 Adrien Grand <jpountz@dinauz.org>
 *
 *  This library is free software. It comes without any warranty, to
 *  the extent permitted by applicable law. You can redistribute it
 *  and/or modify it under the terms of the Do What the Fuck You Want
 *  to Public License, Version 2, as published by Sam Hocevar. See
 *  http://www.wtfpl.net/ for more details.
 */

package org.zoy.caca;

public class CacaException extends RuntimeException {

  private static final long serialVersionUID = 0L;

  public CacaException(String msg) {
    super(msg);
  }

}
