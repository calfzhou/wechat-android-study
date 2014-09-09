package com.tencent.mm.ak;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;

final class i
  implements l
{
  i(h paramh, keep_SceneResult paramkeep_SceneResult)
  {
  }

  public final void I(int paramInt1, int paramInt2)
  {
    n localn = n.fTF;
    Object[] arrayOfObject = new Object[16];
    arrayOfObject[0] = Integer.valueOf(paramInt2);
    arrayOfObject[1] = Integer.valueOf(1);
    arrayOfObject[2] = Long.valueOf(g.c(this.dFP.dFO));
    arrayOfObject[3] = Long.valueOf(ch.CM());
    arrayOfObject[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
    arrayOfObject[5] = Integer.valueOf(CdnTransportEngine.drz);
    arrayOfObject[6] = Integer.valueOf(this.drY.field_fileLength);
    arrayOfObject[7] = this.drY.field_transInfo;
    arrayOfObject[8] = "";
    arrayOfObject[9] = "";
    arrayOfObject[10] = "";
    arrayOfObject[11] = "";
    arrayOfObject[12] = "";
    arrayOfObject[13] = "";
    arrayOfObject[14] = "";
    arrayOfObject[15] = this.drY.report_Part2;
    localn.d(10421, arrayOfObject);
    g.d(this.dFP.dFO).a(paramInt1, paramInt2, "", this.dFP.dFO);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ak.i
 * JD-Core Version:    0.6.2
 */