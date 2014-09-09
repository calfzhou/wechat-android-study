package com.tencent.mm.y;

import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.modelcdntran.CdnTransportEngine;
import com.tencent.mm.modelcdntran.keep_ProgressInfo;
import com.tencent.mm.modelcdntran.keep_SceneResult;
import com.tencent.mm.modelcdntran.o;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.aw;
import java.io.ByteArrayOutputStream;
import java.io.File;

final class u
  implements o
{
  u(t paramt, long paramLong1, ar paramar, long paramLong2, int paramInt, String paramString1, String paramString2)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt != 0)
    {
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = Long.valueOf(this.dxL);
      arrayOfObject5[1] = Integer.valueOf(paramInt);
      z.e("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "getThumbByCdn start failed: file:%s code:%d", arrayOfObject5);
      this.dxM.setStatus(5);
      bg.qW().oV().b(this.dxM.kl(), this.dxM);
      com.tencent.mm.plugin.f.c.n localn2 = com.tencent.mm.plugin.f.c.n.fTF;
      Object[] arrayOfObject6 = new Object[8];
      arrayOfObject6[0] = Integer.valueOf(paramInt);
      arrayOfObject6[1] = Integer.valueOf(2);
      arrayOfObject6[2] = Long.valueOf(this.dxN);
      arrayOfObject6[3] = Long.valueOf(ch.CM());
      arrayOfObject6[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
      arrayOfObject6[5] = Integer.valueOf(CdnTransportEngine.dry);
      arrayOfObject6[6] = Integer.valueOf(this.dxO);
      arrayOfObject6[7] = "";
      localn2.d(10421, arrayOfObject6);
      ap.yg().Bo();
      return 0;
    }
    if (paramkeep_SceneResult != null)
    {
      com.tencent.mm.plugin.f.c.n localn1;
      Object[] arrayOfObject3;
      label284: String str1;
      if (paramkeep_SceneResult.field_retCode != 0)
      {
        Object[] arrayOfObject4 = new Object[2];
        arrayOfObject4[0] = Long.valueOf(this.dxL);
        arrayOfObject4[1] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
        z.e("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "getThumbByCdn failed: file:%s code:%d", arrayOfObject4);
        this.dxM.setStatus(5);
        if (!ch.jb(this.dxM.kt()))
          bg.qW().oV().b(this.dxM.kl(), this.dxM);
        localn1 = com.tencent.mm.plugin.f.c.n.fTF;
        arrayOfObject3 = new Object[16];
        if (paramkeep_SceneResult != null)
          break label660;
        arrayOfObject3[0] = Integer.valueOf(paramInt);
        arrayOfObject3[1] = Integer.valueOf(2);
        arrayOfObject3[2] = Long.valueOf(this.dxN);
        arrayOfObject3[3] = Long.valueOf(ch.CM());
        arrayOfObject3[4] = Integer.valueOf(com.tencent.mm.modelcdntran.i.z(ak.getContext()));
        arrayOfObject3[5] = Integer.valueOf(CdnTransportEngine.dry);
        arrayOfObject3[6] = Integer.valueOf(this.dxO);
        if (paramkeep_SceneResult != null)
          break label669;
        str1 = "";
        label365: arrayOfObject3[7] = str1;
        arrayOfObject3[8] = "";
        arrayOfObject3[9] = "";
        arrayOfObject3[10] = "";
        arrayOfObject3[11] = "";
        arrayOfObject3[12] = "";
        arrayOfObject3[13] = "";
        arrayOfObject3[14] = "";
        if (paramkeep_SceneResult != null)
          break label679;
      }
      label660: label669: label679: for (String str2 = ""; ; str2 = paramkeep_SceneResult.report_Part2)
      {
        arrayOfObject3[15] = str2;
        localn1.d(10421, arrayOfObject3);
        ap.yg().Bo();
        return 0;
        File localFile = new File(this.dxP);
        new File(this.dxQ).renameTo(localFile);
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = Long.valueOf(this.dxL);
        arrayOfObject1[1] = Boolean.valueOf(localFile.exists());
        z.d("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "getThumbByCdn finished file:%s exist:%b", arrayOfObject1);
        this.dxM.setStatus(6);
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        com.tencent.mm.sdk.platformtools.i.a(this.dxP, localPInt1, localPInt2);
        this.dxM.bJ(localPInt1.value);
        this.dxM.bK(localPInt2.value);
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = Integer.valueOf(localPInt1.value);
        arrayOfObject2[1] = Integer.valueOf(localPInt2.value);
        z.i("!44@/B4Tb64lLpJ4HtB9VgvLj5rnhwUwwwYhpaO6wvchOMY=", "thumbImg w:%d, h:%d", arrayOfObject2);
        if (ch.jb(this.dxM.kt()))
          break;
        bg.qW().oV().b(this.dxM.kl(), this.dxM);
        break;
        paramInt = paramkeep_SceneResult.field_retCode;
        break label284;
        str1 = paramkeep_SceneResult.field_transInfo;
        break label365;
      }
    }
    ap.yg().Bo();
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
 * Qualified Name:     com.tencent.mm.y.u
 * JD-Core Version:    0.6.2
 */