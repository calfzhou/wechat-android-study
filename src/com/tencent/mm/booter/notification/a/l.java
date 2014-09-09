package com.tencent.mm.booter.notification.a;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.mm.model.y;
import com.tencent.mm.model.z;

public final class l extends a
{
  private c djq;
  private d djr;
  private e djs;
  private m djt;
  private i djv;
  private b djw;
  private int djx;
  private int djz;
  private int duV;
  private boolean dvS;
  private int dvZ = -1;
  private int dwa = -1;
  private Context mContext;

  public l(Context paramContext)
  {
    this.mContext = paramContext;
    this.djq = new c();
    this.djr = new d();
    this.djs = new e();
    this.djt = new m();
    this.djw = new b();
    this.djv = k.lO();
  }

  public final void a(boolean paramBoolean1, boolean paramBoolean2, Notification paramNotification, String paramString1, int paramInt, Intent paramIntent, String paramString2, String paramString3, boolean paramBoolean3)
  {
    int i;
    if (com.tencent.mm.storage.i.yc(paramString1))
    {
      i = z.qs();
      this.duV = i;
      this.djx = z.dZ(y.dkj);
      this.djz = z.a(y.dkj, null);
      this.dvS = v(this.mContext);
      this.djq.a(this.mContext, paramBoolean1, paramBoolean2, paramNotification);
      this.djr.s(paramString2, paramInt);
      this.djs.a(this.mContext, paramString1, paramInt, paramIntent, this.djx, this.duV, this.dvS);
      if (!this.dvS)
        break label182;
      m localm = this.djt;
      Context localContext = this.mContext;
      localm.a(localContext, paramString2, paramInt, paramString1, paramString3, this.duV, paramBoolean3);
    }
    while (true)
    {
      b localb = this.djw;
      localb.b(paramString1, this.dvS);
      return;
      i = 0;
      break;
      label182: this.djt.a(this.mContext, paramString2, paramInt, paramString1, this.djx, this.djz, this.duV, paramBoolean3);
    }
  }

  public final PendingIntent bU(int paramInt)
  {
    return this.djs.a(paramInt, this.mContext);
  }

  public final void cp(String paramString)
  {
    this.djv.cp(paramString);
  }

  public final int lP()
  {
    return this.djx;
  }

  public final int lQ()
  {
    return this.djz;
  }

  public final boolean lR()
  {
    return this.dvS;
  }

  public final Bitmap lS()
  {
    return this.djw.lH();
  }

  public final int lT()
  {
    return this.djq.lI();
  }

  public final int lU()
  {
    return this.djr.lJ();
  }

  public final String lW()
  {
    return this.djt.getTitle();
  }

  public final String lX()
  {
    return this.djt.getDesc();
  }

  public final String lY()
  {
    return this.djt.me();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.a.l
 * JD-Core Version:    0.6.2
 */