package com.tencent.mm.modelvoice;

import com.tencent.mm.sdk.platformtools.z;

final class bz
  implements n
{
  bz(by paramby)
  {
  }

  public final void mj()
  {
    if (by.a(this.dIT) != null)
      by.a(this.dIT).mj();
    try
    {
      by.b(this.dIT).release();
      by.c(this.dIT);
      return;
    }
    catch (Exception localException)
    {
      z.e("!24@J/TNaXmTnT2mD815LCdsDw==", "setErrorListener File[" + this.dIT.getFileName() + "] ErrMsg[" + localException.getStackTrace() + "]");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoice.bz
 * JD-Core Version:    0.6.2
 */