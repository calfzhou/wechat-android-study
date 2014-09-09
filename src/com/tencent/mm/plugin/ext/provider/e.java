package com.tencent.mm.plugin.ext.provider;

import android.database.MatrixCursor;
import com.tencent.mm.model.bg;
import com.tencent.mm.o.ac;
import com.tencent.mm.o.m;
import com.tencent.mm.o.x;
import com.tencent.mm.pluginsdk.d.a.a;
import com.tencent.mm.sdk.platformtools.z;

final class e
  implements m
{
  e(d paramd, String paramString)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, x paramx)
  {
    Object[] arrayOfObject1 = new Object[2];
    arrayOfObject1[0] = Integer.valueOf(paramInt1);
    arrayOfObject1[1] = Integer.valueOf(paramInt2);
    z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "onSceneEnd errType=%s, errCode=%s", arrayOfObject1);
    if (paramx == null)
    {
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "scene == null");
      bg.qX().b(522, this);
      this.eMt.eMq.hg(4);
      this.eMt.eMc.countDown();
      return;
    }
    switch (paramx.getType())
    {
    default:
      this.eMt.eMq.hg(0);
    case 522:
    }
    while (true)
    {
      this.eMt.eMc.countDown();
      bg.qX().b(522, this);
      return;
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "rtSENDMSG onSceneEnd ok, ");
        MatrixCursor localMatrixCursor2 = ExtControlProviderMsg.a(this.eMt.eMq);
        Object[] arrayOfObject3 = new Object[2];
        arrayOfObject3[0] = this.eMs;
        arrayOfObject3[1] = Integer.valueOf(1);
        localMatrixCursor2.addRow(arrayOfObject3);
        break;
      }
      z.e("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "rtSENDMSG onSceneEnd err, errType = " + paramInt1 + ", errCode = " + paramInt2);
      MatrixCursor localMatrixCursor1 = ExtControlProviderMsg.a(this.eMt.eMq);
      Object[] arrayOfObject2 = new Object[2];
      arrayOfObject2[0] = this.eMs;
      arrayOfObject2[1] = Integer.valueOf(2);
      localMatrixCursor1.addRow(arrayOfObject2);
      this.eMt.eMq.hg(4);
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.e
 * JD-Core Version:    0.6.2
 */