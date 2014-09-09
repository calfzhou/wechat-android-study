package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.aw;
import java.io.ByteArrayOutputStream;

final class aq
  implements o
{
  aq(ap paramap)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = ap.a(this.hvo);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    arrayOfObject1[2] = paramkeep_ProgressInfo;
    arrayOfObject1[3] = paramkeep_SceneResult;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", arrayOfObject1);
    if (paramInt == -21005)
    {
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = ap.a(this.hvo);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", arrayOfObject5);
    }
    do
    {
      return 0;
      if (paramInt != 0)
      {
        ap.b(this.hvo).setStatus(5);
        bg.qW().oV().a(ap.b(this.hvo).kk(), ap.b(this.hvo));
        n localn2 = n.fTF;
        Object[] arrayOfObject4 = new Object[8];
        arrayOfObject4[0] = Integer.valueOf(paramInt);
        arrayOfObject4[1] = Integer.valueOf(1);
        arrayOfObject4[2] = Long.valueOf(ap.c(this.hvo));
        arrayOfObject4[3] = Long.valueOf(ch.CM());
        arrayOfObject4[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject4[5] = Integer.valueOf(CdnTransportEngine.drA);
        arrayOfObject4[6] = Integer.valueOf(0);
        arrayOfObject4[7] = "";
        localn2.d(10421, arrayOfObject4);
        ap.d(this.hvo).a(3, paramInt, "", this.hvo);
        return 0;
      }
    }
    while (paramkeep_SceneResult == null);
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      Object[] arrayOfObject2 = new Object[11];
      arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject2[1] = paramkeep_SceneResult.field_arg;
      arrayOfObject2[2] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject2[3] = "";
      arrayOfObject2[4] = "";
      arrayOfObject2[5] = "";
      arrayOfObject2[6] = "";
      arrayOfObject2[7] = "";
      arrayOfObject2[8] = "";
      arrayOfObject2[9] = "";
      arrayOfObject2[10] = paramkeep_SceneResult.report_Part2;
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvpM8F9Mwt9oo/dBMbRUcE7Q=", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", arrayOfObject2);
      ap.b(this.hvo).setStatus(5);
      bg.qW().oV().a(ap.b(this.hvo).kk(), ap.b(this.hvo));
      n localn1 = n.fTF;
      Object[] arrayOfObject3 = new Object[16];
      arrayOfObject3[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject3[1] = Integer.valueOf(1);
      arrayOfObject3[2] = Long.valueOf(ap.c(this.hvo));
      arrayOfObject3[3] = Long.valueOf(ch.CM());
      arrayOfObject3[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject3[5] = Integer.valueOf(CdnTransportEngine.drA);
      arrayOfObject3[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
      arrayOfObject3[7] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject3[8] = "";
      arrayOfObject3[9] = "";
      arrayOfObject3[10] = "";
      arrayOfObject3[11] = "";
      arrayOfObject3[12] = "";
      arrayOfObject3[13] = "";
      arrayOfObject3[14] = "";
      arrayOfObject3[15] = paramkeep_SceneResult.report_Part2;
      localn1.d(10421, arrayOfObject3);
      ap.d(this.hvo).a(3, paramkeep_SceneResult.field_retCode, "", this.hvo);
      return 0;
    }
    bg.qX().d(new as(ap.e(this.hvo), false, paramkeep_SceneResult, new ar(this, paramkeep_SceneResult)));
    return 0;
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] d(String paramString, byte[] paramArrayOfByte)
  {
    return null;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.aq
 * JD-Core Version:    0.6.2
 */