package com.tencent.mm.compatible.h;

import android.content.Intent;
import com.tencent.mm.compatible.a.b;

final class d
  implements b
{
  d(Intent paramIntent)
  {
  }

  public final void run()
  {
    this.dPd.putExtra("android.intent.extra.durationLimit", 30);
    this.dPd.putExtra("android.intent.extra.sizeLimit", 10485760);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.h.d
 * JD-Core Version:    0.6.2
 */