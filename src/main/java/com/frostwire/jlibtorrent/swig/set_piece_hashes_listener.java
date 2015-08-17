/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class set_piece_hashes_listener {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected set_piece_hashes_listener(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(set_piece_hashes_listener obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_set_piece_hashes_listener(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  protected void swigDirectorDisconnect() {
    swigCMemOwn = false;
    delete();
  }

  public void swigReleaseOwnership() {
    swigCMemOwn = false;
    libtorrent_jni.set_piece_hashes_listener_change_ownership(this, swigCPtr, false);
  }

  public void swigTakeOwnership() {
    swigCMemOwn = true;
    libtorrent_jni.set_piece_hashes_listener_change_ownership(this, swigCPtr, true);
  }

  public void progress(String id, int num_pieces, int i) {
    if (getClass() == set_piece_hashes_listener.class) libtorrent_jni.set_piece_hashes_listener_progress(swigCPtr, this, id, num_pieces, i); else libtorrent_jni.set_piece_hashes_listener_progressSwigExplicitset_piece_hashes_listener(swigCPtr, this, id, num_pieces, i);
  }

  public set_piece_hashes_listener() {
    this(libtorrent_jni.new_set_piece_hashes_listener(), true);
    libtorrent_jni.set_piece_hashes_listener_director_connect(this, swigCPtr, swigCMemOwn, true);
  }

}
