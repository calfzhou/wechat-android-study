package com.tencent.mm.pluginsdk.model;

import com.tencent.mm.sdk.platformtools.cm;

final class l
  implements Runnable
{
  l(k paramk, Object[] paramArrayOfObject)
  {
  }

  public final void run()
  {
    Object localObject = this.huh.doInBackground(this.gfV);
    k.a(this.huh).post(new m(this, localObject));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.l
 * JD-Core Version:    0.6.2
 */