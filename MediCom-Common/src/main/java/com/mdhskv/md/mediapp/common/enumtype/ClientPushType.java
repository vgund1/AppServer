package com.mdhskv.md.mediapp.common.enumtype;

import com.mdhskv.md.mediapp.code.LabeledEnum;

public enum ClientPushType implements LabeledEnum{
  APNS("Apple APNS Push Service"),
  BPPG("Black Berry Push Service"),
  C2DM("Android C2DM Push Service"),
  MDP("MDP"),
  SOCKET("Android SOCKET Push Service"),
  GCM("Android GCM Push Service");
  
  private final String label;
  
  private ClientPushType(String label) {
    this.label = label;
  }
  
  public String getLabel(){
    return this.label;
  }

}
