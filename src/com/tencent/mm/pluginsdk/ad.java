package com.tencent.mm.pluginsdk;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.o;
import java.util.LinkedList;

public abstract interface ad
{
  public abstract void R(LinkedList paramLinkedList);

  public abstract Bitmap a(String paramString, int paramInt, float paramFloat);

  public abstract Cursor aH(int paramInt1, int paramInt2);

  public abstract void aa(String paramString, int paramInt);

  public abstract o ayd();

  public abstract Cursor aye();

  public abstract Cursor d(int[] paramArrayOfInt);

  public abstract void f(k paramk);

  public abstract void g(k paramk);

  public abstract void h(k paramk);

  public abstract Cursor mf(int paramInt);

  public abstract k nt(String paramString);

  public abstract void uJ(String paramString);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ad
 * JD-Core Version:    0.6.2
 */