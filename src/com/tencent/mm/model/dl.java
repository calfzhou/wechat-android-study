package com.tencent.mm.model;

import com.tencent.mm.sdk.platformtools.ch;

final class dl extends du
{
  dl(cx paramcx)
  {
    super(paramcx, (byte)0);
  }

  public final boolean a(cv paramcv)
  {
    boolean bool1 = System.currentTimeMillis() - paramcv.dmn < 1800000L;
    boolean bool2 = false;
    if (bool1)
    {
      int i = ch.getInt(paramcv.dmm, 0);
      bool2 = false;
      if (i > 0)
      {
        cx.g(paramcv.key, paramcv.dmm);
        paramcv.dmm = "0";
        paramcv.dmn = System.currentTimeMillis();
        bool2 = true;
      }
    }
    return bool2;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.dl
 * JD-Core Version:    0.6.2
 */