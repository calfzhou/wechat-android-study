package com.tencent.mm.ui.account;

import android.content.Intent;
import com.tencent.mm.model.bg;
import com.tencent.mm.plugin.a.a;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.sdk.platformtools.ch;
import com.tencent.mm.storage.e;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.bindmobile.BindMContactIntroUI;

final class as
  implements Runnable
{
  as(FacebookLoginUI paramFacebookLoginUI)
  {
  }

  public final void run()
  {
    int i;
    if (ch.a((Integer)bg.qW().oQ().get(65833), 0) > 0)
    {
      i = 1;
      if (i == 0)
        break label84;
      Intent localIntent2 = a.dWo.k(this.iOr);
      localIntent2.addFlags(67108864);
      MMWizardActivity.b(this.iOr, new Intent(this.iOr, BindMContactIntroUI.class), localIntent2);
    }
    while (true)
    {
      this.iOr.finish();
      return;
      i = 0;
      break;
      label84: Intent localIntent1 = a.dWo.k(this.iOr);
      localIntent1.addFlags(67108864);
      this.iOr.startActivity(localIntent1);
      com.tencent.mm.plugin.a.b.jF(bg.qS() + "," + this.iOr.getClass().getName() + ",L14," + bg.eg("L14") + ",4");
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.account.as
 * JD-Core Version:    0.6.2
 */