package com.tencent.mm.pluginsdk.ui;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public final class c
{
  private static ad fAD;

  public static void a(ImageView paramImageView, String paramString)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    if ((localDrawable != null) && ((localDrawable instanceof a)));
    for (a locala = (a)localDrawable; ; locala = new a(paramString, '\000'))
    {
      locala.vo(paramString);
      paramImageView.setImageDrawable(locala);
      paramImageView.invalidate();
      return;
    }
  }

  private static void a(ImageView paramImageView, String paramString, float paramFloat, boolean paramBoolean)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    d locald;
    if ((localDrawable != null) && ((localDrawable instanceof d)))
      locald = (d)localDrawable;
    while (true)
    {
      locald.vo(paramString);
      paramImageView.setImageDrawable(locald);
      paramImageView.invalidate();
      return;
      locald = new d(paramString, paramFloat);
      locald.dg(paramBoolean);
    }
  }

  public static void a(ImageView paramImageView, String paramString, boolean paramBoolean)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    if ((localDrawable != null) && ((localDrawable instanceof a)));
    for (a locala = (a)localDrawable; ; locala = new a(paramString, (short)0))
    {
      locala.vo(paramString);
      paramImageView.setImageDrawable(locala);
      paramImageView.invalidate();
      return;
    }
  }

  public static void a(ad paramad)
  {
    fAD = paramad;
  }

  public static void a(b paramb, String paramString)
  {
    Drawable localDrawable = paramb.getDrawable();
    if ((localDrawable != null) && ((localDrawable instanceof a)));
    for (a locala = (a)localDrawable; ; locala = new a(paramString, '\000'))
    {
      locala.vo(paramString);
      paramb.setImageDrawable(locala);
      paramb.doInvalidate();
      return;
    }
  }

  public static ad azD()
  {
    return fAD;
  }

  public static void e(ImageView paramImageView, String paramString)
  {
    Drawable localDrawable = paramImageView.getDrawable();
    a locala;
    if ((localDrawable != null) && ((localDrawable instanceof a)))
      locala = (a)localDrawable;
    while (true)
    {
      locala.vo(paramString);
      paramImageView.setImageDrawable(locala);
      paramImageView.invalidate();
      return;
      locala = new a(paramString, '\000');
      locala.dg(true);
    }
  }

  public static void f(ImageView paramImageView, String paramString)
  {
    a(paramImageView, paramString, 0.5F, false);
  }

  public static void g(ImageView paramImageView, String paramString)
  {
    a(paramImageView, paramString, 0.03F, true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.c
 * JD-Core Version:    0.6.2
 */