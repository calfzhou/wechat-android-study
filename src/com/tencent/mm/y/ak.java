package com.tencent.mm.y;

import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class ak
  implements ao
{
  ak(aj paramaj, keep_SceneResult paramkeep_SceneResult, l paraml)
  {
  }

  public final void a(long paramLong, int paramInt1, int paramInt2, int paramInt3)
  {
    n localn = n.fTF;
    Object[] arrayOfObject1 = new Object[16];
    arrayOfObject1[0] = Integer.valueOf(paramInt3);
    arrayOfObject1[1] = Integer.valueOf(1);
    arrayOfObject1[2] = Long.valueOf(ag.f(this.dyB.dyA));
    arrayOfObject1[3] = Long.valueOf(ch.CM());
    arrayOfObject1[4] = Integer.valueOf(i.z(com.tencent.mm.sdk.platformtools.ak.getContext()));
    arrayOfObject1[5] = Integer.valueOf(ag.g(this.dyB.dyA));
    arrayOfObject1[6] = Integer.valueOf(this.drY.field_fileLength);
    arrayOfObject1[7] = this.drY.field_transInfo;
    arrayOfObject1[8] = "";
    arrayOfObject1[9] = "";
    arrayOfObject1[10] = "";
    arrayOfObject1[11] = "";
    arrayOfObject1[12] = "";
    arrayOfObject1[13] = "";
    arrayOfObject1[14] = "";
    arrayOfObject1[15] = this.drY.report_Part2;
    localn.d(10421, arrayOfObject1);
    String str = ag.a(this.dyB.dyA);
    Object[] arrayOfObject2 = new Object[3];
    arrayOfObject2[0] = ag.b(this.dyB.dyA);
    arrayOfObject2[1] = Integer.valueOf(paramInt2);
    arrayOfObject2[2] = Integer.valueOf(paramInt3);
    z.d(str, "cdntra clientid:%s NetSceneUploadMsgImgForCdn ret:[%d,%d]", arrayOfObject2);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      v.dX((int)ag.e(this.dyB.dyA));
      v.dW((int)ag.e(this.dyB.dyA));
      ag.d(this.dyB.dyA).a(paramInt2, paramInt3, "", this.dyB.dyA);
      if (ag.c(this.dyB.dyA) != null)
        ag.c(this.dyB.dyA).xY();
      return;
    }
    ag.a(this.dyB.dyA, this.dyv, this.dyv.sp(), paramLong, paramInt1);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.ak
 * JD-Core Version:    0.6.2
 */