package com.tencent.mm.storage;

import com.tencent.mm.protocal.a.qc;

public final class bq
{
  private qc ikw;
  private int key;
  private String value;

  public bq()
  {
    this.key = 0;
    this.value = "";
    this.ikw = new qc();
    this.ikw.hPS = 0;
    this.ikw.ifH = "";
  }

  public bq(int paramInt, String paramString)
  {
    this.key = paramInt;
    this.value = paramString;
    this.ikw = new qc();
    this.ikw.hPS = paramInt;
    this.ikw.ifH = paramString;
  }

  public final String aKy()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(this.key);
    localStringBuffer.append(",");
    localStringBuffer.append(this.value);
    return localStringBuffer.toString();
  }

  public final qc aKz()
  {
    return this.ikw;
  }

  public final void zO(String paramString)
  {
    String[] arrayOfString = paramString.split(",");
    this.ikw.hPS = Integer.valueOf(arrayOfString[0]).intValue();
    this.ikw.ifH = arrayOfString[1];
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.bq
 * JD-Core Version:    0.6.2
 */