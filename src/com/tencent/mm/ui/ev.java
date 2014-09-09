package com.tencent.mm.ui;

import com.tencent.mm.model.bg;
import com.tencent.mm.model.x;
import com.tencent.mm.model.y;
import com.tencent.mm.ui.conversation.aj;
import java.util.ArrayList;
import java.util.List;

public final class ev
{
  public static int aZ(List paramList)
  {
    int i;
    if (!bg.oE())
    {
      com.tencent.mm.sdk.platformtools.z.w("!44@/B4Tb64lLpK+AkWszK7UvIu5cpERJB7d1VkLoGBmsjY=", "getMainTabUnreadCount, but mmcore not ready");
      i = 0;
    }
    while (true)
    {
      return i;
      if ((0x8000 & x.pK()) == 0)
      {
        if (paramList == null)
          paramList = new ArrayList();
        if (!paramList.contains("floatbottle"))
          paramList.add("floatbottle");
      }
      for (i = com.tencent.mm.model.z.a(y.dkj, paramList); i != aj.jGV; i = com.tencent.mm.model.z.a(y.dkj, paramList))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = Integer.valueOf(i);
        arrayOfObject[1] = Integer.valueOf(aj.jGV);
        com.tencent.mm.sdk.platformtools.z.i("!44@/B4Tb64lLpK+AkWszK7UvIu5cpERJB7d1VkLoGBmsjY=", "unreadcheck wrong should be %d, but is %d", arrayOfObject);
        aj.jGV = -1;
        return i;
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ev
 * JD-Core Version:    0.6.2
 */