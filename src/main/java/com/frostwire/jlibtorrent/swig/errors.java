/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public enum errors {
  no_error(0),
  file_collision,
  failed_hash_check,
  torrent_is_no_dict,
  torrent_missing_info,
  torrent_info_no_dict,
  torrent_missing_piece_length,
  torrent_missing_name,
  torrent_invalid_name,
  torrent_invalid_length,
  torrent_file_parse_failed,
  torrent_missing_pieces,
  torrent_invalid_hashes,
  too_many_pieces_in_torrent,
  invalid_swarm_metadata,
  invalid_bencoding,
  no_files_in_torrent,
  invalid_escaped_string,
  session_is_closing,
  duplicate_torrent,
  invalid_torrent_handle,
  invalid_entry_type,
  missing_info_hash_in_uri,
  file_too_short,
  unsupported_url_protocol,
  url_parse_error,
  peer_sent_empty_piece,
  parse_failed,
  invalid_file_tag,
  missing_info_hash,
  mismatching_info_hash,
  invalid_hostname,
  invalid_port,
  port_blocked,
  expected_close_bracket_in_address,
  destructing_torrent,
  timed_out,
  upload_upload_connection,
  uninteresting_upload_peer,
  invalid_info_hash,
  torrent_paused,
  invalid_have,
  invalid_bitfield_size,
  too_many_requests_when_choked,
  invalid_piece,
  no_memory,
  torrent_aborted,
  self_connection,
  invalid_piece_size,
  timed_out_no_interest,
  timed_out_inactivity,
  timed_out_no_handshake,
  timed_out_no_request,
  invalid_choke,
  invalid_unchoke,
  invalid_interested,
  invalid_not_interested,
  invalid_request,
  invalid_hash_list,
  invalid_hash_piece,
  invalid_cancel,
  invalid_dht_port,
  invalid_suggest,
  invalid_have_all,
  invalid_have_none,
  invalid_reject,
  invalid_allow_fast,
  invalid_extended,
  invalid_message,
  sync_hash_not_found,
  invalid_encryption_constant,
  no_plaintext_mode,
  no_rc4_mode,
  unsupported_encryption_mode,
  unsupported_encryption_mode_selected,
  invalid_pad_size,
  invalid_encrypt_handshake,
  no_incoming_encrypted,
  no_incoming_regular,
  duplicate_peer_id,
  torrent_removed,
  packet_too_large,
  reserved,
  http_error,
  missing_location,
  invalid_redirection,
  redirecting,
  invalid_range,
  no_content_length,
  banned_by_ip_filter,
  too_many_connections,
  peer_banned,
  stopping_torrent,
  too_many_corrupt_pieces,
  torrent_not_ready,
  peer_not_constructed,
  session_closing,
  optimistic_disconnect,
  torrent_finished,
  no_router,
  metadata_too_large,
  invalid_metadata_request,
  invalid_metadata_size,
  invalid_metadata_offset,
  invalid_metadata_message,
  pex_message_too_large,
  invalid_pex_message,
  invalid_lt_tracker_message,
  too_frequent_pex,
  no_metadata,
  invalid_dont_have,
  requires_ssl_connection,
  invalid_ssl_cert,
  not_an_ssl_torrent,
  banned_by_port_filter,
  unsupported_protocol_version(120),
  natpmp_not_authorized,
  network_failure,
  no_resources,
  unsupported_opcode,
  missing_file_sizes(130),
  no_files_in_resume_data,
  missing_pieces,
  mismatching_number_of_files,
  mismatching_file_size,
  mismatching_file_timestamp,
  not_a_dictionary,
  invalid_blocks_per_piece,
  missing_slots,
  too_many_slots,
  invalid_slot_list,
  invalid_piece_index,
  pieces_need_reorder,
  resume_data_not_modified,
  http_parse_error(150),
  http_missing_location,
  http_failed_decompress,
  no_i2p_router(160),
  no_i2p_endpoint(161),
  scrape_not_available(170),
  invalid_tracker_response,
  invalid_peer_dict,
  tracker_failure,
  invalid_files_entry,
  invalid_hash_entry,
  invalid_peers_entry,
  invalid_tracker_response_length,
  invalid_tracker_transaction_id,
  invalid_tracker_action,
  error_code_max;

  public final int swigValue() {
    return swigValue;
  }

  public static errors swigToEnum(int swigValue) {
    errors[] swigValues = errors.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (errors swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + errors.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private errors() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private errors(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private errors(errors swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

