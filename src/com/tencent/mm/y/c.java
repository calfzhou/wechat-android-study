package com.tencent.mm.y;

import android.os.Looper;
import android.os.Message;
import com.tencent.mm.sdk.platformtools.cm;
import java.lang.ref.WeakReference;

final class c extends cm
{
  private WeakReference dwT;

  public c(a parama, Looper paramLooper)
  {
    super(paramLooper);
    this.dwT = new WeakReference(parama);
  }

  public final void handleMessage(Message paramMessage)
  {
    a locala = (a)this.dwT.get();
    if (locala != null)
      locala.handleMessage(paramMessage);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.y.c
 * JD-Core Version:    0.6.2
 */