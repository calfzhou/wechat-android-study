package com.tencent.mm.ui.chatting;

import android.app.Activity;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.i;
import com.tencent.mm.ui.base.cr;
import com.tencent.mm.ui.tools.ei;
import java.util.List;

public final class bk
{
  private static cr jnO = null;

  public static void a(hd paramhd, List paramList, boolean paramBoolean, gm paramgm, i parami)
  {
    if (paramhd == null)
      z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXq7Ep5GXOA3OeNRgsM3MeKw==", "do send to brand fail, fragment is null");
    Activity localActivity;
    do
    {
      return;
      if ((paramList == null) || (paramList.isEmpty()))
      {
        z.w("!56@/B4Tb64lLpKwUcOR+EdWcuVetlyqrLmXq7Ep5GXOA3OeNRgsM3MeKw==", "do send to brand fail, select item empty");
        return;
      }
      localActivity = paramhd.agh();
    }
    while (localActivity == null);
    ei localei = new ei(localActivity);
    localei.a(new bl());
    localei.a(new bm(localActivity));
    localei.a(new bn());
    localei.b(new bo(paramhd, paramList, parami, paramgm, localActivity, paramBoolean));
    localei.baG();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.bk
 * JD-Core Version:    0.6.2
 */