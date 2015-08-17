/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class web_seed_t extends web_seed_entry {
  private transient long swigCPtr;

  protected web_seed_t(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.web_seed_t_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(web_seed_t obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_web_seed_t(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public web_seed_t(web_seed_entry wse) {
    this(libtorrent_jni.new_web_seed_t__SWIG_0(web_seed_entry.getCPtr(wse), wse), true);
  }

  public web_seed_t(String url_, web_seed_entry.type_t type_, String auth_, string_string_pair_vector extra_headers_) {
    this(libtorrent_jni.new_web_seed_t__SWIG_1(url_, type_.swigValue(), auth_, string_string_pair_vector.getCPtr(extra_headers_), extra_headers_), true);
  }

  public web_seed_t(String url_, web_seed_entry.type_t type_, String auth_) {
    this(libtorrent_jni.new_web_seed_t__SWIG_2(url_, type_.swigValue(), auth_), true);
  }

  public web_seed_t(String url_, web_seed_entry.type_t type_) {
    this(libtorrent_jni.new_web_seed_t__SWIG_3(url_, type_.swigValue()), true);
  }

  public void setRetry(high_resolution_clock.time_point value) {
    libtorrent_jni.web_seed_t_retry_set(swigCPtr, this, high_resolution_clock.time_point.getCPtr(value), value);
  }

  public high_resolution_clock.time_point getRetry() {
    long cPtr = libtorrent_jni.web_seed_t_retry_get(swigCPtr, this);
    return (cPtr == 0) ? null : new high_resolution_clock.time_point(cPtr, false);
  }

  public void setEndpoints(tcp_endpoint_vector value) {
    libtorrent_jni.web_seed_t_endpoints_set(swigCPtr, this, tcp_endpoint_vector.getCPtr(value), value);
  }

  public tcp_endpoint_vector getEndpoints() {
    long cPtr = libtorrent_jni.web_seed_t_endpoints_get(swigCPtr, this);
    return (cPtr == 0) ? null : new tcp_endpoint_vector(cPtr, false);
  }

  public ipv4_peer getPeer_info() {
    long cPtr = libtorrent_jni.web_seed_t_peer_info_get(swigCPtr, this);
    return (cPtr == 0) ? null : new ipv4_peer(cPtr, false);
  }

  public void setSupports_keepalive(boolean value) {
    libtorrent_jni.web_seed_t_supports_keepalive_set(swigCPtr, this, value);
  }

  public boolean getSupports_keepalive() {
    return libtorrent_jni.web_seed_t_supports_keepalive_get(swigCPtr, this);
  }

  public void setResolving(boolean value) {
    libtorrent_jni.web_seed_t_resolving_set(swigCPtr, this, value);
  }

  public boolean getResolving() {
    return libtorrent_jni.web_seed_t_resolving_get(swigCPtr, this);
  }

  public void setRemoved(boolean value) {
    libtorrent_jni.web_seed_t_removed_set(swigCPtr, this, value);
  }

  public boolean getRemoved() {
    return libtorrent_jni.web_seed_t_removed_get(swigCPtr, this);
  }

  public void setRestart_request(peer_request value) {
    libtorrent_jni.web_seed_t_restart_request_set(swigCPtr, this, peer_request.getCPtr(value), value);
  }

  public peer_request getRestart_request() {
    long cPtr = libtorrent_jni.web_seed_t_restart_request_get(swigCPtr, this);
    return (cPtr == 0) ? null : new peer_request(cPtr, false);
  }

  public void setRestart_piece(char_vector value) {
    libtorrent_jni.web_seed_t_restart_piece_set(swigCPtr, this, char_vector.getCPtr(value), value);
  }

  public char_vector getRestart_piece() {
    long cPtr = libtorrent_jni.web_seed_t_restart_piece_get(swigCPtr, this);
    return (cPtr == 0) ? null : new char_vector(cPtr, false);
  }

}
