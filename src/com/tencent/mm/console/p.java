package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class p
  implements r
{
  public final void b(Intent paramIntent)
  {
    ao.dWb = paramIntent.getStringExtra("acc");
    ao.dWc = paramIntent.getStringExtra("pass");
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = ao.dWb;
    arrayOfObject[1] = ao.dWc;
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "dkwt shell [%s %s]", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.p
 * JD-Core Version:    0.6.2
 */