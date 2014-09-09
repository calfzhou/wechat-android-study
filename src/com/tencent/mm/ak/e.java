package com.tencent.mm.ak;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class e
  implements o
{
  e(d paramd)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt == -21006)
    {
      Object[] arrayOfObject7 = new Object[1];
      arrayOfObject7[0] = d.a(this.dFH);
      z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", arrayOfObject7);
    }
    do
    {
      return 0;
      if (paramInt != 0)
      {
        v.jdMethod_if(d.b(this.dFH));
        n localn2 = n.fTF;
        Object[] arrayOfObject6 = new Object[8];
        arrayOfObject6[0] = Integer.valueOf(paramInt);
        arrayOfObject6[1] = Integer.valueOf(2);
        arrayOfObject6[2] = Long.valueOf(d.c(this.dFH));
        arrayOfObject6[3] = Long.valueOf(ch.CM());
        arrayOfObject6[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject6[5] = Integer.valueOf(CdnTransportEngine.drz);
        arrayOfObject6[6] = Integer.valueOf(d.d(this.dFH));
        arrayOfObject6[7] = "";
        localn2.d(10421, arrayOfObject6);
        d.e(this.dFH).a(3, paramInt, "", this.dFH);
        return 0;
      }
      if (paramkeep_ProgressInfo != null)
      {
        if (paramkeep_ProgressInfo.field_finishedLength == d.d(this.dFH))
        {
          z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra ignore progress 100%");
          return 0;
        }
        if (d.f(this.dFH).AP() > paramkeep_ProgressInfo.field_finishedLength)
        {
          Object[] arrayOfObject5 = new Object[2];
          arrayOfObject5[0] = Integer.valueOf(d.f(this.dFH).AP());
          arrayOfObject5[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
          z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdnEndProc error oldpos:%d newpos:%d", arrayOfObject5);
          v.jdMethod_if(d.b(this.dFH));
          d.e(this.dFH).a(3, paramInt, "", this.dFH);
          return 0;
        }
        d.f(this.dFH).V(ch.CL());
        d.f(this.dFH).eG(paramkeep_ProgressInfo.field_finishedLength);
        d.f(this.dFH).db(1040);
        v.d(d.f(this.dFH));
        Object[] arrayOfObject4 = new Object[3];
        arrayOfObject4[0] = d.a(this.dFH);
        arrayOfObject4[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
        arrayOfObject4[2] = Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength);
        z.d("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra progresscallback id:%s finish:%d total:%d", arrayOfObject4);
        return 0;
      }
    }
    while (paramkeep_SceneResult == null);
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      v.jdMethod_if(d.b(this.dFH));
      Object[] arrayOfObject3 = new Object[1];
      arrayOfObject3[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      z.e("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra sceneResult.retCode :%d", arrayOfObject3);
      d.e(this.dFH).a(3, paramkeep_SceneResult.field_retCode, "", this.dFH);
      n localn1 = n.fTF;
      Object[] arrayOfObject2 = new Object[16];
      arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject2[1] = Integer.valueOf(2);
      arrayOfObject2[2] = Long.valueOf(d.c(this.dFH));
      arrayOfObject2[3] = Long.valueOf(ch.CM());
      arrayOfObject2[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject2[5] = Integer.valueOf(CdnTransportEngine.drz);
      arrayOfObject2[6] = Integer.valueOf(d.d(this.dFH));
      arrayOfObject2[7] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject2[8] = "";
      arrayOfObject2[9] = "";
      arrayOfObject2[10] = "";
      arrayOfObject2[11] = "";
      arrayOfObject2[12] = "";
      arrayOfObject2[13] = "";
      arrayOfObject2[14] = "";
      arrayOfObject2[15] = paramkeep_SceneResult.report_Part2;
      localn1.d(10421, arrayOfObject2);
      return 0;
    }
    new File(m.AL().ib(d.b(this.dFH)) + ".tmp").renameTo(new File(m.AL().ib(d.b(this.dFH))));
    int i = v.r(d.b(this.dFH), paramkeep_SceneResult.field_fileLength);
    Object[] arrayOfObject1 = new Object[5];
    arrayOfObject1[0] = d.b(this.dFH);
    arrayOfObject1[1] = Long.valueOf(d.f(this.dFH).kl());
    arrayOfObject1[2] = d.f(this.dFH).AN();
    arrayOfObject1[3] = d.f(this.dFH).getUser();
    if (i == 1);
    for (boolean bool = true; ; bool = false)
    {
      arrayOfObject1[4] = Boolean.valueOf(bool);
      z.i("!44@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTcdLqt1KtCKk=", "cdntra !FIN! file:%s svrid:%d human:%s user:%s updatedbsucc:%b", arrayOfObject1);
      d.e(this.dFH).a(0, 0, "", this.dFH);
      break;
    }
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
 * Qualified Name:     com.tencent.mm.ak.e
 * JD-Core Version:    0.6.2
 */