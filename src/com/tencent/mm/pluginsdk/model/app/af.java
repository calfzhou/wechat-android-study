package com.tencent.mm.pluginsdk.model.app;

import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.o.m;
import com.tencent.mm.plugin.f.c.n;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class af
  implements o
{
  af(ae paramae)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt == -21006)
    {
      Object[] arrayOfObject6 = new Object[1];
      arrayOfObject6[0] = ae.a(this.hvd);
      z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", arrayOfObject6);
    }
    do
    {
      return 0;
      if (paramInt != 0)
      {
        s.cq(ae.b(this.hvd).iGx);
        n localn2 = n.fTF;
        Object[] arrayOfObject5 = new Object[8];
        arrayOfObject5[0] = Integer.valueOf(paramInt);
        arrayOfObject5[1] = Integer.valueOf(2);
        arrayOfObject5[2] = Long.valueOf(ae.c(this.hvd));
        arrayOfObject5[3] = Long.valueOf(ch.CM());
        arrayOfObject5[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject5[5] = Integer.valueOf(CdnTransportEngine.drA);
        arrayOfObject5[6] = Integer.valueOf(0);
        arrayOfObject5[7] = "";
        localn2.d(10421, arrayOfObject5);
        ae.d(this.hvd).a(3, paramInt, "", this.hvd);
        return 0;
      }
      if (paramkeep_ProgressInfo != null)
      {
        if (paramkeep_ProgressInfo.field_finishedLength == ae.b(this.hvd).field_totalLen)
        {
          z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra ignore progress 100%");
          return 0;
        }
        if (ae.b(this.hvd).field_offset > paramkeep_ProgressInfo.field_finishedLength)
        {
          Object[] arrayOfObject4 = new Object[2];
          arrayOfObject4[0] = Long.valueOf(ae.b(this.hvd).field_offset);
          arrayOfObject4[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
          z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdnEndProc error oldpos:%d newpos:%d", arrayOfObject4);
          s.cq(ae.b(this.hvd).iGx);
          ae.d(this.hvd).a(3, paramInt, "", this.hvd);
          return 0;
        }
        ae.b(this.hvd).field_offset = paramkeep_ProgressInfo.field_finishedLength;
        bf.GP().a(ae.b(this.hvd), new String[0]);
        if (ae.e(this.hvd) != null)
          am.h(new ag(this));
        Object[] arrayOfObject3 = new Object[3];
        arrayOfObject3[0] = ae.a(this.hvd);
        arrayOfObject3[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
        arrayOfObject3[2] = Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength);
        z.d("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra progresscallback id:%s finish:%d total:%d", arrayOfObject3);
        return 0;
      }
    }
    while (paramkeep_SceneResult == null);
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      s.cq(ae.b(this.hvd).iGx);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      z.e("!56@/B4Tb64lLpK+IBX8XDgnvjP7O0awxQNTH9G9i94EUpoxL9lRt5QCng==", "cdntra sceneResult.retCode :%d", arrayOfObject2);
      ae.d(this.hvd).a(3, paramkeep_SceneResult.field_retCode, "", this.hvd);
    }
    while (true)
    {
      n localn1 = n.fTF;
      Object[] arrayOfObject1 = new Object[16];
      arrayOfObject1[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Long.valueOf(ae.c(this.hvd));
      arrayOfObject1[3] = Long.valueOf(ch.CM());
      arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.drA);
      arrayOfObject1[6] = Long.valueOf(ae.b(this.hvd).field_totalLen);
      arrayOfObject1[7] = paramkeep_SceneResult.field_transInfo;
      arrayOfObject1[8] = "";
      arrayOfObject1[9] = "";
      arrayOfObject1[10] = "";
      arrayOfObject1[11] = "";
      arrayOfObject1[12] = "";
      arrayOfObject1[13] = "";
      arrayOfObject1[14] = "";
      arrayOfObject1[15] = paramkeep_SceneResult.report_Part2;
      localn1.d(10421, arrayOfObject1);
      if (ae.e(this.hvd) == null)
        break;
      am.h(new ah(this));
      return 0;
      new File(ae.f(this.hvd)).renameTo(new File(ae.b(this.hvd).field_fileFullPath));
      ae.b(this.hvd).field_status = 199L;
      ae.b(this.hvd).field_offset = ae.b(this.hvd).field_totalLen;
      bf.GP().a(ae.b(this.hvd), new String[0]);
      ae.d(this.hvd).a(0, 0, "", this.hvd);
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
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.af
 * JD-Core Version:    0.6.2
 */