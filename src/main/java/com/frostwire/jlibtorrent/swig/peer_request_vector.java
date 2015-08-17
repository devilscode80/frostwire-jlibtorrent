/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_request_vector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected peer_request_vector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_request_vector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_request_vector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public peer_request_vector() {
    this(libtorrent_jni.new_peer_request_vector(), true);
  }

  public long size() {
    return libtorrent_jni.peer_request_vector_size(swigCPtr, this);
  }

  public long capacity() {
    return libtorrent_jni.peer_request_vector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    libtorrent_jni.peer_request_vector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return libtorrent_jni.peer_request_vector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.peer_request_vector_clear(swigCPtr, this);
  }

  public void add(peer_request x) {
    libtorrent_jni.peer_request_vector_add(swigCPtr, this, peer_request.getCPtr(x), x);
  }

  public peer_request get(int i) {
    return new peer_request(libtorrent_jni.peer_request_vector_get(swigCPtr, this, i), false);
  }

  public void set(int i, peer_request val) {
    libtorrent_jni.peer_request_vector_set(swigCPtr, this, i, peer_request.getCPtr(val), val);
  }

}
