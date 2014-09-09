package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.c;
import com.tencent.mm.compatible.g.k;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.i;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import com.tencent.mm.y.ap;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class q
  implements o
{
  q(p paramp, ar paramar, long paramLong, int paramInt, String paramString, boolean paramBoolean)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt != 0)
    {
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = Long.valueOf(this.dxM.kk());
      arrayOfObject4[1] = Integer.valueOf(paramInt);
      z.e("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "getThumbByCdn start failed: msgid:%d code:%d", arrayOfObject4);
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject5 = new Object[8];
      arrayOfObject5[0] = Integer.valueOf(paramInt);
      arrayOfObject5[1] = Integer.valueOf(2);
      arrayOfObject5[2] = Long.valueOf(this.dxN);
      arrayOfObject5[3] = Long.valueOf(ch.CM());
      arrayOfObject5[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject5[5] = Integer.valueOf(CdnTransportEngine.dry);
      arrayOfObject5[6] = Integer.valueOf(this.dxO);
      arrayOfObject5[7] = "";
      localn2.d(10421, arrayOfObject5);
      return paramInt;
    }
    com.tencent.mm.plugin.f.c.n localn1;
    Object[] arrayOfObject1;
    int i;
    label218: String str1;
    if (paramkeep_SceneResult != null)
    {
      if (paramkeep_SceneResult.field_retCode != 0)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = Long.valueOf(this.dxM.kk());
        arrayOfObject3[1] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
        z.e("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "getThumbByCdn failed: msgid:%d code:%d", arrayOfObject3);
      }
    }
    else
    {
      localn1 = com.tencent.mm.plugin.f.c.n.fTF;
      arrayOfObject1 = new Object[16];
      if (paramkeep_SceneResult != null)
        break label574;
      i = -1;
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Long.valueOf(this.dxN);
      arrayOfObject1[3] = Long.valueOf(ch.CM());
      arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.dry);
      arrayOfObject1[6] = Integer.valueOf(this.dxO);
      if (paramkeep_SceneResult != null)
        break label584;
      str1 = "";
      label300: arrayOfObject1[7] = str1;
      arrayOfObject1[8] = "";
      arrayOfObject1[9] = "";
      arrayOfObject1[10] = "";
      arrayOfObject1[11] = "";
      arrayOfObject1[12] = "";
      arrayOfObject1[13] = "";
      arrayOfObject1[14] = "";
      if (paramkeep_SceneResult != null)
        break label594;
    }
    label574: label584: label594: for (String str2 = ""; ; str2 = paramkeep_SceneResult.report_Part2)
    {
      arrayOfObject1[15] = str2;
      localn1.d(10421, arrayOfObject1);
      ap.yg().Bo();
      return 0;
      byte[] arrayOfByte = c.a(this.dxQ, 0, -1);
      String str3 = ap.yg().a(arrayOfByte, this.huQ, Bitmap.CompressFormat.PNG);
      z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", k.nL() + " thumbData MsgInfo path:" + str3);
      if (!ch.jb(str3))
      {
        this.dxM.bK(str3);
        bg.qW().oV().b(this.dxM.kl(), this.dxM);
        z.d("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "new thumbnail saved, path" + str3);
      }
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = Long.valueOf(this.dxM.kk());
      if (str3 != null);
      for (boolean bool = new File(str3).exists(); ; bool = false)
      {
        arrayOfObject2[1] = Boolean.valueOf(bool);
        z.i("!44@/B4Tb64lLpJNEklygrV/uHRWMsvWL2iTy0xTOrIa8yo=", "getThumbByCdn finished msgid:%d  exist:%b", arrayOfObject2);
        break;
      }
      i = paramkeep_SceneResult.field_retCode;
      break label218;
      str1 = paramkeep_SceneResult.field_transInfo;
      break label300;
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
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.q
 * JD-Core Version:    0.6.2
 */