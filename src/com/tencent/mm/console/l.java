package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class l
  implements r
{
  public final void b(Intent paramIntent)
  {
    ao.dVS = paramIntent.getBooleanExtra("value", false);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Boolean.valueOf(ao.dVS);
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "kiro set Test.forceCDNTrans=%b", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.l
 * JD-Core Version:    0.6.2
 */