package com.tencent.mm.ui.base;

import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.WeakReference;

public final class fe extends cm
{
  WeakReference jdu;
  private long jdv;

  public fe(WeakReference paramWeakReference)
  {
    this.jdu = paramWeakReference;
  }

  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    removeMessages(paramMessage.what);
    MMViewPager localMMViewPager;
    if (this.jdu != null)
    {
      localMMViewPager = (MMViewPager)this.jdu.get();
      if ((localMMViewPager != null) && (paramMessage.what == 1))
      {
        if ((MMViewPager.k(localMMViewPager) == null) || (MMViewPager.k(localMMViewPager).sl()))
          break label81;
        MMViewPager.k(localMMViewPager).play();
        sendEmptyMessageDelayed(paramMessage.what, this.jdv);
      }
    }
    return;
    label81: MMViewPager.l(localMMViewPager);
  }

  public final void j(long paramLong1, long paramLong2)
  {
    this.jdv = 15L;
    sendEmptyMessageDelayed(1, 15L);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.fe
 * JD-Core Version:    0.6.2
 */