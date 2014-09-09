package com.tencent.mm.model;

import com.tencent.mm.storage.aq;
import com.tencent.mm.storage.cj;
import com.tencent.mm.storage.ck;
import com.tencent.mm.storage.cl;
import java.util.List;

public final class ag
{
  public static aq ea(String paramString)
  {
    return new aq("@black.android", null, paramString, null, true, true);
  }

  public static aq eb(String paramString)
  {
    cj localcj = bg.qW().oY().zX("@t.qq.com");
    if (localcj == null)
      return null;
    return new aq("@t.qq.com", null, paramString, null, localcj.aJt(), localcj.aKE());
  }

  public static boolean qu()
  {
    List localList = bg.qW().oY().aKH();
    if (localList.size() <= 0);
    while (true)
    {
      return false;
      for (int i = 0; i < localList.size(); i++)
        if (((cj)localList.get(i)).aJt())
          return true;
    }
  }

  public static aq x(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() <= 0));
    cj localcj;
    do
    {
      return null;
      localcj = bg.qW().oY().zX(paramString1);
    }
    while ((localcj == null) || (!localcj.aKF()));
    String str1 = localcj.getName();
    String str2 = localcj.aKG().zW("");
    String str3 = "";
    if (str2 != null)
      str3 = str3 + str2.replace("@", "");
    if (paramString2 != null)
      str3 = str3 + paramString2;
    return new aq("@domain.android", str1, str3, localcj.aKG().zW(""), localcj.aJt(), true);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.ag
 * JD-Core Version:    0.6.2
 */