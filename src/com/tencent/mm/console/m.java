package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class m
  implements r
{
  public final void b(Intent paramIntent)
  {
    ao.dVY = paramIntent.getIntExtra("key", 0);
    ao.dVZ = paramIntent.getIntExtra("val", 0);
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(ao.dVY);
    arrayOfObject[1] = Integer.valueOf(ao.dVZ);
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "dkshell set [%d %d]", arrayOfObject);
    if (10009 == ao.dVY)
      Shell.ov();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.m
 * JD-Core Version:    0.6.2
 */