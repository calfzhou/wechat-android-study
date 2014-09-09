package com.tencent.mm.am;

import com.tencent.mm.sdk.platformtools.z;

final class e
  implements c
{
  e(String paramString)
  {
  }

  public final void b(Exception paramException)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.jSJ;
    z.e("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "start wizard activity failed, plugin(%s) not loaded", arrayOfObject);
    if (paramException != null)
      z.e("!32@/B4Tb64lLpLv0CLSQhWm+q66vaS28Ftd", "start wizard activity with exception:%s", new Object[] { paramException });
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.am.e
 * JD-Core Version:    0.6.2
 */