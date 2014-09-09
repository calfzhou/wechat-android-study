package com.tencent.mm.modelcdntran;

import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.util.Map;

final class h
  implements Runnable
{
  h(c paramc, String paramString, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
  }

  public final void run()
  {
    n localn = (n)c.d(this.drU).get(this.drW);
    if (localn == null)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = this.drW;
      z.e("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", " task in jni get info failed mediaid:%s", arrayOfObject2);
    }
    long l;
    do
    {
      return;
      if (this.drX != null)
      {
        this.drX.mediaId = this.drW;
        Object[] arrayOfObject1 = new Object[3];
        arrayOfObject1[0] = Integer.valueOf(this.drX.field_toltalLength);
        arrayOfObject1[1] = Integer.valueOf(this.drX.field_finishedLength);
        arrayOfObject1[2] = Boolean.valueOf(this.drX.field_mtlnotify);
        z.i("!44@/B4Tb64lLpJrrBrikOMJ5b3oVjl52GdFxBO5Up2ZAWM=", "MTL: total:%d, cur:%d, mtl:%b", arrayOfObject1);
      }
      if (this.drY != null)
        this.drY.mediaId = this.drW;
      if (localn.dsw == null)
        break;
      l = ch.CM();
    }
    while ((this.drY == null) && (this.drX != null) && (!this.drX.field_mtlnotify) && (bc.bA(ak.getContext()) == -1));
    localn.field_lastProgressCallbackTime = l;
    localn.dsw.a(this.drW, 0, this.drX, this.drY);
    keep_ProgressInfo localkeep_ProgressInfo = this.drX;
    if ((localkeep_ProgressInfo != null) && (localkeep_ProgressInfo.field_finishedLength != localkeep_ProgressInfo.field_toltalLength));
    for (int i = 0; ; i = 1)
    {
      if (i != 0)
        c.a(this.drU).remove(this.drW);
      if (this.drY == null)
        break;
      c.d(this.drU).remove(this.drW);
      return;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelcdntran.h
 * JD-Core Version:    0.6.2
 */