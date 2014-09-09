package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class n
  implements r
{
  public final void b(Intent paramIntent)
  {
    ao.dVX = paramIntent.getIntExtra("value", 0);
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.toBinaryString(ao.dVX);
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "dkdnstd set Test.netDnsSimulateFault=%s", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.n
 * JD-Core Version:    0.6.2
 */