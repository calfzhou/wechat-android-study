package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.compatible.g.k;
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
import java.io.ByteArrayOutputStream;

final class aw
  implements o
{
  aw(av paramav)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    Object[] arrayOfObject1 = new Object[4];
    arrayOfObject1[0] = av.a(this.hvu);
    arrayOfObject1[1] = Integer.valueOf(paramInt);
    arrayOfObject1[2] = paramkeep_ProgressInfo;
    arrayOfObject1[3] = paramkeep_SceneResult;
    z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", arrayOfObject1);
    if (paramInt == -21005)
    {
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = av.a(this.hvu);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra  ERR_CNDCOM_MEDIA_IS_UPLOADING clientid:%s", arrayOfObject7);
    }
    do
    {
      boolean bool2;
      do
      {
        return 0;
        if (paramInt != 0)
        {
          s.cq(av.b(this.hvu).iGx);
          av.c(this.hvu).a(3, paramInt, "", this.hvu);
          n localn2 = n.fTF;
          Object[] arrayOfObject6 = new Object[8];
          arrayOfObject6[0] = Integer.valueOf(paramInt);
          arrayOfObject6[1] = Integer.valueOf(1);
          arrayOfObject6[2] = Long.valueOf(av.d(this.hvu));
          arrayOfObject6[3] = Long.valueOf(ch.CM());
          arrayOfObject6[4] = Integer.valueOf(i.z(ak.getContext()));
          arrayOfObject6[5] = Integer.valueOf(CdnTransportEngine.drA);
          arrayOfObject6[6] = Integer.valueOf(0);
          arrayOfObject6[7] = "";
          localn2.d(10421, arrayOfObject6);
          return 0;
        }
        if (paramkeep_ProgressInfo == null)
          break;
        if (av.b(this.hvu).field_offset > paramkeep_ProgressInfo.field_finishedLength)
        {
          Object[] arrayOfObject5 = new Object[2];
          arrayOfObject5[0] = Long.valueOf(av.b(this.hvu).field_offset);
          arrayOfObject5[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
          z.w("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra cdnEndProc error oldpos:%d newpos:%d", arrayOfObject5);
          return 0;
        }
        av.b(this.hvu).field_lastModifyTime = ch.CL();
        av.b(this.hvu).field_offset = paramkeep_ProgressInfo.field_finishedLength;
        bool2 = bf.GP().a(av.b(this.hvu), new String[0]);
      }
      while (bool2);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd update info ret:" + bool2);
      av.a(this.hvu, -10000 - k.nJ());
      av.c(this.hvu).a(3, paramInt, "", this.hvu);
      return 0;
    }
    while (paramkeep_SceneResult == null);
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      Object[] arrayOfObject3 = new Object[11];
      arrayOfObject3[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject3[1] = paramkeep_SceneResult.field_arg;
      arrayOfObject3[2] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject3[3] = "";
      arrayOfObject3[4] = "";
      arrayOfObject3[5] = "";
      arrayOfObject3[6] = "";
      arrayOfObject3[7] = "";
      arrayOfObject3[8] = "";
      arrayOfObject3[9] = "";
      arrayOfObject3[10] = paramkeep_SceneResult.report_Part2;
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "cdntra sceneResult.retCode :%d arg[%s] info[%s]", arrayOfObject3);
      s.cq(av.b(this.hvu).iGx);
      n localn1 = n.fTF;
      Object[] arrayOfObject4 = new Object[16];
      arrayOfObject4[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject4[1] = Integer.valueOf(1);
      arrayOfObject4[2] = Long.valueOf(av.d(this.hvu));
      arrayOfObject4[3] = Long.valueOf(ch.CM());
      arrayOfObject4[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject4[5] = Integer.valueOf(CdnTransportEngine.drA);
      arrayOfObject4[6] = Integer.valueOf(paramkeep_SceneResult.field_fileLength);
      arrayOfObject4[7] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject4[8] = "";
      arrayOfObject4[9] = "";
      arrayOfObject4[10] = "";
      arrayOfObject4[11] = "";
      arrayOfObject4[12] = "";
      arrayOfObject4[13] = "";
      arrayOfObject4[14] = "";
      arrayOfObject4[15] = paramkeep_SceneResult.report_Part2;
      localn1.d(10421, arrayOfObject4);
      av.c(this.hvu).a(3, paramkeep_SceneResult.field_retCode, "", this.hvu);
      return 0;
    }
    Object[] arrayOfObject2 = new Object[1];
    arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_UploadHitCacheType);
    z.i("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "upload attach by cdn, isHitCacheUpload: %d", arrayOfObject2);
    av.b(this.hvu).field_status = 199L;
    boolean bool1 = bf.GP().a(av.b(this.hvu), new String[0]);
    if (!bool1)
    {
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvq7VDzuBal28k11i8Cf/HY6kvpWeraOWSw==", "onGYNetEnd update info ret:" + bool1);
      av.a(this.hvu, -10000 - k.nJ());
      av.c(this.hvu).a(3, paramInt, "", this.hvu);
      return 0;
    }
    s.g(av.b(this.hvu).field_msgInfoId, av.b(this.hvu).field_mediaSvrId);
    bg.qX().d(new as(av.b(this.hvu).field_msgInfoId, true, paramkeep_SceneResult, new ax(this, paramkeep_SceneResult)));
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
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.aw
 * JD-Core Version:    0.6.2
 */