package com.tencent.mm.ui.tools.a;

import android.net.Uri;
import java.lang.ref.WeakReference;

public abstract class l
{
  final String id;
  final WeakReference jWJ;

  protected l(Object paramObject, String paramString)
  {
    this.jWJ = new WeakReference(paramObject);
    this.id = paramString;
  }

  public abstract Uri baH();

  public final Object bbt()
  {
    return this.jWJ.get();
  }

  public final String getKey()
  {
    if (this.id == null)
      throw new IllegalArgumentException("id should not be null");
    return this.id;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.l
 * JD-Core Version:    0.6.2
 */