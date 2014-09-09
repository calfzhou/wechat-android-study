package com.tencent.kingkong.support;

final class CancellationSignal$Transport extends ICancellationSignal.Stub
{
  final CancellationSignal mCancellationSignal = new CancellationSignal();

  public final void cancel()
  {
    this.mCancellationSignal.cancel();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.kingkong.support.CancellationSignal.Transport
 * JD-Core Version:    0.6.2
 */