package com.tencent.mm.jni.platformcomm;

final class g
  implements Runnable
{
  g(WakerLock paramWakerLock)
  {
  }

  public final void run()
  {
    this.dQT.unLock();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.jni.platformcomm.g
 * JD-Core Version:    0.6.2
 */