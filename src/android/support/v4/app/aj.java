package android.support.v4.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import java.util.ArrayList;

public final class aj
{
  PendingIntent cA;
  PendingIntent cB;
  RemoteViews cC;
  Bitmap cD;
  CharSequence cE;
  int cF;
  boolean cG;
  aq cH;
  CharSequence cI;
  int cJ;
  int cK;
  boolean cM;
  ArrayList cN = new ArrayList();
  Notification cO = new Notification();
  CharSequence cy;
  CharSequence cz;
  Context mContext;
  int mPriority;

  public aj(Context paramContext)
  {
    this.mContext = paramContext;
    this.cO.when = System.currentTimeMillis();
    this.cO.audioStreamType = -1;
    this.mPriority = 0;
  }

  public final aj a(CharSequence paramCharSequence)
  {
    this.cy = paramCharSequence;
    return this;
  }

  public final aj b(CharSequence paramCharSequence)
  {
    this.cz = paramCharSequence;
    return this;
  }

  public final Notification build()
  {
    return af.L().a(this);
  }

  public final aj c(int paramInt1, int paramInt2)
  {
    this.cJ = paramInt1;
    this.cK = paramInt2;
    this.cM = false;
    return this;
  }

  public final aj f(int paramInt)
  {
    this.cO.icon = paramInt;
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.app.aj
 * JD-Core Version:    0.6.2
 */