/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class disk_buffer_holder {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected disk_buffer_holder(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(disk_buffer_holder obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_disk_buffer_holder(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String release() {
    return libtorrent_jni.disk_buffer_holder_release(swigCPtr, this);
  }

  public String get() {
    return libtorrent_jni.disk_buffer_holder_get(swigCPtr, this);
  }

  public void reset(String buf) {
    libtorrent_jni.disk_buffer_holder_reset__SWIG_0(swigCPtr, this, buf);
  }

  public void reset() {
    libtorrent_jni.disk_buffer_holder_reset__SWIG_1(swigCPtr, this);
  }

  public void swap(disk_buffer_holder h) {
    libtorrent_jni.disk_buffer_holder_swap(swigCPtr, this, disk_buffer_holder.getCPtr(h), h);
  }

}
