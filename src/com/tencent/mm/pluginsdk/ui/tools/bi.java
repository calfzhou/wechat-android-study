package com.tencent.mm.pluginsdk.ui.tools;

import com.tencent.mm.sdk.platformtools.z;
import java.util.ArrayList;
import java.util.List;

public final class bi
{
  private static List hME = new ArrayList();

  public static void a(bj parambj)
  {
    z.d("!44@/B4Tb64lLpJLnjolkGdCefwLG6QT9EqvNAxO7Tr/+58=", "add, plugin name = " + parambj.getName());
    hME.add(parambj);
  }

  public static List aFk()
  {
    return hME;
  }

  public static void clear()
  {
    z.d("!44@/B4Tb64lLpJLnjolkGdCefwLG6QT9EqvNAxO7Tr/+58=", "clear");
    hME.clear();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.bi
 * JD-Core Version:    0.6.2
 */