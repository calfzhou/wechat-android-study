package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.ch;

abstract class du
{
  private du(cx paramcx)
  {
  }

  public void a(cv paramcv, Object[] paramArrayOfObject)
  {
    int i = 1;
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      i = ch.h(paramArrayOfObject[0], i);
    paramcv.dmm = (i + ch.getInt(paramcv.dmm, 0));
  }

  public abstract boolean a(cv paramcv);

  public cv b(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 1;
    if ((paramArrayOfObject != null) && (paramArrayOfObject.length > 0))
      i = ch.h(paramArrayOfObject[0], i);
    cv localcv = new cv();
    localcv.key = paramInt;
    localcv.dmm = String.valueOf(i);
    localcv.dmn = 0L;
    return localcv;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.du
 * JD-Core Version:    0.6.2
 */