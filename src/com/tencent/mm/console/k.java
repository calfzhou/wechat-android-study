package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.sdk.platformtools.z;

final class k
  implements r
{
  public final void b(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("level", 0);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(z.getLogLevel());
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "kiro set Log.level=%d", arrayOfObject);
    z.nQ(i);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.k
 * JD-Core Version:    0.6.2
 */