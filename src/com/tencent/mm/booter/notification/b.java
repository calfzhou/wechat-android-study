package com.tencent.mm.booter.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.tencent.mm.booter.notification.a.f;
import com.tencent.mm.h;
import com.tencent.mm.sdk.platformtools.ak;

public final class b
{
  private String cEh;
  private Notification djb;
  private Bitmap djc;
  private int id = -1;

  @TargetApi(11)
  public b(int paramInt, String paramString, Notification paramNotification)
  {
    this.id = paramInt;
    this.cEh = paramString;
    if (Build.VERSION.SDK_INT >= 11)
      this.djc = paramNotification.largeIcon;
    this.djb = paramNotification;
  }

  public final void cancel()
  {
    ((NotificationManager)ak.getContext().getSystemService("notification")).cancel(this.id);
    clear();
    f.lL().bT(this.id);
  }

  public final void clear()
  {
    if ((this.djc != null) && (!this.djc.isRecycled()))
      this.djc.recycle();
    this.djb = null;
    this.djc = null;
  }

  public final int getId()
  {
    return this.id;
  }

  public final String kt()
  {
    return this.cEh;
  }

  public final void show()
  {
    Context localContext1 = ak.getContext();
    b localb1 = f.lL().cn(this.cEh);
    if (localb1 != null)
      f.lL().mark(localb1.id);
    this.djb.deleteIntent = NotificationDeleteReceive.a(localContext1, this.id);
    if ((localb1 != null) && (localb1.djb.tickerText != null) && (this.djb.tickerText != null) && (localb1.djb.tickerText.equals(this.djb.tickerText)))
      this.djb.tickerText += " ";
    Context localContext2 = ak.getContext();
    int i = this.djb.icon;
    if (localContext2.getResources().getDrawable(i) == null)
      this.djb.icon = h.icon;
    ((NotificationManager)localContext1.getSystemService("notification")).notify(this.id, this.djb);
    b localb2 = f.lL().a(this);
    if (localb2 != null)
      localb2.cancel();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.notification.b
 * JD-Core Version:    0.6.2
 */