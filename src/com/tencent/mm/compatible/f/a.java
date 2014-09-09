package com.tencent.mm.compatible.f;

import android.view.MenuItem;
import com.tencent.mm.sdk.platformtools.z;

public final class a
{
  public static void a(MenuItem paramMenuItem, String paramString)
  {
    if (paramMenuItem == null)
      z.w("!32@/B4Tb64lLpJKcBiDy6zxE3hSxe+6+uSO", "fixTitleCondensed fail, item is null");
    do
    {
      return;
      if (paramMenuItem.getTitleCondensed() == null)
      {
        z.w("!32@/B4Tb64lLpJKcBiDy6zxE3hSxe+6+uSO", "%s title condensed is null, fix it", new Object[] { paramString });
        paramMenuItem.setTitleCondensed("");
        return;
      }
    }
    while ((paramMenuItem.getTitleCondensed() instanceof String));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramMenuItem.getTitleCondensed().getClass().getName();
    arrayOfObject[2] = paramMenuItem.getTitleCondensed();
    z.w("!32@/B4Tb64lLpJKcBiDy6zxE3hSxe+6+uSO", "%s title condensed is not String type, cur type[%s], cur value[%s], fix it", arrayOfObject);
    paramMenuItem.setTitleCondensed(paramMenuItem.getTitleCondensed().toString());
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.f.a
 * JD-Core Version:    0.6.2
 */