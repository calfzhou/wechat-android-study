package com.tencent.mm.pluginsdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import com.tencent.mm.o.n;
import com.tencent.mm.o.o;
import com.tencent.mm.o.x;

@Deprecated
public abstract interface c
{
  public abstract Bitmap a(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent);

  public abstract x a(n paramn);

  public abstract String a(Context paramContext, String paramString1, String paramString2);

  public abstract String a(String paramString1, String paramString2, boolean paramBoolean);

  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4);

  public abstract void a(Context paramContext, String paramString1, String paramString2, String paramString3, long paramLong);

  public abstract boolean a(Context paramContext, int paramInt1, int paramInt2, String paramString);

  public abstract void aV(int paramInt);

  public abstract String as(String paramString);

  public abstract boolean at(String paramString);

  public abstract boolean au(String paramString);

  public abstract x c(int paramInt, boolean paramBoolean);

  public abstract String c(Context paramContext, String paramString);

  public abstract boolean d(Context paramContext, String paramString);

  public abstract boolean e(Activity paramActivity);

  public abstract void f(Activity paramActivity);

  public abstract String h(Context paramContext);

  public abstract void hT();

  public abstract o hU();

  public abstract void hV();

  public abstract void hW();

  public abstract void hX();

  public abstract void hY();

  public abstract Intent hZ();

  public abstract void i(Context paramContext);
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.c
 * JD-Core Version:    0.6.2
 */