package model;

public enum MessageState {
  NORMAL,
  GETTING_TYPE,
  GETTING_TO_IP,
  GETTING_FROM_IP,
  GETTING_LENGTH,
  UPDATING_IPS,
  RECEIVING_DATA,
}