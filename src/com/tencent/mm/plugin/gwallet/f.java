package com.tencent.mm.plugin.gwallet;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.plugin.gwallet.a.b;
import java.util.ArrayList;

final class f extends BroadcastReceiver
{
  f(GWalletUI paramGWalletUI)
  {
  }

  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    ArrayList localArrayList;
    if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(paramIntent.getAction()))
    {
      localArrayList = paramIntent.getStringArrayListExtra("tokens");
      if ((localArrayList == null) || (localArrayList.size() == 0))
        GWalletUI.a(this.fdw, 0, null);
    }
    else
    {
      return;
    }
    GWalletUI.b(this.fdw).a(localArrayList, new g(this));
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.gwallet.f
 * JD-Core Version:    0.6.2
 */