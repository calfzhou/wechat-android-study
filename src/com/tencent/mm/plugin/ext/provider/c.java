package com.tencent.mm.plugin.ext.provider;

import android.database.MatrixCursor;
import com.tencent.mm.c.a.cf;
import com.tencent.mm.c.a.ch;
import com.tencent.mm.c.a.cl;
import com.tencent.mm.c.a.cn;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.sdk.c.f;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bc;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;

final class c
  implements Runnable
{
  c(ExtControlProviderMsg paramExtControlProviderMsg, int paramInt, long paramLong, com.tencent.mm.pluginsdk.d.a.a parama, String[] paramArrayOfString)
  {
  }

  public final void run()
  {
    if (this.eMn == 1)
    {
      b.PZ();
      i locali = b.aQ(this.eMo);
      if ((locali == null) || ((int)locali.dhv <= 0))
      {
        this.eMq.hg(3);
        this.eMc.countDown();
        return;
      }
      cf localcf2 = new cf();
      localcf2.cIS.op = 1;
      localcf2.cIS.username = locali.getUsername();
      if (!com.tencent.mm.sdk.c.a.aGB().g(localcf2))
      {
        this.eMq.hg(4);
        this.eMc.countDown();
        return;
      }
      ExtControlProviderMsg.a(this.eMq, new MatrixCursor(ExtControlProviderMsg.Qj()));
      if ((locali != null) && ((int)locali.dhv > 0) && (localcf2.cIT.cCM))
      {
        MatrixCursor localMatrixCursor5 = ExtControlProviderMsg.a(this.eMq);
        Object[] arrayOfObject7 = new Object[3];
        arrayOfObject7[0] = this.eMp[1];
        arrayOfObject7[1] = Integer.valueOf(1);
        arrayOfObject7[2] = "0";
        localMatrixCursor5.addRow(arrayOfObject7);
        this.eMq.hg(0);
        Object[] arrayOfObject6 = new Object[2];
        arrayOfObject6[0] = Boolean.valueOf(localcf2.cIT.cCM);
        arrayOfObject6[1] = localcf2.cIT.rI;
        z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "start record, ret=[%s], fileName=[%s]", arrayOfObject6);
      }
    }
    while (true)
    {
      this.eMc.countDown();
      return;
      MatrixCursor localMatrixCursor4 = ExtControlProviderMsg.a(this.eMq);
      Object[] arrayOfObject5 = new Object[3];
      arrayOfObject5[0] = this.eMp[1];
      arrayOfObject5[1] = Integer.valueOf(2);
      arrayOfObject5[2] = "0";
      localMatrixCursor4.addRow(arrayOfObject5);
      this.eMq.hg(3);
      break;
      if (this.eMn == 2)
      {
        cf localcf1 = new cf();
        localcf1.cIS.op = 2;
        if (!com.tencent.mm.sdk.c.a.aGB().g(localcf1))
        {
          this.eMq.hg(4);
          this.eMc.countDown();
          return;
        }
        String str = localcf1.cIT.rI;
        ExtControlProviderMsg.a(this.eMq, new MatrixCursor(ExtControlProviderMsg.Qj()));
        cl localcl = new cl();
        localcl.cIZ.rI = str;
        if (!com.tencent.mm.sdk.c.a.aGB().g(localcl))
        {
          this.eMq.hg(4);
          ExtControlProviderMsg.a(this.eMq).close();
          this.eMc.countDown();
          return;
        }
        Object[] arrayOfObject1 = new Object[1];
        arrayOfObject1[0] = Long.valueOf(localcl.cJa.cDM);
        z.d("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", "stop record, msgId=[%s]", arrayOfObject1);
        long l = localcl.cJa.cDM;
        if (l > 0L)
        {
          try
          {
            if (!localcf1.cIT.cCM)
              break label666;
            if ((ak.getContext() == null) || (!bc.by(ak.getContext())))
              break label605;
            MatrixCursor localMatrixCursor3 = ExtControlProviderMsg.a(this.eMq);
            Object[] arrayOfObject4 = new Object[3];
            arrayOfObject4[0] = this.eMp[1];
            arrayOfObject4[1] = Integer.valueOf(1);
            arrayOfObject4[2] = com.tencent.mm.plugin.ext.a.a.aS(l);
            localMatrixCursor3.addRow(arrayOfObject4);
            this.eMq.hg(0);
          }
          catch (Exception localException)
          {
            z.w("!44@/B4Tb64lLpKAQbqlkU5I8moU7mSKZGy4juIXFpXMSUI=", localException.getMessage());
            this.eMq.hg(4);
          }
          continue;
          label605: MatrixCursor localMatrixCursor2 = ExtControlProviderMsg.a(this.eMq);
          Object[] arrayOfObject3 = new Object[3];
          arrayOfObject3[0] = this.eMp[1];
          arrayOfObject3[1] = Integer.valueOf(6);
          arrayOfObject3[2] = com.tencent.mm.plugin.ext.a.a.aS(l);
          localMatrixCursor2.addRow(arrayOfObject3);
          this.eMq.hg(4);
          continue;
          label666: MatrixCursor localMatrixCursor1 = ExtControlProviderMsg.a(this.eMq);
          Object[] arrayOfObject2 = new Object[3];
          arrayOfObject2[0] = this.eMp[1];
          arrayOfObject2[1] = Integer.valueOf(4);
          arrayOfObject2[2] = com.tencent.mm.plugin.ext.a.a.aS(l);
          localMatrixCursor1.addRow(arrayOfObject2);
          this.eMq.hg(4);
        }
        else
        {
          this.eMq.hg(3);
        }
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.provider.c
 * JD-Core Version:    0.6.2
 */