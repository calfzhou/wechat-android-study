package com.tencent.mm.console;

import com.tencent.mm.model.cg;
import com.tencent.mm.network.a.f;
import com.tencent.mm.network.r;
import com.tencent.mm.sdk.platformtools.z;

final class d
  implements cg
{
  public final void a(r paramr)
  {
    if (paramr == null);
    while (true)
    {
      return;
      String[] arrayOfString1 = paramr.getIPsString(true);
      for (int i = 0; i < arrayOfString1.length; i++)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Integer.valueOf(i);
        arrayOfObject3[1] = arrayOfString1[i];
        z.d("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "dkip long:%d  %s", arrayOfObject3);
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Integer.valueOf(i);
        arrayOfObject4[1] = f.ju(arrayOfString1[i]).toString();
        z.d("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "dkip long:%d %s", arrayOfObject4);
      }
      String[] arrayOfString2 = paramr.getIPsString(false);
      for (int j = 0; j < arrayOfString2.length; j++)
      {
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Integer.valueOf(j);
        arrayOfObject1[1] = arrayOfString2[j];
        z.d("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "dkip short:%d %s", arrayOfObject1);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(j);
        arrayOfObject2[1] = f.ju(arrayOfString2[j]).toString();
        z.d("!44@/B4Tb64lLpJLD/TSzHAWHSAf/GG2c9mYEhKZ1EHpY7c=", "dkip long:%d %s", arrayOfObject2);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.d
 * JD-Core Version:    0.6.2
 */