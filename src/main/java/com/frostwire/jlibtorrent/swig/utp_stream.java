/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class utp_stream {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected utp_stream(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(utp_stream obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_utp_stream(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public utp_stream lowest_layer() {
    return new utp_stream(libtorrent_jni.utp_stream_lowest_layer(swigCPtr, this), false);
  }

  public error_code cancel(error_code arg0) {
    return new error_code(libtorrent_jni.utp_stream_cancel(swigCPtr, this, error_code.getCPtr(arg0), arg0), true);
  }

  public void close() {
    libtorrent_jni.utp_stream_close__SWIG_0(swigCPtr, this);
  }

  public void close(error_code arg0) {
    libtorrent_jni.utp_stream_close__SWIG_1(swigCPtr, this, error_code.getCPtr(arg0), arg0);
  }

  public void set_close_reason(int code) {
    libtorrent_jni.utp_stream_set_close_reason(swigCPtr, this, code);
  }

  public int get_close_reason() {
    return libtorrent_jni.utp_stream_get_close_reason(swigCPtr, this);
  }

  public boolean is_open() {
    return libtorrent_jni.utp_stream_is_open(swigCPtr, this);
  }

  public int read_buffer_size() {
    return libtorrent_jni.utp_stream_read_buffer_size(swigCPtr, this);
  }

  public void issue_read() {
    libtorrent_jni.utp_stream_issue_read(swigCPtr, this);
  }

  public void issue_write() {
    libtorrent_jni.utp_stream_issue_write(swigCPtr, this);
  }

  public long read_some(boolean clear_buffers) {
    return libtorrent_jni.utp_stream_read_some(swigCPtr, this, clear_buffers);
  }

  public int send_delay() {
    return libtorrent_jni.utp_stream_send_delay(swigCPtr, this);
  }

  public int recv_delay() {
    return libtorrent_jni.utp_stream_recv_delay(swigCPtr, this);
  }

  public void do_connect(tcp_endpoint ep) {
    libtorrent_jni.utp_stream_do_connect(swigCPtr, this, tcp_endpoint.getCPtr(ep), ep);
  }

  public long available() {
    return libtorrent_jni.utp_stream_available__SWIG_0(swigCPtr, this);
  }

  public long available(error_code arg0) {
    return libtorrent_jni.utp_stream_available__SWIG_1(swigCPtr, this, error_code.getCPtr(arg0), arg0);
  }

}
