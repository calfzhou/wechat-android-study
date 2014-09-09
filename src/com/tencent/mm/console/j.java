package com.tencent.mm.console;

import android.content.Intent;
import com.tencent.mm.platformtools.ao;
import com.tencent.mm.sdk.platformtools.z;

final class j
  implements r
{
  public final void b(Intent paramIntent)
  {
    int i = paramIntent.getIntExtra("type", 2147483647);
    int j = paramIntent.getIntExtra("error", 0);
    if ((i == 2147483647) || (j == 0))
      return;
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(i);
    arrayOfObject[1] = Integer.valueOf(j);
    z.w("!24@/B4Tb64lLpLOIdMtS2bKaA==", "kiro set Test.pushNextErrorRet(type=%d, err=%d)", arrayOfObject);
    ao.O(i, j);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.j
 * JD-Core Version:    0.6.2
 */