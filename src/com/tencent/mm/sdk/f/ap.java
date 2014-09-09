package com.tencent.mm.sdk.f;

import android.os.Looper;

public abstract class ap
{
  private final am iGA = new aq(this);

  public final void a(as paramas)
  {
    if (paramas != null)
      this.iGA.a(paramas, Looper.getMainLooper());
  }

  public final void b(int paramInt, ap paramap, Object paramObject)
  {
    this.iGA.ae(new ar(this, paramInt, paramap, paramObject));
    this.iGA.Bo();
  }

  public final void b(as paramas)
  {
    if (paramas != null)
      this.iGA.remove(paramas);
  }

  protected abstract boolean vQ();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.ap
 * JD-Core Version:    0.6.2
 */