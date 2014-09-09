package com.tencent.mm.compatible.e;

import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  private int dOA = -1;
  private String dOx = null;
  private long dOy = -1L;
  private int dOz = -1;

  public final void cF(String paramString)
  {
    this.dOx = paramString;
  }

  public final void ck(int paramInt)
  {
    this.dOz = paramInt;
  }

  public final void cm(int paramInt)
  {
    this.dOA = paramInt;
  }

  public final String nG()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.dOx);
    localStringBuffer.append(",");
    localStringBuffer.append(this.dOy);
    localStringBuffer.append(",");
    localStringBuffer.append(this.dOz);
    localStringBuffer.append(",");
    localStringBuffer.append(this.dOA);
    z.d("!44@/B4Tb64lLpJiDhxS2T+FNRuIiIcxQpzWPZs/WhJTVOg=", " getStatInfo " + localStringBuffer.toString());
    return localStringBuffer.toString();
  }

  public final void t(long paramLong)
  {
    this.dOy = paramLong;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.e.a
 * JD-Core Version:    0.6.2
 */