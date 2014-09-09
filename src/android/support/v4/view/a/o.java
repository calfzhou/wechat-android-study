package android.support.v4.view.a;

import android.os.Build.VERSION;

public final class o
{
  private static final r fS = new t();
  private final Object fT;

  static
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      fS = new s();
      return;
    }
    if (Build.VERSION.SDK_INT >= 15)
    {
      fS = new q();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      fS = new p();
      return;
    }
  }

  private o(Object paramObject)
  {
    this.fT = paramObject;
  }

  public static o ap()
  {
    return new o(fS.obtain());
  }

  public final boolean equals(Object paramObject)
  {
    if (this == paramObject);
    o localo;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localo = (o)paramObject;
        if (this.fT != null)
          break;
      }
      while (localo.fT == null);
      return false;
    }
    while (this.fT.equals(localo.fT));
    return false;
  }

  public final int hashCode()
  {
    if (this.fT == null)
      return 0;
    return this.fT.hashCode();
  }

  public final void setFromIndex(int paramInt)
  {
    fS.c(this.fT, paramInt);
  }

  public final void setItemCount(int paramInt)
  {
    fS.d(this.fT, paramInt);
  }

  public final void setScrollable(boolean paramBoolean)
  {
    fS.f(this.fT, paramBoolean);
  }

  public final void setToIndex(int paramInt)
  {
    fS.e(this.fT, paramInt);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.a.o
 * JD-Core Version:    0.6.2
 */