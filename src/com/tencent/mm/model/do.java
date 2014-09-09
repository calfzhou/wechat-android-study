package com.tencent.mm.model;

final class do extends du
{
  do(cx paramcx)
  {
    super(paramcx, (byte)0);
  }

  public final void a(cv paramcv, Object[] paramArrayOfObject)
  {
    paramcv.dmm = paramArrayOfObject[0];
  }

  public final boolean a(cv paramcv)
  {
    if ((System.currentTimeMillis() - paramcv.dmn > 3600000L) && (paramcv.dmm.length() > 0))
    {
      cx.g(paramcv.key, paramcv.dmm);
      paramcv.dmm = "";
      paramcv.dmn = System.currentTimeMillis();
      return true;
    }
    return false;
  }

  public final cv b(int paramInt, Object[] paramArrayOfObject)
  {
    cv localcv = new cv();
    localcv.key = paramInt;
    localcv.dmm = paramArrayOfObject[0];
    localcv.dmn = 0L;
    return localcv;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.do
 * JD-Core Version:    0.6.2
 */