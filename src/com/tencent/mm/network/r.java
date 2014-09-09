package com.tencent.mm.network;

import com.tencent.mm.network.a.c;
import com.tencent.mm.protocal.be;
import java.util.List;

public abstract interface r
{
  public abstract void B(long paramLong);

  public abstract void Y(boolean paramBoolean);

  public abstract int a(ak paramak, ac paramac);

  public abstract void a(c paramc);

  public abstract void a(be parambe);

  public abstract void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4);

  public abstract void a(boolean paramBoolean, byte[] paramArrayOfByte);

  public abstract int c(String paramString, List paramList);

  public abstract void cancel(int paramInt);

  public abstract void fl(String paramString);

  public abstract String[] getIPsString(boolean paramBoolean);

  public abstract String getIspId();

  public abstract String getNetworkServerIp();

  public abstract void keepSignalling();

  public abstract void reset();

  public abstract void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt);

  public abstract void stopSignalling();

  public abstract n tE();

  public abstract v tF();

  public abstract boolean tx();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.r
 * JD-Core Version:    0.6.2
 */