package com.tencent.mm.model;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.e;

final class cj
  implements Runnable
{
  public final void run()
  {
    if (!bg.oE())
      return;
    while (true)
    {
      byte[] arrayOfByte2;
      try
      {
        long l1 = System.currentTimeMillis();
        Context localContext = ak.getContext();
        String str1 = localContext.getApplicationInfo().sourceDir;
        byte[] arrayOfByte1 = NorMsgSource.checkSoftType(str1, bg.qW().oD());
        arrayOfByte2 = NorMsgSource.checkSoftType2(localContext, str1, bg.qW().oD());
        long l2 = System.currentTimeMillis() - l1;
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = ch.a(arrayOfByte1, 0, arrayOfByte1.length);
        localObject = String.format("<k25>%s</k25>", arrayOfObject1);
        if (arrayOfByte2 != null)
        {
          if (arrayOfByte2.length == 8)
          {
            int i = arrayOfByte2[0];
            arrayOfByte2[0] = arrayOfByte2[3];
            arrayOfByte2[3] = i;
            int j = arrayOfByte2[1];
            arrayOfByte2[1] = arrayOfByte2[2];
            arrayOfByte2[2] = j;
            int k = arrayOfByte2[4];
            arrayOfByte2[4] = arrayOfByte2[7];
            arrayOfByte2[7] = k;
            int m = arrayOfByte2[5];
            arrayOfByte2[5] = arrayOfByte2[6];
            arrayOfByte2[6] = m;
            StringBuilder localStringBuilder2 = new StringBuilder().append((String)localObject);
            Object[] arrayOfObject3 = new Object[2];
            arrayOfObject3[0] = ch.a(arrayOfByte2, 0, 4);
            arrayOfObject3[1] = ch.a(arrayOfByte2, 4, 8);
            localObject = String.format("<k28>%s</k28><k29>%s</k29>", arrayOfObject3);
          }
        }
        else
        {
          z.i("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", "checkSoftType2 [time: " + l2 + ", value: " + (String)localObject + "]");
          bg.qW().oQ().set(79, localObject);
          return;
        }
      }
      catch (Exception localException)
      {
        z.printErrStackTrace("!32@/B4Tb64lLpLzSPiC36REVuOjo/7Q98V8", localException, "Failed checkSoftType2.", new Object[0]);
        return;
      }
      StringBuilder localStringBuilder1 = new StringBuilder().append((String)localObject);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = ch.a(arrayOfByte2, 0, arrayOfByte2.length);
      String str2 = String.format("<k27>%s</k27>", arrayOfObject2);
      Object localObject = str2;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.cj
 * JD-Core Version:    0.6.2
 */