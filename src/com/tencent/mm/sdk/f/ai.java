package com.tencent.mm.sdk.f;

import android.os.Looper;

public abstract class ai
{
  private final am iGA = new aj(this);
  private final am iGB = new ak(this);

  public final void Ba(String paramString)
  {
    ao localao = new ao(paramString);
    this.iGA.ae(localao);
    this.iGA.Bo();
  }

  public final void Bo()
  {
    ao localao = new ao("*");
    this.iGA.ae(localao);
    this.iGA.Bo();
  }

  public final void a(al paramal, Looper paramLooper)
  {
    this.iGA.a(paramal, paramLooper);
  }

  public final void a(String paramString, int paramInt, Object paramObject)
  {
    ao localao = new ao();
    localao.cHv = paramString;
    localao.iGJ = paramInt;
    localao.obj = paramObject;
    localao.iGK = this;
    this.iGA.ae(localao);
    this.iGA.Bo();
  }

  public final void g(al paramal)
  {
    this.iGA.a(paramal, Looper.getMainLooper());
  }

  public final void h(al paramal)
  {
    this.iGA.remove(paramal);
  }

  public void lock()
  {
    this.iGA.lock();
  }

  public void unlock()
  {
    this.iGA.unlock();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.f.ai
 * JD-Core Version:    0.6.2
 */