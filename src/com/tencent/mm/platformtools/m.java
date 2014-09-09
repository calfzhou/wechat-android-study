package com.tencent.mm.platformtools;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.tencent.mm.as.h;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.sdk.platformtools.z;

public final class m extends h
{
  public final boolean dUJ;
  private SparseBooleanArray dUK = new SparseBooleanArray();
  private final String path;

  public m(String paramString, boolean paramBoolean)
  {
    z.d("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "create db %s", new Object[] { paramString });
    this.dUJ = false;
    this.path = paramString;
  }

  @Deprecated
  public final void bQ(String paramString)
  {
    z.e("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "forbid to use this method");
    if (this.dUK.size() <= 1)
      super.bQ(paramString);
  }

  final void eu(int paramInt)
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "addRef %d", arrayOfObject);
    this.dUK.put(paramInt, true);
  }

  public final void ev(int paramInt)
  {
    Object[] arrayOfObject1 = new Object[1];
    arrayOfObject1[0] = Integer.valueOf(paramInt);
    z.d("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "try close db %d", arrayOfObject1);
    this.dUK.delete(paramInt);
    if (this.dUK.size() <= 0)
    {
      Object[] arrayOfObject2 = new Object[1];
      arrayOfObject2[0] = Integer.valueOf(paramInt);
      z.d("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "close db %d succ", arrayOfObject2);
      super.oG();
      l.Dw().remove(this.path.hashCode());
    }
  }

  @Deprecated
  public final void oG()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = ch.aHN();
    z.e("!44@/B4Tb64lLpKLtvWkVeLEdAH+ecu3SbUE1q+PcZlao4w=", "forbid to use this method %s", arrayOfObject);
    if (this.dUK.size() <= 1)
      super.oG();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.platformtools.m
 * JD-Core Version:    0.6.2
 */