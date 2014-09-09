package com.tencent.mm.plugin.c.a.b;

import android.bluetooth.BluetoothAdapter;

final class c
  implements Runnable
{
  c(a parama)
  {
  }

  public final void run()
  {
    if (a.b(this.eiS).isDiscovering())
      a.b(this.eiS).cancelDiscovery();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a.b.c
 * JD-Core Version:    0.6.2
 */