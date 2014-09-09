package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

final class ar
  implements at
{
  ar(aq paramaq, keep_SceneResult paramkeep_SceneResult)
  {
  }

  public final void I(int paramInt1, int paramInt2)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra NetSceneSendAppMsgForCdn callback %d,%d", arrayOfObject1);
    n localn = n.fTF;
    Object[] arrayOfObject2 = new Object[16];
    arrayOfObject2[0] = Integer.valueOf(paramInt2);
    arrayOfObject2[1] = Integer.valueOf(1);
    arrayOfObject2[2] = Long.valueOf(ap.c(this.hvp.hvo));
    arrayOfObject2[3] = Long.valueOf(ch.CM());
    arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
    arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drA);
    arrayOfObject2[6] = Integer.valueOf(this.drY.field_fileLength);
    arrayOfObject2[7] = this.drY.field_transInfo;
    arrayOfObject2[8] = "";
    arrayOfObject2[9] = "";
    arrayOfObject2[10] = "";
    arrayOfObject2[11] = "";
    arrayOfObject2[12] = "";
    arrayOfObject2[13] = "";
    arrayOfObject2[14] = "";
    arrayOfObject2[15] = this.drY.report_Part2;
    localn.d(10421, arrayOfObject2);
    ap.d(this.hvp.hvo).a(paramInt1, paramInt2, "", this.hvp.hvo);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ar
 * JD-Core Version:    0.6.2
 */