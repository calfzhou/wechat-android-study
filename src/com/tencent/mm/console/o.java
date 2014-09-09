package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class o
  implements r
{
  public final void b(Intent paramIntent)
  {
    ao.dWa = paramIntent.getStringExtra("errmsg");
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ao.dWa;
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "tiger set tigerIDCErrMsg =%s", arrayOfObject);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.o
 * JD-Core Version:    0.6.2
 */