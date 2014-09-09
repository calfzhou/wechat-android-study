package com.tencent.mm.o;

import com.tencent.mm.sdk.platformtools.z;
import oicq.wlogin_sdk.c.c;

final class ax extends c
{
  public ax(aw paramaw)
  {
  }

  public final void e(int paramInt, String paramString1, String paramString2)
  {
    if (paramInt == 1)
      z.i("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
    do
    {
      return;
      if (paramInt == 2)
      {
        z.d("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
        return;
      }
    }
    while (paramInt != 0);
    z.w("!32@/B4Tb64lLpLVdL+8AzH/ajt4gtR/I89R.Core", "[%s]%s", new Object[] { paramString1, paramString2 });
  }

  public final void h(int paramInt, String paramString)
  {
    e(paramInt, "", paramString);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.o.ax
 * JD-Core Version:    0.6.2
 */