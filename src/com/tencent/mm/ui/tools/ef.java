package com.tencent.mm.ui.tools;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import java.lang.ref.WeakReference;

public final class ef extends cm
{
  private boolean jTH;
  WeakReference jdu;
  private long jdv;

  public ef(WeakReference paramWeakReference)
  {
    this.jdu = paramWeakReference;
  }

  public final void c(int paramInt, long paramLong1, long paramLong2)
  {
    this.jdv = paramLong2;
    sendEmptyMessageDelayed(paramInt, paramLong1);
  }

  public final void gj(boolean paramBoolean)
  {
    this.jTH = paramBoolean;
    c(0, 350L, 0L);
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    removeMessages(paramMessage.what);
    MMGestureGallery localMMGestureGallery;
    if (this.jdu != null)
    {
      localMMGestureGallery = (MMGestureGallery)this.jdu.get();
      if (localMMGestureGallery != null)
      {
        if (paramMessage.what != 0)
          break label95;
        if ((MMGestureGallery.i(localMMGestureGallery) == 1) || (this.jTH))
        {
          z.d("!44@/B4Tb64lLpLtADHeupmcR9RkE1hpp/4l1le5KqFDqOc=", "single click over!");
          if (MMGestureGallery.f(localMMGestureGallery) != null)
            MMGestureGallery.c(localMMGestureGallery).post(new eg(this, localMMGestureGallery));
        }
        MMGestureGallery.a(localMMGestureGallery, 0);
      }
    }
    label95: 
    do
    {
      return;
      if (paramMessage.what == 1)
      {
        if ((MMGestureGallery.z(localMMGestureGallery) != null) && (!MMGestureGallery.z(localMMGestureGallery).sl()))
        {
          MMGestureGallery.z(localMMGestureGallery).play();
          sendEmptyMessageDelayed(paramMessage.what, this.jdv);
          return;
        }
        MMGestureGallery.A(localMMGestureGallery);
        return;
      }
      removeMessages(2);
    }
    while (MMGestureGallery.B(localMMGestureGallery) == null);
    MMGestureGallery.c(localMMGestureGallery).post(new eh(this, localMMGestureGallery));
  }

  public final void release()
  {
    removeMessages(0);
    removeMessages(1);
    removeMessages(2);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.ef
 * JD-Core Version:    0.6.2
 */