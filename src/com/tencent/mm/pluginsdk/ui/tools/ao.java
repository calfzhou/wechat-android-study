package com.tencent.mm.pluginsdk.ui.tools;

import android.os.Looper;
import com.tencent.mm.sdk.platformtools.cm;
import java.util.LinkedList;

abstract class ao
{
  private cm gQj;
  private final int hLJ = Math.max(1, 16);
  private LinkedList hLK = new LinkedList();

  public ao(ag paramag, int paramInt, Looper paramLooper)
  {
    this.gQj = new ap(this, paramLooper, paramag);
  }

  protected abstract Object aEZ();

  public final Object aFa()
  {
    if (this.hLK.isEmpty())
      return aEZ();
    return this.hLK.removeFirst();
  }

  public final void s(Object paramObject)
  {
    this.gQj.sendMessage(this.gQj.obtainMessage(1, paramObject));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.ao
 * JD-Core Version:    0.6.2
 */