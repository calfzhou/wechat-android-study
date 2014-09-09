package com.tencent.mm.y;

import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.o.m;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import java.io.ByteArrayOutputStream;

final class ae
  implements o
{
  ae(ac paramac)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt == -21006)
    {
      String str7 = ac.a(this.dyu);
      Object[] arrayOfObject5 = new Object[1];
      arrayOfObject5[0] = ac.b(this.dyu);
      z.d(str7, "cdntra  ERR_CNDCOM_MEDIA_IS_DOWNLOADING clientid:%s", arrayOfObject5);
    }
    label288: l locall;
    do
    {
      return 0;
      if (paramInt != 0)
      {
        v.dX((int)ac.c(this.dyu));
        v.dW((int)ac.c(this.dyu));
        com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
        Object[] arrayOfObject4 = new Object[16];
        arrayOfObject4[0] = Integer.valueOf(paramInt);
        arrayOfObject4[1] = Integer.valueOf(2);
        arrayOfObject4[2] = Long.valueOf(ac.d(this.dyu));
        arrayOfObject4[3] = Long.valueOf(ch.CM());
        arrayOfObject4[4] = Integer.valueOf(i.z(ak.getContext()));
        arrayOfObject4[5] = Integer.valueOf(ac.e(this.dyu));
        arrayOfObject4[6] = Integer.valueOf(ac.f(this.dyu));
        String str5;
        if (paramkeep_SceneResult == null)
        {
          str5 = "";
          arrayOfObject4[7] = str5;
          arrayOfObject4[8] = "";
          arrayOfObject4[9] = "";
          arrayOfObject4[10] = "";
          arrayOfObject4[11] = "";
          arrayOfObject4[12] = "";
          arrayOfObject4[13] = "";
          arrayOfObject4[14] = "";
          if (paramkeep_SceneResult != null)
            break label288;
        }
        for (String str6 = ""; ; str6 = paramkeep_SceneResult.report_Part2)
        {
          arrayOfObject4[15] = str6;
          localn2.d(10421, arrayOfObject4);
          ac.g(this.dyu).a(3, paramInt, "", this.dyu);
          return 0;
          str5 = paramkeep_SceneResult.field_transInfo;
          break;
        }
      }
      locall = ap.yg().Q(ac.h(this.dyu));
      if (paramkeep_ProgressInfo != null)
      {
        if (paramkeep_ProgressInfo.field_finishedLength == ac.f(this.dyu))
        {
          z.d(ac.a(this.dyu), "cdntra ignore progress 100%");
          return 0;
        }
        if (!ac.i(this.dyu))
          ac.a(this.dyu, paramkeep_ProgressInfo.field_mtlnotify);
        String str4 = ac.a(this.dyu);
        Object[] arrayOfObject3 = new Object[4];
        arrayOfObject3[0] = ac.b(this.dyu);
        arrayOfObject3[1] = Integer.valueOf(paramkeep_ProgressInfo.field_finishedLength);
        arrayOfObject3[2] = Integer.valueOf(paramkeep_ProgressInfo.field_toltalLength);
        arrayOfObject3[3] = Boolean.valueOf(ac.i(this.dyu));
        z.i(str4, "cdntra progresscallback id:%s finish:%d total:%d,  canshowProgressimg:%b", arrayOfObject3);
        ac.a(this.dyu, locall, ac.f(this.dyu), locall.getOffset(), paramkeep_ProgressInfo.field_finishedLength - locall.getOffset());
        return 0;
      }
    }
    while (paramkeep_SceneResult == null);
    com.tencent.mm.plugin.f.c.n localn1;
    Object[] arrayOfObject1;
    String str1;
    if (paramkeep_SceneResult.field_retCode != 0)
    {
      v.dW((int)ac.c(this.dyu));
      String str3 = ac.a(this.dyu);
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      z.e(str3, "cdntra sceneResult.retCode :%d", arrayOfObject2);
      ac.g(this.dyu).a(3, paramkeep_SceneResult.field_retCode, "", this.dyu);
      localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      arrayOfObject1 = new Object[16];
      arrayOfObject1[0] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Long.valueOf(ac.d(this.dyu));
      arrayOfObject1[3] = Long.valueOf(ch.CM());
      arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject1[5] = Integer.valueOf(ac.e(this.dyu));
      arrayOfObject1[6] = Integer.valueOf(ac.f(this.dyu));
      if (paramkeep_SceneResult != null)
        break label786;
      str1 = "";
      label664: arrayOfObject1[7] = str1;
      arrayOfObject1[8] = "";
      arrayOfObject1[9] = "";
      arrayOfObject1[10] = "";
      arrayOfObject1[11] = "";
      arrayOfObject1[12] = "";
      arrayOfObject1[13] = "";
      arrayOfObject1[14] = "";
      if (paramkeep_SceneResult != null)
        break label796;
    }
    label786: label796: for (String str2 = ""; ; str2 = paramkeep_SceneResult.report_Part2)
    {
      arrayOfObject1[15] = str2;
      localn1.d(10421, arrayOfObject1);
      return 0;
      ac.a(this.dyu, locall, ac.f(this.dyu), locall.getOffset(), ac.f(this.dyu) - locall.getOffset());
      break;
      str1 = paramkeep_SceneResult.field_transInfo;
      break label664;
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
 * Qualified Name:     com.tencent.mm.y.ae
 * JD-Core Version:    0.6.2
 */