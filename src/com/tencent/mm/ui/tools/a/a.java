package com.tencent.mm.ui.tools.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

abstract class a
{
  boolean EO;
  final String dqq;
  final ab jWq;
  final WeakReference jWr;
  final boolean jWs;
  final int jWt;
  final Drawable jWu;
  final boolean jWv;

  a(Object paramObject, ab paramab, boolean paramBoolean1, boolean paramBoolean2, int paramInt, Drawable paramDrawable, String paramString)
  {
    this.jWq = paramab;
    this.jWr = new b(this, paramObject, u.bbu().jXc);
    this.jWs = paramBoolean1;
    this.jWt = paramInt;
    this.jWu = paramDrawable;
    this.dqq = paramString;
    this.jWv = paramBoolean2;
  }

  abstract void a(Bitmap paramBitmap, s params);

  void cancel()
  {
    this.EO = true;
  }

  abstract void error();
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.a
 * JD-Core Version:    0.6.2
 */