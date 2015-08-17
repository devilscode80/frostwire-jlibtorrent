/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class cache_status {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected cache_status(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(cache_status obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_cache_status(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public cache_status() {
    this(libtorrent_jni.new_cache_status(), true);
  }

  public void setPieces(cached_piece_info_vector value) {
    libtorrent_jni.cache_status_pieces_set(swigCPtr, this, cached_piece_info_vector.getCPtr(value), value);
  }

  public cached_piece_info_vector getPieces() {
    long cPtr = libtorrent_jni.cache_status_pieces_get(swigCPtr, this);
    return (cPtr == 0) ? null : new cached_piece_info_vector(cPtr, false);
  }

}
