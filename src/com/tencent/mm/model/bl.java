package com.tencent.mm.model;

import com.tencent.mm.protocal.bc;
import com.tencent.mm.protocal.bd;
import com.tencent.mm.protocal.bf;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;

final class bl extends bf
{
  private byte[] dlr;

  public final int n(byte[] paramArrayOfByte)
  {
    bd localbd = new bd();
    try
    {
      localbd.r(paramArrayOfByte);
      long l = localbd.aHd();
      return (int)l;
    }
    catch (Exception localException)
    {
    }
    return 0;
  }

  public final byte[] ri()
  {
    if (bg.qW() == null)
      return null;
    if (!bg.oE())
      return null;
    bc localbc = new bc();
    localbc.bk(bg.qW().oD());
    localbc.aT(ch.jg((String)bg.qW().oQ().get(8195)));
    try
    {
      byte[] arrayOfByte = localbc.sW();
      this.dlr = localbc.aHc();
      return arrayOfByte;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public final byte[] rj()
  {
    return this.dlr;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.bl
 * JD-Core Version:    0.6.2
 */