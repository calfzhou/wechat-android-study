package com.tencent.mm.ak;

import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.c;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;

final class h
  implements o
{
  h(g paramg)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = g.a(this.dFO);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    arrayOfObject1[2] = paramkeep_ProgressInfo;
    arrayOfObject1[3] = paramkeep_SceneResult;
    z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", arrayOfObject1);
    if (paramInt == -21005)
    {
      Object[] arrayOfObject8 = new Object[1];
      arrayOfObject8[0] = g.a(this.dFO);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", arrayOfObject8);
    }
    do
    {
      return 0;
      if (paramInt != 0)
      {
        v.jdMethod_if(g.b(this.dFO));
        n localn2 = n.fTF;
        Object[] arrayOfObject7 = new Object[8];
        arrayOfObject7[0] = Integer.valueOf(paramInt);
        arrayOfObject7[1] = Integer.valueOf(1);
        arrayOfObject7[2] = Long.valueOf(g.c(this.dFO));
        arrayOfObject7[3] = Long.valueOf(ch.CM());
        arrayOfObject7[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
        arrayOfObject7[5] = Integer.valueOf(CdnTransportEngine.drz);
        arrayOfObject7[6] = Integer.valueOf(0);
        arrayOfObject7[7] = "";
        localn2.d(10421, arrayOfObject7);
        g.d(this.dFO).a(3, paramInt, "", this.dFO);
        return 0;
      }
      g.a(this.dFO, v.ij(g.b(this.dFO)));
      if ((g.e(this.dFO) == null) || (g.e(this.dFO).getStatus() == 105))
      {
        if (g.e(this.dFO) == null);
        for (int i = -1; ; i = g.e(this.dFO).getStatus())
        {
          Object[] arrayOfObject2 = new Object[1];
          arrayOfObject2[0] = Integer.valueOf(i);
          z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "info is null or has paused, status:%d", arrayOfObject2);
          com.tencent.mm.modelcdntran.k.vl().fO(g.a(this.dFO));
          g.d(this.dFO).a(3, paramInt, "info is null or has paused, status" + i, this.dFO);
          return 0;
        }
      }
      if (paramkeep_ProgressInfo != null)
      {
        if (g.e(this.dFO).AO() > paramkeep_ProgressInfo.field_finishedLength)
        {
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = Integer.valueOf(g.e(this.dFO).AO());
          arrayOfObject6[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
          z.w("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra cdnEndProc error oldpos:%d newpos:%d", arrayOfObject6);
          return 0;
        }
        g.e(this.dFO).V(ch.CL());
        g.e(this.dFO).eF(paramkeep_ProgressInfo.field_finishedLength);
        g.e(this.dFO).db(1032);
        v.d(g.e(this.dFO));
        return 0;
      }
    }
    while (paramkeep_SceneResult == null);
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      Object[] arrayOfObject4 = new Object[3];
      arrayOfObject4[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject4[1] = paramkeep_SceneResult.field_arg;
      arrayOfObject4[2] = paramkeep_SceneResult.field_transInfo;
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", arrayOfObject4);
      v.jdMethod_if(g.b(this.dFO));
      n localn1 = n.fTF;
      Object[] arrayOfObject5 = new Object[16];
      arrayOfObject5[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject5[1] = Integer.valueOf(1);
      arrayOfObject5[2] = Long.valueOf(g.c(this.dFO));
      arrayOfObject5[3] = Long.valueOf(ch.CM());
      arrayOfObject5[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
      arrayOfObject5[5] = Integer.valueOf(CdnTransportEngine.drz);
      arrayOfObject5[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
      arrayOfObject5[7] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject5[8] = "";
      arrayOfObject5[9] = "";
      arrayOfObject5[10] = "";
      arrayOfObject5[11] = "";
      arrayOfObject5[12] = "";
      arrayOfObject5[13] = "";
      arrayOfObject5[14] = "";
      arrayOfObject5[15] = paramkeep_SceneResult.report_Part2;
      localn1.d(10421, arrayOfObject5);
      g.d(this.dFO).a(3, paramkeep_SceneResult.field_retCode, "", this.dFO);
      return 0;
    }
    Object[] arrayOfObject3 = new Object[1];
    arrayOfObject3[0] = Integer.valueOf(paramkeep_SceneResult.field_UploadHitCacheType);
    z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "uploadvideo by cdn, isHitCacheUpload: %d", arrayOfObject3);
    g.a(this.dFO, v.ij(g.b(this.dFO)));
    if (ch.jb(g.e(this.dFO).AZ()))
    {
      String str1 = "<msg><videomsg aeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" cdnthumbaeskey=\"" + paramkeep_SceneResult.field_aesKey + "\" cdnvideourl=\"" + paramkeep_SceneResult.field_fileId + "\" ";
      String str2 = str1 + "cdnthumburl=\"" + paramkeep_SceneResult.field_fileId + "\" ";
      String str3 = str2 + "length=\"" + paramkeep_SceneResult.field_fileLength + "\" ";
      String str4 = str3 + "cdnthumblength=\"" + paramkeep_SceneResult.field_thumbimgLength + "\"/></msg>";
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvvSy8Q5zWk/rcmO7lAhmh4Y=", "cdn callback new build cdnInfo:%s", new Object[] { str4 });
      g.e(this.dFO).hW(str4);
      v.d(g.e(this.dFO));
    }
    bg.qX().d(new k(g.b(this.dFO), paramkeep_SceneResult, new i(this, paramkeep_SceneResult)));
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
 * Qualified Name:     com.tencent.mm.ak.h
 * JD-Core Version:    0.6.2
 */