package com.tencent.mm.ui.tools.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;

final class ae extends d
{
  private final Context context;

  ae(Context paramContext, n paramn, e parame, a parama)
  {
    super(paramn, parame, parama);
    this.context = paramContext;
  }

  final Bitmap a(ab paramab)
  {
    Resources localResources = this.context.getResources();
    int i = paramab.resourceId;
    boolean bool = paramab.bby();
    BitmapFactory.Options localOptions = null;
    if (bool)
    {
      localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeResource(localResources, i, localOptions);
      a(paramab.fkq, paramab.eSi, localOptions);
    }
    return BitmapFactory.decodeResource(localResources, i, localOptions);
  }

  final s bbr()
  {
    return s.jWU;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.ae
 * JD-Core Version:    0.6.2
 */