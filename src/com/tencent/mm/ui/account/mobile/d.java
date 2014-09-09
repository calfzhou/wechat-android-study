package com.tencent.mm.ui.account.mobile;

import android.content.Intent;
import com.tencent.mm.ui.MMActivity;

final class d
  implements Runnable
{
  d(a parama, MMActivity paramMMActivity)
  {
  }

  public final void run()
  {
    Intent localIntent = com.tencent.mm.plugin.a.a.dWo.k(this.cHe);
    localIntent.addFlags(67108864);
    this.cHe.startActivity(localIntent);
    this.cHe.finish();
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.mobile.d
 * JD-Core Version:    0.6.2
 */