/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class tracker_error_alert extends tracker_alert {
  private transient long swigCPtr;

  protected tracker_error_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.tracker_error_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(tracker_error_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_tracker_error_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public tracker_error_alert(stack_allocator alloc, torrent_handle h, int times, int status, String u, error_code e, String m) {
    this(libtorrent_jni.new_tracker_error_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, times, status, u, error_code.getCPtr(e), e, m), true);
  }

  public int type() {
    return libtorrent_jni.tracker_error_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.tracker_error_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.tracker_error_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.tracker_error_alert_message(swigCPtr, this);
  }

  public void setTimes_in_row(int value) {
    libtorrent_jni.tracker_error_alert_times_in_row_set(swigCPtr, this, value);
  }

  public int getTimes_in_row() {
    return libtorrent_jni.tracker_error_alert_times_in_row_get(swigCPtr, this);
  }

  public void setStatus_code(int value) {
    libtorrent_jni.tracker_error_alert_status_code_set(swigCPtr, this, value);
  }

  public int getStatus_code() {
    return libtorrent_jni.tracker_error_alert_status_code_get(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.tracker_error_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.tracker_error_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public String error_message() {
    return libtorrent_jni.tracker_error_alert_error_message(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.tracker_error_alert_priority_get();
  public final static int alert_type = libtorrent_jni.tracker_error_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.tracker_error_alert_static_category_get();
}
