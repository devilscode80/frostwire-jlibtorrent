/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class session_stats_alert extends alert {
  private transient long swigCPtr;

  protected session_stats_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.session_stats_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(session_stats_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_session_stats_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public session_stats_alert(stack_allocator alloc, counters cnt) {
    this(libtorrent_jni.new_session_stats_alert(stack_allocator.getCPtr(alloc), alloc, counters.getCPtr(cnt), cnt), true);
  }

  public int type() {
    return libtorrent_jni.session_stats_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.session_stats_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.session_stats_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.session_stats_alert_message(swigCPtr, this);
  }

  public long get_value(int index) {
    return libtorrent_jni.session_stats_alert_get_value(swigCPtr, this, index);
  }

  public final static int priority = libtorrent_jni.session_stats_alert_priority_get();
  public final static int alert_type = libtorrent_jni.session_stats_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.session_stats_alert_static_category_get();
}
