package com.tencent.mm.a;

import com.tencent.mm.sdk.platformtools.ae;

public final class d extends ae
{
  private e cFc = null;

  public d(int paramInt)
  {
    super(paramInt);
  }

  public d(int paramInt, e parame)
  {
    super(paramInt);
    this.cFc = parame;
  }

  public final void b(Object paramObject1, Object paramObject2)
  {
    if (paramObject2 == null)
      return;
    put(paramObject1, paramObject2);
  }

  public final void clear()
  {
    super.trimToSize(-1);
  }

  protected final Object create(Object paramObject)
  {
    return super.create(paramObject);
  }

  protected final void entryRemoved(boolean paramBoolean, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    super.entryRemoved(paramBoolean, paramObject1, paramObject2, paramObject3);
    if ((this.cFc != null) && (paramObject3 == null))
      this.cFc.c(paramObject1, paramObject2);
  }

  public final void hk()
  {
    super.trimToSize(-1);
  }

  protected final int sizeOf(Object paramObject1, Object paramObject2)
  {
    return super.sizeOf(paramObject1, paramObject2);
  }

  public final void trimToSize(int paramInt)
  {
    super.trimToSize(paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.d
 * JD-Core Version:    0.6.2
 */