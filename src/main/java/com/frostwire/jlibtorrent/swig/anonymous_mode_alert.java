/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class anonymous_mode_alert extends torrent_alert {
  private transient long swigCPtr;

  protected anonymous_mode_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.anonymous_mode_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(anonymous_mode_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_anonymous_mode_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public anonymous_mode_alert(stack_allocator alloc, torrent_handle h, int k, String s) {
    this(libtorrent_jni.new_anonymous_mode_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, k, s), true);
  }

  public int type() {
    return libtorrent_jni.anonymous_mode_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.anonymous_mode_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.anonymous_mode_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.anonymous_mode_alert_message(swigCPtr, this);
  }

  public void setKind(int value) {
    libtorrent_jni.anonymous_mode_alert_kind_set(swigCPtr, this, value);
  }

  public int getKind() {
    return libtorrent_jni.anonymous_mode_alert_kind_get(swigCPtr, this);
  }

  public void setStr(String value) {
    libtorrent_jni.anonymous_mode_alert_str_set(swigCPtr, this, value);
  }

  public String getStr() {
    return libtorrent_jni.anonymous_mode_alert_str_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.anonymous_mode_alert_priority_get();
  public final static int alert_type = libtorrent_jni.anonymous_mode_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.anonymous_mode_alert_static_category_get();
  public enum kind_t {
    tracker_not_anonymous(libtorrent_jni.anonymous_mode_alert_tracker_not_anonymous_get());

    public final int swigValue() {
      return swigValue;
    }

    public static kind_t swigToEnum(int swigValue) {
      kind_t[] swigValues = kind_t.class.getEnumConstants();
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (kind_t swigEnum : swigValues)
        if (swigEnum.swigValue == swigValue)
          return swigEnum;
      throw new IllegalArgumentException("No enum " + kind_t.class + " with value " + swigValue);
    }

    @SuppressWarnings("unused")
    private kind_t() {
      this.swigValue = SwigNext.next++;
    }

    @SuppressWarnings("unused")
    private kind_t(int swigValue) {
      this.swigValue = swigValue;
      SwigNext.next = swigValue+1;
    }

    @SuppressWarnings("unused")
    private kind_t(kind_t swigEnum) {
      this.swigValue = swigEnum.swigValue;
      SwigNext.next = this.swigValue+1;
    }

    private final int swigValue;

    private static class SwigNext {
      private static int next = 0;
    }
  }

}
