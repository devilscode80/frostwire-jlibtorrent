/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class float_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected float_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(float_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_float_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public float_vector() {
    this(libtorrent_jni.new_float_vector(), true);
  }

  public long size() {
    return libtorrent_jni.float_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.float_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.float_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.float_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.float_vector_clear(swigCPtr, this);
  }

  public void add(float x) {
    libtorrent_jni.float_vector_add(swigCPtr, this, x);
  }

  public float get(int i) {
    return libtorrent_jni.float_vector_get(swigCPtr, this, i);
  }

  public void set(int i, float val) {
    libtorrent_jni.float_vector_set(swigCPtr, this, i, val);
  }

}
