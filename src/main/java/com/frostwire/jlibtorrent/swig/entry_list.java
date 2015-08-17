/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class entry_list {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected entry_list(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(entry_list obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_entry_list(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public entry_list() {
    this(libtorrent_jni.new_entry_list(), true);
  }

  public boolean isEmpty() {
    return libtorrent_jni.entry_list_isEmpty(swigCPtr, this);
  }

  public long size() {
    return libtorrent_jni.entry_list_size(swigCPtr, this);
  }

  public long max_size() {
    return libtorrent_jni.entry_list_max_size(swigCPtr, this);
  }

  public entry front() {
    return new entry(libtorrent_jni.entry_list_front(swigCPtr, this), true);
  }

  public entry back() {
    return new entry(libtorrent_jni.entry_list_back(swigCPtr, this), true);
  }

  public void push_front(entry x) {
    libtorrent_jni.entry_list_push_front(swigCPtr, this, entry.getCPtr(x), x);
  }

  public void pop_front() {
    libtorrent_jni.entry_list_pop_front(swigCPtr, this);
  }

  public void push_back(entry x) {
    libtorrent_jni.entry_list_push_back(swigCPtr, this, entry.getCPtr(x), x);
  }

  public void pop_back() {
    libtorrent_jni.entry_list_pop_back(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.entry_list_clear(swigCPtr, this);
  }

  public entry_vector to_vector() {
    return new entry_vector(libtorrent_jni.entry_list_to_vector(swigCPtr, this), true);
  }

}
