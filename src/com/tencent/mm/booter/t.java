package com.tencent.mm.booter;

import com.tencent.mm.model.s;

final class t
  implements s
{
  private final String dip = "lock_audio";

  private t(i parami)
  {
  }

  public final void ll()
  {
    if (!i.o(this.dil))
      return;
    try
    {
      this.dil.resume();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void lm()
  {
    if (!i.o(this.dil))
      return;
    try
    {
      this.dil.release();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void ln()
  {
    if (!i.o(this.dil))
      return;
    try
    {
      this.dil.pause();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void lo()
  {
    if (!i.o(this.dil))
      return;
    try
    {
      this.dil.pause();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.t
 * JD-Core Version:    0.6.2
 */