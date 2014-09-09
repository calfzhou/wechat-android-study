package com.tencent.mm.modelcdntran;

final class b
{
  public int field_AckSlice = 8192;
  public int field_Ptl = 35;
  public int field_UseLogic = 0;
  public int field_WifiEtl = 90;
  public int field_noWifiEtl = 70;
  public boolean field_onlyrecvPtl = false;
  public boolean field_onlysendETL = false;

  b(CdnTransportEngine paramCdnTransportEngine)
  {
  }

  public final String toString()
  {
    Object[] arrayOfObject = new Object[7];
    arrayOfObject[0] = Integer.valueOf(this.field_WifiEtl);
    arrayOfObject[1] = Integer.valueOf(this.field_noWifiEtl);
    arrayOfObject[2] = Integer.valueOf(this.field_Ptl);
    arrayOfObject[3] = Integer.valueOf(this.field_UseLogic);
    arrayOfObject[4] = Boolean.valueOf(this.field_onlysendETL);
    arrayOfObject[5] = Boolean.valueOf(this.field_onlyrecvPtl);
    arrayOfObject[6] = Integer.valueOf(this.field_AckSlice);
    return String.format("wifietl:%d, nowifietl:%d,ptl:%d,uselogic:%d,onlysendetl:%b,onlyrecvptl:%b,ackslice:%d", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.b
 * JD-Core Version:    0.6.2
 */