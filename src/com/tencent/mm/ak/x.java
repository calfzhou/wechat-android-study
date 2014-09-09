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

final class x
  implements o
{
  x(w paramw, q paramq, long paramLong, int paramInt, String paramString1, String paramString2)
  {
  }

  public final int a(String paramString, int paramInt, keep_ProgressInfo paramkeep_ProgressInfo, keep_SceneResult paramkeep_SceneResult)
  {
    if (paramInt != 0)
    {
      Object[] arrayOfObject4 = new Object[2];
      arrayOfObject4[0] = this.dGo.getFileName();
      arrayOfObject4[1] = Integer.valueOf(paramInt);
      z.e("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "getThumbByCdn start failed: file:%s code:%d", arrayOfObject4);
      n localn2 = n.fTF;
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
    n localn1;
    Object[] arrayOfObject1;
    int i;
    label212: String str1;
    if (paramkeep_SceneResult != null)
    {
      if (paramkeep_SceneResult.field_retCode != 0)
      {
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = this.dGo.getFileName();
        arrayOfObject3[1] = Integer.valueOf(paramkeep_SceneResult.field_retCode);
        z.e("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "getThumbByCdn failed: file:%s code:%d", arrayOfObject3);
      }
    }
    else
    {
      localn1 = n.fTF;
      arrayOfObject1 = new Object[16];
      if (paramkeep_SceneResult != null)
        break label462;
      i = -1;
      arrayOfObject1[0] = Integer.valueOf(i);
      arrayOfObject1[1] = Integer.valueOf(2);
      arrayOfObject1[2] = Long.valueOf(this.dxN);
      arrayOfObject1[3] = Long.valueOf(ch.CM());
      arrayOfObject1[4] = Integer.valueOf(i.z(ak.getContext()));
      arrayOfObject1[5] = Integer.valueOf(CdnTransportEngine.dry);
      arrayOfObject1[6] = Integer.valueOf(this.dxO);
      if (paramkeep_SceneResult != null)
        break label472;
      str1 = "";
      label294: arrayOfObject1[7] = str1;
      arrayOfObject1[8] = "";
      arrayOfObject1[9] = "";
      arrayOfObject1[10] = "";
      arrayOfObject1[11] = "";
      arrayOfObject1[12] = "";
      arrayOfObject1[13] = "";
      arrayOfObject1[14] = "";
      if (paramkeep_SceneResult != null)
        break label482;
    }
    label462: label472: label482: for (String str2 = ""; ; str2 = paramkeep_SceneResult.report_Part2)
    {
      arrayOfObject1[15] = str2;
      localn1.d(10421, arrayOfObject1);
      m.AL().hX(this.dGo.getFileName());
      return 0;
      File localFile = new File(this.dxP);
      new File(this.dxQ).renameTo(localFile);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = this.dGo.getFileName();
      arrayOfObject2[1] = Boolean.valueOf(localFile.exists());
      z.i("!44@/B4Tb64lLpLtL6p2wI6qDet+P7T7RRxxz/wkXnoz7QM=", "getThumbByCdn finished file:%s exist:%b", arrayOfObject2);
      break;
      i = paramkeep_SceneResult.field_retCode;
      break label212;
      str1 = paramkeep_SceneResult.field_transInfo;
      break label294;
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
 * Qualified Name:     com.tencent.mm.ak.x
 * JD-Core Version:    0.6.2
 */